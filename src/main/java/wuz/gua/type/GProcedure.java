package wuz.gua.type;

import org.antlr.v4.runtime.Token;
import wuz.gua.exception.ArityExpection;
import wuz.gua.generate.GuaParser;
import wuz.gua.interpreter.Environment;
import wuz.gua.interpreter.GuaAstVisitor;

import java.util.LinkedList;
import java.util.List;

public class GProcedure extends GuaObject {

    private String                  name;
    private List<Token>             operands;
    private GuaParser.BodyContext   body;


    public GProcedure(String name, List<Token> operands, GuaParser.BodyContext body) {
        super(GuaType.PROCEDURE);
        this.name = name;
        this.operands = operands;
        this.body = body;
    }


    public GuaObject call(GuaAstVisitor visitor, List<GuaObject> formals) {
        fixedArity(formals, operands.size());
        int size = formals.size();
        Environment env = new Environment();
        for(int i = 0; i < size; i++) {
            env.putVariable(operands.get(i).getText(), formals.get(i));
        }

        LinkedList<Environment> envs = visitor.getEnvironments();

        envs.push(env);

        GuaObject ret = visitor.visit(body);

        ret = tryConvertClosure(ret, envs);

        envs.pop();

        return ret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Token> getOperands() {
        return operands;
    }

    public void setOperands(List<Token> operands) {
        this.operands = operands;
    }

    public GuaParser.BodyContext getBody() {
        return body;
    }

    public void setBody(GuaParser.BodyContext body) {
        this.body = body;
    }


    public GuaObject tryConvertClosure(GuaObject ret, LinkedList<Environment> envs) {
        if(GuaType.isProcedure(ret)) {
            return new GClosure( (GProcedure) ret, new LinkedList<>(envs));
        }
        return ret;
    }


    public void fixedArity(List<GuaObject> formals, int expected) {
        int given = formals.size();
        if (expected != given) throw new ArityExpection(name + ": arity mismatch\n" +
                "expected: " + expected + "\n" +
                "given: "    + given    + "\n");
    }

    public void leastArity(List<GuaObject> formals, int least) {
        int given = formals.size();
        if(given < least) throw new ArityExpection(name + ": arity mismatch\n" +
                "expected: at least " + least + "\n" +
                "given: "    + given    + "\n");
    }

    @Override
    public GBoolean eqv(GuaObject other) {
        if(other.getTypeid() == getTypeid()) {
            GProcedure o = (GProcedure)other;
            if(o == this) return GBoolean.TRUE;
        }
        return GBoolean.FALSE;
    }

    @Override
    public String toString() {
        return "#<procedure:" + name + ">";
    }
}
