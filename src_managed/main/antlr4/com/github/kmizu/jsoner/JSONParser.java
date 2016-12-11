// Generated from C:\Users\Mizushima\git\jsoner\src\main\antlr4\com\github\kmizu\jsoner\JSON.g4 by ANTLR 4.5.3
package com.github.kmizu.jsoner;

  import scala.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRING=10, NUMBER=11, WS=12;
	public static final int
		RULE_json = 0, RULE_object = 1, RULE_pairs = 2, RULE_pair = 3, RULE_array = 4, 
		RULE_values = 5, RULE_value = 6;
	public static final String[] ruleNames = {
		"json", "object", "pairs", "pair", "array", "values", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", "':'", "'['", "']'", "'true'", "'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "STRING", 
		"NUMBER", "WS"
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
	public String getGrammarFileName() { return "JSON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class JsonContext extends ParserRuleContext {
		public JsonValue v;
		public ObjectContext o;
		public ArrayContext a;
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitJson(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		try {
			setState(18);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				((JsonContext)_localctx).o = object();
				((JsonContext)_localctx).v =  ((JsonContext)_localctx).o.o;
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				((JsonContext)_localctx).a = array();
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

	public static class ObjectContext extends ParserRuleContext {
		public JsonObject o;
		public PairsContext p;
		public PairsContext pairs() {
			return getRuleContext(PairsContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_object);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(T__0);
				setState(21);
				((ObjectContext)_localctx).p = pairs();
				setState(22);
				match(T__1);
				((ObjectContext)_localctx).o =  new JsonObject(((ObjectContext)_localctx).p.v); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(T__0);
				setState(26);
				match(T__1);
				((ObjectContext)_localctx).o =  new JsonObject(); 
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

	public static class PairsContext extends ParserRuleContext {
		public scala.collection.immutable.List<Tuple2<String, JsonValue>> v;
		public PairContext h;
		public PairsContext t;
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public PairsContext pairs() {
			return getRuleContext(PairsContext.class,0);
		}
		public PairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterPairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitPairs(this);
		}
	}

	public final PairsContext pairs() throws RecognitionException {
		PairsContext _localctx = new PairsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pairs);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				((PairsContext)_localctx).h = pair();
				setState(31);
				match(T__2);
				setState(32);
				((PairsContext)_localctx).t = pairs();
				((PairsContext)_localctx).v =  Lists.cons(((PairsContext)_localctx).h.tuple, ((PairsContext)_localctx).t.v);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				((PairsContext)_localctx).h = pair();
				((PairsContext)_localctx).v =  Lists.one(((PairsContext)_localctx).h.tuple);
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

	public static class PairContext extends ParserRuleContext {
		public Tuple2<String, JsonValue> tuple;
		public Token k;
		public ValueContext v;
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			((PairContext)_localctx).k = match(STRING);
			setState(41);
			match(T__3);
			setState(42);
			((PairContext)_localctx).v = value();
			((PairContext)_localctx).tuple =  new Tuple2<String, JsonValue>(((PairContext)_localctx).k.getText(), ((PairContext)_localctx).v.v);
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

	public static class ArrayContext extends ParserRuleContext {
		public JsonArray a;
		public ValuesContext vs;
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__4);
				setState(46);
				((ArrayContext)_localctx).vs = values();
				setState(47);
				match(T__5);
				((ArrayContext)_localctx).a =  new JsonArray(((ArrayContext)_localctx).vs.vs); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(T__4);
				setState(51);
				match(T__5);
				((ArrayContext)_localctx).a =  new JsonArray(); 
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

	public static class ValuesContext extends ParserRuleContext {
		public scala.collection.immutable.List<JsonValue> vs;
		public ValueContext h;
		public ValuesContext hs;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitValues(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_values);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				((ValuesContext)_localctx).h = value();
				setState(56);
				match(T__2);
				setState(57);
				((ValuesContext)_localctx).hs = values();
				 ((ValuesContext)_localctx).vs =  Lists.cons(((ValuesContext)_localctx).h.v, ((ValuesContext)_localctx).hs.vs); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				((ValuesContext)_localctx).h = value();
				 ((ValuesContext)_localctx).vs =  Lists.one(((ValuesContext)_localctx).h.v); 
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

	public static class ValueContext extends ParserRuleContext {
		public JsonValue v;
		public Token a;
		public Token b;
		public ObjectContext c;
		public ArrayContext d;
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(JSONParser.NUMBER, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(81);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				((ValueContext)_localctx).a = match(STRING);
				((ValueContext)_localctx).v =  new JsonString(((ValueContext)_localctx).a.getText());
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				((ValueContext)_localctx).b = match(NUMBER);
				((ValueContext)_localctx).v =  new JsonNumber(java.lang.Double.parseDouble(((ValueContext)_localctx).b.getText()));
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				((ValueContext)_localctx).c = object();
				((ValueContext)_localctx).v =  ((ValueContext)_localctx).c.o;
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				((ValueContext)_localctx).d = array();
				((ValueContext)_localctx).v =  ((ValueContext)_localctx).d.a;
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				match(T__6);
				((ValueContext)_localctx).v =  new JsonBoolean(true);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				match(T__7);
				((ValueContext)_localctx).v =  new JsonBoolean(false); 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				match(T__8);
				((ValueContext)_localctx).v =  JsonNull$.MODULE$; 
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\5\2\25\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4)\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\68\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7B\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bT\n\b\3\b\2\2\t\2\4\6\b"+
		"\n\f\16\2\2Y\2\24\3\2\2\2\4\36\3\2\2\2\6(\3\2\2\2\b*\3\2\2\2\n\67\3\2"+
		"\2\2\fA\3\2\2\2\16S\3\2\2\2\20\21\5\4\3\2\21\22\b\2\1\2\22\25\3\2\2\2"+
		"\23\25\5\n\6\2\24\20\3\2\2\2\24\23\3\2\2\2\25\3\3\2\2\2\26\27\7\3\2\2"+
		"\27\30\5\6\4\2\30\31\7\4\2\2\31\32\b\3\1\2\32\37\3\2\2\2\33\34\7\3\2\2"+
		"\34\35\7\4\2\2\35\37\b\3\1\2\36\26\3\2\2\2\36\33\3\2\2\2\37\5\3\2\2\2"+
		" !\5\b\5\2!\"\7\5\2\2\"#\5\6\4\2#$\b\4\1\2$)\3\2\2\2%&\5\b\5\2&\'\b\4"+
		"\1\2\')\3\2\2\2( \3\2\2\2(%\3\2\2\2)\7\3\2\2\2*+\7\f\2\2+,\7\6\2\2,-\5"+
		"\16\b\2-.\b\5\1\2.\t\3\2\2\2/\60\7\7\2\2\60\61\5\f\7\2\61\62\7\b\2\2\62"+
		"\63\b\6\1\2\638\3\2\2\2\64\65\7\7\2\2\65\66\7\b\2\2\668\b\6\1\2\67/\3"+
		"\2\2\2\67\64\3\2\2\28\13\3\2\2\29:\5\16\b\2:;\7\5\2\2;<\5\f\7\2<=\b\7"+
		"\1\2=B\3\2\2\2>?\5\16\b\2?@\b\7\1\2@B\3\2\2\2A9\3\2\2\2A>\3\2\2\2B\r\3"+
		"\2\2\2CD\7\f\2\2DT\b\b\1\2EF\7\r\2\2FT\b\b\1\2GH\5\4\3\2HI\b\b\1\2IT\3"+
		"\2\2\2JK\5\n\6\2KL\b\b\1\2LT\3\2\2\2MN\7\t\2\2NT\b\b\1\2OP\7\n\2\2PT\b"+
		"\b\1\2QR\7\13\2\2RT\b\b\1\2SC\3\2\2\2SE\3\2\2\2SG\3\2\2\2SJ\3\2\2\2SM"+
		"\3\2\2\2SO\3\2\2\2SQ\3\2\2\2T\17\3\2\2\2\b\24\36(\67AS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}