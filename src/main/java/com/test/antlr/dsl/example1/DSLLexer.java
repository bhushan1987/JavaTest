// Generated from DSL.g4 by ANTLR 4.7.1
package com.test.antlr.dsl.example1;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AUTHENTICATE=2, USER=3, ON=4, AUTHENTICATION=5, NTLM=6, KERBEROS=7, 
		AND=8, DELEGATE=9, CREDENTIALS=10, GET=11, TGS=12, FOR=13, SERVICE=14, 
		URL=15, URI=16, PROTOCOL=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "AUTHENTICATE", "USER", "ON", "AUTHENTICATION", "NTLM", "KERBEROS", 
		"AND", "DELEGATE", "CREDENTIALS", "GET", "TGS", "FOR", "SERVICE", "URL", 
		"URI", "PROTOCOL", "WS"
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


	public DSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\5\6A\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\6\21\u0086\n\21\r\21\16\21\u0087\3\21\7\21\u008b\n\21\f\21\16"+
		"\21\u008e\13\21\6\21\u0090\n\21\r\21\16\21\u0091\3\21\7\21\u0095\n\21"+
		"\f\21\16\21\u0098\13\21\3\21\6\21\u009b\n\21\r\21\16\21\u009c\7\21\u009f"+
		"\n\21\f\21\16\21\u00a2\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\5\22\u00ad\n\22\3\23\6\23\u00b0\n\23\r\23\16\23\u00b1\3\23\3\23\2"+
		"\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\3\2\4\4\2\62;c|\5\2\13\f\17\17\"\"\2\u00bd\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7\66\3\2\2\2\t;\3\2\2\2\13@\3\2\2\2\r"+
		"B\3\2\2\2\17G\3\2\2\2\21P\3\2\2\2\23T\3\2\2\2\25]\3\2\2\2\27i\3\2\2\2"+
		"\31m\3\2\2\2\33q\3\2\2\2\35u\3\2\2\2\37}\3\2\2\2!\u008f\3\2\2\2#\u00ac"+
		"\3\2\2\2%\u00af\3\2\2\2\'(\7=\2\2(\4\3\2\2\2)*\7C\2\2*+\7W\2\2+,\7V\2"+
		"\2,-\7J\2\2-.\7G\2\2./\7P\2\2/\60\7V\2\2\60\61\7K\2\2\61\62\7E\2\2\62"+
		"\63\7C\2\2\63\64\7V\2\2\64\65\7G\2\2\65\6\3\2\2\2\66\67\7W\2\2\678\7U"+
		"\2\289\7G\2\29:\7T\2\2:\b\3\2\2\2;<\7Q\2\2<=\7P\2\2=\n\3\2\2\2>A\5\r\7"+
		"\2?A\5\17\b\2@>\3\2\2\2@?\3\2\2\2A\f\3\2\2\2BC\7P\2\2CD\7V\2\2DE\7N\2"+
		"\2EF\7O\2\2F\16\3\2\2\2GH\7M\2\2HI\7G\2\2IJ\7T\2\2JK\7D\2\2KL\7G\2\2L"+
		"M\7T\2\2MN\7Q\2\2NO\7U\2\2O\20\3\2\2\2PQ\7C\2\2QR\7P\2\2RS\7F\2\2S\22"+
		"\3\2\2\2TU\7F\2\2UV\7G\2\2VW\7N\2\2WX\7G\2\2XY\7I\2\2YZ\7C\2\2Z[\7V\2"+
		"\2[\\\7G\2\2\\\24\3\2\2\2]^\7E\2\2^_\7T\2\2_`\7G\2\2`a\7F\2\2ab\7G\2\2"+
		"bc\7P\2\2cd\7V\2\2de\7K\2\2ef\7C\2\2fg\7N\2\2gh\7U\2\2h\26\3\2\2\2ij\7"+
		"I\2\2jk\7G\2\2kl\7V\2\2l\30\3\2\2\2mn\7V\2\2no\7I\2\2op\7U\2\2p\32\3\2"+
		"\2\2qr\7H\2\2rs\7Q\2\2st\7T\2\2t\34\3\2\2\2uv\7U\2\2vw\7G\2\2wx\7T\2\2"+
		"xy\7X\2\2yz\7K\2\2z{\7E\2\2{|\7G\2\2|\36\3\2\2\2}~\5#\22\2~\177\7<\2\2"+
		"\177\u0080\7\61\2\2\u0080\u0081\7\61\2\2\u0081\u0082\3\2\2\2\u0082\u0083"+
		"\5!\21\2\u0083 \3\2\2\2\u0084\u0086\t\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008c\3\2"+
		"\2\2\u0089\u008b\7\60\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0085\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u00a0\3\2\2\2\u0093\u0095\7\61\2\2\u0094\u0093\3"+
		"\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\t\2\2\2\u009a\u0099\3\2"+
		"\2\2\u009b\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u0096\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4"+
		"\7j\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7v\2\2\u00a6\u00ad\7r\2\2\u00a7"+
		"\u00a8\7j\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7r\2\2"+
		"\u00ab\u00ad\7u\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ad$\3\2"+
		"\2\2\u00ae\u00b0\t\3\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\23"+
		"\2\2\u00b4&\3\2\2\2\16\2@\u0085\u0087\u008c\u0091\u0096\u009a\u009c\u00a0"+
		"\u00ac\u00b1\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}