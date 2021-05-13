// Generated from DSL2.g4 by ANTLR 4.7.1
package com.test.antlr.dsl.example2;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DSL2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OPERATOR=2, VAR=3, EQ=4, AND=5, INVOKE=6, SERVICE=7, GET=8, TOKEN=9, 
		DELEGATE=10, CREDENTIALS=11, WITH=12, CLIENT=13, IMPERONATE=14, USER=15, 
		KRB=16, AUTH=17, NUMBER=18, VARIABLE=19, COMPARE_OP=20, URL=21, URI=22, 
		PROTOCOL=23, ID=24, WS=25;
	public static final int
		RULE_dsl = 0, RULE_command = 1, RULE_get_token = 2, RULE_get_token_command = 3, 
		RULE_get_token_and_delegate = 4, RULE_invoke_service = 5, RULE_invoke_service_command = 6, 
		RULE_invoke_service_impersonate_command = 7, RULE_math = 8, RULE_assignment = 9, 
		RULE_comparison = 10, RULE_expression = 11, RULE_baseExpr = 12;
	public static final String[] ruleNames = {
		"dsl", "command", "get_token", "get_token_command", "get_token_and_delegate", 
		"invoke_service", "invoke_service_command", "invoke_service_impersonate_command", 
		"math", "assignment", "comparison", "expression", "baseExpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", null, "'var'", "'='", "'and'", "'invoke'", "'service'", "'get'", 
		"'token'", "'delegate'", "'credentials'", "'with'", "'client'", "'impersonate'", 
		"'user'", "'kerberos'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "OPERATOR", "VAR", "EQ", "AND", "INVOKE", "SERVICE", "GET", 
		"TOKEN", "DELEGATE", "CREDENTIALS", "WITH", "CLIENT", "IMPERONATE", "USER", 
		"KRB", "AUTH", "NUMBER", "VARIABLE", "COMPARE_OP", "URL", "URI", "PROTOCOL", 
		"ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DSL2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DSL2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DslContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public DslContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dsl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).enterDsl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).exitDsl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL2Visitor ) return ((DSL2Visitor<? extends T>)visitor).visitDsl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DslContext dsl() throws RecognitionException {
		DslContext _localctx = new DslContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dsl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				command();
				setState(27);
				match(T__0);
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << INVOKE) | (1L << GET) | (1L << NUMBER) | (1L << VARIABLE))) != 0) );
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

	public static class CommandContext extends ParserRuleContext {
		public Get_tokenContext get_token() {
			return getRuleContext(Get_tokenContext.class,0);
		}
		public Invoke_serviceContext invoke_service() {
			return getRuleContext(Invoke_serviceContext.class,0);
		}
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL2Visitor ) return ((DSL2Visitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				get_token();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				invoke_service();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				math();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				expression();
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

	public static class Get_tokenContext extends ParserRuleContext {
		public Get_token_commandContext get_token_command() {
			return getRuleContext(Get_token_commandContext.class,0);
		}
		public Get_token_and_delegateContext get_token_and_delegate() {
			return getRuleContext(Get_token_and_delegateContext.class,0);
		}
		public Get_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).enterGet_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).exitGet_token(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL2Visitor ) return ((DSL2Visitor<? extends T>)visitor).visitGet_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_tokenContext get_token() throws RecognitionException {
		Get_tokenContext _localctx = new Get_tokenContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_get_token);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				get_token_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				get_token_and_delegate();
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

	public static class Get_token_commandContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(DSL2Parser.GET, 0); }
		public TerminalNode AUTH() { return getToken(DSL2Parser.AUTH, 0); }
		public TerminalNode TOKEN() { return getToken(DSL2Parser.TOKEN, 0); }
		public Get_token_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_token_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).enterGet_token_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).exitGet_token_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL2Visitor ) return ((DSL2Visitor<? extends T>)visitor).visitGet_token_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_token_commandContext get_token_command() throws RecognitionException {
		Get_token_commandContext _localctx = new Get_token_commandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_get_token_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(GET);
			setState(44);
			match(AUTH);
			setState(45);
			match(TOKEN);
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

	public static class Get_token_and_delegateContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(DSL2Parser.GET, 0); }
		public TerminalNode KRB() { return getToken(DSL2Parser.KRB, 0); }
		public TerminalNode TOKEN() { return getToken(DSL2Parser.TOKEN, 0); }
		public TerminalNode AND() { return getToken(DSL2Parser.AND, 0); }
		public TerminalNode DELEGATE() { return getToken(DSL2Parser.DELEGATE, 0); }
		public TerminalNode CREDENTIALS() { return getToken(DSL2Parser.CREDENTIALS, 0); }
		public Get_token_and_delegateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_token_and_delegate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).enterGet_token_and_delegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).exitGet_token_and_delegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL2Visitor ) return ((DSL2Visitor<? extends T>)visitor).visitGet_token_and_delegate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_token_and_delegateContext get_token_and_delegate() throws RecognitionException {
		Get_token_and_delegateContext _localctx = new Get_token_and_delegateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_get_token_and_delegate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(GET);
			setState(48);
			match(KRB);
			setState(49);
			match(TOKEN);
			setState(50);
			match(AND);
			setState(51);
			match(DELEGATE);
			setState(52);
			match(CREDENTIALS);
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

	public static class Invoke_serviceContext extends ParserRuleContext {
		public Invoke_service_commandContext invoke_service_command() {
			return getRuleContext(Invoke_service_commandContext.class,0);
		}
		public Invoke_service_impersonate_commandContext invoke_service_impersonate_command() {
			return getRuleContext(Invoke_service_impersonate_commandContext.class,0);
		}
		public Invoke_serviceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoke_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).enterInvoke_service(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).exitInvoke_service(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL2Visitor ) return ((DSL2Visitor<? extends T>)visitor).visitInvoke_service(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Invoke_serviceContext invoke_service() throws RecognitionException {
		Invoke_serviceContext _localctx = new Invoke_serviceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_invoke_service);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				invoke_service_command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				invoke_service_impersonate_command();
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

	public static class Invoke_service_commandContext extends ParserRuleContext {
		public TerminalNode INVOKE() { return getToken(DSL2Parser.INVOKE, 0); }
		public TerminalNode SERVICE() { return getToken(DSL2Parser.SERVICE, 0); }
		public TerminalNode URL() { return getToken(DSL2Parser.URL, 0); }
		public TerminalNode WITH() { return getToken(DSL2Parser.WITH, 0); }
		public TerminalNode CLIENT() { return getToken(DSL2Parser.CLIENT, 0); }
		public TerminalNode VARIABLE() { return getToken(DSL2Parser.VARIABLE, 0); }
		public Invoke_service_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoke_service_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).enterInvoke_service_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).exitInvoke_service_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL2Visitor ) return ((DSL2Visitor<? extends T>)visitor).visitInvoke_service_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Invoke_service_commandContext invoke_service_command() throws RecognitionException {
		Invoke_service_commandContext _localctx = new Invoke_service_commandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_invoke_service_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(58);
			match(INVOKE);
			setState(59);
			match(SERVICE);
			setState(60);
			match(URL);
			setState(61);
			match(WITH);
			setState(62);
			match(CLIENT);
			setState(63);
			match(VARIABLE);
			}
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

	public static class Invoke_service_impersonate_commandContext extends ParserRuleContext {
		public TerminalNode INVOKE() { return getToken(DSL2Parser.INVOKE, 0); }
		public TerminalNode SERVICE() { return getToken(DSL2Parser.SERVICE, 0); }
		public TerminalNode URL() { return getToken(DSL2Parser.URL, 0); }
		public TerminalNode WITH() { return getToken(DSL2Parser.WITH, 0); }
		public TerminalNode CLIENT() { return getToken(DSL2Parser.CLIENT, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(DSL2Parser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(DSL2Parser.VARIABLE, i);
		}
		public TerminalNode AND() { return getToken(DSL2Parser.AND, 0); }
		public TerminalNode IMPERONATE() { return getToken(DSL2Parser.IMPERONATE, 0); }
		public TerminalNode USER() { return getToken(DSL2Parser.USER, 0); }
		public Invoke_service_impersonate_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invoke_service_impersonate_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).enterInvoke_service_impersonate_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).exitInvoke_service_impersonate_command(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL2Visitor ) return ((DSL2Visitor<? extends T>)visitor).visitInvoke_service_impersonate_command(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Invoke_service_impersonate_commandContext invoke_service_impersonate_command() throws RecognitionException {
		Invoke_service_impersonate_commandContext _localctx = new Invoke_service_impersonate_commandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_invoke_service_impersonate_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(65);
			match(INVOKE);
			setState(66);
			match(SERVICE);
			setState(67);
			match(URL);
			setState(68);
			match(WITH);
			setState(69);
			match(CLIENT);
			setState(70);
			match(VARIABLE);
			setState(71);
			match(AND);
			setState(72);
			match(IMPERONATE);
			setState(73);
			match(USER);
			setState(74);
			match(VARIABLE);
			}
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

	public static class MathContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).exitMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL2Visitor ) return ((DSL2Visitor<? extends T>)visitor).visitMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_math);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				assignment();
				}
				break;
			case NUMBER:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				comparison();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(DSL2Parser.VAR, 0); }
		public TerminalNode VARIABLE() { return getToken(DSL2Parser.VARIABLE, 0); }
		public TerminalNode EQ() { return getToken(DSL2Parser.EQ, 0); }
		public TerminalNode NUMBER() { return getToken(DSL2Parser.NUMBER, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL2Visitor ) return ((DSL2Visitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(VAR);
			setState(81);
			match(VARIABLE);
			setState(82);
			match(EQ);
			setState(83);
			match(NUMBER);
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

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode COMPARE_OP() { return getToken(DSL2Parser.COMPARE_OP, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(DSL2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DSL2Parser.NUMBER, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(DSL2Parser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(DSL2Parser.VARIABLE, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL2Visitor ) return ((DSL2Visitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(86);
			match(COMPARE_OP);
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		public List<BaseExprContext> baseExpr() {
			return getRuleContexts(BaseExprContext.class);
		}
		public BaseExprContext baseExpr(int i) {
			return getRuleContext(BaseExprContext.class,i);
		}
		public TerminalNode EOF() { return getToken(DSL2Parser.EOF, 0); }
		public List<TerminalNode> OPERATOR() { return getTokens(DSL2Parser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(DSL2Parser.OPERATOR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL2Visitor ) return ((DSL2Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			baseExpr();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR) {
				{
				{
				setState(90);
				match(OPERATOR);
				setState(91);
				baseExpr();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(EOF);
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

	public static class BaseExprContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(DSL2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DSL2Parser.NUMBER, i);
		}
		public TerminalNode OPERATOR() { return getToken(DSL2Parser.OPERATOR, 0); }
		public BaseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).enterBaseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL2Listener ) ((DSL2Listener)listener).exitBaseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL2Visitor ) return ((DSL2Visitor<? extends T>)visitor).visitBaseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseExprContext baseExpr() throws RecognitionException {
		BaseExprContext _localctx = new BaseExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_baseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(NUMBER);
			setState(100);
			match(OPERATOR);
			setState(101);
			match(NUMBER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3\3\3\3"+
		"\3\5\3(\n\3\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\5\7;\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\nQ\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\7\r_\n\r\f\r\16\rb\13\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\24\25\2d\2"+
		"\37\3\2\2\2\4\'\3\2\2\2\6+\3\2\2\2\b-\3\2\2\2\n\61\3\2\2\2\f:\3\2\2\2"+
		"\16<\3\2\2\2\20C\3\2\2\2\22P\3\2\2\2\24R\3\2\2\2\26W\3\2\2\2\30[\3\2\2"+
		"\2\32e\3\2\2\2\34\35\5\4\3\2\35\36\7\3\2\2\36 \3\2\2\2\37\34\3\2\2\2 "+
		"!\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#(\5\6\4\2$(\5\f\7\2%(\5\22"+
		"\n\2&(\5\30\r\2\'#\3\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2"+
		"),\5\b\5\2*,\5\n\6\2+)\3\2\2\2+*\3\2\2\2,\7\3\2\2\2-.\7\n\2\2./\7\23\2"+
		"\2/\60\7\13\2\2\60\t\3\2\2\2\61\62\7\n\2\2\62\63\7\22\2\2\63\64\7\13\2"+
		"\2\64\65\7\7\2\2\65\66\7\f\2\2\66\67\7\r\2\2\67\13\3\2\2\28;\5\16\b\2"+
		"9;\5\20\t\2:8\3\2\2\2:9\3\2\2\2;\r\3\2\2\2<=\7\b\2\2=>\7\t\2\2>?\7\27"+
		"\2\2?@\7\16\2\2@A\7\17\2\2AB\7\25\2\2B\17\3\2\2\2CD\7\b\2\2DE\7\t\2\2"+
		"EF\7\27\2\2FG\7\16\2\2GH\7\17\2\2HI\7\25\2\2IJ\7\7\2\2JK\7\20\2\2KL\7"+
		"\21\2\2LM\7\25\2\2M\21\3\2\2\2NQ\5\24\13\2OQ\5\26\f\2PN\3\2\2\2PO\3\2"+
		"\2\2Q\23\3\2\2\2RS\7\5\2\2ST\7\25\2\2TU\7\6\2\2UV\7\24\2\2V\25\3\2\2\2"+
		"WX\t\2\2\2XY\7\26\2\2YZ\t\2\2\2Z\27\3\2\2\2[`\5\32\16\2\\]\7\4\2\2]_\5"+
		"\32\16\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2"+
		"cd\7\2\2\3d\31\3\2\2\2ef\7\24\2\2fg\7\4\2\2gh\7\24\2\2h\33\3\2\2\2\b!"+
		"\'+:P`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}