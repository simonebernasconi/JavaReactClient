// Generated from antlr_grammars/Expression.g4 by ANTLR 4.1
package test.javareact.common.expressions.antlr_grammars;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, MUL=13, DIV=14, ADD=15, SUB=16, DOT=17, MIN=18, 
		MAX=19, NOT=20, EQUAL=21, AND=22, OR=23, ID=24, STRING=25, DIGIT=26, DOUBLE=27, 
		BOOL=28, WS=29;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "':Bool'", "')'", "':ListString'", "','", "'['", "'('", 
		"':Num'", "':ListInt'", "':String'", "':ListDouble'", "':ListBool'", "'*'", 
		"'/'", "'+'", "'-'", "'.'", "'<'", "'>'", "'!'", "'=='", "'&'", "'|'", 
		"ID", "STRING", "DIGIT", "DOUBLE", "BOOL", "WS"
	};
	public static final int
		RULE_start = 0, RULE_expression = 1, RULE_stringExpr = 2, RULE_numExpr = 3, 
		RULE_boolExpr = 4, RULE_listExpr = 5, RULE_listDigit = 6, RULE_listDouble = 7, 
		RULE_listString = 8, RULE_listBool = 9, RULE_seqInt = 10, RULE_seqDouble = 11, 
		RULE_seqString = 12, RULE_seqBool = 13, RULE_listDigitExpr = 14, RULE_listDoubleExpr = 15, 
		RULE_listStringExpr = 16, RULE_listBoolExpr = 17, RULE_identifierNum = 18, 
		RULE_identifierString = 19, RULE_identifierBool = 20, RULE_identifierListInt = 21, 
		RULE_identifierListBool = 22, RULE_identifierListDouble = 23, RULE_identifierListString = 24, 
		RULE_hostId = 25, RULE_observableId = 26, RULE_method = 27;
	public static final String[] ruleNames = {
		"start", "expression", "stringExpr", "numExpr", "boolExpr", "listExpr", 
		"listDigit", "listDouble", "listString", "listBool", "seqInt", "seqDouble", 
		"seqString", "seqBool", "listDigitExpr", "listDoubleExpr", "listStringExpr", 
		"listBoolExpr", "identifierNum", "identifierString", "identifierBool", 
		"identifierListInt", "identifierListBool", "identifierListDouble", "identifierListString", 
		"hostId", "observableId", "method"
	};

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); expression();
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumExpressionContext extends ExpressionContext {
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public NumExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitNumExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressionContext extends ExpressionContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListExpressionContext extends ExpressionContext {
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public ListExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new StringExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58); stringExpr(0);
				}
				break;

			case 2:
				_localctx = new NumExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59); numExpr(0);
				}
				break;

			case 3:
				_localctx = new BoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60); boolExpr(0);
				}
				break;

			case 4:
				_localctx = new ListExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(61); listExpr();
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

	public static class StringExprContext extends ParserRuleContext {
		public int _p;
		public StringExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StringExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_stringExpr; }
	 
		public StringExprContext() { }
		public void copyFrom(StringExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class IdStringContext extends StringExprContext {
		public IdentifierStringContext identifierString() {
			return getRuleContext(IdentifierStringContext.class,0);
		}
		public IdStringContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BaseStrContext extends StringExprContext {
		public TerminalNode STRING() { return getToken(ExpressionParser.STRING, 0); }
		public BaseStrContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitBaseStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensStringContext extends StringExprContext {
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public ParensStringContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitParensString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatContext extends StringExprContext {
		public StringExprContext stringExpr(int i) {
			return getRuleContext(StringExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ExpressionParser.ADD, 0); }
		public List<StringExprContext> stringExpr() {
			return getRuleContexts(StringExprContext.class);
		}
		public ConcatContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitConcat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExprContext stringExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StringExprContext _localctx = new StringExprContext(_ctx, _parentState, _p);
		StringExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, RULE_stringExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			switch (_input.LA(1)) {
			case STRING:
				{
				_localctx = new BaseStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(65); match(STRING);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new IdStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66); identifierString();
				}
				break;
			case 7:
				{
				_localctx = new ParensStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67); match(7);
				setState(68); stringExpr(0);
				setState(69); match(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConcatContext(new StringExprContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_stringExpr);
					setState(73);
					if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
					setState(74); match(ADD);
					setState(75); stringExpr(5);
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NumExprContext extends ParserRuleContext {
		public int _p;
		public NumExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NumExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_numExpr; }
	 
		public NumExprContext() { }
		public void copyFrom(NumExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class DoubleContext extends NumExprContext {
		public TerminalNode DOUBLE() { return getToken(ExpressionParser.DOUBLE, 0); }
		public DoubleContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdNumContext extends NumExprContext {
		public IdentifierNumContext identifierNum() {
			return getRuleContext(IdentifierNumContext.class,0);
		}
		public IdNumContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdNumListDoubleContext extends NumExprContext {
		public IdentifierListDoubleContext identifierListDouble() {
			return getRuleContext(IdentifierListDoubleContext.class,0);
		}
		public IdNumListDoubleContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdNumListDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdNumListIntContext extends NumExprContext {
		public IdentifierListIntContext identifierListInt() {
			return getRuleContext(IdentifierListIntContext.class,0);
		}
		public IdNumListIntContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdNumListInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends NumExprContext {
		public Token op;
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public TerminalNode SUB() { return getToken(ExpressionParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(ExpressionParser.ADD, 0); }
		public AddSubContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensNumContext extends NumExprContext {
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public ParensNumContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitParensNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends NumExprContext {
		public TerminalNode DIGIT() { return getToken(ExpressionParser.DIGIT, 0); }
		public IntContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends NumExprContext {
		public Token op;
		public TerminalNode MUL() { return getToken(ExpressionParser.MUL, 0); }
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ExpressionParser.DIV, 0); }
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public MulDivContext(NumExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumExprContext numExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumExprContext _localctx = new NumExprContext(_ctx, _parentState, _p);
		NumExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, RULE_numExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(82); match(DIGIT);
				}
				break;

			case 2:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83); match(DOUBLE);
				}
				break;

			case 3:
				{
				_localctx = new IdNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84); identifierNum();
				}
				break;

			case 4:
				{
				_localctx = new IdNumListDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85); identifierListDouble();
				}
				break;

			case 5:
				{
				_localctx = new IdNumListIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86); identifierListInt();
				}
				break;

			case 6:
				{
				_localctx = new ParensNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87); match(7);
				setState(88); numExpr(0);
				setState(89); match(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(93);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(94);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(95); numExpr(9);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new NumExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(96);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(97);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(98); numExpr(8);
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolExprContext extends ParserRuleContext {
		public int _p;
		public BoolExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BoolExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	 
		public BoolExprContext() { }
		public void copyFrom(BoolExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class AndOrContext extends BoolExprContext {
		public Token op;
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public TerminalNode AND() { return getToken(ExpressionParser.AND, 0); }
		public TerminalNode OR() { return getToken(ExpressionParser.OR, 0); }
		public AndOrContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends BoolExprContext {
		public TerminalNode BOOL() { return getToken(ExpressionParser.BOOL, 0); }
		public BoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdBoolContext extends BoolExprContext {
		public IdentifierBoolContext identifierBool() {
			return getRuleContext(IdentifierBoolContext.class,0);
		}
		public IdBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualNumContext extends BoolExprContext {
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public TerminalNode EQUAL() { return getToken(ExpressionParser.EQUAL, 0); }
		public EqualNumContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitEqualNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualBoolContext extends BoolExprContext {
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public TerminalNode EQUAL() { return getToken(ExpressionParser.EQUAL, 0); }
		public EqualBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitEqualBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinMaxContext extends BoolExprContext {
		public Token op;
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public TerminalNode MIN() { return getToken(ExpressionParser.MIN, 0); }
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public TerminalNode MAX() { return getToken(ExpressionParser.MAX, 0); }
		public MinMaxContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMinMax(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualListContext extends BoolExprContext {
		public List<ListExprContext> listExpr() {
			return getRuleContexts(ListExprContext.class);
		}
		public TerminalNode EQUAL() { return getToken(ExpressionParser.EQUAL, 0); }
		public ListExprContext listExpr(int i) {
			return getRuleContext(ListExprContext.class,i);
		}
		public EqualListContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitEqualList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensBoolContext extends BoolExprContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ParensBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitParensBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualStringContext extends BoolExprContext {
		public StringExprContext stringExpr(int i) {
			return getRuleContext(StringExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(ExpressionParser.EQUAL, 0); }
		public List<StringExprContext> stringExpr() {
			return getRuleContexts(StringExprContext.class);
		}
		public EqualStringContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitEqualString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends BoolExprContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode NOT() { return getToken(ExpressionParser.NOT, 0); }
		public NotContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState, _p);
		BoolExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_boolExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(105); match(NOT);
				setState(106); boolExpr(10);
				}
				break;

			case 2:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107); match(BOOL);
				}
				break;

			case 3:
				{
				_localctx = new IdBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108); identifierBool();
				}
				break;

			case 4:
				{
				_localctx = new ParensBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109); match(7);
				setState(110); boolExpr(0);
				setState(111); match(3);
				}
				break;

			case 5:
				{
				_localctx = new MinMaxContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113); numExpr(0);
				setState(114);
				((MinMaxContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MIN || _la==MAX) ) {
					((MinMaxContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(115); numExpr(0);
				}
				break;

			case 6:
				{
				_localctx = new EqualNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117); numExpr(0);
				setState(118); match(EQUAL);
				setState(119); numExpr(0);
				}
				break;

			case 7:
				{
				_localctx = new EqualStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121); stringExpr(0);
				setState(122); match(EQUAL);
				setState(123); stringExpr(0);
				}
				break;

			case 8:
				{
				_localctx = new EqualListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125); listExpr();
				setState(126); match(EQUAL);
				setState(127); listExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(137);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AndOrContext(new BoolExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(131);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(132);
						((AndOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((AndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(133); boolExpr(10);
						}
						break;

					case 2:
						{
						_localctx = new EqualBoolContext(new BoolExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(134);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(135); match(EQUAL);
						setState(136); boolExpr(5);
						}
						break;
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListExprContext extends ParserRuleContext {
		public ListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpr; }
	 
		public ListExprContext() { }
		public void copyFrom(ListExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListStringExpressionContext extends ListExprContext {
		public ListStringExprContext listStringExpr() {
			return getRuleContext(ListStringExprContext.class,0);
		}
		public ListStringExpressionContext(ListExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListDigitExpressionContext extends ListExprContext {
		public ListDigitExprContext listDigitExpr() {
			return getRuleContext(ListDigitExprContext.class,0);
		}
		public ListDigitExpressionContext(ListExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListDigitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListDoubleExpressionContext extends ListExprContext {
		public ListDoubleExprContext listDoubleExpr() {
			return getRuleContext(ListDoubleExprContext.class,0);
		}
		public ListDoubleExpressionContext(ListExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListDoubleExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListBoolExpressionContext extends ListExprContext {
		public ListBoolExprContext listBoolExpr() {
			return getRuleContext(ListBoolExprContext.class,0);
		}
		public ListBoolExpressionContext(ListExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExprContext listExpr() throws RecognitionException {
		ListExprContext _localctx = new ListExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listExpr);
		try {
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ListDigitExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142); listDigitExpr();
				}
				break;

			case 2:
				_localctx = new ListDoubleExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143); listDoubleExpr();
				}
				break;

			case 3:
				_localctx = new ListStringExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144); listStringExpr();
				}
				break;

			case 4:
				_localctx = new ListBoolExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(145); listBoolExpr();
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

	public static class ListDigitContext extends ParserRuleContext {
		public SeqIntContext seqInt() {
			return getRuleContext(SeqIntContext.class,0);
		}
		public ListDigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDigit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDigitContext listDigit() throws RecognitionException {
		ListDigitContext _localctx = new ListDigitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listDigit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(6);
			setState(149); seqInt(0);
			setState(150); match(1);
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

	public static class ListDoubleContext extends ParserRuleContext {
		public SeqDoubleContext seqDouble() {
			return getRuleContext(SeqDoubleContext.class,0);
		}
		public ListDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDouble; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDoubleContext listDouble() throws RecognitionException {
		ListDoubleContext _localctx = new ListDoubleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(6);
			setState(153); seqDouble(0);
			setState(154); match(1);
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

	public static class ListStringContext extends ParserRuleContext {
		public SeqStringContext seqString() {
			return getRuleContext(SeqStringContext.class,0);
		}
		public ListStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listString; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListStringContext listString() throws RecognitionException {
		ListStringContext _localctx = new ListStringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); match(6);
			setState(157); seqString(0);
			setState(158); match(1);
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

	public static class ListBoolContext extends ParserRuleContext {
		public SeqBoolContext seqBool() {
			return getRuleContext(SeqBoolContext.class,0);
		}
		public ListBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listBool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListBoolContext listBool() throws RecognitionException {
		ListBoolContext _localctx = new ListBoolContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(6);
			setState(161); seqBool(0);
			setState(162); match(1);
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

	public static class SeqIntContext extends ParserRuleContext {
		public int _p;
		public SeqIntContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SeqIntContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_seqInt; }
	 
		public SeqIntContext() { }
		public void copyFrom(SeqIntContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class SeqIntSeqIntContext extends SeqIntContext {
		public SeqIntContext seqInt() {
			return getRuleContext(SeqIntContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(ExpressionParser.DIGIT, 0); }
		public SeqIntSeqIntContext(SeqIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqIntSeqInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqIntDigitContext extends SeqIntContext {
		public TerminalNode DIGIT() { return getToken(ExpressionParser.DIGIT, 0); }
		public SeqIntDigitContext(SeqIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqIntDigit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqIntIdentifierListIntContext extends SeqIntContext {
		public IdentifierNumContext identifierNum() {
			return getRuleContext(IdentifierNumContext.class,0);
		}
		public SeqIntIdentifierListIntContext(SeqIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqIntIdentifierListInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqIntSeqIntIdListIntContext extends SeqIntContext {
		public SeqIntContext seqInt() {
			return getRuleContext(SeqIntContext.class,0);
		}
		public IdentifierNumContext identifierNum() {
			return getRuleContext(IdentifierNumContext.class,0);
		}
		public SeqIntSeqIntIdListIntContext(SeqIntContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqIntSeqIntIdListInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqIntContext seqInt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SeqIntContext _localctx = new SeqIntContext(_ctx, _parentState, _p);
		SeqIntContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_seqInt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				_localctx = new SeqIntDigitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(165); match(DIGIT);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new SeqIntIdentifierListIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166); identifierNum();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new SeqIntSeqIntContext(new SeqIntContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqInt);
						setState(169);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(170); match(5);
						setState(171); match(DIGIT);
						}
						break;

					case 2:
						{
						_localctx = new SeqIntSeqIntIdListIntContext(new SeqIntContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqInt);
						setState(172);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(173); match(5);
						setState(174); identifierNum();
						}
						break;
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SeqDoubleContext extends ParserRuleContext {
		public int _p;
		public SeqDoubleContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SeqDoubleContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_seqDouble; }
	 
		public SeqDoubleContext() { }
		public void copyFrom(SeqDoubleContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class SeqDoubleSeqDoubleIdListDoubleContext extends SeqDoubleContext {
		public SeqDoubleContext seqDouble() {
			return getRuleContext(SeqDoubleContext.class,0);
		}
		public IdentifierNumContext identifierNum() {
			return getRuleContext(IdentifierNumContext.class,0);
		}
		public SeqDoubleSeqDoubleIdListDoubleContext(SeqDoubleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqDoubleSeqDoubleIdListDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqDoubleDoubleContext extends SeqDoubleContext {
		public TerminalNode DOUBLE() { return getToken(ExpressionParser.DOUBLE, 0); }
		public SeqDoubleDoubleContext(SeqDoubleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqDoubleDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqDoubleIdentifierListDoubleContext extends SeqDoubleContext {
		public IdentifierNumContext identifierNum() {
			return getRuleContext(IdentifierNumContext.class,0);
		}
		public SeqDoubleIdentifierListDoubleContext(SeqDoubleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqDoubleIdentifierListDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqDoubleSeqDoubleContext extends SeqDoubleContext {
		public SeqDoubleContext seqDouble() {
			return getRuleContext(SeqDoubleContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(ExpressionParser.DOUBLE, 0); }
		public SeqDoubleSeqDoubleContext(SeqDoubleContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqDoubleSeqDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqDoubleContext seqDouble(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SeqDoubleContext _localctx = new SeqDoubleContext(_ctx, _parentState, _p);
		SeqDoubleContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_seqDouble);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			switch (_input.LA(1)) {
			case DOUBLE:
				{
				_localctx = new SeqDoubleDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(181); match(DOUBLE);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new SeqDoubleIdentifierListDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182); identifierNum();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(191);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new SeqDoubleSeqDoubleContext(new SeqDoubleContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqDouble);
						setState(185);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(186); match(5);
						setState(187); match(DOUBLE);
						}
						break;

					case 2:
						{
						_localctx = new SeqDoubleSeqDoubleIdListDoubleContext(new SeqDoubleContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqDouble);
						setState(188);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(189); match(5);
						setState(190); identifierNum();
						}
						break;
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SeqStringContext extends ParserRuleContext {
		public int _p;
		public SeqStringContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SeqStringContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_seqString; }
	 
		public SeqStringContext() { }
		public void copyFrom(SeqStringContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class SeqStringStringContext extends SeqStringContext {
		public TerminalNode STRING() { return getToken(ExpressionParser.STRING, 0); }
		public SeqStringStringContext(SeqStringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqStringString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqStringSeqStringContext extends SeqStringContext {
		public TerminalNode STRING() { return getToken(ExpressionParser.STRING, 0); }
		public SeqStringContext seqString() {
			return getRuleContext(SeqStringContext.class,0);
		}
		public SeqStringSeqStringContext(SeqStringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqStringSeqString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqStringSeqStringIdListStringContext extends SeqStringContext {
		public SeqStringContext seqString() {
			return getRuleContext(SeqStringContext.class,0);
		}
		public IdentifierStringContext identifierString() {
			return getRuleContext(IdentifierStringContext.class,0);
		}
		public SeqStringSeqStringIdListStringContext(SeqStringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqStringSeqStringIdListString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqStringIdentifierListStringContext extends SeqStringContext {
		public IdentifierStringContext identifierString() {
			return getRuleContext(IdentifierStringContext.class,0);
		}
		public SeqStringIdentifierListStringContext(SeqStringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqStringIdentifierListString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqStringContext seqString(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SeqStringContext _localctx = new SeqStringContext(_ctx, _parentState, _p);
		SeqStringContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_seqString);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			switch (_input.LA(1)) {
			case STRING:
				{
				_localctx = new SeqStringStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(197); match(STRING);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new SeqStringIdentifierListStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198); identifierString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new SeqStringSeqStringContext(new SeqStringContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqString);
						setState(201);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(202); match(5);
						setState(203); match(STRING);
						}
						break;

					case 2:
						{
						_localctx = new SeqStringSeqStringIdListStringContext(new SeqStringContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqString);
						setState(204);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(205); match(5);
						setState(206); identifierString();
						}
						break;
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SeqBoolContext extends ParserRuleContext {
		public int _p;
		public SeqBoolContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SeqBoolContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_seqBool; }
	 
		public SeqBoolContext() { }
		public void copyFrom(SeqBoolContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class SeqBoolSeqBoolContext extends SeqBoolContext {
		public TerminalNode BOOL() { return getToken(ExpressionParser.BOOL, 0); }
		public SeqBoolContext seqBool() {
			return getRuleContext(SeqBoolContext.class,0);
		}
		public SeqBoolSeqBoolContext(SeqBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqBoolSeqBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqBoolBoolContext extends SeqBoolContext {
		public TerminalNode BOOL() { return getToken(ExpressionParser.BOOL, 0); }
		public SeqBoolBoolContext(SeqBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqBoolBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqBoolIdentifierListBoolContext extends SeqBoolContext {
		public IdentifierBoolContext identifierBool() {
			return getRuleContext(IdentifierBoolContext.class,0);
		}
		public SeqBoolIdentifierListBoolContext(SeqBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqBoolIdentifierListBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqBoolSeqBoolIdListBoolContext extends SeqBoolContext {
		public IdentifierBoolContext identifierBool() {
			return getRuleContext(IdentifierBoolContext.class,0);
		}
		public SeqBoolContext seqBool() {
			return getRuleContext(SeqBoolContext.class,0);
		}
		public SeqBoolSeqBoolIdListBoolContext(SeqBoolContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitSeqBoolSeqBoolIdListBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqBoolContext seqBool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SeqBoolContext _localctx = new SeqBoolContext(_ctx, _parentState, _p);
		SeqBoolContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, RULE_seqBool);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			switch (_input.LA(1)) {
			case BOOL:
				{
				_localctx = new SeqBoolBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(213); match(BOOL);
				}
				break;
			case MUL:
			case ID:
				{
				_localctx = new SeqBoolIdentifierListBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(214); identifierBool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(223);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new SeqBoolSeqBoolContext(new SeqBoolContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqBool);
						setState(217);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(218); match(5);
						setState(219); match(BOOL);
						}
						break;

					case 2:
						{
						_localctx = new SeqBoolSeqBoolIdListBoolContext(new SeqBoolContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_seqBool);
						setState(220);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(221); match(5);
						setState(222); identifierBool();
						}
						break;
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListDigitExprContext extends ParserRuleContext {
		public ListDigitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDigitExpr; }
	 
		public ListDigitExprContext() { }
		public void copyFrom(ListDigitExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListDigit_LabelContext extends ListDigitExprContext {
		public ListDigitContext listDigit() {
			return getRuleContext(ListDigitContext.class,0);
		}
		public ListDigit_LabelContext(ListDigitExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListDigit_Label(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdListIntContext extends ListDigitExprContext {
		public IdentifierListIntContext identifierListInt() {
			return getRuleContext(IdentifierListIntContext.class,0);
		}
		public IdListIntContext(ListDigitExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdListInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDigitExprContext listDigitExpr() throws RecognitionException {
		ListDigitExprContext _localctx = new ListDigitExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_listDigitExpr);
		try {
			setState(230);
			switch (_input.LA(1)) {
			case 6:
				_localctx = new ListDigit_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228); listDigit();
				}
				break;
			case MUL:
			case ID:
				_localctx = new IdListIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229); identifierListInt();
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

	public static class ListDoubleExprContext extends ParserRuleContext {
		public ListDoubleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDoubleExpr; }
	 
		public ListDoubleExprContext() { }
		public void copyFrom(ListDoubleExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdListDoubleContext extends ListDoubleExprContext {
		public IdentifierListDoubleContext identifierListDouble() {
			return getRuleContext(IdentifierListDoubleContext.class,0);
		}
		public IdListDoubleContext(ListDoubleExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdListDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListDouble_LabelContext extends ListDoubleExprContext {
		public ListDoubleContext listDouble() {
			return getRuleContext(ListDoubleContext.class,0);
		}
		public ListDouble_LabelContext(ListDoubleExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListDouble_Label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDoubleExprContext listDoubleExpr() throws RecognitionException {
		ListDoubleExprContext _localctx = new ListDoubleExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listDoubleExpr);
		try {
			setState(234);
			switch (_input.LA(1)) {
			case 6:
				_localctx = new ListDouble_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232); listDouble();
				}
				break;
			case MUL:
			case ID:
				_localctx = new IdListDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233); identifierListDouble();
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

	public static class ListStringExprContext extends ParserRuleContext {
		public ListStringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listStringExpr; }
	 
		public ListStringExprContext() { }
		public void copyFrom(ListStringExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdListStringContext extends ListStringExprContext {
		public IdentifierListStringContext identifierListString() {
			return getRuleContext(IdentifierListStringContext.class,0);
		}
		public IdListStringContext(ListStringExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdListString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListString_LabelContext extends ListStringExprContext {
		public ListStringContext listString() {
			return getRuleContext(ListStringContext.class,0);
		}
		public ListString_LabelContext(ListStringExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListString_Label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListStringExprContext listStringExpr() throws RecognitionException {
		ListStringExprContext _localctx = new ListStringExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listStringExpr);
		try {
			setState(238);
			switch (_input.LA(1)) {
			case 6:
				_localctx = new ListString_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(236); listString();
				}
				break;
			case MUL:
			case ID:
				_localctx = new IdListStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237); identifierListString();
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

	public static class ListBoolExprContext extends ParserRuleContext {
		public ListBoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listBoolExpr; }
	 
		public ListBoolExprContext() { }
		public void copyFrom(ListBoolExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ListBool_LabelContext extends ListBoolExprContext {
		public ListBoolContext listBool() {
			return getRuleContext(ListBoolContext.class,0);
		}
		public ListBool_LabelContext(ListBoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitListBool_Label(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdListBoolContext extends ListBoolExprContext {
		public IdentifierListBoolContext identifierListBool() {
			return getRuleContext(IdentifierListBoolContext.class,0);
		}
		public IdListBoolContext(ListBoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdListBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListBoolExprContext listBoolExpr() throws RecognitionException {
		ListBoolExprContext _localctx = new ListBoolExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_listBoolExpr);
		try {
			setState(242);
			switch (_input.LA(1)) {
			case 6:
				_localctx = new ListBool_LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240); listBool();
				}
				break;
			case MUL:
			case ID:
				_localctx = new IdListBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(241); identifierListBool();
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

	public static class IdentifierNumContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(ExpressionParser.DOT); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public ObservableIdContext observableId() {
			return getRuleContext(ObservableIdContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(ExpressionParser.DOT, i);
		}
		public HostIdContext hostId() {
			return getRuleContext(HostIdContext.class,0);
		}
		public IdentifierNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierNum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierNumContext identifierNum() throws RecognitionException {
		IdentifierNumContext _localctx = new IdentifierNumContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_identifierNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); hostId();
			setState(245); match(DOT);
			setState(246); observableId();
			setState(247); match(DOT);
			setState(248); method();
			setState(249); match(8);
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

	public static class IdentifierStringContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(ExpressionParser.DOT); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public ObservableIdContext observableId() {
			return getRuleContext(ObservableIdContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(ExpressionParser.DOT, i);
		}
		public HostIdContext hostId() {
			return getRuleContext(HostIdContext.class,0);
		}
		public IdentifierStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierString; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierStringContext identifierString() throws RecognitionException {
		IdentifierStringContext _localctx = new IdentifierStringContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_identifierString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); hostId();
			setState(252); match(DOT);
			setState(253); observableId();
			setState(254); match(DOT);
			setState(255); method();
			setState(256); match(10);
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

	public static class IdentifierBoolContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(ExpressionParser.DOT); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public ObservableIdContext observableId() {
			return getRuleContext(ObservableIdContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(ExpressionParser.DOT, i);
		}
		public HostIdContext hostId() {
			return getRuleContext(HostIdContext.class,0);
		}
		public IdentifierBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierBool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierBoolContext identifierBool() throws RecognitionException {
		IdentifierBoolContext _localctx = new IdentifierBoolContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_identifierBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); hostId();
			setState(259); match(DOT);
			setState(260); observableId();
			setState(261); match(DOT);
			setState(262); method();
			setState(263); match(2);
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

	public static class IdentifierListIntContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(ExpressionParser.DOT); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public ObservableIdContext observableId() {
			return getRuleContext(ObservableIdContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(ExpressionParser.DOT, i);
		}
		public HostIdContext hostId() {
			return getRuleContext(HostIdContext.class,0);
		}
		public IdentifierListIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierListInt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierListInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListIntContext identifierListInt() throws RecognitionException {
		IdentifierListIntContext _localctx = new IdentifierListIntContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_identifierListInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); hostId();
			setState(266); match(DOT);
			setState(267); observableId();
			setState(268); match(DOT);
			setState(269); method();
			setState(270); match(9);
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

	public static class IdentifierListBoolContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(ExpressionParser.DOT); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public ObservableIdContext observableId() {
			return getRuleContext(ObservableIdContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(ExpressionParser.DOT, i);
		}
		public HostIdContext hostId() {
			return getRuleContext(HostIdContext.class,0);
		}
		public IdentifierListBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierListBool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierListBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListBoolContext identifierListBool() throws RecognitionException {
		IdentifierListBoolContext _localctx = new IdentifierListBoolContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifierListBool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); hostId();
			setState(273); match(DOT);
			setState(274); observableId();
			setState(275); match(DOT);
			setState(276); method();
			setState(277); match(12);
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

	public static class IdentifierListDoubleContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(ExpressionParser.DOT); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public ObservableIdContext observableId() {
			return getRuleContext(ObservableIdContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(ExpressionParser.DOT, i);
		}
		public HostIdContext hostId() {
			return getRuleContext(HostIdContext.class,0);
		}
		public IdentifierListDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierListDouble; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierListDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListDoubleContext identifierListDouble() throws RecognitionException {
		IdentifierListDoubleContext _localctx = new IdentifierListDoubleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_identifierListDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279); hostId();
			setState(280); match(DOT);
			setState(281); observableId();
			setState(282); match(DOT);
			setState(283); method();
			setState(284); match(11);
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

	public static class IdentifierListStringContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(ExpressionParser.DOT); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public ObservableIdContext observableId() {
			return getRuleContext(ObservableIdContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(ExpressionParser.DOT, i);
		}
		public HostIdContext hostId() {
			return getRuleContext(HostIdContext.class,0);
		}
		public IdentifierListStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierListString; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitIdentifierListString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListStringContext identifierListString() throws RecognitionException {
		IdentifierListStringContext _localctx = new IdentifierListStringContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_identifierListString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); hostId();
			setState(287); match(DOT);
			setState(288); observableId();
			setState(289); match(DOT);
			setState(290); method();
			setState(291); match(4);
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

	public static class HostIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressionParser.ID, 0); }
		public HostIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitHostId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostIdContext hostId() throws RecognitionException {
		HostIdContext _localctx = new HostIdContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_hostId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !(_la==MUL || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ObservableIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressionParser.ID, 0); }
		public ObservableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observableId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitObservableId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObservableIdContext observableId() throws RecognitionException {
		ObservableIdContext _localctx = new ObservableIdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_observableId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295); match(ID);
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressionParser.ID, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionVisitor ) return ((ExpressionVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297); match(ID);
			setState(298); match(7);
			setState(299); match(3);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return stringExpr_sempred((StringExprContext)_localctx, predIndex);

		case 3: return numExpr_sempred((NumExprContext)_localctx, predIndex);

		case 4: return boolExpr_sempred((BoolExprContext)_localctx, predIndex);

		case 10: return seqInt_sempred((SeqIntContext)_localctx, predIndex);

		case 11: return seqDouble_sempred((SeqDoubleContext)_localctx, predIndex);

		case 12: return seqString_sempred((SeqStringContext)_localctx, predIndex);

		case 13: return seqBool_sempred((SeqBoolContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean stringExpr_sempred(StringExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 4 >= _localctx._p;
		}
		return true;
	}
	private boolean seqInt_sempred(SeqIntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return 2 >= _localctx._p;

		case 6: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean numExpr_sempred(NumExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 8 >= _localctx._p;

		case 2: return 7 >= _localctx._p;
		}
		return true;
	}
	private boolean seqBool_sempred(SeqBoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11: return 2 >= _localctx._p;

		case 12: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return 9 >= _localctx._p;

		case 4: return 4 >= _localctx._p;
		}
		return true;
	}
	private boolean seqDouble_sempred(SeqDoubleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return 2 >= _localctx._p;

		case 8: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean seqString_sempred(SeqStringContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9: return 2 >= _localctx._p;

		case 10: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\37\u0130\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\3\5\3A"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\3\4\7\4O\n\4\f\4\16"+
		"\4R\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5^\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5f\n\5\f\5\16\5i\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u0084\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008c\n\6\f\6\16\6\u008f\13\6\3"+
		"\7\3\7\3\7\3\7\5\7\u0095\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u00aa\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u00b2\n\f\f\f\16\f\u00b5\13\f\3\r\3\r\3\r\5\r\u00ba\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\7\r\u00c2\n\r\f\r\16\r\u00c5\13\r\3\16\3\16\3\16"+
		"\5\16\u00ca\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00d2\n\16\f\16\16"+
		"\16\u00d5\13\16\3\17\3\17\3\17\5\17\u00da\n\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u00e2\n\17\f\17\16\17\u00e5\13\17\3\20\3\20\5\20\u00e9\n\20"+
		"\3\21\3\21\5\21\u00ed\n\21\3\22\3\22\5\22\u00f1\n\22\3\23\3\23\5\23\u00f5"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668\2\7\3\2\17\20\3\2\21\22\3\2\24\25\3\2\30\31\4\2\17\17\32\32"+
		"\u013c\2:\3\2\2\2\4@\3\2\2\2\6I\3\2\2\2\b]\3\2\2\2\n\u0083\3\2\2\2\f\u0094"+
		"\3\2\2\2\16\u0096\3\2\2\2\20\u009a\3\2\2\2\22\u009e\3\2\2\2\24\u00a2\3"+
		"\2\2\2\26\u00a9\3\2\2\2\30\u00b9\3\2\2\2\32\u00c9\3\2\2\2\34\u00d9\3\2"+
		"\2\2\36\u00e8\3\2\2\2 \u00ec\3\2\2\2\"\u00f0\3\2\2\2$\u00f4\3\2\2\2&\u00f6"+
		"\3\2\2\2(\u00fd\3\2\2\2*\u0104\3\2\2\2,\u010b\3\2\2\2.\u0112\3\2\2\2\60"+
		"\u0119\3\2\2\2\62\u0120\3\2\2\2\64\u0127\3\2\2\2\66\u0129\3\2\2\28\u012b"+
		"\3\2\2\2:;\5\4\3\2;\3\3\2\2\2<A\5\6\4\2=A\5\b\5\2>A\5\n\6\2?A\5\f\7\2"+
		"@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\5\3\2\2\2BC\b\4\1\2CJ\7\33\2"+
		"\2DJ\5(\25\2EF\7\t\2\2FG\5\6\4\2GH\7\5\2\2HJ\3\2\2\2IB\3\2\2\2ID\3\2\2"+
		"\2IE\3\2\2\2JP\3\2\2\2KL\6\4\2\3LM\7\21\2\2MO\5\6\4\2NK\3\2\2\2OR\3\2"+
		"\2\2PN\3\2\2\2PQ\3\2\2\2Q\7\3\2\2\2RP\3\2\2\2ST\b\5\1\2T^\7\34\2\2U^\7"+
		"\35\2\2V^\5&\24\2W^\5\60\31\2X^\5,\27\2YZ\7\t\2\2Z[\5\b\5\2[\\\7\5\2\2"+
		"\\^\3\2\2\2]S\3\2\2\2]U\3\2\2\2]V\3\2\2\2]W\3\2\2\2]X\3\2\2\2]Y\3\2\2"+
		"\2^g\3\2\2\2_`\6\5\3\3`a\t\2\2\2af\5\b\5\2bc\6\5\4\3cd\t\3\2\2df\5\b\5"+
		"\2e_\3\2\2\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\t\3\2\2\2ig\3\2"+
		"\2\2jk\b\6\1\2kl\7\26\2\2l\u0084\5\n\6\2m\u0084\7\36\2\2n\u0084\5*\26"+
		"\2op\7\t\2\2pq\5\n\6\2qr\7\5\2\2r\u0084\3\2\2\2st\5\b\5\2tu\t\4\2\2uv"+
		"\5\b\5\2v\u0084\3\2\2\2wx\5\b\5\2xy\7\27\2\2yz\5\b\5\2z\u0084\3\2\2\2"+
		"{|\5\6\4\2|}\7\27\2\2}~\5\6\4\2~\u0084\3\2\2\2\177\u0080\5\f\7\2\u0080"+
		"\u0081\7\27\2\2\u0081\u0082\5\f\7\2\u0082\u0084\3\2\2\2\u0083j\3\2\2\2"+
		"\u0083m\3\2\2\2\u0083n\3\2\2\2\u0083o\3\2\2\2\u0083s\3\2\2\2\u0083w\3"+
		"\2\2\2\u0083{\3\2\2\2\u0083\177\3\2\2\2\u0084\u008d\3\2\2\2\u0085\u0086"+
		"\6\6\5\3\u0086\u0087\t\5\2\2\u0087\u008c\5\n\6\2\u0088\u0089\6\6\6\3\u0089"+
		"\u008a\7\27\2\2\u008a\u008c\5\n\6\2\u008b\u0085\3\2\2\2\u008b\u0088\3"+
		"\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\13\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0095\5\36\20\2\u0091\u0095\5 \21"+
		"\2\u0092\u0095\5\"\22\2\u0093\u0095\5$\23\2\u0094\u0090\3\2\2\2\u0094"+
		"\u0091\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\r\3\2\2\2"+
		"\u0096\u0097\7\b\2\2\u0097\u0098\5\26\f\2\u0098\u0099\7\3\2\2\u0099\17"+
		"\3\2\2\2\u009a\u009b\7\b\2\2\u009b\u009c\5\30\r\2\u009c\u009d\7\3\2\2"+
		"\u009d\21\3\2\2\2\u009e\u009f\7\b\2\2\u009f\u00a0\5\32\16\2\u00a0\u00a1"+
		"\7\3\2\2\u00a1\23\3\2\2\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4\5\34\17\2\u00a4"+
		"\u00a5\7\3\2\2\u00a5\25\3\2\2\2\u00a6\u00a7\b\f\1\2\u00a7\u00aa\7\34\2"+
		"\2\u00a8\u00aa\5&\24\2\u00a9\u00a6\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00b3"+
		"\3\2\2\2\u00ab\u00ac\6\f\7\3\u00ac\u00ad\7\7\2\2\u00ad\u00b2\7\34\2\2"+
		"\u00ae\u00af\6\f\b\3\u00af\u00b0\7\7\2\2\u00b0\u00b2\5&\24\2\u00b1\u00ab"+
		"\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\27\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\b\r\1"+
		"\2\u00b7\u00ba\7\35\2\2\u00b8\u00ba\5&\24\2\u00b9\u00b6\3\2\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00c3\3\2\2\2\u00bb\u00bc\6\r\t\3\u00bc\u00bd\7\7"+
		"\2\2\u00bd\u00c2\7\35\2\2\u00be\u00bf\6\r\n\3\u00bf\u00c0\7\7\2\2\u00c0"+
		"\u00c2\5&\24\2\u00c1\u00bb\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\u00c5\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\31\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\u00c7\b\16\1\2\u00c7\u00ca\7\33\2\2\u00c8\u00ca\5(\25\2"+
		"\u00c9\u00c6\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00d3\3\2\2\2\u00cb\u00cc"+
		"\6\16\13\3\u00cc\u00cd\7\7\2\2\u00cd\u00d2\7\33\2\2\u00ce\u00cf\6\16\f"+
		"\3\u00cf\u00d0\7\7\2\2\u00d0\u00d2\5(\25\2\u00d1\u00cb\3\2\2\2\u00d1\u00ce"+
		"\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\33\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\b\17\1\2\u00d7\u00da\7\36"+
		"\2\2\u00d8\u00da\5*\26\2\u00d9\u00d6\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\u00e3\3\2\2\2\u00db\u00dc\6\17\r\3\u00dc\u00dd\7\7\2\2\u00dd\u00e2\7"+
		"\36\2\2\u00de\u00df\6\17\16\3\u00df\u00e0\7\7\2\2\u00e0\u00e2\5*\26\2"+
		"\u00e1\u00db\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\35\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e9\5\16\b\2\u00e7\u00e9\5,\27\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3"+
		"\2\2\2\u00e9\37\3\2\2\2\u00ea\u00ed\5\20\t\2\u00eb\u00ed\5\60\31\2\u00ec"+
		"\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed!\3\2\2\2\u00ee\u00f1\5\22\n\2"+
		"\u00ef\u00f1\5\62\32\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1#"+
		"\3\2\2\2\u00f2\u00f5\5\24\13\2\u00f3\u00f5\5.\30\2\u00f4\u00f2\3\2\2\2"+
		"\u00f4\u00f3\3\2\2\2\u00f5%\3\2\2\2\u00f6\u00f7\5\64\33\2\u00f7\u00f8"+
		"\7\23\2\2\u00f8\u00f9\5\66\34\2\u00f9\u00fa\7\23\2\2\u00fa\u00fb\58\35"+
		"\2\u00fb\u00fc\7\n\2\2\u00fc\'\3\2\2\2\u00fd\u00fe\5\64\33\2\u00fe\u00ff"+
		"\7\23\2\2\u00ff\u0100\5\66\34\2\u0100\u0101\7\23\2\2\u0101\u0102\58\35"+
		"\2\u0102\u0103\7\f\2\2\u0103)\3\2\2\2\u0104\u0105\5\64\33\2\u0105\u0106"+
		"\7\23\2\2\u0106\u0107\5\66\34\2\u0107\u0108\7\23\2\2\u0108\u0109\58\35"+
		"\2\u0109\u010a\7\4\2\2\u010a+\3\2\2\2\u010b\u010c\5\64\33\2\u010c\u010d"+
		"\7\23\2\2\u010d\u010e\5\66\34\2\u010e\u010f\7\23\2\2\u010f\u0110\58\35"+
		"\2\u0110\u0111\7\13\2\2\u0111-\3\2\2\2\u0112\u0113\5\64\33\2\u0113\u0114"+
		"\7\23\2\2\u0114\u0115\5\66\34\2\u0115\u0116\7\23\2\2\u0116\u0117\58\35"+
		"\2\u0117\u0118\7\16\2\2\u0118/\3\2\2\2\u0119\u011a\5\64\33\2\u011a\u011b"+
		"\7\23\2\2\u011b\u011c\5\66\34\2\u011c\u011d\7\23\2\2\u011d\u011e\58\35"+
		"\2\u011e\u011f\7\r\2\2\u011f\61\3\2\2\2\u0120\u0121\5\64\33\2\u0121\u0122"+
		"\7\23\2\2\u0122\u0123\5\66\34\2\u0123\u0124\7\23\2\2\u0124\u0125\58\35"+
		"\2\u0125\u0126\7\6\2\2\u0126\63\3\2\2\2\u0127\u0128\t\6\2\2\u0128\65\3"+
		"\2\2\2\u0129\u012a\7\32\2\2\u012a\67\3\2\2\2\u012b\u012c\7\32\2\2\u012c"+
		"\u012d\7\t\2\2\u012d\u012e\7\5\2\2\u012e9\3\2\2\2\34@IP]eg\u0083\u008b"+
		"\u008d\u0094\u00a9\u00b1\u00b3\u00b9\u00c1\u00c3\u00c9\u00d1\u00d3\u00d9"+
		"\u00e1\u00e3\u00e8\u00ec\u00f0\u00f4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}