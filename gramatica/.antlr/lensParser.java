// Generated from c:/Users/augus/compilador_lens/gramatica/lens.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class lensParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, STRING=42, INT=43, FLOAT=44, VAR=45, DUPONT=46, 
		BOOL=47, ANY=48, COMENTARIO=49, WS=50;
	public static final int
		RULE_lens = 0, RULE_comando = 1, RULE_opper = 2, RULE_expop = 3, RULE_imprime = 4, 
		RULE_concat = 5, RULE_ler = 6, RULE_funcaoW = 7, RULE_funcaoD = 8, RULE_condicao = 9, 
		RULE_ifcond = 10, RULE_elifcond = 11, RULE_elcond = 12, RULE_lacofor = 13, 
		RULE_lacowhile = 14, RULE_arit = 15, RULE_aritp = 16, RULE_oparit = 17, 
		RULE_opalogi = 18, RULE_comparacao = 19, RULE_expcomp = 20, RULE_explogi = 21, 
		RULE_expTemplate = 22, RULE_exp = 23, RULE_expcond = 24, RULE_dec = 25, 
		RULE_class = 26, RULE_atray = 27, RULE_arraysdec = 28, RULE_letvar = 29, 
		RULE_arraysolto = 30, RULE_setarray = 31, RULE_atrsolta = 32, RULE_atr = 33, 
		RULE_rolav = 34, RULE_valor = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"lens", "comando", "opper", "expop", "imprime", "concat", "ler", "funcaoW", 
			"funcaoD", "condicao", "ifcond", "elifcond", "elcond", "lacofor", "lacowhile", 
			"arit", "aritp", "oparit", "opalogi", "comparacao", "expcomp", "explogi", 
			"expTemplate", "exp", "expcond", "dec", "class", "atray", "arraysdec", 
			"letvar", "arraysolto", "setarray", "atrsolta", "atr", "rolav", "valor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@start'", "'@end'", "'op'", "'('", "':'", "','", "')'", "'->'", 
			"'{'", "'return'", "'}'", "'print'", "'input'", "'func'", "'if'", "'elseif'", 
			"'else'", "'for'", "'in'", "'..'", "'while'", "'*'", "'/'", "'+'", "'-'", 
			"'&&'", "'||'", "'!='", "'<'", "'>'", "'<='", "'>='", "'=='", "'int'", 
			"'bool'", "'String'", "'float'", "'='", "'['", "']'", "'let'", null, 
			null, null, null, "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "STRING", "INT", "FLOAT", "VAR", 
			"DUPONT", "BOOL", "ANY", "COMENTARIO", "WS"
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
	public String getGrammarFileName() { return "lens.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lensParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LensContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public LensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lens; }
	}

	public final LensContext lens() throws RecognitionException {
		LensContext _localctx = new LensContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__0);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37383397765128L) != 0)) {
				{
				{
				setState(73);
				comando();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public ImprimeContext imprime() {
			return getRuleContext(ImprimeContext.class,0);
		}
		public AtrsoltaContext atrsolta() {
			return getRuleContext(AtrsoltaContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public LerContext ler() {
			return getRuleContext(LerContext.class,0);
		}
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public LacoforContext lacofor() {
			return getRuleContext(LacoforContext.class,0);
		}
		public LacowhileContext lacowhile() {
			return getRuleContext(LacowhileContext.class,0);
		}
		public FuncaoWContext funcaoW() {
			return getRuleContext(FuncaoWContext.class,0);
		}
		public FuncaoDContext funcaoD() {
			return getRuleContext(FuncaoDContext.class,0);
		}
		public OpperContext opper() {
			return getRuleContext(OpperContext.class,0);
		}
		public ArraysdecContext arraysdec() {
			return getRuleContext(ArraysdecContext.class,0);
		}
		public SetarrayContext setarray() {
			return getRuleContext(SetarrayContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				imprime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				atrsolta();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				dec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				ler();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				condicao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				lacofor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				lacowhile();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(88);
				funcaoW();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(89);
				funcaoD();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(90);
				opper();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(91);
				arraysdec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(92);
				setarray();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpperContext extends ParserRuleContext {
		public TerminalNode ANY() { return getToken(lensParser.ANY, 0); }
		public List<TerminalNode> VAR() { return getTokens(lensParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(lensParser.VAR, i);
		}
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public OpperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opper; }
	}

	public final OpperContext opper() throws RecognitionException {
		OpperContext _localctx = new OpperContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_opper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__2);
			setState(96);
			match(ANY);
			setState(97);
			match(T__3);
			setState(98);
			match(VAR);
			setState(99);
			match(T__4);
			setState(100);
			class_();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(101);
				match(T__5);
				setState(102);
				match(VAR);
				setState(103);
				match(T__4);
				setState(104);
				class_();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(T__6);
			setState(111);
			match(T__7);
			setState(112);
			class_();
			setState(113);
			match(T__8);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37383397765128L) != 0)) {
				{
				{
				setState(114);
				comando();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(T__9);
			setState(121);
			exp();
			setState(122);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpopContext extends ParserRuleContext {
		public List<ExpTemplateContext> expTemplate() {
			return getRuleContexts(ExpTemplateContext.class);
		}
		public ExpTemplateContext expTemplate(int i) {
			return getRuleContext(ExpTemplateContext.class,i);
		}
		public List<TerminalNode> ANY() { return getTokens(lensParser.ANY); }
		public TerminalNode ANY(int i) {
			return getToken(lensParser.ANY, i);
		}
		public ExpopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expop; }
	}

	public final ExpopContext expop() throws RecognitionException {
		ExpopContext _localctx = new ExpopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			expTemplate();
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125);
				match(ANY);
				setState(126);
				expTemplate();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ANY );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImprimeContext extends ParserRuleContext {
		public TerminalNode DUPONT() { return getToken(lensParser.DUPONT, 0); }
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public ImprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprime; }
	}

	public final ImprimeContext imprime() throws RecognitionException {
		ImprimeContext _localctx = new ImprimeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_imprime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__11);
			setState(132);
			match(DUPONT);
			setState(133);
			concat();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConcatContext extends ParserRuleContext {
		public List<RolavContext> rolav() {
			return getRuleContexts(RolavContext.class);
		}
		public RolavContext rolav(int i) {
			return getRuleContext(RolavContext.class,i);
		}
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_concat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			rolav();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(136);
				match(T__5);
				setState(137);
				rolav();
				}
				}
				setState(142);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LerContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public LerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ler; }
	}

	public final LerContext ler() throws RecognitionException {
		LerContext _localctx = new LerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__12);
			setState(144);
			match(T__3);
			setState(145);
			match(VAR);
			setState(146);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoWContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(lensParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(lensParser.VAR, i);
		}
		public List<ClassContext> class_() {
			return getRuleContexts(ClassContext.class);
		}
		public ClassContext class_(int i) {
			return getRuleContext(ClassContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public FuncaoWContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoW; }
	}

	public final FuncaoWContext funcaoW() throws RecognitionException {
		FuncaoWContext _localctx = new FuncaoWContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcaoW);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__13);
			setState(149);
			match(VAR);
			setState(150);
			match(T__3);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(151);
				match(VAR);
				setState(152);
				match(T__4);
				setState(153);
				class_();
				}
			}

			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(156);
				match(T__5);
				setState(157);
				match(VAR);
				setState(158);
				match(T__4);
				setState(159);
				class_();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(T__6);
			setState(166);
			match(T__7);
			setState(167);
			class_();
			setState(168);
			match(T__8);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37383397765128L) != 0)) {
				{
				{
				setState(169);
				comando();
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(175);
				match(T__9);
				setState(176);
				concat();
				}
			}

			setState(179);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoDContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FuncaoDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcaoD; }
	}

	public final FuncaoDContext funcaoD() throws RecognitionException {
		FuncaoDContext _localctx = new FuncaoDContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcaoD);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(VAR);
			setState(182);
			match(T__3);
			setState(183);
			exp();
			setState(184);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicaoContext extends ParserRuleContext {
		public IfcondContext ifcond() {
			return getRuleContext(IfcondContext.class,0);
		}
		public List<ElifcondContext> elifcond() {
			return getRuleContexts(ElifcondContext.class);
		}
		public ElifcondContext elifcond(int i) {
			return getRuleContext(ElifcondContext.class,i);
		}
		public ElcondContext elcond() {
			return getRuleContext(ElcondContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			ifcond();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(187);
				elifcond();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(193);
				elcond();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfcondContext extends ParserRuleContext {
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public IfcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifcond; }
	}

	public final IfcondContext ifcond() throws RecognitionException {
		IfcondContext _localctx = new IfcondContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__14);
			setState(197);
			expcond();
			setState(198);
			match(T__8);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37383397765128L) != 0)) {
				{
				{
				setState(199);
				comando();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElifcondContext extends ParserRuleContext {
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ElifcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifcond; }
	}

	public final ElifcondContext elifcond() throws RecognitionException {
		ElifcondContext _localctx = new ElifcondContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elifcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__15);
			setState(208);
			expcond();
			setState(209);
			match(T__8);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37383397765128L) != 0)) {
				{
				{
				setState(210);
				comando();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElcondContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ElcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elcond; }
	}

	public final ElcondContext elcond() throws RecognitionException {
		ElcondContext _localctx = new ElcondContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_elcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__16);
			setState(219);
			match(T__8);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37383397765128L) != 0)) {
				{
				{
				setState(220);
				comando();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LacoforContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(lensParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(lensParser.VAR, i);
		}
		public List<TerminalNode> INT() { return getTokens(lensParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(lensParser.INT, i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public LacoforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lacofor; }
	}

	public final LacoforContext lacofor() throws RecognitionException {
		LacoforContext _localctx = new LacoforContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lacofor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__17);
			setState(229);
			match(VAR);
			setState(230);
			match(T__18);
			setState(231);
			match(INT);
			setState(232);
			match(T__19);
			setState(233);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(234);
			match(T__8);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37383397765128L) != 0)) {
				{
				{
				setState(235);
				comando();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LacowhileContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(lensParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(lensParser.VAR, i);
		}
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public TerminalNode INT() { return getToken(lensParser.INT, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public LacowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lacowhile; }
	}

	public final LacowhileContext lacowhile() throws RecognitionException {
		LacowhileContext _localctx = new LacowhileContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lacowhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__20);
			setState(244);
			match(VAR);
			setState(245);
			comparacao();
			setState(246);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(247);
			match(T__8);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37383397765128L) != 0)) {
				{
				{
				setState(248);
				comando();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AritContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<OparitContext> oparit() {
			return getRuleContexts(OparitContext.class);
		}
		public OparitContext oparit(int i) {
			return getRuleContext(OparitContext.class,i);
		}
		public AritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arit; }
	}

	public final AritContext arit() throws RecognitionException {
		AritContext _localctx = new AritContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			valor();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) {
				{
				{
				setState(257);
				oparit();
				setState(258);
				valor();
				}
				}
				setState(264);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AritpContext extends ParserRuleContext {
		public AritContext arit() {
			return getRuleContext(AritContext.class,0);
		}
		public AritpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aritp; }
	}

	public final AritpContext aritp() throws RecognitionException {
		AritpContext _localctx = new AritpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_aritp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__3);
			setState(266);
			arit();
			setState(267);
			match(T__6);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OparitContext extends ParserRuleContext {
		public OparitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oparit; }
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_oparit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpalogiContext extends ParserRuleContext {
		public OpalogiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opalogi; }
	}

	public final OpalogiContext opalogi() throws RecognitionException {
		OpalogiContext _localctx = new OpalogiContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_opalogi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparacaoContext extends ParserRuleContext {
		public ComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao; }
	}

	public final ComparacaoContext comparacao() throws RecognitionException {
		ComparacaoContext _localctx = new ComparacaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpcompContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<ComparacaoContext> comparacao() {
			return getRuleContexts(ComparacaoContext.class);
		}
		public ComparacaoContext comparacao(int i) {
			return getRuleContext(ComparacaoContext.class,i);
		}
		public ExpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcomp; }
	}

	public final ExpcompContext expcomp() throws RecognitionException {
		ExpcompContext _localctx = new ExpcompContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expcomp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			valor();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) {
				{
				{
				setState(276);
				comparacao();
				setState(277);
				valor();
				}
				}
				setState(283);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExplogiContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(lensParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(lensParser.VAR, i);
		}
		public List<OpalogiContext> opalogi() {
			return getRuleContexts(OpalogiContext.class);
		}
		public OpalogiContext opalogi(int i) {
			return getRuleContext(OpalogiContext.class,i);
		}
		public ExplogiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explogi; }
	}

	public final ExplogiContext explogi() throws RecognitionException {
		ExplogiContext _localctx = new ExplogiContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_explogi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(VAR);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25 || _la==T__26) {
				{
				{
				setState(285);
				opalogi();
				setState(286);
				match(VAR);
				}
				}
				setState(292);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpTemplateContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(lensParser.STRING, 0); }
		public TerminalNode INT() { return getToken(lensParser.INT, 0); }
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode BOOL() { return getToken(lensParser.BOOL, 0); }
		public AritContext arit() {
			return getRuleContext(AritContext.class,0);
		}
		public ExplogiContext explogi() {
			return getRuleContext(ExplogiContext.class,0);
		}
		public ExpcompContext expcomp() {
			return getRuleContext(ExpcompContext.class,0);
		}
		public FuncaoDContext funcaoD() {
			return getRuleContext(FuncaoDContext.class,0);
		}
		public ExpTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expTemplate; }
	}

	public final ExpTemplateContext expTemplate() throws RecognitionException {
		ExpTemplateContext _localctx = new ExpTemplateContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expTemplate);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				match(VAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				arit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(298);
				explogi();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(299);
				expcomp();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(300);
				funcaoD();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpTemplateContext expTemplate() {
			return getRuleContext(ExpTemplateContext.class,0);
		}
		public ExpopContext expop() {
			return getRuleContext(ExpopContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_exp);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				expTemplate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				expop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpcondContext extends ParserRuleContext {
		public ExplogiContext explogi() {
			return getRuleContext(ExplogiContext.class,0);
		}
		public ExpcompContext expcomp() {
			return getRuleContext(ExpcompContext.class,0);
		}
		public ExpopContext expop() {
			return getRuleContext(ExpopContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expcond);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				explogi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				expcomp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(309);
				expop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecContext extends ParserRuleContext {
		public LetvarContext letvar() {
			return getRuleContext(LetvarContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dec);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				letvar();
				setState(313);
				class_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				letvar();
				setState(316);
				class_();
				setState(317);
				atr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ParserRuleContext {
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtrayContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(lensParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(lensParser.STRING, i);
		}
		public AtrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atray; }
	}

	public final AtrayContext atray() throws RecognitionException {
		AtrayContext _localctx = new AtrayContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__37);
			setState(324);
			match(T__38);
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case INT:
			case FLOAT:
			case VAR:
			case BOOL:
				{
				setState(325);
				valor();
				}
				break;
			case STRING:
				{
				setState(326);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(329);
				match(T__5);
				setState(332);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case INT:
				case FLOAT:
				case VAR:
				case BOOL:
					{
					setState(330);
					valor();
					}
					break;
				case STRING:
					{
					setState(331);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			match(T__39);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArraysdecContext extends ParserRuleContext {
		public LetvarContext letvar() {
			return getRuleContext(LetvarContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public TerminalNode INT() { return getToken(lensParser.INT, 0); }
		public AtrayContext atray() {
			return getRuleContext(AtrayContext.class,0);
		}
		public ArraysdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraysdec; }
	}

	public final ArraysdecContext arraysdec() throws RecognitionException {
		ArraysdecContext _localctx = new ArraysdecContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arraysdec);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				letvar();
				setState(342);
				match(T__38);
				setState(343);
				class_();
				setState(344);
				match(T__39);
				setState(345);
				match(T__38);
				setState(346);
				match(INT);
				setState(347);
				match(T__39);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				letvar();
				setState(350);
				match(T__38);
				setState(351);
				class_();
				setState(352);
				match(T__39);
				setState(353);
				match(T__38);
				setState(354);
				match(INT);
				setState(355);
				match(T__39);
				setState(356);
				atray();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LetvarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public LetvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letvar; }
	}

	public final LetvarContext letvar() throws RecognitionException {
		LetvarContext _localctx = new LetvarContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_letvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__40);
			setState(361);
			match(VAR);
			setState(362);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArraysoltoContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(lensParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(lensParser.VAR, i);
		}
		public TerminalNode INT() { return getToken(lensParser.INT, 0); }
		public ArraysoltoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraysolto; }
	}

	public final ArraysoltoContext arraysolto() throws RecognitionException {
		ArraysoltoContext _localctx = new ArraysoltoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arraysolto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(VAR);
			setState(365);
			match(T__38);
			setState(366);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(367);
			match(T__39);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SetarrayContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode INT() { return getToken(lensParser.INT, 0); }
		public RolavContext rolav() {
			return getRuleContext(RolavContext.class,0);
		}
		public SetarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setarray; }
	}

	public final SetarrayContext setarray() throws RecognitionException {
		SetarrayContext _localctx = new SetarrayContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_setarray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(VAR);
			setState(370);
			match(T__38);
			setState(371);
			match(INT);
			setState(372);
			match(T__39);
			setState(373);
			match(T__37);
			setState(374);
			rolav();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtrsoltaContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public RolavContext rolav() {
			return getRuleContext(RolavContext.class,0);
		}
		public OparitContext oparit() {
			return getRuleContext(OparitContext.class,0);
		}
		public AtrsoltaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrsolta; }
	}

	public final AtrsoltaContext atrsolta() throws RecognitionException {
		AtrsoltaContext _localctx = new AtrsoltaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_atrsolta);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(VAR);
				setState(377);
				match(T__37);
				setState(378);
				rolav();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(VAR);
				setState(380);
				oparit();
				setState(381);
				match(T__37);
				setState(382);
				rolav();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtrContext extends ParserRuleContext {
		public RolavContext rolav() {
			return getRuleContext(RolavContext.class,0);
		}
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(T__37);
			setState(387);
			rolav();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RolavContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public RolavContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rolav; }
	}

	public final RolavContext rolav() throws RecognitionException {
		RolavContext _localctx = new RolavContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_rolav);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				valor();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode BOOL() { return getToken(lensParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(lensParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(lensParser.FLOAT, 0); }
		public AritpContext aritp() {
			return getRuleContext(AritpContext.class,0);
		}
		public ArraysoltoContext arraysolto() {
			return getRuleContext(ArraysoltoContext.class,0);
		}
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_valor);
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				match(FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				aritp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(398);
				arraysolto();
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

	public static final String _serializedATN =
		"\u0004\u00012\u0192\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0001\u0000\u0005\u0000K\b\u0000\n\u0000\f\u0000"+
		"N\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001^\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002j\b\u0002\n\u0002\f\u0002"+
		"m\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002t\b\u0002\n\u0002\f\u0002w\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003"+
		"\u0080\b\u0003\u000b\u0003\f\u0003\u0081\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u008b"+
		"\b\u0005\n\u0005\f\u0005\u008e\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u009b\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00a1\b\u0007\n\u0007\f\u0007\u00a4"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00ab\b\u0007\n\u0007\f\u0007\u00ae\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00b2\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u00bd\b\t\n\t\f\t\u00c0\t\t"+
		"\u0001\t\u0003\t\u00c3\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00c9"+
		"\b\n\n\n\f\n\u00cc\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00d4\b\u000b\n\u000b\f\u000b\u00d7\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00de\b\f\n\f\f\f\u00e1"+
		"\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00ed\b\r\n\r\f\r\u00f0\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00fa\b\u000e\n\u000e\f\u000e\u00fd\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0105\b\u000f\n"+
		"\u000f\f\u000f\u0108\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0118"+
		"\b\u0014\n\u0014\f\u0014\u011b\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u0121\b\u0015\n\u0015\f\u0015\u0124\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u012e\b\u0016\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0132\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0137"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0140\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0148\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u014d\b\u001b\u0005\u001b\u014f"+
		"\b\u001b\n\u001b\f\u001b\u0152\t\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0167\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0181\b \u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0003\"\u0188\b\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0003#\u0190\b#\u0001#\u0000\u0000$\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDF\u0000\u0005\u0002\u0000++--\u0001\u0000\u0016\u0019\u0001\u0000"+
		"\u001a\u001b\u0001\u0000\u001c!\u0001\u0000\"%\u01a1\u0000H\u0001\u0000"+
		"\u0000\u0000\u0002]\u0001\u0000\u0000\u0000\u0004_\u0001\u0000\u0000\u0000"+
		"\u0006|\u0001\u0000\u0000\u0000\b\u0083\u0001\u0000\u0000\u0000\n\u0087"+
		"\u0001\u0000\u0000\u0000\f\u008f\u0001\u0000\u0000\u0000\u000e\u0094\u0001"+
		"\u0000\u0000\u0000\u0010\u00b5\u0001\u0000\u0000\u0000\u0012\u00ba\u0001"+
		"\u0000\u0000\u0000\u0014\u00c4\u0001\u0000\u0000\u0000\u0016\u00cf\u0001"+
		"\u0000\u0000\u0000\u0018\u00da\u0001\u0000\u0000\u0000\u001a\u00e4\u0001"+
		"\u0000\u0000\u0000\u001c\u00f3\u0001\u0000\u0000\u0000\u001e\u0100\u0001"+
		"\u0000\u0000\u0000 \u0109\u0001\u0000\u0000\u0000\"\u010d\u0001\u0000"+
		"\u0000\u0000$\u010f\u0001\u0000\u0000\u0000&\u0111\u0001\u0000\u0000\u0000"+
		"(\u0113\u0001\u0000\u0000\u0000*\u011c\u0001\u0000\u0000\u0000,\u012d"+
		"\u0001\u0000\u0000\u0000.\u0131\u0001\u0000\u0000\u00000\u0136\u0001\u0000"+
		"\u0000\u00002\u013f\u0001\u0000\u0000\u00004\u0141\u0001\u0000\u0000\u0000"+
		"6\u0143\u0001\u0000\u0000\u00008\u0166\u0001\u0000\u0000\u0000:\u0168"+
		"\u0001\u0000\u0000\u0000<\u016c\u0001\u0000\u0000\u0000>\u0171\u0001\u0000"+
		"\u0000\u0000@\u0180\u0001\u0000\u0000\u0000B\u0182\u0001\u0000\u0000\u0000"+
		"D\u0187\u0001\u0000\u0000\u0000F\u018f\u0001\u0000\u0000\u0000HL\u0005"+
		"\u0001\u0000\u0000IK\u0003\u0002\u0001\u0000JI\u0001\u0000\u0000\u0000"+
		"KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005\u0002"+
		"\u0000\u0000P\u0001\u0001\u0000\u0000\u0000Q^\u0003\b\u0004\u0000R^\u0003"+
		"@ \u0000S^\u00032\u0019\u0000T^\u0003\f\u0006\u0000U^\u0003\u0012\t\u0000"+
		"V^\u0003\u001a\r\u0000W^\u0003\u001c\u000e\u0000X^\u0003\u000e\u0007\u0000"+
		"Y^\u0003\u0010\b\u0000Z^\u0003\u0004\u0002\u0000[^\u00038\u001c\u0000"+
		"\\^\u0003>\u001f\u0000]Q\u0001\u0000\u0000\u0000]R\u0001\u0000\u0000\u0000"+
		"]S\u0001\u0000\u0000\u0000]T\u0001\u0000\u0000\u0000]U\u0001\u0000\u0000"+
		"\u0000]V\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000\u0000]X\u0001\u0000"+
		"\u0000\u0000]Y\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u0003\u0001\u0000\u0000"+
		"\u0000_`\u0005\u0003\u0000\u0000`a\u00050\u0000\u0000ab\u0005\u0004\u0000"+
		"\u0000bc\u0005-\u0000\u0000cd\u0005\u0005\u0000\u0000dk\u00034\u001a\u0000"+
		"ef\u0005\u0006\u0000\u0000fg\u0005-\u0000\u0000gh\u0005\u0005\u0000\u0000"+
		"hj\u00034\u001a\u0000ie\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000"+
		"\u0000mk\u0001\u0000\u0000\u0000no\u0005\u0007\u0000\u0000op\u0005\b\u0000"+
		"\u0000pq\u00034\u001a\u0000qu\u0005\t\u0000\u0000rt\u0003\u0002\u0001"+
		"\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000xy\u0005\n\u0000\u0000yz\u0003.\u0017\u0000z{\u0005"+
		"\u000b\u0000\u0000{\u0005\u0001\u0000\u0000\u0000|\u007f\u0003,\u0016"+
		"\u0000}~\u00050\u0000\u0000~\u0080\u0003,\u0016\u0000\u007f}\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0007\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0005\f\u0000\u0000\u0084\u0085\u0005.\u0000"+
		"\u0000\u0085\u0086\u0003\n\u0005\u0000\u0086\t\u0001\u0000\u0000\u0000"+
		"\u0087\u008c\u0003D\"\u0000\u0088\u0089\u0005\u0006\u0000\u0000\u0089"+
		"\u008b\u0003D\"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008e"+
		"\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0001\u0000\u0000\u0000\u008d\u000b\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\r\u0000\u0000\u0090\u0091\u0005"+
		"\u0004\u0000\u0000\u0091\u0092\u0005-\u0000\u0000\u0092\u0093\u0005\u0007"+
		"\u0000\u0000\u0093\r\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u000e\u0000"+
		"\u0000\u0095\u0096\u0005-\u0000\u0000\u0096\u009a\u0005\u0004\u0000\u0000"+
		"\u0097\u0098\u0005-\u0000\u0000\u0098\u0099\u0005\u0005\u0000\u0000\u0099"+
		"\u009b\u00034\u001a\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u00a2\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0005\u0006\u0000\u0000\u009d\u009e\u0005-\u0000\u0000\u009e\u009f\u0005"+
		"\u0005\u0000\u0000\u009f\u00a1\u00034\u001a\u0000\u00a0\u009c\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0007"+
		"\u0000\u0000\u00a6\u00a7\u0005\b\u0000\u0000\u00a7\u00a8\u00034\u001a"+
		"\u0000\u00a8\u00ac\u0005\t\u0000\u0000\u00a9\u00ab\u0003\u0002\u0001\u0000"+
		"\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00b1\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005\n\u0000\u0000\u00b0\u00b2\u0003\n\u0005\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u000b\u0000\u0000\u00b4"+
		"\u000f\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005-\u0000\u0000\u00b6\u00b7"+
		"\u0005\u0004\u0000\u0000\u00b7\u00b8\u0003.\u0017\u0000\u00b8\u00b9\u0005"+
		"\u0007\u0000\u0000\u00b9\u0011\u0001\u0000\u0000\u0000\u00ba\u00be\u0003"+
		"\u0014\n\u0000\u00bb\u00bd\u0003\u0016\u000b\u0000\u00bc\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c3\u0003\u0018"+
		"\f\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c3\u0013\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u000f\u0000"+
		"\u0000\u00c5\u00c6\u00030\u0018\u0000\u00c6\u00ca\u0005\t\u0000\u0000"+
		"\u00c7\u00c9\u0003\u0002\u0001\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u000b\u0000\u0000"+
		"\u00ce\u0015\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0010\u0000\u0000"+
		"\u00d0\u00d1\u00030\u0018\u0000\u00d1\u00d5\u0005\t\u0000\u0000\u00d2"+
		"\u00d4\u0003\u0002\u0001\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u000b\u0000\u0000\u00d9"+
		"\u0017\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0011\u0000\u0000\u00db"+
		"\u00df\u0005\t\u0000\u0000\u00dc\u00de\u0003\u0002\u0001\u0000\u00dd\u00dc"+
		"\u0001\u0000\u0000\u0000\u00de\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0005\u000b\u0000\u0000\u00e3\u0019\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0005\u0012\u0000\u0000\u00e5\u00e6\u0005-\u0000\u0000\u00e6\u00e7\u0005"+
		"\u0013\u0000\u0000\u00e7\u00e8\u0005+\u0000\u0000\u00e8\u00e9\u0005\u0014"+
		"\u0000\u0000\u00e9\u00ea\u0007\u0000\u0000\u0000\u00ea\u00ee\u0005\t\u0000"+
		"\u0000\u00eb\u00ed\u0003\u0002\u0001\u0000\u00ec\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u000b\u0000"+
		"\u0000\u00f2\u001b\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0015\u0000"+
		"\u0000\u00f4\u00f5\u0005-\u0000\u0000\u00f5\u00f6\u0003&\u0013\u0000\u00f6"+
		"\u00f7\u0007\u0000\u0000\u0000\u00f7\u00fb\u0005\t\u0000\u0000\u00f8\u00fa"+
		"\u0003\u0002\u0001\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u000b\u0000\u0000\u00ff\u001d"+
		"\u0001\u0000\u0000\u0000\u0100\u0106\u0003F#\u0000\u0101\u0102\u0003\""+
		"\u0011\u0000\u0102\u0103\u0003F#\u0000\u0103\u0105\u0001\u0000\u0000\u0000"+
		"\u0104\u0101\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000"+
		"\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000"+
		"\u0107\u001f\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u0005\u0004\u0000\u0000\u010a\u010b\u0003\u001e\u000f\u0000"+
		"\u010b\u010c\u0005\u0007\u0000\u0000\u010c!\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0007\u0001\u0000\u0000\u010e#\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0007\u0002\u0000\u0000\u0110%\u0001\u0000\u0000\u0000\u0111\u0112\u0007"+
		"\u0003\u0000\u0000\u0112\'\u0001\u0000\u0000\u0000\u0113\u0119\u0003F"+
		"#\u0000\u0114\u0115\u0003&\u0013\u0000\u0115\u0116\u0003F#\u0000\u0116"+
		"\u0118\u0001\u0000\u0000\u0000\u0117\u0114\u0001\u0000\u0000\u0000\u0118"+
		"\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0001\u0000\u0000\u0000\u011a)\u0001\u0000\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\u011c\u0122\u0005-\u0000\u0000\u011d\u011e\u0003"+
		"$\u0012\u0000\u011e\u011f\u0005-\u0000\u0000\u011f\u0121\u0001\u0000\u0000"+
		"\u0000\u0120\u011d\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000"+
		"\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123+\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000"+
		"\u0125\u012e\u0005*\u0000\u0000\u0126\u012e\u0005+\u0000\u0000\u0127\u012e"+
		"\u0005-\u0000\u0000\u0128\u012e\u0005/\u0000\u0000\u0129\u012e\u0003\u001e"+
		"\u000f\u0000\u012a\u012e\u0003*\u0015\u0000\u012b\u012e\u0003(\u0014\u0000"+
		"\u012c\u012e\u0003\u0010\b\u0000\u012d\u0125\u0001\u0000\u0000\u0000\u012d"+
		"\u0126\u0001\u0000\u0000\u0000\u012d\u0127\u0001\u0000\u0000\u0000\u012d"+
		"\u0128\u0001\u0000\u0000\u0000\u012d\u0129\u0001\u0000\u0000\u0000\u012d"+
		"\u012a\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d"+
		"\u012c\u0001\u0000\u0000\u0000\u012e-\u0001\u0000\u0000\u0000\u012f\u0132"+
		"\u0003,\u0016\u0000\u0130\u0132\u0003\u0006\u0003\u0000\u0131\u012f\u0001"+
		"\u0000\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132/\u0001\u0000"+
		"\u0000\u0000\u0133\u0137\u0003*\u0015\u0000\u0134\u0137\u0003(\u0014\u0000"+
		"\u0135\u0137\u0003\u0006\u0003\u0000\u0136\u0133\u0001\u0000\u0000\u0000"+
		"\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000"+
		"\u01371\u0001\u0000\u0000\u0000\u0138\u0139\u0003:\u001d\u0000\u0139\u013a"+
		"\u00034\u001a\u0000\u013a\u0140\u0001\u0000\u0000\u0000\u013b\u013c\u0003"+
		":\u001d\u0000\u013c\u013d\u00034\u001a\u0000\u013d\u013e\u0003B!\u0000"+
		"\u013e\u0140\u0001\u0000\u0000\u0000\u013f\u0138\u0001\u0000\u0000\u0000"+
		"\u013f\u013b\u0001\u0000\u0000\u0000\u01403\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0007\u0004\u0000\u0000\u01425\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0005&\u0000\u0000\u0144\u0147\u0005\'\u0000\u0000\u0145\u0148\u0003"+
		"F#\u0000\u0146\u0148\u0005*\u0000\u0000\u0147\u0145\u0001\u0000\u0000"+
		"\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u0150\u0001\u0000\u0000"+
		"\u0000\u0149\u014c\u0005\u0006\u0000\u0000\u014a\u014d\u0003F#\u0000\u014b"+
		"\u014d\u0005*\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014b"+
		"\u0001\u0000\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u0149"+
		"\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0153"+
		"\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0005(\u0000\u0000\u01547\u0001\u0000\u0000\u0000\u0155\u0156\u0003:"+
		"\u001d\u0000\u0156\u0157\u0005\'\u0000\u0000\u0157\u0158\u00034\u001a"+
		"\u0000\u0158\u0159\u0005(\u0000\u0000\u0159\u015a\u0005\'\u0000\u0000"+
		"\u015a\u015b\u0005+\u0000\u0000\u015b\u015c\u0005(\u0000\u0000\u015c\u0167"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0003:\u001d\u0000\u015e\u015f\u0005"+
		"\'\u0000\u0000\u015f\u0160\u00034\u001a\u0000\u0160\u0161\u0005(\u0000"+
		"\u0000\u0161\u0162\u0005\'\u0000\u0000\u0162\u0163\u0005+\u0000\u0000"+
		"\u0163\u0164\u0005(\u0000\u0000\u0164\u0165\u00036\u001b\u0000\u0165\u0167"+
		"\u0001\u0000\u0000\u0000\u0166\u0155\u0001\u0000\u0000\u0000\u0166\u015d"+
		"\u0001\u0000\u0000\u0000\u01679\u0001\u0000\u0000\u0000\u0168\u0169\u0005"+
		")\u0000\u0000\u0169\u016a\u0005-\u0000\u0000\u016a\u016b\u0005\u0005\u0000"+
		"\u0000\u016b;\u0001\u0000\u0000\u0000\u016c\u016d\u0005-\u0000\u0000\u016d"+
		"\u016e\u0005\'\u0000\u0000\u016e\u016f\u0007\u0000\u0000\u0000\u016f\u0170"+
		"\u0005(\u0000\u0000\u0170=\u0001\u0000\u0000\u0000\u0171\u0172\u0005-"+
		"\u0000\u0000\u0172\u0173\u0005\'\u0000\u0000\u0173\u0174\u0005+\u0000"+
		"\u0000\u0174\u0175\u0005(\u0000\u0000\u0175\u0176\u0005&\u0000\u0000\u0176"+
		"\u0177\u0003D\"\u0000\u0177?\u0001\u0000\u0000\u0000\u0178\u0179\u0005"+
		"-\u0000\u0000\u0179\u017a\u0005&\u0000\u0000\u017a\u0181\u0003D\"\u0000"+
		"\u017b\u017c\u0005-\u0000\u0000\u017c\u017d\u0003\"\u0011\u0000\u017d"+
		"\u017e\u0005&\u0000\u0000\u017e\u017f\u0003D\"\u0000\u017f\u0181\u0001"+
		"\u0000\u0000\u0000\u0180\u0178\u0001\u0000\u0000\u0000\u0180\u017b\u0001"+
		"\u0000\u0000\u0000\u0181A\u0001\u0000\u0000\u0000\u0182\u0183\u0005&\u0000"+
		"\u0000\u0183\u0184\u0003D\"\u0000\u0184C\u0001\u0000\u0000\u0000\u0185"+
		"\u0188\u0003.\u0017\u0000\u0186\u0188\u0003F#\u0000\u0187\u0185\u0001"+
		"\u0000\u0000\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0188E\u0001\u0000"+
		"\u0000\u0000\u0189\u0190\u0005-\u0000\u0000\u018a\u0190\u0005/\u0000\u0000"+
		"\u018b\u0190\u0005+\u0000\u0000\u018c\u0190\u0005,\u0000\u0000\u018d\u0190"+
		"\u0003 \u0010\u0000\u018e\u0190\u0003<\u001e\u0000\u018f\u0189\u0001\u0000"+
		"\u0000\u0000\u018f\u018a\u0001\u0000\u0000\u0000\u018f\u018b\u0001\u0000"+
		"\u0000\u0000\u018f\u018c\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000"+
		"\u0000\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u0190G\u0001\u0000\u0000"+
		"\u0000\u001fL]ku\u0081\u008c\u009a\u00a2\u00ac\u00b1\u00be\u00c2\u00ca"+
		"\u00d5\u00df\u00ee\u00fb\u0106\u0119\u0122\u012d\u0131\u0136\u013f\u0147"+
		"\u014c\u0150\u0166\u0180\u0187\u018f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}