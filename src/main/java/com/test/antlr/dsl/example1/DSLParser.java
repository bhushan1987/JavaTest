// Generated from DSL.g4 by ANTLR 4.7.1
package com.test.antlr.dsl.example1;

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
public class DSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AUTHENTICATE=2, USER=3, ON=4, AUTHENTICATION=5, NTLM=6, KERBEROS=7, 
		AND=8, DELEGATE=9, CREDENTIALS=10, GET=11, TGS=12, FOR=13, SERVICE=14, 
		URL=15, URI=16, PROTOCOL=17, WS=18;
	public static final int
		RULE_script = 0;
	public static final String[] ruleNames = {
		"script"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'AUTHENTICATE'", "'USER'", "'ON'", null, "'NTLM'", "'KERBEROS'", 
		"'AND'", "'DELEGATE'", "'CREDENTIALS'", "'GET'", "'TGS'", "'FOR'", "'SERVICE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "AUTHENTICATE", "USER", "ON", "AUTHENTICATION", "NTLM", "KERBEROS", 
		"AND", "DELEGATE", "CREDENTIALS", "GET", "TGS", "FOR", "SERVICE", "URL", 
		"URI", "PROTOCOL", "WS"
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
	public String getGrammarFileName() { return "DSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public List<TerminalNode> AUTHENTICATE() { return getTokens(DSLParser.AUTHENTICATE); }
		public TerminalNode AUTHENTICATE(int i) {
			return getToken(DSLParser.AUTHENTICATE, i);
		}
		public List<TerminalNode> USER() { return getTokens(DSLParser.USER); }
		public TerminalNode USER(int i) {
			return getToken(DSLParser.USER, i);
		}
		public List<TerminalNode> ON() { return getTokens(DSLParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(DSLParser.ON, i);
		}
		public List<TerminalNode> AUTHENTICATION() { return getTokens(DSLParser.AUTHENTICATION); }
		public TerminalNode AUTHENTICATION(int i) {
			return getToken(DSLParser.AUTHENTICATION, i);
		}
		public List<TerminalNode> AND() { return getTokens(DSLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(DSLParser.AND, i);
		}
		public List<TerminalNode> DELEGATE() { return getTokens(DSLParser.DELEGATE); }
		public TerminalNode DELEGATE(int i) {
			return getToken(DSLParser.DELEGATE, i);
		}
		public List<TerminalNode> CREDENTIALS() { return getTokens(DSLParser.CREDENTIALS); }
		public TerminalNode CREDENTIALS(int i) {
			return getToken(DSLParser.CREDENTIALS, i);
		}
		public List<TerminalNode> GET() { return getTokens(DSLParser.GET); }
		public TerminalNode GET(int i) {
			return getToken(DSLParser.GET, i);
		}
		public List<TerminalNode> TGS() { return getTokens(DSLParser.TGS); }
		public TerminalNode TGS(int i) {
			return getToken(DSLParser.TGS, i);
		}
		public List<TerminalNode> FOR() { return getTokens(DSLParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(DSLParser.FOR, i);
		}
		public List<TerminalNode> SERVICE() { return getTokens(DSLParser.SERVICE); }
		public TerminalNode SERVICE(int i) {
			return getToken(DSLParser.SERVICE, i);
		}
		public List<TerminalNode> URL() { return getTokens(DSLParser.URL); }
		public TerminalNode URL(int i) {
			return getToken(DSLParser.URL, i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DSLListener ) ((DSLListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DSLVisitor ) return ((DSLVisitor<? extends T>)visitor).visitScript(this);
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
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2);
				match(AUTHENTICATE);
				setState(3);
				match(USER);
				setState(4);
				match(ON);
				setState(5);
				match(AUTHENTICATION);
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(6);
					match(AND);
					setState(7);
					match(DELEGATE);
					setState(8);
					match(CREDENTIALS);
					setState(15);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AND) {
						{
						setState(9);
						match(AND);
						setState(10);
						match(GET);
						setState(11);
						match(TGS);
						setState(12);
						match(FOR);
						setState(13);
						match(SERVICE);
						setState(14);
						match(URL);
						}
					}

					}
				}

				setState(19);
				match(T__0);
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AUTHENTICATE );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\33\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\22\n\2\5\2\24\n\2"+
		"\3\2\6\2\27\n\2\r\2\16\2\30\3\2\2\2\3\2\2\2\2\34\2\26\3\2\2\2\4\5\7\4"+
		"\2\2\5\6\7\5\2\2\6\7\7\6\2\2\7\23\7\7\2\2\b\t\7\n\2\2\t\n\7\13\2\2\n\21"+
		"\7\f\2\2\13\f\7\n\2\2\f\r\7\r\2\2\r\16\7\16\2\2\16\17\7\17\2\2\17\20\7"+
		"\20\2\2\20\22\7\21\2\2\21\13\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\b"+
		"\3\2\2\2\23\24\3\2\2\2\24\25\3\2\2\2\25\27\7\3\2\2\26\4\3\2\2\2\27\30"+
		"\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\3\3\2\2\2\5\21\23\30";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}