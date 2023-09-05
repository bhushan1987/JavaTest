// Generated from DSL3.g4 by ANTLR 4.7.1
package com.test.antlr.dsl.example3;

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
public class DSL3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMI_COLON=1, COMMA=2, EQ=3, OPEN_BRACKET=4, CLOSE_BRACKET=5, QUOTE=6, 
		VAR=7, CALL=8, FUNCTION=9, NUMBER=10, ID=11, STRING=12, WS=13;
	public static final int
		RULE_script = 0, RULE_code_line = 1, RULE_define_var = 2, RULE_call_fun = 3;
	public static final String[] ruleNames = {
		"script", "code_line", "define_var", "call_fun"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "','", "'='", "'('", "')'", "'\"'", "'var'", "'call'", "'function'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEMI_COLON", "COMMA", "EQ", "OPEN_BRACKET", "CLOSE_BRACKET", "QUOTE", 
		"VAR", "CALL", "FUNCTION", "NUMBER", "ID", "STRING", "WS"
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
	public String getGrammarFileName() { return "DSL3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DSL3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public List<Code_lineContext> code_line() {
			return getRuleContexts(Code_lineContext.class);
		}
		public Code_lineContext code_line(int i) {
			return getRuleContext(Code_lineContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL3Listener ) ((DSL3Listener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL3Listener ) ((DSL3Listener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL3Visitor ) return ((DSL3Visitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				code_line();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR || _la==ID );
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

	public static class Code_lineContext extends ParserRuleContext {
		public Define_varContext define_var() {
			return getRuleContext(Define_varContext.class,0);
		}
		public Call_funContext call_fun() {
			return getRuleContext(Call_funContext.class,0);
		}
		public Code_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL3Listener ) ((DSL3Listener)listener).enterCode_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL3Listener ) ((DSL3Listener)listener).exitCode_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL3Visitor ) return ((DSL3Visitor<? extends T>)visitor).visitCode_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_lineContext code_line() throws RecognitionException {
		Code_lineContext _localctx = new Code_lineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code_line);
		try {
			setState(15);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				define_var();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				call_fun();
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

	public static class Define_varContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(DSL3Parser.VAR, 0); }
		public TerminalNode ID() { return getToken(DSL3Parser.ID, 0); }
		public TerminalNode EQ() { return getToken(DSL3Parser.EQ, 0); }
		public TerminalNode SEMI_COLON() { return getToken(DSL3Parser.SEMI_COLON, 0); }
		public Call_funContext call_fun() {
			return getRuleContext(Call_funContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(DSL3Parser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(DSL3Parser.STRING, 0); }
		public Define_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL3Listener ) ((DSL3Listener)listener).enterDefine_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL3Listener ) ((DSL3Listener)listener).exitDefine_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL3Visitor ) return ((DSL3Visitor<? extends T>)visitor).visitDefine_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_varContext define_var() throws RecognitionException {
		Define_varContext _localctx = new Define_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_define_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(VAR);
			setState(18);
			match(ID);
			setState(19);
			match(EQ);
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING:
				{
				setState(20);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(21);
				match(SEMI_COLON);
				}
				break;
			case ID:
				{
				setState(22);
				call_fun();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Call_funContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DSL3Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DSL3Parser.ID, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(DSL3Parser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(DSL3Parser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMI_COLON() { return getToken(DSL3Parser.SEMI_COLON, 0); }
		public List<TerminalNode> STRING() { return getTokens(DSL3Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(DSL3Parser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DSL3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DSL3Parser.COMMA, i);
		}
		public Call_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSL3Listener ) ((DSL3Listener)listener).enterCall_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSL3Listener ) ((DSL3Listener)listener).exitCall_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSL3Visitor ) return ((DSL3Visitor<? extends T>)visitor).visitCall_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_funContext call_fun() throws RecognitionException {
		Call_funContext _localctx = new Call_funContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_call_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(ID);
			setState(26);
			match(OPEN_BRACKET);
			setState(27);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(28);
				match(COMMA);
				setState(29);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
			match(CLOSE_BRACKET);
			setState(36);
			match(SEMI_COLON);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17)\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\3\3\3\5\3\22\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4\32\n\4\3\5\3\5\3\5\3\5\3\5\7\5!\n\5\f\5\16\5$\13"+
		"\5\3\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\4\4\2\f\f\16\16\3\2\r\16\2(\2\13\3"+
		"\2\2\2\4\21\3\2\2\2\6\23\3\2\2\2\b\33\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2\2"+
		"\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\3\3\2\2\2\17\22\5\6\4\2\20\22"+
		"\5\b\5\2\21\17\3\2\2\2\21\20\3\2\2\2\22\5\3\2\2\2\23\24\7\t\2\2\24\25"+
		"\7\r\2\2\25\31\7\5\2\2\26\27\t\2\2\2\27\32\7\3\2\2\30\32\5\b\5\2\31\26"+
		"\3\2\2\2\31\30\3\2\2\2\32\7\3\2\2\2\33\34\7\r\2\2\34\35\7\6\2\2\35\"\t"+
		"\3\2\2\36\37\7\4\2\2\37!\t\3\2\2 \36\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3"+
		"\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\7\2\2&\'\7\3\2\2\'\t\3\2\2\2\6\r\21\31"+
		"\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}