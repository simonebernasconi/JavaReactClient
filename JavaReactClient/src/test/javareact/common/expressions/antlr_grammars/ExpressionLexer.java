// Generated from antlr_grammars/Expression.g4 by ANTLR 4.1
package test.javareact.common.expressions.antlr_grammars;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, MUL=13, DIV=14, ADD=15, SUB=16, DOT=17, MIN=18, 
		MAX=19, NOT=20, EQUAL=21, AND=22, OR=23, ID=24, STRING=25, DIGIT=26, DOUBLE=27, 
		BOOL=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"']'", "':Bool'", "')'", "':ListString'", "','", "'['", "'('", "':Num'", 
		"':ListInt'", "':String'", "':ListDouble'", "':ListBool'", "'*'", "'/'", 
		"'+'", "'-'", "'.'", "'<'", "'>'", "'!'", "'=='", "'&'", "'|'", "ID", 
		"STRING", "DIGIT", "DOUBLE", "BOOL", "WS"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "MUL", "DIV", "ADD", "SUB", "DOT", "MIN", "MAX", 
		"NOT", "EQUAL", "AND", "OR", "ID", "STRING", "DIGIT", "DOUBLE", "BOOL", 
		"WS"
	};


	public ExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 28: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\37\u00ce\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\7\31\u009f"+
		"\n\31\f\31\16\31\u00a2\13\31\3\32\3\32\6\32\u00a6\n\32\r\32\16\32\u00a7"+
		"\3\32\3\32\3\33\6\33\u00ad\n\33\r\33\16\33\u00ae\3\34\7\34\u00b2\n\34"+
		"\f\34\16\34\u00b5\13\34\3\34\3\34\6\34\u00b9\n\34\r\34\16\34\u00ba\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00c6\n\35\3\36\6\36\u00c9"+
		"\n\36\r\36\16\36\u00ca\3\36\3\36\2\37\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r"+
		"\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21"+
		"\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65"+
		"\34\1\67\35\19\36\1;\37\2\3\2\7\4\2C\\c|\5\2\62;C\\c|\6\2\"\"\62;C\\c"+
		"|\3\2\62;\4\2\13\f\"\"\u00d4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7E\3\2\2\2\tG"+
		"\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2\17W\3\2\2\2\21Y\3\2\2\2\23^\3\2\2\2\25"+
		"g\3\2\2\2\27o\3\2\2\2\31{\3\2\2\2\33\u0085\3\2\2\2\35\u0087\3\2\2\2\37"+
		"\u0089\3\2\2\2!\u008b\3\2\2\2#\u008d\3\2\2\2%\u008f\3\2\2\2\'\u0091\3"+
		"\2\2\2)\u0093\3\2\2\2+\u0095\3\2\2\2-\u0098\3\2\2\2/\u009a\3\2\2\2\61"+
		"\u009c\3\2\2\2\63\u00a3\3\2\2\2\65\u00ac\3\2\2\2\67\u00b3\3\2\2\29\u00c5"+
		"\3\2\2\2;\u00c8\3\2\2\2=>\7_\2\2>\4\3\2\2\2?@\7<\2\2@A\7D\2\2AB\7q\2\2"+
		"BC\7q\2\2CD\7n\2\2D\6\3\2\2\2EF\7+\2\2F\b\3\2\2\2GH\7<\2\2HI\7N\2\2IJ"+
		"\7k\2\2JK\7u\2\2KL\7v\2\2LM\7U\2\2MN\7v\2\2NO\7t\2\2OP\7k\2\2PQ\7p\2\2"+
		"QR\7i\2\2R\n\3\2\2\2ST\7.\2\2T\f\3\2\2\2UV\7]\2\2V\16\3\2\2\2WX\7*\2\2"+
		"X\20\3\2\2\2YZ\7<\2\2Z[\7P\2\2[\\\7w\2\2\\]\7o\2\2]\22\3\2\2\2^_\7<\2"+
		"\2_`\7N\2\2`a\7k\2\2ab\7u\2\2bc\7v\2\2cd\7K\2\2de\7p\2\2ef\7v\2\2f\24"+
		"\3\2\2\2gh\7<\2\2hi\7U\2\2ij\7v\2\2jk\7t\2\2kl\7k\2\2lm\7p\2\2mn\7i\2"+
		"\2n\26\3\2\2\2op\7<\2\2pq\7N\2\2qr\7k\2\2rs\7u\2\2st\7v\2\2tu\7F\2\2u"+
		"v\7q\2\2vw\7w\2\2wx\7d\2\2xy\7n\2\2yz\7g\2\2z\30\3\2\2\2{|\7<\2\2|}\7"+
		"N\2\2}~\7k\2\2~\177\7u\2\2\177\u0080\7v\2\2\u0080\u0081\7D\2\2\u0081\u0082"+
		"\7q\2\2\u0082\u0083\7q\2\2\u0083\u0084\7n\2\2\u0084\32\3\2\2\2\u0085\u0086"+
		"\7,\2\2\u0086\34\3\2\2\2\u0087\u0088\7\61\2\2\u0088\36\3\2\2\2\u0089\u008a"+
		"\7-\2\2\u008a \3\2\2\2\u008b\u008c\7/\2\2\u008c\"\3\2\2\2\u008d\u008e"+
		"\7\60\2\2\u008e$\3\2\2\2\u008f\u0090\7>\2\2\u0090&\3\2\2\2\u0091\u0092"+
		"\7@\2\2\u0092(\3\2\2\2\u0093\u0094\7#\2\2\u0094*\3\2\2\2\u0095\u0096\7"+
		"?\2\2\u0096\u0097\7?\2\2\u0097,\3\2\2\2\u0098\u0099\7(\2\2\u0099.\3\2"+
		"\2\2\u009a\u009b\7~\2\2\u009b\60\3\2\2\2\u009c\u00a0\t\2\2\2\u009d\u009f"+
		"\t\3\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\62\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\7)\2\2"+
		"\u00a4\u00a6\t\4\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7)\2\2\u00aa"+
		"\64\3\2\2\2\u00ab\u00ad\t\5\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2"+
		"\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\66\3\2\2\2\u00b0\u00b2"+
		"\t\5\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b8\5#"+
		"\22\2\u00b7\u00b9\t\5\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb8\3\2\2\2\u00bc\u00bd\7v\2\2\u00bd"+
		"\u00be\7t\2\2\u00be\u00bf\7w\2\2\u00bf\u00c6\7g\2\2\u00c0\u00c1\7h\2\2"+
		"\u00c1\u00c2\7c\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c6"+
		"\7g\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c6:\3\2\2\2\u00c7\u00c9"+
		"\t\6\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\36\2\2\u00cd<\3\2\2\2"+
		"\n\2\u00a0\u00a7\u00ae\u00b3\u00ba\u00c5\u00ca";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}