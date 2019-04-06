package wuz.gua.generate;
// Generated from GuaParser.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import wuz.gua.generate.GuaParserVisitor;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GuaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUOTE=8, SET=11, BEGIN=12, DO=22, String=26, SINGLEQUOTE=5, VEC_PAREN=6, 
		DEFINE=9, Whitespace=29, ARROW=4, LETSTAR=14, Identifier=28, Number=27, 
		ELSE=19, Boolean=24, IF=17, Comment=30, OR=21, Character=25, LPAREN=1, 
		DOT=3, RPAREN=2, LAMBDA=10, CASE=18, MAP_PAREN=7, LETREC=15, AND=20, LET=13, 
		COND=16, DELAY=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'.'", "'=>'", "'''", "'#('", "'#hash('", "'quote'", 
		"'define'", "'lambda'", "'set!'", "'begin'", "'let'", "'let*'", "'letrec'", 
		"'cond'", "'if'", "'case'", "'else'", "'and'", "'or'", "'do'", "'delay'", 
		"Boolean", "Character", "String", "Number", "Identifier", "Whitespace", 
		"Comment"
	};
	public static final int
		RULE_program = 0, RULE_source = 1, RULE_expression = 2, RULE_literal = 3, 
		RULE_variable = 4, RULE_booleanLiteral = 5, RULE_numberLiteral = 6, RULE_characterLiteral = 7, 
		RULE_stringLiteral = 8, RULE_symbolLiteral = 9, RULE_quotation = 10, RULE_dataum = 11, 
		RULE_list = 12, RULE_abbrev = 13, RULE_vector = 14, RULE_map = 15, RULE_member = 16, 
		RULE_condition = 17, RULE_ifCondition = 18, RULE_condCondition = 19, RULE_condClause = 20, 
		RULE_caseCondition = 21, RULE_caseClause = 22, RULE_elseClause = 23, RULE_andCondition = 24, 
		RULE_orCondition = 25, RULE_localBind = 26, RULE_letBind = 27, RULE_letStarBind = 28, 
		RULE_letRecBind = 29, RULE_binds = 30, RULE_bind = 31, RULE_assignment = 32, 
		RULE_setAssignment = 33, RULE_sequence = 34, RULE_beginSequence = 35, 
		RULE_action = 36, RULE_iteration = 37, RULE_doIteration = 38, RULE_doBinds = 39, 
		RULE_doBind = 40, RULE_delayEval = 41, RULE_lambda = 42, RULE_rest = 43, 
		RULE_procedureCall = 44, RULE_definition = 45, RULE_body = 46;
	public static final String[] ruleNames = {
		"program", "source", "expression", "literal", "variable", "booleanLiteral", 
		"numberLiteral", "characterLiteral", "stringLiteral", "symbolLiteral", 
		"quotation", "dataum", "list", "abbrev", "vector", "map", "member", "condition", 
		"ifCondition", "condCondition", "condClause", "caseCondition", "caseClause", 
		"elseClause", "andCondition", "orCondition", "localBind", "letBind", "letStarBind", 
		"letRecBind", "binds", "bind", "assignment", "setAssignment", "sequence", 
		"beginSequence", "action", "iteration", "doIteration", "doBinds", "doBind", 
		"delayEval", "lambda", "rest", "procedureCall", "definition", "body"
	};

	@Override
	public String getGrammarFileName() { return "GuaParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GuaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public SourceContext source(int i) {
			return getRuleContext(SourceContext.class,i);
		}
		public List<SourceContext> source() {
			return getRuleContexts(SourceContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94); source();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_source);
		try {
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); definition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LambdaContext lambda() {
			return getRuleContext(LambdaContext.class,0);
		}
		public ProcedureCallContext procedureCall() {
			return getRuleContext(ProcedureCallContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LocalBindContext localBind() {
			return getRuleContext(LocalBindContext.class,0);
		}
		public IterationContext iteration() {
			return getRuleContext(IterationContext.class,0);
		}
		public DelayEvalContext delayEval() {
			return getRuleContext(DelayEvalContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); variable();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); literal();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(105); condition();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106); localBind();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(107); assignment();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(108); sequence();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(109); iteration();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(110); delayEval();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(111); lambda();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(112); procedureCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public CharacterLiteralContext characterLiteral() {
			return getRuleContext(CharacterLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public QuotationContext quotation() {
			return getRuleContext(QuotationContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literal);
		try {
			setState(120);
			switch (_input.LA(1)) {
			case Boolean:
				enterOuterAlt(_localctx, 1);
				{
				setState(115); booleanLiteral();
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(116); numberLiteral();
				}
				break;
			case Character:
				enterOuterAlt(_localctx, 3);
				{
				setState(117); characterLiteral();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(118); stringLiteral();
				}
				break;
			case LPAREN:
			case SINGLEQUOTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(119); quotation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GuaParser.Identifier, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode Boolean() { return getToken(GuaParser.Boolean, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(Boolean);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(GuaParser.Number, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_numberLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharacterLiteralContext extends ParserRuleContext {
		public TerminalNode Character() { return getToken(GuaParser.Character, 0); }
		public CharacterLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitCharacterLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterLiteralContext characterLiteral() throws RecognitionException {
		CharacterLiteralContext _localctx = new CharacterLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_characterLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(Character);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(GuaParser.String, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(String);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolLiteralContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GuaParser.Identifier, 0); }
		public SymbolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitSymbolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolLiteralContext symbolLiteral() throws RecognitionException {
		SymbolLiteralContext _localctx = new SymbolLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_symbolLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotationContext extends ParserRuleContext {
		public TerminalNode QUOTE() { return getToken(GuaParser.QUOTE, 0); }
		public DataumContext dataum() {
			return getRuleContext(DataumContext.class,0);
		}
		public QuotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitQuotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotationContext quotation() throws RecognitionException {
		QuotationContext _localctx = new QuotationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_quotation);
		try {
			setState(141);
			switch (_input.LA(1)) {
			case SINGLEQUOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(134); match(SINGLEQUOTE);
				setState(135); dataum();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); match(LPAREN);
				setState(137); match(QUOTE);
				setState(138); dataum();
				setState(139); match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataumContext extends ParserRuleContext {
		public CharacterLiteralContext characterLiteral() {
			return getRuleContext(CharacterLiteralContext.class,0);
		}
		public SymbolLiteralContext symbolLiteral() {
			return getRuleContext(SymbolLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public VectorContext vector() {
			return getRuleContext(VectorContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public DataumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitDataum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataumContext dataum() throws RecognitionException {
		DataumContext _localctx = new DataumContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dataum);
		try {
			setState(151);
			switch (_input.LA(1)) {
			case Boolean:
				enterOuterAlt(_localctx, 1);
				{
				setState(143); booleanLiteral();
				}
				break;
			case Number:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); numberLiteral();
				}
				break;
			case Character:
				enterOuterAlt(_localctx, 3);
				{
				setState(145); characterLiteral();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 4);
				{
				setState(146); stringLiteral();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(147); symbolLiteral();
				}
				break;
			case LPAREN:
			case SINGLEQUOTE:
				enterOuterAlt(_localctx, 6);
				{
				setState(148); list();
				}
				break;
			case VEC_PAREN:
				enterOuterAlt(_localctx, 7);
				{
				setState(149); vector();
				}
				break;
			case MAP_PAREN:
				enterOuterAlt(_localctx, 8);
				{
				setState(150); map();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
	 
		public ListContext() { }
		public void copyFrom(ListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProperListContext extends ListContext {
		public DataumContext dataum(int i) {
			return getRuleContext(DataumContext.class,i);
		}
		public List<DataumContext> dataum() {
			return getRuleContexts(DataumContext.class);
		}
		public ProperListContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitProperList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairOrImproperListContext extends ListContext {
		public DataumContext last;
		public DataumContext dataum(int i) {
			return getRuleContext(DataumContext.class,i);
		}
		public List<DataumContext> dataum() {
			return getRuleContexts(DataumContext.class);
		}
		public PairOrImproperListContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitPairOrImproperList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AbbrevListContext extends ListContext {
		public DataumContext dataum() {
			return getRuleContext(DataumContext.class,0);
		}
		public AbbrevContext abbrev() {
			return getRuleContext(AbbrevContext.class,0);
		}
		public AbbrevListContext(ListContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitAbbrevList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_list);
		int _la;
		try {
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ProperListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153); match(LPAREN);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << VEC_PAREN) | (1L << MAP_PAREN) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0)) {
					{
					{
					setState(154); dataum();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160); match(RPAREN);
				}
				break;

			case 2:
				_localctx = new PairOrImproperListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(LPAREN);
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(162); dataum();
					}
					}
					setState(165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << VEC_PAREN) | (1L << MAP_PAREN) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0) );
				setState(167); match(DOT);
				setState(168); ((PairOrImproperListContext)_localctx).last = dataum();
				setState(169); match(RPAREN);
				}
				break;

			case 3:
				_localctx = new AbbrevListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(171); abbrev();
				setState(172); dataum();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbbrevContext extends ParserRuleContext {
		public AbbrevContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abbrev; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitAbbrev(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbbrevContext abbrev() throws RecognitionException {
		AbbrevContext _localctx = new AbbrevContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_abbrev);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(SINGLEQUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VectorContext extends ParserRuleContext {
		public DataumContext dataum(int i) {
			return getRuleContext(DataumContext.class,i);
		}
		public List<DataumContext> dataum() {
			return getRuleContexts(DataumContext.class);
		}
		public VectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitVector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VectorContext vector() throws RecognitionException {
		VectorContext _localctx = new VectorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(VEC_PAREN);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << VEC_PAREN) | (1L << MAP_PAREN) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0)) {
				{
				{
				setState(179); dataum();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapContext extends ParserRuleContext {
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(MAP_PAREN);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(188); member();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public DataumContext key;
		public DataumContext value;
		public DataumContext dataum(int i) {
			return getRuleContext(DataumContext.class,i);
		}
		public List<DataumContext> dataum() {
			return getRuleContexts(DataumContext.class);
		}
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(LPAREN);
			setState(197); ((MemberContext)_localctx).key = dataum();
			setState(198); match(DOT);
			setState(199); ((MemberContext)_localctx).value = dataum();
			setState(200); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public OrConditionContext orCondition() {
			return getRuleContext(OrConditionContext.class,0);
		}
		public AndConditionContext andCondition() {
			return getRuleContext(AndConditionContext.class,0);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public CaseConditionContext caseCondition() {
			return getRuleContext(CaseConditionContext.class,0);
		}
		public CondConditionContext condCondition() {
			return getRuleContext(CondConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_condition);
		try {
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); ifCondition();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); condCondition();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204); caseCondition();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205); andCondition();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206); orCondition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionContext extends ParserRuleContext {
		public ExpressionContext test;
		public ExpressionContext consequent;
		public ExpressionContext alternate;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IF() { return getToken(GuaParser.IF, 0); }
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(LPAREN);
			setState(210); match(IF);
			setState(211); ((IfConditionContext)_localctx).test = expression();
			setState(212); ((IfConditionContext)_localctx).consequent = expression();
			setState(214);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0)) {
				{
				setState(213); ((IfConditionContext)_localctx).alternate = expression();
				}
			}

			setState(216); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondConditionContext extends ParserRuleContext {
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public List<CondClauseContext> condClause() {
			return getRuleContexts(CondClauseContext.class);
		}
		public CondClauseContext condClause(int i) {
			return getRuleContext(CondClauseContext.class,i);
		}
		public TerminalNode COND() { return getToken(GuaParser.COND, 0); }
		public CondConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitCondCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondConditionContext condCondition() throws RecognitionException {
		CondConditionContext _localctx = new CondConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condCondition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(LPAREN);
			setState(219); match(COND);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(220); condClause();
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(227);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(226); elseClause();
				}
			}

			setState(229); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondClauseContext extends ParserRuleContext {
		public CondClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condClause; }
	 
		public CondClauseContext() { }
		public void copyFrom(CondClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondClauseOrderContext extends CondClauseContext {
		public ExpressionContext test;
		public ExpressionContext expression;
		public List<ExpressionContext> order = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CondClauseOrderContext(CondClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitCondClauseOrder(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondClauseArrowContext extends CondClauseContext {
		public ExpressionContext test;
		public ExpressionContext operator;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CondClauseArrowContext(CondClauseContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitCondClauseArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondClauseContext condClause() throws RecognitionException {
		CondClauseContext _localctx = new CondClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condClause);
		int _la;
		try {
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new CondClauseOrderContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231); match(LPAREN);
				setState(232); ((CondClauseOrderContext)_localctx).test = expression();
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0)) {
					{
					{
					setState(233); ((CondClauseOrderContext)_localctx).expression = expression();
					((CondClauseOrderContext)_localctx).order.add(((CondClauseOrderContext)_localctx).expression);
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239); match(RPAREN);
				}
				break;

			case 2:
				_localctx = new CondClauseArrowContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241); match(LPAREN);
				setState(242); ((CondClauseArrowContext)_localctx).test = expression();
				setState(243); match(ARROW);
				setState(244); ((CondClauseArrowContext)_localctx).operator = expression();
				setState(245); match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseConditionContext extends ParserRuleContext {
		public ExpressionContext key;
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public TerminalNode CASE() { return getToken(GuaParser.CASE, 0); }
		public CaseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitCaseCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseConditionContext caseCondition() throws RecognitionException {
		CaseConditionContext _localctx = new CaseConditionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_caseCondition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(LPAREN);
			setState(250); match(CASE);
			setState(251); ((CaseConditionContext)_localctx).key = expression();
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(252); caseClause();
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(259);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(258); elseClause();
				}
			}

			setState(261); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public DataumContext dataum(int i) {
			return getRuleContext(DataumContext.class,i);
		}
		public List<DataumContext> dataum() {
			return getRuleContexts(DataumContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitCaseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(LPAREN);
			setState(264); match(LPAREN);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << VEC_PAREN) | (1L << MAP_PAREN) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0)) {
				{
				{
				setState(265); dataum();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271); match(RPAREN);
			setState(273); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(272); expression();
				}
				}
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(277); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseClauseContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> order = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode ELSE() { return getToken(GuaParser.ELSE, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); match(LPAREN);
			setState(280); match(ELSE);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0)) {
				{
				{
				setState(281); ((ElseClauseContext)_localctx).expression = expression();
				((ElseClauseContext)_localctx).order.add(((ElseClauseContext)_localctx).expression);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode AND() { return getToken(GuaParser.AND, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitAndCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndConditionContext andCondition() throws RecognitionException {
		AndConditionContext _localctx = new AndConditionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_andCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289); match(LPAREN);
			setState(290); match(AND);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0)) {
				{
				{
				setState(291); expression();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrConditionContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(GuaParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitOrCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrConditionContext orCondition() throws RecognitionException {
		OrConditionContext _localctx = new OrConditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_orCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(LPAREN);
			setState(300); match(OR);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0)) {
				{
				{
				setState(301); expression();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalBindContext extends ParserRuleContext {
		public LetBindContext letBind() {
			return getRuleContext(LetBindContext.class,0);
		}
		public LetRecBindContext letRecBind() {
			return getRuleContext(LetRecBindContext.class,0);
		}
		public LetStarBindContext letStarBind() {
			return getRuleContext(LetStarBindContext.class,0);
		}
		public LocalBindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localBind; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitLocalBind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalBindContext localBind() throws RecognitionException {
		LocalBindContext _localctx = new LocalBindContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_localBind);
		try {
			setState(312);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309); letBind();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310); letStarBind();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(311); letRecBind();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetBindContext extends ParserRuleContext {
		public BindsContext binds() {
			return getRuleContext(BindsContext.class,0);
		}
		public TerminalNode LET() { return getToken(GuaParser.LET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LetBindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letBind; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitLetBind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetBindContext letBind() throws RecognitionException {
		LetBindContext _localctx = new LetBindContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_letBind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); match(LPAREN);
			setState(315); match(LET);
			setState(316); binds();
			setState(317); body();
			setState(318); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetStarBindContext extends ParserRuleContext {
		public BindsContext binds() {
			return getRuleContext(BindsContext.class,0);
		}
		public TerminalNode LETSTAR() { return getToken(GuaParser.LETSTAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LetStarBindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStarBind; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitLetStarBind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStarBindContext letStarBind() throws RecognitionException {
		LetStarBindContext _localctx = new LetStarBindContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_letStarBind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); match(LPAREN);
			setState(321); match(LETSTAR);
			setState(322); binds();
			setState(323); body();
			setState(324); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetRecBindContext extends ParserRuleContext {
		public BindsContext binds() {
			return getRuleContext(BindsContext.class,0);
		}
		public TerminalNode LETREC() { return getToken(GuaParser.LETREC, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LetRecBindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letRecBind; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitLetRecBind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetRecBindContext letRecBind() throws RecognitionException {
		LetRecBindContext _localctx = new LetRecBindContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_letRecBind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); match(LPAREN);
			setState(327); match(LETREC);
			setState(328); binds();
			setState(329); body();
			setState(330); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindsContext extends ParserRuleContext {
		public List<BindContext> bind() {
			return getRuleContexts(BindContext.class);
		}
		public BindContext bind(int i) {
			return getRuleContext(BindContext.class,i);
		}
		public BindsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binds; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitBinds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindsContext binds() throws RecognitionException {
		BindsContext _localctx = new BindsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_binds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(LPAREN);
			setState(334); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(333); bind();
				}
				}
				setState(336); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(338); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BindContext extends ParserRuleContext {
		public Token varname;
		public ExpressionContext init;
		public TerminalNode Identifier() { return getToken(GuaParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bind; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitBind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindContext bind() throws RecognitionException {
		BindContext _localctx = new BindContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340); match(LPAREN);
			setState(341); ((BindContext)_localctx).varname = match(Identifier);
			setState(342); ((BindContext)_localctx).init = expression();
			setState(343); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public SetAssignmentContext setAssignment() {
			return getRuleContext(SetAssignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); setAssignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetAssignmentContext extends ParserRuleContext {
		public Token varname;
		public TerminalNode SET() { return getToken(GuaParser.SET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(GuaParser.Identifier, 0); }
		public SetAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitSetAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetAssignmentContext setAssignment() throws RecognitionException {
		SetAssignmentContext _localctx = new SetAssignmentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_setAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347); match(LPAREN);
			setState(348); match(SET);
			setState(349); ((SetAssignmentContext)_localctx).varname = match(Identifier);
			setState(350); expression();
			setState(351); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceContext extends ParserRuleContext {
		public BeginSequenceContext beginSequence() {
			return getRuleContext(BeginSequenceContext.class,0);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353); beginSequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeginSequenceContext extends ParserRuleContext {
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public TerminalNode BEGIN() { return getToken(GuaParser.BEGIN, 0); }
		public BeginSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginSequence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitBeginSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginSequenceContext beginSequence() throws RecognitionException {
		BeginSequenceContext _localctx = new BeginSequenceContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_beginSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355); match(LPAREN);
			setState(356); match(BEGIN);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0)) {
				{
				{
				setState(357); action();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_action);
		try {
			setState(367);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365); expression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366); definition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationContext extends ParserRuleContext {
		public DoIterationContext doIteration() {
			return getRuleContext(DoIterationContext.class,0);
		}
		public IterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitIteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationContext iteration() throws RecognitionException {
		IterationContext _localctx = new IterationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_iteration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); doIteration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoIterationContext extends ParserRuleContext {
		public ExpressionContext test;
		public ExpressionContext expression;
		public List<ExpressionContext> order = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> command = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DoBindsContext doBinds() {
			return getRuleContext(DoBindsContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DO() { return getToken(GuaParser.DO, 0); }
		public DoIterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doIteration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitDoIteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoIterationContext doIteration() throws RecognitionException {
		DoIterationContext _localctx = new DoIterationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_doIteration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371); match(LPAREN);
			setState(372); match(DO);
			setState(373); match(LPAREN);
			setState(374); doBinds();
			setState(375); match(RPAREN);
			setState(376); match(LPAREN);
			setState(377); ((DoIterationContext)_localctx).test = expression();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0)) {
				{
				{
				setState(378); ((DoIterationContext)_localctx).expression = expression();
				((DoIterationContext)_localctx).order.add(((DoIterationContext)_localctx).expression);
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384); match(RPAREN);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0)) {
				{
				{
				setState(385); ((DoIterationContext)_localctx).expression = expression();
				((DoIterationContext)_localctx).command.add(((DoIterationContext)_localctx).expression);
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoBindsContext extends ParserRuleContext {
		public DoBindContext doBind(int i) {
			return getRuleContext(DoBindContext.class,i);
		}
		public List<DoBindContext> doBind() {
			return getRuleContexts(DoBindContext.class);
		}
		public DoBindsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doBinds; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitDoBinds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoBindsContext doBinds() throws RecognitionException {
		DoBindsContext _localctx = new DoBindsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_doBinds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); match(LPAREN);
			setState(395); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(394); doBind();
				}
				}
				setState(397); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Identifier );
			setState(399); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoBindContext extends ParserRuleContext {
		public Token varname;
		public ExpressionContext init;
		public ExpressionContext step;
		public TerminalNode Identifier() { return getToken(GuaParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DoBindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doBind; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitDoBind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoBindContext doBind() throws RecognitionException {
		DoBindContext _localctx = new DoBindContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_doBind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); ((DoBindContext)_localctx).varname = match(Identifier);
			setState(402); ((DoBindContext)_localctx).init = expression();
			setState(403); ((DoBindContext)_localctx).step = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelayEvalContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DELAY() { return getToken(GuaParser.DELAY, 0); }
		public DelayEvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delayEval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitDelayEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelayEvalContext delayEval() throws RecognitionException {
		DelayEvalContext _localctx = new DelayEvalContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_delayEval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405); match(LPAREN);
			setState(406); match(DELAY);
			setState(408); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(407); expression();
				}
				}
				setState(410); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0) );
			setState(412); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaContext extends ParserRuleContext {
		public LambdaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda; }
	 
		public LambdaContext() { }
		public void copyFrom(LambdaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LambdaFixedArgumentsContext extends LambdaContext {
		public Token Identifier;
		public List<Token> formals = new ArrayList<Token>();
		public List<TerminalNode> Identifier() { return getTokens(GuaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(GuaParser.Identifier, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode LAMBDA() { return getToken(GuaParser.LAMBDA, 0); }
		public LambdaFixedArgumentsContext(LambdaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitLambdaFixedArguments(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaRestArgumentsContext extends LambdaContext {
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode LAMBDA() { return getToken(GuaParser.LAMBDA, 0); }
		public LambdaRestArgumentsContext(LambdaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitLambdaRestArguments(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaAnyArgumentsContext extends LambdaContext {
		public Token formal;
		public TerminalNode Identifier() { return getToken(GuaParser.Identifier, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode LAMBDA() { return getToken(GuaParser.LAMBDA, 0); }
		public LambdaAnyArgumentsContext(LambdaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitLambdaAnyArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaContext lambda() throws RecognitionException {
		LambdaContext _localctx = new LambdaContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_lambda);
		int _la;
		try {
			setState(441);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new LambdaFixedArgumentsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(414); match(LPAREN);
				setState(415); match(LAMBDA);
				setState(416); match(LPAREN);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(417); ((LambdaFixedArgumentsContext)_localctx).Identifier = match(Identifier);
					((LambdaFixedArgumentsContext)_localctx).formals.add(((LambdaFixedArgumentsContext)_localctx).Identifier);
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(423); match(RPAREN);
				setState(424); body();
				setState(425); match(RPAREN);
				}
				break;

			case 2:
				_localctx = new LambdaAnyArgumentsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(427); match(LPAREN);
				setState(428); match(LAMBDA);
				setState(429); ((LambdaAnyArgumentsContext)_localctx).formal = match(Identifier);
				setState(430); body();
				setState(431); match(RPAREN);
				}
				break;

			case 3:
				_localctx = new LambdaRestArgumentsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(433); match(LPAREN);
				setState(434); match(LAMBDA);
				setState(435); match(LPAREN);
				setState(436); rest();
				setState(437); match(RPAREN);
				setState(438); body();
				setState(439); match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestContext extends ParserRuleContext {
		public Token last;
		public List<TerminalNode> Identifier() { return getTokens(GuaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(GuaParser.Identifier, i);
		}
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_rest);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(444); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(443); match(Identifier);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(446); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(448);
			matchWildcard();
			setState(449); ((RestContext)_localctx).last = match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureCallContext extends ParserRuleContext {
		public ExpressionContext operator;
		public ExpressionContext expression;
		public List<ExpressionContext> operands = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ProcedureCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitProcedureCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureCallContext procedureCall() throws RecognitionException {
		ProcedureCallContext _localctx = new ProcedureCallContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_procedureCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451); match(LPAREN);
			setState(452); ((ProcedureCallContext)_localctx).operator = expression();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0)) {
				{
				{
				setState(453); ((ProcedureCallContext)_localctx).expression = expression();
				((ProcedureCallContext)_localctx).operands.add(((ProcedureCallContext)_localctx).expression);
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(459); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	 
		public DefinitionContext() { }
		public void copyFrom(DefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefineLambdaRestArgumentsContext extends DefinitionContext {
		public Token varname;
		public Token formal;
		public List<TerminalNode> Identifier() { return getTokens(GuaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(GuaParser.Identifier, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DEFINE() { return getToken(GuaParser.DEFINE, 0); }
		public DefineLambdaRestArgumentsContext(DefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitDefineLambdaRestArguments(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefineVariableContext extends DefinitionContext {
		public Token varname;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(GuaParser.Identifier, 0); }
		public TerminalNode DEFINE() { return getToken(GuaParser.DEFINE, 0); }
		public DefineVariableContext(DefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitDefineVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefineProcedureContext extends DefinitionContext {
		public Token varname;
		public Token Identifier;
		public List<Token> formals = new ArrayList<Token>();
		public List<TerminalNode> Identifier() { return getTokens(GuaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(GuaParser.Identifier, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DEFINE() { return getToken(GuaParser.DEFINE, 0); }
		public DefineProcedureContext(DefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitDefineProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_definition);
		int _la;
		try {
			setState(491);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new DefineProcedureContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(461); match(LPAREN);
				setState(462); match(DEFINE);
				setState(463); match(LPAREN);
				setState(464); ((DefineProcedureContext)_localctx).varname = match(Identifier);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(465); ((DefineProcedureContext)_localctx).Identifier = match(Identifier);
					((DefineProcedureContext)_localctx).formals.add(((DefineProcedureContext)_localctx).Identifier);
					}
					}
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(471); match(RPAREN);
				setState(472); body();
				setState(473); match(RPAREN);
				}
				break;

			case 2:
				_localctx = new DefineLambdaRestArgumentsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(475); match(LPAREN);
				setState(476); match(DEFINE);
				setState(477); match(LPAREN);
				setState(478); ((DefineLambdaRestArgumentsContext)_localctx).varname = match(Identifier);
				setState(479); match(DOT);
				setState(480); ((DefineLambdaRestArgumentsContext)_localctx).formal = match(Identifier);
				setState(481); match(RPAREN);
				setState(482); body();
				setState(483); match(RPAREN);
				}
				break;

			case 3:
				_localctx = new DefineVariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(485); match(LPAREN);
				setState(486); match(DEFINE);
				setState(487); ((DefineVariableContext)_localctx).varname = match(Identifier);
				setState(488); expression();
				setState(489); match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GuaParserVisitor ) return ((GuaParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(493); definition();
					}
					} 
				}
				setState(498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(500); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(499); expression();
				}
				}
				setState(502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << SINGLEQUOTE) | (1L << Boolean) | (1L << Character) | (1L << String) | (1L << Number) | (1L << Identifier))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3 \u01fb\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4"+
		")\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\6\2b\n\2\r\2\16"+
		"\2c\3\3\3\3\5\3h\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4t\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\5\5{\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0090\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u009a\n\r\3\16\3\16\7\16\u009e\n\16\f\16\16\16\u00a1"+
		"\13\16\3\16\3\16\3\16\6\16\u00a6\n\16\r\16\16\16\u00a7\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00b1\n\16\3\17\3\17\3\20\3\20\7\20\u00b7\n"+
		"\20\f\20\16\20\u00ba\13\20\3\20\3\20\3\21\3\21\7\21\u00c0\n\21\f\21\16"+
		"\21\u00c3\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00d2\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00d9\n\24\3"+
		"\24\3\24\3\25\3\25\3\25\7\25\u00e0\n\25\f\25\16\25\u00e3\13\25\3\25\5"+
		"\25\u00e6\n\25\3\25\3\25\3\26\3\26\3\26\7\26\u00ed\n\26\f\26\16\26\u00f0"+
		"\13\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00fa\n\26\3\27\3"+
		"\27\3\27\3\27\7\27\u0100\n\27\f\27\16\27\u0103\13\27\3\27\5\27\u0106\n"+
		"\27\3\27\3\27\3\30\3\30\3\30\7\30\u010d\n\30\f\30\16\30\u0110\13\30\3"+
		"\30\3\30\6\30\u0114\n\30\r\30\16\30\u0115\3\30\3\30\3\31\3\31\3\31\7\31"+
		"\u011d\n\31\f\31\16\31\u0120\13\31\3\31\3\31\3\32\3\32\3\32\7\32\u0127"+
		"\n\32\f\32\16\32\u012a\13\32\3\32\3\32\3\33\3\33\3\33\7\33\u0131\n\33"+
		"\f\33\16\33\u0134\13\33\3\33\3\33\3\34\3\34\3\34\5\34\u013b\n\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \6 \u0151\n \r \16 \u0152\3 \3 \3!\3!\3!\3!\3!\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3%\7%\u0169\n%\f%\16%\u016c\13%\3"+
		"%\3%\3&\3&\5&\u0172\n&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\7(\u017e\n(\f("+
		"\16(\u0181\13(\3(\3(\7(\u0185\n(\f(\16(\u0188\13(\3(\3(\3)\3)\6)\u018e"+
		"\n)\r)\16)\u018f\3)\3)\3*\3*\3*\3*\3+\3+\3+\6+\u019b\n+\r+\16+\u019c\3"+
		"+\3+\3,\3,\3,\3,\7,\u01a5\n,\f,\16,\u01a8\13,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u01bc\n,\3-\6-\u01bf\n-\r-\16-\u01c0"+
		"\3-\3-\3-\3.\3.\3.\7.\u01c9\n.\f.\16.\u01cc\13.\3.\3.\3/\3/\3/\3/\3/\7"+
		"/\u01d5\n/\f/\16/\u01d8\13/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\5/\u01ee\n/\3\60\7\60\u01f1\n\60\f\60\16\60\u01f4\13"+
		"\60\3\60\6\60\u01f7\n\60\r\60\16\60\u01f8\3\60\2\61\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\2\u020b"+
		"\2a\3\2\2\2\4g\3\2\2\2\6s\3\2\2\2\bz\3\2\2\2\n|\3\2\2\2\f~\3\2\2\2\16"+
		"\u0080\3\2\2\2\20\u0082\3\2\2\2\22\u0084\3\2\2\2\24\u0086\3\2\2\2\26\u008f"+
		"\3\2\2\2\30\u0099\3\2\2\2\32\u00b0\3\2\2\2\34\u00b2\3\2\2\2\36\u00b4\3"+
		"\2\2\2 \u00bd\3\2\2\2\"\u00c6\3\2\2\2$\u00d1\3\2\2\2&\u00d3\3\2\2\2(\u00dc"+
		"\3\2\2\2*\u00f9\3\2\2\2,\u00fb\3\2\2\2.\u0109\3\2\2\2\60\u0119\3\2\2\2"+
		"\62\u0123\3\2\2\2\64\u012d\3\2\2\2\66\u013a\3\2\2\28\u013c\3\2\2\2:\u0142"+
		"\3\2\2\2<\u0148\3\2\2\2>\u014e\3\2\2\2@\u0156\3\2\2\2B\u015b\3\2\2\2D"+
		"\u015d\3\2\2\2F\u0163\3\2\2\2H\u0165\3\2\2\2J\u0171\3\2\2\2L\u0173\3\2"+
		"\2\2N\u0175\3\2\2\2P\u018b\3\2\2\2R\u0193\3\2\2\2T\u0197\3\2\2\2V\u01bb"+
		"\3\2\2\2X\u01be\3\2\2\2Z\u01c5\3\2\2\2\\\u01ed\3\2\2\2^\u01f2\3\2\2\2"+
		"`b\5\4\3\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\3\3\2\2\2eh\5\\/\2"+
		"fh\5\6\4\2ge\3\2\2\2gf\3\2\2\2h\5\3\2\2\2it\5\n\6\2jt\5\b\5\2kt\5$\23"+
		"\2lt\5\66\34\2mt\5B\"\2nt\5F$\2ot\5L\'\2pt\5T+\2qt\5V,\2rt\5Z.\2si\3\2"+
		"\2\2sj\3\2\2\2sk\3\2\2\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2sp\3\2"+
		"\2\2sq\3\2\2\2sr\3\2\2\2t\7\3\2\2\2u{\5\f\7\2v{\5\16\b\2w{\5\20\t\2x{"+
		"\5\22\n\2y{\5\26\f\2zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2zy\3\2\2\2"+
		"{\t\3\2\2\2|}\7\36\2\2}\13\3\2\2\2~\177\7\32\2\2\177\r\3\2\2\2\u0080\u0081"+
		"\7\35\2\2\u0081\17\3\2\2\2\u0082\u0083\7\33\2\2\u0083\21\3\2\2\2\u0084"+
		"\u0085\7\34\2\2\u0085\23\3\2\2\2\u0086\u0087\7\36\2\2\u0087\25\3\2\2\2"+
		"\u0088\u0089\7\7\2\2\u0089\u0090\5\30\r\2\u008a\u008b\7\3\2\2\u008b\u008c"+
		"\7\n\2\2\u008c\u008d\5\30\r\2\u008d\u008e\7\4\2\2\u008e\u0090\3\2\2\2"+
		"\u008f\u0088\3\2\2\2\u008f\u008a\3\2\2\2\u0090\27\3\2\2\2\u0091\u009a"+
		"\5\f\7\2\u0092\u009a\5\16\b\2\u0093\u009a\5\20\t\2\u0094\u009a\5\22\n"+
		"\2\u0095\u009a\5\24\13\2\u0096\u009a\5\32\16\2\u0097\u009a\5\36\20\2\u0098"+
		"\u009a\5 \21\2\u0099\u0091\3\2\2\2\u0099\u0092\3\2\2\2\u0099\u0093\3\2"+
		"\2\2\u0099\u0094\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\31\3\2\2\2\u009b\u009f\7\3\2"+
		"\2\u009c\u009e\5\30\r\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\u00b1\7\4\2\2\u00a3\u00a5\7\3\2\2\u00a4\u00a6\5\30\r\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\5\2\2\u00aa\u00ab\5\30\r\2\u00ab"+
		"\u00ac\7\4\2\2\u00ac\u00b1\3\2\2\2\u00ad\u00ae\5\34\17\2\u00ae\u00af\5"+
		"\30\r\2\u00af\u00b1\3\2\2\2\u00b0\u009b\3\2\2\2\u00b0\u00a3\3\2\2\2\u00b0"+
		"\u00ad\3\2\2\2\u00b1\33\3\2\2\2\u00b2\u00b3\7\7\2\2\u00b3\35\3\2\2\2\u00b4"+
		"\u00b8\7\b\2\2\u00b5\u00b7\5\30\r\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3"+
		"\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00bb\u00bc\7\4\2\2\u00bc\37\3\2\2\2\u00bd\u00c1\7\t\2"+
		"\2\u00be\u00c0\5\"\22\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4\u00c5\7\4\2\2\u00c5!\3\2\2\2\u00c6\u00c7\7\3\2\2\u00c7\u00c8"+
		"\5\30\r\2\u00c8\u00c9\7\5\2\2\u00c9\u00ca\5\30\r\2\u00ca\u00cb\7\4\2\2"+
		"\u00cb#\3\2\2\2\u00cc\u00d2\5&\24\2\u00cd\u00d2\5(\25\2\u00ce\u00d2\5"+
		",\27\2\u00cf\u00d2\5\62\32\2\u00d0\u00d2\5\64\33\2\u00d1\u00cc\3\2\2\2"+
		"\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0"+
		"\3\2\2\2\u00d2%\3\2\2\2\u00d3\u00d4\7\3\2\2\u00d4\u00d5\7\23\2\2\u00d5"+
		"\u00d6\5\6\4\2\u00d6\u00d8\5\6\4\2\u00d7\u00d9\5\6\4\2\u00d8\u00d7\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\4\2\2\u00db"+
		"\'\3\2\2\2\u00dc\u00dd\7\3\2\2\u00dd\u00e1\7\22\2\2\u00de\u00e0\5*\26"+
		"\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\5\60\31\2"+
		"\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8"+
		"\7\4\2\2\u00e8)\3\2\2\2\u00e9\u00ea\7\3\2\2\u00ea\u00ee\5\6\4\2\u00eb"+
		"\u00ed\5\6\4\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f2\7\4\2\2\u00f2\u00fa\3\2\2\2\u00f3\u00f4\7\3\2\2\u00f4\u00f5\5\6"+
		"\4\2\u00f5\u00f6\7\6\2\2\u00f6\u00f7\5\6\4\2\u00f7\u00f8\7\4\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00e9\3\2\2\2\u00f9\u00f3\3\2\2\2\u00fa+\3\2\2\2"+
		"\u00fb\u00fc\7\3\2\2\u00fc\u00fd\7\24\2\2\u00fd\u0101\5\6\4\2\u00fe\u0100"+
		"\5.\30\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0106\5\60"+
		"\31\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\7\4\2\2\u0108-\3\2\2\2\u0109\u010a\7\3\2\2\u010a\u010e\7\3\2\2"+
		"\u010b\u010d\5\30\r\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0113\7\4\2\2\u0112\u0114\5\6\4\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\7\4\2\2\u0118/\3\2\2\2\u0119\u011a\7\3\2\2\u011a\u011e\7\25\2\2"+
		"\u011b\u011d\5\6\4\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121"+
		"\u0122\7\4\2\2\u0122\61\3\2\2\2\u0123\u0124\7\3\2\2\u0124\u0128\7\26\2"+
		"\2\u0125\u0127\5\6\4\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012c\7\4\2\2\u012c\63\3\2\2\2\u012d\u012e\7\3\2\2\u012e\u0132\7\27\2"+
		"\2\u012f\u0131\5\6\4\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"\u0136\7\4\2\2\u0136\65\3\2\2\2\u0137\u013b\58\35\2\u0138\u013b\5:\36"+
		"\2\u0139\u013b\5<\37\2\u013a\u0137\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139"+
		"\3\2\2\2\u013b\67\3\2\2\2\u013c\u013d\7\3\2\2\u013d\u013e\7\17\2\2\u013e"+
		"\u013f\5> \2\u013f\u0140\5^\60\2\u0140\u0141\7\4\2\2\u01419\3\2\2\2\u0142"+
		"\u0143\7\3\2\2\u0143\u0144\7\20\2\2\u0144\u0145\5> \2\u0145\u0146\5^\60"+
		"\2\u0146\u0147\7\4\2\2\u0147;\3\2\2\2\u0148\u0149\7\3\2\2\u0149\u014a"+
		"\7\21\2\2\u014a\u014b\5> \2\u014b\u014c\5^\60\2\u014c\u014d\7\4\2\2\u014d"+
		"=\3\2\2\2\u014e\u0150\7\3\2\2\u014f\u0151\5@!\2\u0150\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0155\7\4\2\2\u0155?\3\2\2\2\u0156\u0157\7\3\2\2\u0157\u0158"+
		"\7\36\2\2\u0158\u0159\5\6\4\2\u0159\u015a\7\4\2\2\u015aA\3\2\2\2\u015b"+
		"\u015c\5D#\2\u015cC\3\2\2\2\u015d\u015e\7\3\2\2\u015e\u015f\7\r\2\2\u015f"+
		"\u0160\7\36\2\2\u0160\u0161\5\6\4\2\u0161\u0162\7\4\2\2\u0162E\3\2\2\2"+
		"\u0163\u0164\5H%\2\u0164G\3\2\2\2\u0165\u0166\7\3\2\2\u0166\u016a\7\16"+
		"\2\2\u0167\u0169\5J&\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d"+
		"\u016e\7\4\2\2\u016eI\3\2\2\2\u016f\u0172\5\6\4\2\u0170\u0172\5\\/\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172K\3\2\2\2\u0173\u0174\5N(\2\u0174"+
		"M\3\2\2\2\u0175\u0176\7\3\2\2\u0176\u0177\7\30\2\2\u0177\u0178\7\3\2\2"+
		"\u0178\u0179\5P)\2\u0179\u017a\7\4\2\2\u017a\u017b\7\3\2\2\u017b\u017f"+
		"\5\6\4\2\u017c\u017e\5\6\4\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0182\u0186\7\4\2\2\u0183\u0185\5\6\4\2\u0184\u0183\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0189\u018a\7\4\2\2\u018aO\3\2\2\2\u018b\u018d"+
		"\7\3\2\2\u018c\u018e\5R*\2\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\7\4"+
		"\2\2\u0192Q\3\2\2\2\u0193\u0194\7\36\2\2\u0194\u0195\5\6\4\2\u0195\u0196"+
		"\5\6\4\2\u0196S\3\2\2\2\u0197\u0198\7\3\2\2\u0198\u019a\7\31\2\2\u0199"+
		"\u019b\5\6\4\2\u019a\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\7\4\2\2\u019f"+
		"U\3\2\2\2\u01a0\u01a1\7\3\2\2\u01a1\u01a2\7\f\2\2\u01a2\u01a6\7\3\2\2"+
		"\u01a3\u01a5\7\36\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9"+
		"\u01aa\7\4\2\2\u01aa\u01ab\5^\60\2\u01ab\u01ac\7\4\2\2\u01ac\u01bc\3\2"+
		"\2\2\u01ad\u01ae\7\3\2\2\u01ae\u01af\7\f\2\2\u01af\u01b0\7\36\2\2\u01b0"+
		"\u01b1\5^\60\2\u01b1\u01b2\7\4\2\2\u01b2\u01bc\3\2\2\2\u01b3\u01b4\7\3"+
		"\2\2\u01b4\u01b5\7\f\2\2\u01b5\u01b6\7\3\2\2\u01b6\u01b7\5X-\2\u01b7\u01b8"+
		"\7\4\2\2\u01b8\u01b9\5^\60\2\u01b9\u01ba\7\4\2\2\u01ba\u01bc\3\2\2\2\u01bb"+
		"\u01a0\3\2\2\2\u01bb\u01ad\3\2\2\2\u01bb\u01b3\3\2\2\2\u01bcW\3\2\2\2"+
		"\u01bd\u01bf\7\36\2\2\u01be\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01be"+
		"\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\13\2\2\2"+
		"\u01c3\u01c4\7\36\2\2\u01c4Y\3\2\2\2\u01c5\u01c6\7\3\2\2\u01c6\u01ca\5"+
		"\6\4\2\u01c7\u01c9\5\6\4\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca\3\2"+
		"\2\2\u01cd\u01ce\7\4\2\2\u01ce[\3\2\2\2\u01cf\u01d0\7\3\2\2\u01d0\u01d1"+
		"\7\13\2\2\u01d1\u01d2\7\3\2\2\u01d2\u01d6\7\36\2\2\u01d3\u01d5\7\36\2"+
		"\2\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da\7\4\2\2\u01da"+
		"\u01db\5^\60\2\u01db\u01dc\7\4\2\2\u01dc\u01ee\3\2\2\2\u01dd\u01de\7\3"+
		"\2\2\u01de\u01df\7\13\2\2\u01df\u01e0\7\3\2\2\u01e0\u01e1\7\36\2\2\u01e1"+
		"\u01e2\7\5\2\2\u01e2\u01e3\7\36\2\2\u01e3\u01e4\7\4\2\2\u01e4\u01e5\5"+
		"^\60\2\u01e5\u01e6\7\4\2\2\u01e6\u01ee\3\2\2\2\u01e7\u01e8\7\3\2\2\u01e8"+
		"\u01e9\7\13\2\2\u01e9\u01ea\7\36\2\2\u01ea\u01eb\5\6\4\2\u01eb\u01ec\7"+
		"\4\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01cf\3\2\2\2\u01ed\u01dd\3\2\2\2\u01ed"+
		"\u01e7\3\2\2\2\u01ee]\3\2\2\2\u01ef\u01f1\5\\/\2\u01f0\u01ef\3\2\2\2\u01f1"+
		"\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f6\3\2"+
		"\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f7\5\6\4\2\u01f6\u01f5\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9_\3\2\2\2"+
		"*cgsz\u008f\u0099\u009f\u00a7\u00b0\u00b8\u00c1\u00d1\u00d8\u00e1\u00e5"+
		"\u00ee\u00f9\u0101\u0105\u010e\u0115\u011e\u0128\u0132\u013a\u0152\u016a"+
		"\u0171\u017f\u0186\u018f\u019c\u01a6\u01bb\u01c0\u01ca\u01d6\u01ed\u01f2"+
		"\u01f8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}