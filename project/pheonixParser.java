// Generated from pheonix.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pheonixParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, Letter=33, Digit=34, WS=35;
	public static final int
		RULE_start = 0, RULE_begin = 1, RULE_function = 2, RULE_dataType = 3, 
		RULE_functionName = 4, RULE_functionBlock = 5, RULE_functionWork = 6, 
		RULE_variableDeclaration = 7, RULE_valueAssignment = 8, RULE_arithmeticCalculation = 9, 
		RULE_arithmeticOperator = 10, RULE_conditionalStatement = 11, RULE_condition = 12, 
		RULE_conditionalOperator = 13, RULE_conditionalBlock = 14, RULE_conditionalStatementWork = 15, 
		RULE_loop = 16, RULE_loopBlock = 17, RULE_loopWork = 18, RULE_returnValue = 19, 
		RULE_variable = 20, RULE_end = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "begin", "function", "dataType", "functionName", "functionBlock", 
			"functionWork", "variableDeclaration", "valueAssignment", "arithmeticCalculation", 
			"arithmeticOperator", "conditionalStatement", "condition", "conditionalOperator", 
			"conditionalBlock", "conditionalStatementWork", "loop", "loopBlock", 
			"loopWork", "returnValue", "variable", "end"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'$start'", "'('", "')'", "'int'", "'float'", "'char'", "'string'", 
			"'boolean'", "'['", "']'", "'.'", "'='", "'+'", "'-'", "'/'", "'*'", 
			"'%'", "'when'", "'or'", "'>'", "'<'", "'=='", "'>='", "'<='", "'!='", 
			"'run'", "'from'", "'to'", "'increase'", "'by'", "'return'", "'$end'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "Letter", "Digit", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "pheonix.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pheonixParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			begin();
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				function();
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) );
			setState(50);
			end();
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

	public static class BeginContext extends ParserRuleContext {
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitBegin(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
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

	public static class FunctionContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionBlockContext functionBlock() {
			return getRuleContext(FunctionBlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			dataType();
			setState(55);
			functionName();
			setState(56);
			match(T__1);
			setState(57);
			match(T__2);
			setState(58);
			functionBlock();
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
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

	public static class FunctionNameContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			variable();
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

	public static class FunctionBlockContext extends ParserRuleContext {
		public FunctionWorkContext functionWork() {
			return getRuleContext(FunctionWorkContext.class,0);
		}
		public ReturnValueContext returnValue() {
			return getRuleContext(ReturnValueContext.class,0);
		}
		public FunctionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterFunctionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitFunctionBlock(this);
		}
	}

	public final FunctionBlockContext functionBlock() throws RecognitionException {
		FunctionBlockContext _localctx = new FunctionBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__8);
			setState(65);
			functionWork();
			setState(66);
			returnValue();
			setState(67);
			match(T__9);
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

	public static class FunctionWorkContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<ValueAssignmentContext> valueAssignment() {
			return getRuleContexts(ValueAssignmentContext.class);
		}
		public ValueAssignmentContext valueAssignment(int i) {
			return getRuleContext(ValueAssignmentContext.class,i);
		}
		public List<ConditionalStatementContext> conditionalStatement() {
			return getRuleContexts(ConditionalStatementContext.class);
		}
		public ConditionalStatementContext conditionalStatement(int i) {
			return getRuleContext(ConditionalStatementContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FunctionWorkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionWork; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterFunctionWork(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitFunctionWork(this);
		}
	}

	public final FunctionWorkContext functionWork() throws RecognitionException {
		FunctionWorkContext _localctx = new FunctionWorkContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionWork);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(69);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(70);
					valueAssignment();
					}
					break;
				case 3:
					{
					setState(71);
					conditionalStatement();
					}
					break;
				case 4:
					{
					setState(72);
					loop();
					}
					break;
				case 5:
					{
					setState(73);
					function();
					}
					break;
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__17) | (1L << T__25) | (1L << Letter))) != 0) );
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			dataType();
			setState(79);
			variable();
			setState(80);
			match(T__10);
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

	public static class ValueAssignmentContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode Digit() { return getToken(pheonixParser.Digit, 0); }
		public ArithmeticCalculationContext arithmeticCalculation() {
			return getRuleContext(ArithmeticCalculationContext.class,0);
		}
		public ValueAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterValueAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitValueAssignment(this);
		}
	}

	public final ValueAssignmentContext valueAssignment() throws RecognitionException {
		ValueAssignmentContext _localctx = new ValueAssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valueAssignment);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(82);
				variable();
				setState(83);
				match(T__11);
				setState(84);
				match(Digit);
				setState(85);
				match(T__10);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(87);
				variable();
				setState(88);
				match(T__11);
				setState(89);
				variable();
				setState(90);
				match(T__10);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(92);
				variable();
				setState(93);
				match(T__11);
				setState(94);
				arithmeticCalculation();
				setState(95);
				match(T__10);
				}
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

	public static class ArithmeticCalculationContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public ArithmeticCalculationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticCalculation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterArithmeticCalculation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitArithmeticCalculation(this);
		}
	}

	public final ArithmeticCalculationContext arithmeticCalculation() throws RecognitionException {
		ArithmeticCalculationContext _localctx = new ArithmeticCalculationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arithmeticCalculation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			variable();
			setState(100);
			arithmeticOperator();
			setState(101);
			variable();
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitArithmeticOperator(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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

	public static class ConditionalStatementContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ConditionalBlockContext> conditionalBlock() {
			return getRuleContexts(ConditionalBlockContext.class);
		}
		public ConditionalBlockContext conditionalBlock(int i) {
			return getRuleContext(ConditionalBlockContext.class,i);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitConditionalStatement(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditionalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__17);
			setState(106);
			match(T__1);
			setState(107);
			condition();
			setState(108);
			match(T__2);
			setState(109);
			conditionalBlock();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(110);
				match(T__18);
				setState(111);
				match(T__1);
				setState(112);
				condition();
				setState(113);
				match(T__2);
				setState(114);
				conditionalBlock();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ConditionalOperatorContext conditionalOperator() {
			return getRuleContext(ConditionalOperatorContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			variable();
			setState(122);
			conditionalOperator();
			setState(123);
			variable();
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

	public static class ConditionalOperatorContext extends ParserRuleContext {
		public ConditionalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterConditionalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitConditionalOperator(this);
		}
	}

	public final ConditionalOperatorContext conditionalOperator() throws RecognitionException {
		ConditionalOperatorContext _localctx = new ConditionalOperatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
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

	public static class ConditionalBlockContext extends ParserRuleContext {
		public ConditionalStatementWorkContext conditionalStatementWork() {
			return getRuleContext(ConditionalStatementWorkContext.class,0);
		}
		public ConditionalBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterConditionalBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitConditionalBlock(this);
		}
	}

	public final ConditionalBlockContext conditionalBlock() throws RecognitionException {
		ConditionalBlockContext _localctx = new ConditionalBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conditionalBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__8);
			setState(128);
			conditionalStatementWork();
			setState(129);
			match(T__9);
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

	public static class ConditionalStatementWorkContext extends ParserRuleContext {
		public List<ValueAssignmentContext> valueAssignment() {
			return getRuleContexts(ValueAssignmentContext.class);
		}
		public ValueAssignmentContext valueAssignment(int i) {
			return getRuleContext(ValueAssignmentContext.class,i);
		}
		public List<ConditionalStatementContext> conditionalStatement() {
			return getRuleContexts(ConditionalStatementContext.class);
		}
		public ConditionalStatementContext conditionalStatement(int i) {
			return getRuleContext(ConditionalStatementContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ConditionalStatementWorkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatementWork; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterConditionalStatementWork(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitConditionalStatementWork(this);
		}
	}

	public final ConditionalStatementWorkContext conditionalStatementWork() throws RecognitionException {
		ConditionalStatementWorkContext _localctx = new ConditionalStatementWorkContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conditionalStatementWork);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Letter:
					{
					setState(131);
					valueAssignment();
					}
					break;
				case T__17:
					{
					setState(132);
					conditionalStatement();
					}
					break;
				case T__25:
					{
					setState(133);
					loop();
					}
					break;
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
					{
					setState(134);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__17) | (1L << T__25) | (1L << Letter))) != 0) );
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

	public static class LoopContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public LoopBlockContext loopBlock() {
			return getRuleContext(LoopBlockContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__25);
			setState(140);
			match(T__1);
			setState(141);
			match(T__26);
			setState(142);
			variable();
			setState(143);
			match(T__27);
			setState(144);
			variable();
			setState(145);
			match(T__28);
			setState(146);
			match(T__29);
			setState(147);
			variable();
			setState(148);
			match(T__2);
			setState(149);
			loopBlock();
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

	public static class LoopBlockContext extends ParserRuleContext {
		public LoopWorkContext loopWork() {
			return getRuleContext(LoopWorkContext.class,0);
		}
		public LoopBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterLoopBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitLoopBlock(this);
		}
	}

	public final LoopBlockContext loopBlock() throws RecognitionException {
		LoopBlockContext _localctx = new LoopBlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_loopBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__8);
			setState(152);
			loopWork();
			setState(153);
			match(T__9);
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

	public static class LoopWorkContext extends ParserRuleContext {
		public List<ValueAssignmentContext> valueAssignment() {
			return getRuleContexts(ValueAssignmentContext.class);
		}
		public ValueAssignmentContext valueAssignment(int i) {
			return getRuleContext(ValueAssignmentContext.class,i);
		}
		public List<ConditionalStatementContext> conditionalStatement() {
			return getRuleContexts(ConditionalStatementContext.class);
		}
		public ConditionalStatementContext conditionalStatement(int i) {
			return getRuleContext(ConditionalStatementContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public LoopWorkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopWork; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterLoopWork(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitLoopWork(this);
		}
	}

	public final LoopWorkContext loopWork() throws RecognitionException {
		LoopWorkContext _localctx = new LoopWorkContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_loopWork);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Letter:
					{
					setState(155);
					valueAssignment();
					}
					break;
				case T__17:
					{
					setState(156);
					conditionalStatement();
					}
					break;
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
					{
					setState(157);
					function();
					}
					break;
				case T__25:
					{
					setState(158);
					loop();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__17) | (1L << T__25) | (1L << Letter))) != 0) );
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

	public static class ReturnValueContext extends ParserRuleContext {
		public TerminalNode Digit() { return getToken(pheonixParser.Digit, 0); }
		public ReturnValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterReturnValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitReturnValue(this);
		}
	}

	public final ReturnValueContext returnValue() throws RecognitionException {
		ReturnValueContext _localctx = new ReturnValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__30);
			setState(164);
			match(Digit);
			setState(165);
			match(T__10);
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
		public List<TerminalNode> Letter() { return getTokens(pheonixParser.Letter); }
		public TerminalNode Letter(int i) {
			return getToken(pheonixParser.Letter, i);
		}
		public List<TerminalNode> Digit() { return getTokens(pheonixParser.Digit); }
		public TerminalNode Digit(int i) {
			return getToken(pheonixParser.Digit, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(Letter);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Letter || _la==Digit) {
				{
				{
				setState(168);
				_la = _input.LA(1);
				if ( !(_la==Letter || _la==Digit) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pheonixListener ) ((pheonixListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__31);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\6\2\61\n\2"+
		"\r\2\16\2\62\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\6\bM\n\b\r\b\16\bN\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nd"+
		"\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\7\rw\n\r\f\r\16\rz\13\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\6\21\u008a\n\21\r\21\16\21\u008b\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\6\24\u00a2\n\24\r\24\16\24\u00a3\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\7\26\u00ac\n\26\f\26\16\26\u00af\13\26\3\27\3\27\3\27"+
		"\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\6\3\2\6\n\3\2"+
		"\17\23\3\2\26\33\3\2#$\2\u00ae\2.\3\2\2\2\4\66\3\2\2\2\68\3\2\2\2\b>\3"+
		"\2\2\2\n@\3\2\2\2\fB\3\2\2\2\16L\3\2\2\2\20P\3\2\2\2\22c\3\2\2\2\24e\3"+
		"\2\2\2\26i\3\2\2\2\30k\3\2\2\2\32{\3\2\2\2\34\177\3\2\2\2\36\u0081\3\2"+
		"\2\2 \u0089\3\2\2\2\"\u008d\3\2\2\2$\u0099\3\2\2\2&\u00a1\3\2\2\2(\u00a5"+
		"\3\2\2\2*\u00a9\3\2\2\2,\u00b0\3\2\2\2.\60\5\4\3\2/\61\5\6\4\2\60/\3\2"+
		"\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\5,"+
		"\27\2\65\3\3\2\2\2\66\67\7\3\2\2\67\5\3\2\2\289\5\b\5\29:\5\n\6\2:;\7"+
		"\4\2\2;<\7\5\2\2<=\5\f\7\2=\7\3\2\2\2>?\t\2\2\2?\t\3\2\2\2@A\5*\26\2A"+
		"\13\3\2\2\2BC\7\13\2\2CD\5\16\b\2DE\5(\25\2EF\7\f\2\2F\r\3\2\2\2GM\5\20"+
		"\t\2HM\5\22\n\2IM\5\30\r\2JM\5\"\22\2KM\5\6\4\2LG\3\2\2\2LH\3\2\2\2LI"+
		"\3\2\2\2LJ\3\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\17\3\2\2\2"+
		"PQ\5\b\5\2QR\5*\26\2RS\7\r\2\2S\21\3\2\2\2TU\5*\26\2UV\7\16\2\2VW\7$\2"+
		"\2WX\7\r\2\2Xd\3\2\2\2YZ\5*\26\2Z[\7\16\2\2[\\\5*\26\2\\]\7\r\2\2]d\3"+
		"\2\2\2^_\5*\26\2_`\7\16\2\2`a\5\24\13\2ab\7\r\2\2bd\3\2\2\2cT\3\2\2\2"+
		"cY\3\2\2\2c^\3\2\2\2d\23\3\2\2\2ef\5*\26\2fg\5\26\f\2gh\5*\26\2h\25\3"+
		"\2\2\2ij\t\3\2\2j\27\3\2\2\2kl\7\24\2\2lm\7\4\2\2mn\5\32\16\2no\7\5\2"+
		"\2ox\5\36\20\2pq\7\25\2\2qr\7\4\2\2rs\5\32\16\2st\7\5\2\2tu\5\36\20\2"+
		"uw\3\2\2\2vp\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\31\3\2\2\2zx\3\2\2"+
		"\2{|\5*\26\2|}\5\34\17\2}~\5*\26\2~\33\3\2\2\2\177\u0080\t\4\2\2\u0080"+
		"\35\3\2\2\2\u0081\u0082\7\13\2\2\u0082\u0083\5 \21\2\u0083\u0084\7\f\2"+
		"\2\u0084\37\3\2\2\2\u0085\u008a\5\22\n\2\u0086\u008a\5\30\r\2\u0087\u008a"+
		"\5\"\22\2\u0088\u008a\5\6\4\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2"+
		"\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c!\3\2\2\2\u008d\u008e\7\34\2\2\u008e"+
		"\u008f\7\4\2\2\u008f\u0090\7\35\2\2\u0090\u0091\5*\26\2\u0091\u0092\7"+
		"\36\2\2\u0092\u0093\5*\26\2\u0093\u0094\7\37\2\2\u0094\u0095\7 \2\2\u0095"+
		"\u0096\5*\26\2\u0096\u0097\7\5\2\2\u0097\u0098\5$\23\2\u0098#\3\2\2\2"+
		"\u0099\u009a\7\13\2\2\u009a\u009b\5&\24\2\u009b\u009c\7\f\2\2\u009c%\3"+
		"\2\2\2\u009d\u00a2\5\22\n\2\u009e\u00a2\5\30\r\2\u009f\u00a2\5\6\4\2\u00a0"+
		"\u00a2\5\"\22\2\u00a1\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\'\3\2\2\2\u00a5\u00a6\7!\2\2\u00a6\u00a7\7$\2\2\u00a7"+
		"\u00a8\7\r\2\2\u00a8)\3\2\2\2\u00a9\u00ad\7#\2\2\u00aa\u00ac\t\5\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae+\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\"\2\2\u00b1-\3\2"+
		"\2\2\f\62LNcx\u0089\u008b\u00a1\u00a3\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}