package wuz.gua.interpreter;

import wuz.gua.exception.TypeException;
import wuz.gua.exception.UndefineException;
import wuz.gua.generate.GuaParser;
import wuz.gua.generate.GuaParserBaseVisitor;
import wuz.gua.type.*;

import java.util.*;


public class GuaAstVisitor extends GuaParserBaseVisitor<GuaObject> {

    private LinkedList<Environment> envs = new LinkedList<>();

    @Override
    public GuaObject visitCondCondition(GuaParser.CondConditionContext ctx) {
        GuaObject ret = GVoid.VOID;
        for(GuaParser.CondClauseContext clause: ctx.condClause()) {
            ret = visit(clause);
            if(!GuaType.isVoid(ret)) break;
        }
        if(GuaType.isVoid(ret) && ctx.elseClause() != null) {
            return visit(ctx.elseClause());
        }
        return ret;
    }

    @Override
    public GuaObject visitCondClauseOrder(GuaParser.CondClauseOrderContext ctx) {
        GuaObject ret = GVoid.VOID;
        if(testExpr(visit(ctx.test))) {
            for(GuaParser.ExpressionContext  expr: ctx.order) {
                ret = visit(expr);
            }
        }
        return ret;
    }

    @Override
    public GuaObject visitCondClauseArrow(GuaParser.CondClauseArrowContext ctx) {
        GuaObject ret  = GVoid.VOID;
        GuaObject test = visit(ctx.test);
        if(testExpr(test)) {
            GuaObject operator = visit(ctx.operator);
            List<GuaObject> formals = new ArrayList<>();
            formals.add(test);
            return call(operator, formals);
        }
        return ret;
    }

    enum SelectState {SELECTED, UNSELECTED}

    @Override
    public GuaObject visitCaseCondition(GuaParser.CaseConditionContext ctx) {
        SelectState state = SelectState.UNSELECTED;
        GuaObject ret   = GVoid.VOID;
        GuaObject keyObject = visit(ctx.key);
        for(GuaParser.CaseClauseContext caseClause: ctx.caseClause()) {
            for (GuaParser.DataumContext datum: caseClause.dataum()) {
                if(keyObject.eqv(visit(datum)).getValue()) {
                    state = SelectState.SELECTED;
                    for(GuaParser.ExpressionContext order: caseClause.expression()) {
                        ret = visit(order);
                    }
                    break;
                }
            }
            if(state == SelectState.SELECTED) break;
        }

        return (ctx.elseClause() != null && GuaType.isVoid(ret))
                ? visit(ctx.elseClause())
                : ret;
    }

    @Override
    public GuaObject visitElseClause(GuaParser.ElseClauseContext ctx) {
        GuaObject ret = GVoid.VOID;
        for(GuaParser.ExpressionContext expr: ctx.order) {
            ret = visit(expr);
        }
        return ret;
    }

    @Override
    public GuaObject visitIfCondition(GuaParser.IfConditionContext ctx) {
        return testExpr(visit(ctx.test))
                ? visit(ctx.consequent)
                : ctx.alternate != null
                ? visit(ctx.alternate)
                : GVoid.VOID;
    }

    @Override
    public GuaObject visitAndCondition(GuaParser.AndConditionContext ctx) {
        GuaObject ret = GBoolean.FALSE;
        for(GuaParser.ExpressionContext expr: ctx.expression()) {
            ret = visit(expr);
            if(!testExpr(ret)) {
                return ret;
            }
        }
        return ret;
    }

    @Override
    public GuaObject visitOrCondition(GuaParser.OrConditionContext ctx) {
        GuaObject ret = GBoolean.FALSE;
        for(GuaParser.ExpressionContext expr: ctx.expression()) {
            ret = visit(expr);
            if(testExpr(ret)) {
                return ret;
            }
        }
        return ret;
    }

    @Override
    public GuaObject visitBeginSequence(GuaParser.BeginSequenceContext ctx)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    {
        GuaObject ret = GVoid.VOID;
        for(GuaParser.ActionContext action: ctx.action()) {
            ret = visit(action);
        }
        return ret;
    }

    @Override
    public GuaObject visitLetBind(GuaParser.LetBindContext ctx) {
        Environment env = new Environment();
        for(GuaParser.BindContext bind: ctx.binds().bind()) {
            env.putVariable(bind.varname.getText(), visit(bind.init));
        }
        envs.push(env);
        GuaObject ret = visit(ctx.body());
        envs.pop();
        return ret;
    }

    @Override
    public GuaObject visitLetStarBind(GuaParser.LetStarBindContext ctx) {
        Environment env = new Environment();
        envs.push(env);
        for(GuaParser.BindContext bind: ctx.binds().bind()) {
            env.putVariable(bind.varname.getText(), visit(bind.init));
        }
        GuaObject ret = visit(ctx.body());
        envs.pop();
        return ret;
    }

    @Override
    public GuaObject visitLetRecBind(GuaParser.LetRecBindContext ctx) {
        Environment env = new Environment();
        envs.push(env);
        for(GuaParser.BindContext bind: ctx.binds().bind()) {
            env.putVariable(bind.varname.getText(), visit(bind.init));
        }
        GuaObject ret = visit(ctx.body());
        envs.pop();
        return ret;
    }

    @Override
    public GuaObject visitDoIteration(GuaParser.DoIterationContext ctx) {
        Environment env = new Environment();
        envs.push(env);
        for(GuaParser.DoBindContext doBind: ctx.doBinds().doBind()) {
            envs.getFirst().putVariable(doBind.varname.getText(), visit(doBind.init));
        }
        for(;;) {
            if(testExpr(visit(ctx.test))) {
                GuaObject ret = GVoid.VOID;
                for(GuaParser.ExpressionContext order: ctx.order) {
                    ret = visit(order);
                }
                return ret;
            }
            for(GuaParser.ExpressionContext command: ctx.command) {
                visit(command);
            }
            for(GuaParser.DoBindContext doBind: ctx.doBinds().doBind()) {
                envs.getFirst().putVariable(doBind.varname.getText(), visit(doBind.step));
            }
        }
    }

    @Override
    public GuaObject visitDelayEval(GuaParser.DelayEvalContext ctx) {
        return new GPromise(ctx.expression(), new LinkedList<>(envs));
    }

    @Override
    public GuaObject visitPairOrImproperList(GuaParser.PairOrImproperListContext ctx) {
        LinkedList<GuaObject> value = new LinkedList<>();
        List<GuaParser.DataumContext> datums =  ctx.dataum();
        int init = datums.size() - 1;
        for(int i = 0; i < init; i++) {
            value.add(visit(datums.get(i)));
        }
        GuaObject GObject =  visit(ctx.last);
        switch (GObject.getTypeid()) {
            case GuaType.LIST:
            case GuaType.IMPROPER:
                value.addAll(((GList)GObject).getValue());
                return new GList(GuaType.IMPROPER, value);
            case GuaType.PAIR:
                value.addAll(((GList)GObject).getValue());
                return new GList(GuaType.PAIR, value);
        }
        value.add(GObject);
        return new GList(GuaType.PAIR, value);
    }

    @Override
    public GuaObject visitAbbrevList(GuaParser.AbbrevListContext ctx) {
        LinkedList<GuaObject> list = new LinkedList<>();
        list.add(new GSymbol("quote"));
        list.add(visit(ctx.dataum()));
        return new GList(GuaType.LIST, list);
    }

    @Override
    public GuaObject visitProperList(GuaParser.ProperListContext ctx) {
        LinkedList<GuaObject> value = new LinkedList<>();
        for(GuaParser.DataumContext datum: ctx.dataum()) {
            value.add(visit(datum));
        }
        return new GList(GuaType.LIST, value);
    }

    @Override
    public GuaObject visitVector(GuaParser.VectorContext ctx) {
        ArrayList<GuaObject> value = new ArrayList<>();
        for(GuaParser.DataumContext datum: ctx.dataum()) {
            value.add(visit(datum));
        }
        return new GVector(value);
    }

    @Override
    public GuaObject visitMap(GuaParser.MapContext ctx) {
        HashMap<GuaObject, GuaObject> value = new HashMap<>();
        for(GuaParser.MemberContext member: ctx.member()) {
            value.put(visit(member.key), visit(member.value));
        }
        return new GMap(value);
    }

    @Override
    public GuaObject visitStringLiteral(GuaParser.StringLiteralContext ctx) {
        StringBuilder builder = new StringBuilder();
        String text = ctx.String().getText();
        int start = 1;
        int end = text.length() - 1;
        for(int i = start; i < end; i++) {
            if(text.charAt(i) == '\\' && text.charAt(i + 1) == 'u') {
                builder.append(
                        (char)Integer.valueOf(text.substring(i += 2, i += 4), 16).intValue()
                );

            }else {builder.append(text.charAt(i));}
        }
        return new GString(builder.toString());
    }

    @Override
    public GuaObject visitCharacterLiteral(GuaParser.CharacterLiteralContext ctx) {
        String str = ctx.Character().getText().substring(2);
        return new GCharacter(
                str.length() == 1
                        ? str.charAt(0)
                        : (char)Integer.valueOf(str.substring(1), 16).intValue()
        );
    }

    @Override
    public GuaObject visitSymbolLiteral(GuaParser.SymbolLiteralContext ctx) {
        return new GSymbol(ctx.Identifier().getText());
    }

    @Override
    public GuaObject visitNumberLiteral(GuaParser.NumberLiteralContext ctx) {
        return new GNumber(Float.parseFloat(ctx.Number().getText()));
    }

    @Override
    public GuaObject visitBooleanLiteral(GuaParser.BooleanLiteralContext ctx) {
        return ctx.Boolean().getText().equals("#t")
                ? GBoolean.TRUE
                : GBoolean.FALSE;
    }

    @Override
    public GuaObject visitSetAssignment(GuaParser.SetAssignmentContext ctx) {
        envs.getFirst().replaceVariable(ctx.varname.getText(), visit(ctx.expression()));
        return GVoid.VOID;
    }

    @Override
    public GuaObject visitVariable(GuaParser.VariableContext ctx) {
        String variable = ctx.Identifier().getText();
        for(Environment env: envs) {
            GuaObject ret = env.getVariable(variable);
            if(ret != null) {
                return ret;
            }
        }
        throw new UndefineException(variable);
    }

    @Override
    public GuaObject visitDefineVariable(GuaParser.DefineVariableContext ctx) {
        envs.getFirst().putVariable(ctx.varname.getText(), visit(ctx.expression()));
        return GVoid.VOID;
    }

    @Override
    public GuaObject visitProcedureCall(GuaParser.ProcedureCallContext ctx) {
        GuaObject operator = visit(ctx.operator);
        List<GuaObject> formals = new ArrayList<>();
        for (GuaParser.ExpressionContext argument : ctx.operands) {
            formals.add(visit(argument));
        }
        return call(operator, formals);
    }

    @Override
    public GuaObject visitLambdaFixedArguments(GuaParser.LambdaFixedArgumentsContext ctx) {
        return new GClosure(
                new GProcedure("", ctx.formals, ctx.body()),
                new LinkedList<>(envs)
        );
    }

    @Override
    public GuaObject visitDefineProcedure(GuaParser.DefineProcedureContext ctx) {
        String variable =  ctx.varname.getText();
        GuaObject procedure = new GProcedure(
                variable,
                ctx.formals,
                ctx.body()
        );
        envs.getFirst().putVariable(variable, procedure);
        return GVoid.VOID;
    }

    private boolean testExpr(GuaObject GObject) {
        if(GObject.getTypeid() == GuaType.BOOLEAN) {
            GBoolean booleanObject = (GBoolean) GObject;
            return booleanObject.getValue();
        }
        return true;
    }

    private GuaObject call(GuaObject operator, List<GuaObject> formals) {
        switch (operator.getTypeid()) {
            case GuaType.PROCEDURE:
                GProcedure procedure = (GProcedure) operator;
                return procedure.call(this, formals);
            case GuaType.CLOSURE:
                GClosure closure = (GClosure) operator;
                return closure.call(this, formals);
            default:
                throw new TypeException(operator.toString(), "not a procedure");
        }
    }

    public LinkedList<Environment> getEnvironments() {
        return envs;
    }

    public void setEnvironments(LinkedList<Environment> envs) {
        this.envs = envs;
    }
}
