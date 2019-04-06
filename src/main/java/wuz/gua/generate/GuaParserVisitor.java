package wuz.gua.generate;// Generated from GuaParser.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GuaParserVisitor<T> extends ParseTreeVisitor<T> {
	T visitDefineLambdaRestArguments(GuaParser.DefineLambdaRestArgumentsContext ctx);

	T visitDefineVariable(GuaParser.DefineVariableContext ctx);

	T visitOrCondition(GuaParser.OrConditionContext ctx);

	T visitLetBind(GuaParser.LetBindContext ctx);

	T visitCaseCondition(GuaParser.CaseConditionContext ctx);

	T visitDoBind(GuaParser.DoBindContext ctx);

	T visitProgram(GuaParser.ProgramContext ctx);

	T visitSource(GuaParser.SourceContext ctx);

	T visitBody(GuaParser.BodyContext ctx);

	T visitCharacterLiteral(GuaParser.CharacterLiteralContext ctx);

	T visitBind(GuaParser.BindContext ctx);

	T visitAction(GuaParser.ActionContext ctx);

	T visitLambdaRestArguments(GuaParser.LambdaRestArgumentsContext ctx);

	T visitBooleanLiteral(GuaParser.BooleanLiteralContext ctx);

	T visitBeginSequence(GuaParser.BeginSequenceContext ctx);

	T visitLambdaFixedArguments(GuaParser.LambdaFixedArgumentsContext ctx);

	T visitCondClauseOrder(GuaParser.CondClauseOrderContext ctx);

	T visitDoBinds(GuaParser.DoBindsContext ctx);

	T visitCondClauseArrow(GuaParser.CondClauseArrowContext ctx);

	T visitSequence(GuaParser.SequenceContext ctx);

	T visitCondition(GuaParser.ConditionContext ctx);

	T visitStringLiteral(GuaParser.StringLiteralContext ctx);

	T visitProperList(GuaParser.ProperListContext ctx);

	T visitProcedureCall(GuaParser.ProcedureCallContext ctx);

	T visitDoIteration(GuaParser.DoIterationContext ctx);

	T visitAbbrev(GuaParser.AbbrevContext ctx);

	T visitDelayEval(GuaParser.DelayEvalContext ctx);

	T visitBinds(GuaParser.BindsContext ctx);

	T visitElseClause(GuaParser.ElseClauseContext ctx);

	T visitLambdaAnyArguments(GuaParser.LambdaAnyArgumentsContext ctx);

	T visitLiteral(GuaParser.LiteralContext ctx);

	T visitIfCondition(GuaParser.IfConditionContext ctx);

	T visitMember(GuaParser.MemberContext ctx);

	T visitIteration(GuaParser.IterationContext ctx);

	T visitVector(GuaParser.VectorContext ctx);

	T visitCondCondition(GuaParser.CondConditionContext ctx);

	T visitAbbrevList(GuaParser.AbbrevListContext ctx);

	T visitMap(GuaParser.MapContext ctx);

	T visitLetStarBind(GuaParser.LetStarBindContext ctx);

	T visitSetAssignment(GuaParser.SetAssignmentContext ctx);

	T visitRest(GuaParser.RestContext ctx);

	T visitExpression(GuaParser.ExpressionContext ctx);

	T visitSymbolLiteral(GuaParser.SymbolLiteralContext ctx);

	T visitAndCondition(GuaParser.AndConditionContext ctx);

	T visitAssignment(GuaParser.AssignmentContext ctx);

	T visitPairOrImproperList(GuaParser.PairOrImproperListContext ctx);

	T visitDefineProcedure(GuaParser.DefineProcedureContext ctx);

	T visitLocalBind(GuaParser.LocalBindContext ctx);

	T visitDataum(GuaParser.DataumContext ctx);

	T visitVariable(GuaParser.VariableContext ctx);

	T visitCaseClause(GuaParser.CaseClauseContext ctx);

	T visitLetRecBind(GuaParser.LetRecBindContext ctx);

	T visitQuotation(GuaParser.QuotationContext ctx);

	T visitNumberLiteral(GuaParser.NumberLiteralContext ctx);
}