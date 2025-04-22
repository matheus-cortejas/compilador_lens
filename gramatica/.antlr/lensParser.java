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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, STRING=44, INT=45, FLOAT=46, 
		VAR=47, TIPO=48, DUPONT=49, BOOL=50, ANY=51, COMENTARIO=52, WS=53;
	public static final int
		RULE_lens = 0, RULE_comando = 1, RULE_opper = 2, RULE_expop = 3, RULE_imprime = 4, 
		RULE_concat = 5, RULE_ler = 6, RULE_funcaoW = 7, RULE_parametros = 8, 
		RULE_funcaoD = 9, RULE_condicao = 10, RULE_ifcond = 11, RULE_elifcond = 12, 
		RULE_elcond = 13, RULE_lacofor = 14, RULE_lacowhile = 15, RULE_arit = 16, 
		RULE_aritp = 17, RULE_oparit = 18, RULE_opalogi = 19, RULE_comparacao = 20, 
		RULE_expcomp = 21, RULE_explogi = 22, RULE_expTemplate = 23, RULE_exp = 24, 
		RULE_expcond = 25, RULE_dec = 26, RULE_tipo = 27, RULE_atray = 28, RULE_arraysdec = 29, 
		RULE_letvar = 30, RULE_arraysolto = 31, RULE_setarray = 32, RULE_atrsolta = 33, 
		RULE_atr = 34, RULE_rolav = 35, RULE_valor = 36, RULE_objeto = 37, RULE_decobj = 38, 
		RULE_atrobj = 39, RULE_obj = 40, RULE_membro = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"lens", "comando", "opper", "expop", "imprime", "concat", "ler", "funcaoW", 
			"parametros", "funcaoD", "condicao", "ifcond", "elifcond", "elcond", 
			"lacofor", "lacowhile", "arit", "aritp", "oparit", "opalogi", "comparacao", 
			"expcomp", "explogi", "expTemplate", "exp", "expcond", "dec", "tipo", 
			"atray", "arraysdec", "letvar", "arraysolto", "setarray", "atrsolta", 
			"atr", "rolav", "valor", "objeto", "decobj", "atrobj", "obj", "membro"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@start'", "'@end'", "'op'", "'('", "':'", "','", "')'", "'->'", 
			"'{'", "'return'", "'}'", "'print'", "'input'", "'func'", "'if'", "'elseif'", 
			"'else'", "'for'", "'in'", "'..'", "'while'", "'*'", "'/'", "'+'", "'-'", 
			"'&&'", "'||'", "'!='", "'<'", "'>'", "'<='", "'>='", "'=='", "'int'", 
			"'bool'", "'String'", "'float'", "'='", "'['", "']'", "'let'", "'obj'", 
			"'.'", null, null, null, null, null, "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "STRING", "INT", "FLOAT", 
			"VAR", "TIPO", "DUPONT", "BOOL", "ANY", "COMENTARIO", "WS"
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
			setState(84);
			match(T__0);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 147334560542728L) != 0)) {
				{
				{
				setState(85);
				comando();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
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
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public AtrobjContext atrobj() {
			return getRuleContext(AtrobjContext.class,0);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				imprime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				atrsolta();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				dec();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				ler();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				condicao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				lacofor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				lacowhile();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				funcaoW();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				funcaoD();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(102);
				opper();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(103);
				arraysdec();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(104);
				setarray();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(105);
				objeto();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(106);
				atrobj();
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
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
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
			setState(109);
			match(T__2);
			setState(110);
			match(ANY);
			setState(111);
			match(T__3);
			setState(112);
			match(VAR);
			setState(113);
			match(T__4);
			setState(114);
			tipo();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(115);
				match(T__5);
				setState(116);
				match(VAR);
				setState(117);
				match(T__4);
				setState(118);
				tipo();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__6);
			setState(125);
			match(T__7);
			setState(126);
			tipo();
			setState(127);
			match(T__8);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 147334560542728L) != 0)) {
				{
				{
				setState(128);
				comando();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(T__9);
			setState(135);
			exp();
			setState(136);
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
			setState(138);
			expTemplate();
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				match(ANY);
				setState(140);
				expTemplate();
				}
				}
				setState(143); 
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
			setState(145);
			match(T__11);
			setState(146);
			match(DUPONT);
			setState(147);
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
			setState(149);
			rolav();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(150);
				match(T__5);
				setState(151);
				rolav();
				}
				}
				setState(156);
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
			setState(157);
			match(T__12);
			setState(158);
			match(T__3);
			setState(159);
			match(VAR);
			setState(160);
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
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
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
			setState(162);
			match(T__13);
			setState(163);
			match(VAR);
			setState(164);
			match(T__3);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(165);
				parametros();
				}
			}

			setState(168);
			match(T__6);
			setState(169);
			match(T__7);
			setState(170);
			tipo();
			setState(171);
			match(T__8);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 147334560542728L) != 0)) {
				{
				{
				setState(172);
				comando();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(178);
				match(T__9);
				setState(179);
				concat();
				}
			}

			setState(182);
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
	public static class ParametrosContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(lensParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(lensParser.VAR, i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(VAR);
			setState(185);
			match(T__4);
			setState(186);
			tipo();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(187);
				match(T__5);
				setState(188);
				match(VAR);
				setState(189);
				match(T__4);
				setState(190);
				tipo();
				}
				}
				setState(195);
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
		enterRule(_localctx, 18, RULE_funcaoD);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(VAR);
			setState(197);
			match(T__3);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1389782697508880L) != 0)) {
				{
				setState(198);
				exp();
				}
			}

			setState(201);
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
		enterRule(_localctx, 20, RULE_condicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			ifcond();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(204);
				elifcond();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(210);
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
		enterRule(_localctx, 22, RULE_ifcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__14);
			setState(214);
			expcond();
			setState(215);
			match(T__8);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 147334560542728L) != 0)) {
				{
				{
				setState(216);
				comando();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
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
		enterRule(_localctx, 24, RULE_elifcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__15);
			setState(225);
			expcond();
			setState(226);
			match(T__8);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 147334560542728L) != 0)) {
				{
				{
				setState(227);
				comando();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
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
		enterRule(_localctx, 26, RULE_elcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__16);
			setState(236);
			match(T__8);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 147334560542728L) != 0)) {
				{
				{
				setState(237);
				comando();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
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
		enterRule(_localctx, 28, RULE_lacofor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(T__17);
			setState(246);
			match(VAR);
			setState(247);
			match(T__18);
			setState(248);
			match(INT);
			setState(249);
			match(T__19);
			setState(250);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(251);
			match(T__8);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 147334560542728L) != 0)) {
				{
				{
				setState(252);
				comando();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
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
		enterRule(_localctx, 30, RULE_lacowhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__20);
			setState(261);
			match(VAR);
			setState(262);
			comparacao();
			setState(263);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(264);
			match(T__8);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 147334560542728L) != 0)) {
				{
				{
				setState(265);
				comando();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
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
		enterRule(_localctx, 32, RULE_arit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			valor();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) {
				{
				{
				setState(274);
				oparit();
				setState(275);
				valor();
				}
				}
				setState(281);
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
		enterRule(_localctx, 34, RULE_aritp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__3);
			setState(283);
			arit();
			setState(284);
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
		enterRule(_localctx, 36, RULE_oparit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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
		enterRule(_localctx, 38, RULE_opalogi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
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
		enterRule(_localctx, 40, RULE_comparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
		enterRule(_localctx, 42, RULE_expcomp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			valor();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) {
				{
				{
				setState(293);
				comparacao();
				setState(294);
				valor();
				}
				}
				setState(300);
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
		enterRule(_localctx, 44, RULE_explogi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(VAR);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25 || _la==T__26) {
				{
				{
				setState(302);
				opalogi();
				setState(303);
				match(VAR);
				}
				}
				setState(309);
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
		enterRule(_localctx, 46, RULE_expTemplate);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				match(VAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				arit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(315);
				explogi();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(316);
				expcomp();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(317);
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
		enterRule(_localctx, 48, RULE_exp);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				expTemplate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
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
		enterRule(_localctx, 50, RULE_expcond);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				explogi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				expcomp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
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
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
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
		enterRule(_localctx, 52, RULE_dec);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				letvar();
				setState(330);
				tipo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				letvar();
				setState(333);
				tipo();
				setState(334);
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(lensParser.TIPO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 281732674748416L) != 0)) ) {
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
		enterRule(_localctx, 56, RULE_atray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__37);
			setState(341);
			match(T__38);
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case INT:
			case FLOAT:
			case VAR:
			case BOOL:
				{
				setState(342);
				valor();
				}
				break;
			case STRING:
				{
				setState(343);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(346);
				match(T__5);
				setState(349);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case INT:
				case FLOAT:
				case VAR:
				case BOOL:
					{
					setState(347);
					valor();
					}
					break;
				case STRING:
					{
					setState(348);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
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
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
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
		enterRule(_localctx, 58, RULE_arraysdec);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				letvar();
				setState(359);
				match(T__38);
				setState(360);
				tipo();
				setState(361);
				match(T__39);
				setState(362);
				match(T__38);
				setState(363);
				match(INT);
				setState(364);
				match(T__39);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				letvar();
				setState(367);
				match(T__38);
				setState(368);
				tipo();
				setState(369);
				match(T__39);
				setState(370);
				match(T__38);
				setState(371);
				match(INT);
				setState(372);
				match(T__39);
				setState(373);
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
		enterRule(_localctx, 60, RULE_letvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__40);
			setState(378);
			match(VAR);
			setState(379);
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
		enterRule(_localctx, 62, RULE_arraysolto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(VAR);
			setState(382);
			match(T__38);
			setState(383);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(384);
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
		enterRule(_localctx, 64, RULE_setarray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(VAR);
			setState(387);
			match(T__38);
			setState(388);
			match(INT);
			setState(389);
			match(T__39);
			setState(390);
			match(T__37);
			setState(391);
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
		enterRule(_localctx, 66, RULE_atrsolta);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(VAR);
				setState(394);
				match(T__37);
				setState(395);
				rolav();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				match(VAR);
				setState(397);
				oparit();
				setState(398);
				match(T__37);
				setState(399);
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
		enterRule(_localctx, 68, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(T__37);
			setState(404);
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
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public RolavContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rolav; }
	}

	public final RolavContext rolav() throws RecognitionException {
		RolavContext _localctx = new RolavContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rolav);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				valor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				obj();
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
		enterRule(_localctx, 72, RULE_valor);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				match(INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(414);
				match(FLOAT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(415);
				aritp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(416);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjetoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(lensParser.TIPO, 0); }
		public List<DecobjContext> decobj() {
			return getRuleContexts(DecobjContext.class);
		}
		public DecobjContext decobj(int i) {
			return getRuleContext(DecobjContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__41);
			setState(420);
			match(TIPO);
			setState(421);
			match(T__8);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 147334560542728L) != 0)) {
				{
				setState(424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(422);
					decobj();
					}
					break;
				case 2:
					{
					setState(423);
					comando();
					}
					break;
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(429);
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
	public static class DecobjContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DecobjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decobj; }
	}

	public final DecobjContext decobj() throws RecognitionException {
		DecobjContext _localctx = new DecobjContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_decobj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(VAR);
			setState(432);
			match(T__4);
			setState(433);
			tipo();
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
	public static class AtrobjContext extends ParserRuleContext {
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public RolavContext rolav() {
			return getRuleContext(RolavContext.class,0);
		}
		public AtrobjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrobj; }
	}

	public final AtrobjContext atrobj() throws RecognitionException {
		AtrobjContext _localctx = new AtrobjContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_atrobj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			obj();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(436);
				match(T__37);
				setState(437);
				rolav();
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
	public static class ObjContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public List<MembroContext> membro() {
			return getRuleContexts(MembroContext.class);
		}
		public MembroContext membro(int i) {
			return getRuleContext(MembroContext.class,i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_obj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(VAR);
			setState(441);
			match(T__42);
			setState(442);
			membro();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__42) {
				{
				{
				setState(443);
				match(T__42);
				setState(444);
				membro();
				}
				}
				setState(449);
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
	public static class MembroContext extends ParserRuleContext {
		public FuncaoDContext funcaoD() {
			return getRuleContext(FuncaoDContext.class,0);
		}
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public MembroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membro; }
	}

	public final MembroContext membro() throws RecognitionException {
		MembroContext _localctx = new MembroContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_membro);
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				funcaoD();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(VAR);
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
		"\u0004\u00015\u01c7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0001\u0000\u0005\u0000W\b\u0000\n"+
		"\u0000\f\u0000Z\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001l\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002x\b\u0002\n\u0002\f\u0002{\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0082\b\u0002\n\u0002"+
		"\f\u0002\u0085\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003\u008e\b\u0003\u000b\u0003"+
		"\f\u0003\u008f\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u0099\b\u0005\n\u0005\f\u0005\u009c"+
		"\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a7\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00ae"+
		"\b\u0007\n\u0007\f\u0007\u00b1\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00b5\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u00c0\b\b\n\b\f\b\u00c3\t\b\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00c8\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u00ce"+
		"\b\n\n\n\f\n\u00d1\t\n\u0001\n\u0003\n\u00d4\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00da\b\u000b\n\u000b\f\u000b\u00dd"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00e5\b\f\n\f\f\f\u00e8\t\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r"+
		"\u0005\r\u00ef\b\r\n\r\f\r\u00f2\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00fe\b\u000e\n\u000e\f\u000e\u0101\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u010b\b\u000f\n\u000f\f\u000f\u010e\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0116\b\u0010\n\u0010\f\u0010\u0119\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0129\b\u0015\n\u0015\f\u0015\u012c\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0132\b\u0016\n\u0016\f\u0016"+
		"\u0135\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u013f\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u0143\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u0148\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0151\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c"+
		"\u0159\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u015e\b"+
		"\u001c\u0005\u001c\u0160\b\u001c\n\u001c\f\u001c\u0163\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0178\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u0192\b!\u0001\"\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0001#\u0003#\u019a\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u01a2\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u01a9\b%\n"+
		"%\f%\u01ac\t%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u01b7\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0005"+
		"(\u01be\b(\n(\f(\u01c1\t(\u0001)\u0001)\u0003)\u01c5\b)\u0001)\u0000\u0000"+
		"*\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR\u0000\u0005\u0002\u0000--//\u0001"+
		"\u0000\u0016\u0019\u0001\u0000\u001a\u001b\u0001\u0000\u001c!\u0002\u0000"+
		"\"%00\u01d9\u0000T\u0001\u0000\u0000\u0000\u0002k\u0001\u0000\u0000\u0000"+
		"\u0004m\u0001\u0000\u0000\u0000\u0006\u008a\u0001\u0000\u0000\u0000\b"+
		"\u0091\u0001\u0000\u0000\u0000\n\u0095\u0001\u0000\u0000\u0000\f\u009d"+
		"\u0001\u0000\u0000\u0000\u000e\u00a2\u0001\u0000\u0000\u0000\u0010\u00b8"+
		"\u0001\u0000\u0000\u0000\u0012\u00c4\u0001\u0000\u0000\u0000\u0014\u00cb"+
		"\u0001\u0000\u0000\u0000\u0016\u00d5\u0001\u0000\u0000\u0000\u0018\u00e0"+
		"\u0001\u0000\u0000\u0000\u001a\u00eb\u0001\u0000\u0000\u0000\u001c\u00f5"+
		"\u0001\u0000\u0000\u0000\u001e\u0104\u0001\u0000\u0000\u0000 \u0111\u0001"+
		"\u0000\u0000\u0000\"\u011a\u0001\u0000\u0000\u0000$\u011e\u0001\u0000"+
		"\u0000\u0000&\u0120\u0001\u0000\u0000\u0000(\u0122\u0001\u0000\u0000\u0000"+
		"*\u0124\u0001\u0000\u0000\u0000,\u012d\u0001\u0000\u0000\u0000.\u013e"+
		"\u0001\u0000\u0000\u00000\u0142\u0001\u0000\u0000\u00002\u0147\u0001\u0000"+
		"\u0000\u00004\u0150\u0001\u0000\u0000\u00006\u0152\u0001\u0000\u0000\u0000"+
		"8\u0154\u0001\u0000\u0000\u0000:\u0177\u0001\u0000\u0000\u0000<\u0179"+
		"\u0001\u0000\u0000\u0000>\u017d\u0001\u0000\u0000\u0000@\u0182\u0001\u0000"+
		"\u0000\u0000B\u0191\u0001\u0000\u0000\u0000D\u0193\u0001\u0000\u0000\u0000"+
		"F\u0199\u0001\u0000\u0000\u0000H\u01a1\u0001\u0000\u0000\u0000J\u01a3"+
		"\u0001\u0000\u0000\u0000L\u01af\u0001\u0000\u0000\u0000N\u01b3\u0001\u0000"+
		"\u0000\u0000P\u01b8\u0001\u0000\u0000\u0000R\u01c4\u0001\u0000\u0000\u0000"+
		"TX\u0005\u0001\u0000\u0000UW\u0003\u0002\u0001\u0000VU\u0001\u0000\u0000"+
		"\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\\\u0005"+
		"\u0002\u0000\u0000\\\u0001\u0001\u0000\u0000\u0000]l\u0003\b\u0004\u0000"+
		"^l\u0003B!\u0000_l\u00034\u001a\u0000`l\u0003\f\u0006\u0000al\u0003\u0014"+
		"\n\u0000bl\u0003\u001c\u000e\u0000cl\u0003\u001e\u000f\u0000dl\u0003\u000e"+
		"\u0007\u0000el\u0003\u0012\t\u0000fl\u0003\u0004\u0002\u0000gl\u0003:"+
		"\u001d\u0000hl\u0003@ \u0000il\u0003J%\u0000jl\u0003N\'\u0000k]\u0001"+
		"\u0000\u0000\u0000k^\u0001\u0000\u0000\u0000k_\u0001\u0000\u0000\u0000"+
		"k`\u0001\u0000\u0000\u0000ka\u0001\u0000\u0000\u0000kb\u0001\u0000\u0000"+
		"\u0000kc\u0001\u0000\u0000\u0000kd\u0001\u0000\u0000\u0000ke\u0001\u0000"+
		"\u0000\u0000kf\u0001\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000kh\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000"+
		"l\u0003\u0001\u0000\u0000\u0000mn\u0005\u0003\u0000\u0000no\u00053\u0000"+
		"\u0000op\u0005\u0004\u0000\u0000pq\u0005/\u0000\u0000qr\u0005\u0005\u0000"+
		"\u0000ry\u00036\u001b\u0000st\u0005\u0006\u0000\u0000tu\u0005/\u0000\u0000"+
		"uv\u0005\u0005\u0000\u0000vx\u00036\u001b\u0000ws\u0001\u0000\u0000\u0000"+
		"x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u0007"+
		"\u0000\u0000}~\u0005\b\u0000\u0000~\u007f\u00036\u001b\u0000\u007f\u0083"+
		"\u0005\t\u0000\u0000\u0080\u0082\u0003\u0002\u0001\u0000\u0081\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"\n\u0000\u0000\u0087\u0088\u00030\u0018\u0000\u0088\u0089\u0005\u000b"+
		"\u0000\u0000\u0089\u0005\u0001\u0000\u0000\u0000\u008a\u008d\u0003.\u0017"+
		"\u0000\u008b\u008c\u00053\u0000\u0000\u008c\u008e\u0003.\u0017\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0007\u0001\u0000\u0000\u0000\u0091\u0092\u0005\f\u0000\u0000\u0092\u0093"+
		"\u00051\u0000\u0000\u0093\u0094\u0003\n\u0005\u0000\u0094\t\u0001\u0000"+
		"\u0000\u0000\u0095\u009a\u0003F#\u0000\u0096\u0097\u0005\u0006\u0000\u0000"+
		"\u0097\u0099\u0003F#\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009c"+
		"\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0001\u0000\u0000\u0000\u009b\u000b\u0001\u0000\u0000\u0000\u009c\u009a"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0005\r\u0000\u0000\u009e\u009f\u0005"+
		"\u0004\u0000\u0000\u009f\u00a0\u0005/\u0000\u0000\u00a0\u00a1\u0005\u0007"+
		"\u0000\u0000\u00a1\r\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005\u000e\u0000"+
		"\u0000\u00a3\u00a4\u0005/\u0000\u0000\u00a4\u00a6\u0005\u0004\u0000\u0000"+
		"\u00a5\u00a7\u0003\u0010\b\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0005\u0007\u0000\u0000\u00a9\u00aa\u0005\b\u0000\u0000\u00aa\u00ab"+
		"\u00036\u001b\u0000\u00ab\u00af\u0005\t\u0000\u0000\u00ac\u00ae\u0003"+
		"\u0002\u0001\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001"+
		"\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b4\u0001\u0000\u0000\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005\n\u0000\u0000\u00b3\u00b5\u0003\n"+
		"\u0005\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u000b"+
		"\u0000\u0000\u00b7\u000f\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005/\u0000"+
		"\u0000\u00b9\u00ba\u0005\u0005\u0000\u0000\u00ba\u00c1\u00036\u001b\u0000"+
		"\u00bb\u00bc\u0005\u0006\u0000\u0000\u00bc\u00bd\u0005/\u0000\u0000\u00bd"+
		"\u00be\u0005\u0005\u0000\u0000\u00be\u00c0\u00036\u001b\u0000\u00bf\u00bb"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u0011"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0005/\u0000\u0000\u00c5\u00c7\u0005\u0004\u0000\u0000\u00c6\u00c8\u0003"+
		"0\u0018\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0007"+
		"\u0000\u0000\u00ca\u0013\u0001\u0000\u0000\u0000\u00cb\u00cf\u0003\u0016"+
		"\u000b\u0000\u00cc\u00ce\u0003\u0018\f\u0000\u00cd\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d4\u0003\u001a\r\u0000"+
		"\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u0015\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u000f\u0000\u0000"+
		"\u00d6\u00d7\u00032\u0019\u0000\u00d7\u00db\u0005\t\u0000\u0000\u00d8"+
		"\u00da\u0003\u0002\u0001\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da"+
		"\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd"+
		"\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u000b\u0000\u0000\u00df"+
		"\u0017\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0010\u0000\u0000\u00e1"+
		"\u00e2\u00032\u0019\u0000\u00e2\u00e6\u0005\t\u0000\u0000\u00e3\u00e5"+
		"\u0003\u0002\u0001\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u000b\u0000\u0000\u00ea\u0019"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u0011\u0000\u0000\u00ec\u00f0"+
		"\u0005\t\u0000\u0000\u00ed\u00ef\u0003\u0002\u0001\u0000\u00ee\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005"+
		"\u000b\u0000\u0000\u00f4\u001b\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005"+
		"\u0012\u0000\u0000\u00f6\u00f7\u0005/\u0000\u0000\u00f7\u00f8\u0005\u0013"+
		"\u0000\u0000\u00f8\u00f9\u0005-\u0000\u0000\u00f9\u00fa\u0005\u0014\u0000"+
		"\u0000\u00fa\u00fb\u0007\u0000\u0000\u0000\u00fb\u00ff\u0005\t\u0000\u0000"+
		"\u00fc\u00fe\u0003\u0002\u0001\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000"+
		"\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u000b\u0000\u0000"+
		"\u0103\u001d\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0015\u0000\u0000"+
		"\u0105\u0106\u0005/\u0000\u0000\u0106\u0107\u0003(\u0014\u0000\u0107\u0108"+
		"\u0007\u0000\u0000\u0000\u0108\u010c\u0005\t\u0000\u0000\u0109\u010b\u0003"+
		"\u0002\u0001\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u010e\u0001"+
		"\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001"+
		"\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u010c\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0005\u000b\u0000\u0000\u0110\u001f\u0001"+
		"\u0000\u0000\u0000\u0111\u0117\u0003H$\u0000\u0112\u0113\u0003$\u0012"+
		"\u0000\u0113\u0114\u0003H$\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115"+
		"\u0112\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117"+
		"\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118"+
		"!\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0005\u0004\u0000\u0000\u011b\u011c\u0003 \u0010\u0000\u011c\u011d\u0005"+
		"\u0007\u0000\u0000\u011d#\u0001\u0000\u0000\u0000\u011e\u011f\u0007\u0001"+
		"\u0000\u0000\u011f%\u0001\u0000\u0000\u0000\u0120\u0121\u0007\u0002\u0000"+
		"\u0000\u0121\'\u0001\u0000\u0000\u0000\u0122\u0123\u0007\u0003\u0000\u0000"+
		"\u0123)\u0001\u0000\u0000\u0000\u0124\u012a\u0003H$\u0000\u0125\u0126"+
		"\u0003(\u0014\u0000\u0126\u0127\u0003H$\u0000\u0127\u0129\u0001\u0000"+
		"\u0000\u0000\u0128\u0125\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000"+
		"\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000"+
		"\u0000\u0000\u012b+\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000"+
		"\u0000\u012d\u0133\u0005/\u0000\u0000\u012e\u012f\u0003&\u0013\u0000\u012f"+
		"\u0130\u0005/\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u012e"+
		"\u0001\u0000\u0000\u0000\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134-\u0001"+
		"\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u013f\u0005"+
		",\u0000\u0000\u0137\u013f\u0005-\u0000\u0000\u0138\u013f\u0005/\u0000"+
		"\u0000\u0139\u013f\u00052\u0000\u0000\u013a\u013f\u0003 \u0010\u0000\u013b"+
		"\u013f\u0003,\u0016\u0000\u013c\u013f\u0003*\u0015\u0000\u013d\u013f\u0003"+
		"\u0012\t\u0000\u013e\u0136\u0001\u0000\u0000\u0000\u013e\u0137\u0001\u0000"+
		"\u0000\u0000\u013e\u0138\u0001\u0000\u0000\u0000\u013e\u0139\u0001\u0000"+
		"\u0000\u0000\u013e\u013a\u0001\u0000\u0000\u0000\u013e\u013b\u0001\u0000"+
		"\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013d\u0001\u0000"+
		"\u0000\u0000\u013f/\u0001\u0000\u0000\u0000\u0140\u0143\u0003.\u0017\u0000"+
		"\u0141\u0143\u0003\u0006\u0003\u0000\u0142\u0140\u0001\u0000\u0000\u0000"+
		"\u0142\u0141\u0001\u0000\u0000\u0000\u01431\u0001\u0000\u0000\u0000\u0144"+
		"\u0148\u0003,\u0016\u0000\u0145\u0148\u0003*\u0015\u0000\u0146\u0148\u0003"+
		"\u0006\u0003\u0000\u0147\u0144\u0001\u0000\u0000\u0000\u0147\u0145\u0001"+
		"\u0000\u0000\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u01483\u0001\u0000"+
		"\u0000\u0000\u0149\u014a\u0003<\u001e\u0000\u014a\u014b\u00036\u001b\u0000"+
		"\u014b\u0151\u0001\u0000\u0000\u0000\u014c\u014d\u0003<\u001e\u0000\u014d"+
		"\u014e\u00036\u001b\u0000\u014e\u014f\u0003D\"\u0000\u014f\u0151\u0001"+
		"\u0000\u0000\u0000\u0150\u0149\u0001\u0000\u0000\u0000\u0150\u014c\u0001"+
		"\u0000\u0000\u0000\u01515\u0001\u0000\u0000\u0000\u0152\u0153\u0007\u0004"+
		"\u0000\u0000\u01537\u0001\u0000\u0000\u0000\u0154\u0155\u0005&\u0000\u0000"+
		"\u0155\u0158\u0005\'\u0000\u0000\u0156\u0159\u0003H$\u0000\u0157\u0159"+
		"\u0005,\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0157\u0001"+
		"\u0000\u0000\u0000\u0159\u0161\u0001\u0000\u0000\u0000\u015a\u015d\u0005"+
		"\u0006\u0000\u0000\u015b\u015e\u0003H$\u0000\u015c\u015e\u0005,\u0000"+
		"\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000"+
		"\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u015a\u0001\u0000\u0000"+
		"\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000"+
		"\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0164\u0001\u0000\u0000"+
		"\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u0165\u0005(\u0000\u0000"+
		"\u01659\u0001\u0000\u0000\u0000\u0166\u0167\u0003<\u001e\u0000\u0167\u0168"+
		"\u0005\'\u0000\u0000\u0168\u0169\u00036\u001b\u0000\u0169\u016a\u0005"+
		"(\u0000\u0000\u016a\u016b\u0005\'\u0000\u0000\u016b\u016c\u0005-\u0000"+
		"\u0000\u016c\u016d\u0005(\u0000\u0000\u016d\u0178\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0003<\u001e\u0000\u016f\u0170\u0005\'\u0000\u0000\u0170"+
		"\u0171\u00036\u001b\u0000\u0171\u0172\u0005(\u0000\u0000\u0172\u0173\u0005"+
		"\'\u0000\u0000\u0173\u0174\u0005-\u0000\u0000\u0174\u0175\u0005(\u0000"+
		"\u0000\u0175\u0176\u00038\u001c\u0000\u0176\u0178\u0001\u0000\u0000\u0000"+
		"\u0177\u0166\u0001\u0000\u0000\u0000\u0177\u016e\u0001\u0000\u0000\u0000"+
		"\u0178;\u0001\u0000\u0000\u0000\u0179\u017a\u0005)\u0000\u0000\u017a\u017b"+
		"\u0005/\u0000\u0000\u017b\u017c\u0005\u0005\u0000\u0000\u017c=\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0005/\u0000\u0000\u017e\u017f\u0005\'\u0000"+
		"\u0000\u017f\u0180\u0007\u0000\u0000\u0000\u0180\u0181\u0005(\u0000\u0000"+
		"\u0181?\u0001\u0000\u0000\u0000\u0182\u0183\u0005/\u0000\u0000\u0183\u0184"+
		"\u0005\'\u0000\u0000\u0184\u0185\u0005-\u0000\u0000\u0185\u0186\u0005"+
		"(\u0000\u0000\u0186\u0187\u0005&\u0000\u0000\u0187\u0188\u0003F#\u0000"+
		"\u0188A\u0001\u0000\u0000\u0000\u0189\u018a\u0005/\u0000\u0000\u018a\u018b"+
		"\u0005&\u0000\u0000\u018b\u0192\u0003F#\u0000\u018c\u018d\u0005/\u0000"+
		"\u0000\u018d\u018e\u0003$\u0012\u0000\u018e\u018f\u0005&\u0000\u0000\u018f"+
		"\u0190\u0003F#\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u0189\u0001"+
		"\u0000\u0000\u0000\u0191\u018c\u0001\u0000\u0000\u0000\u0192C\u0001\u0000"+
		"\u0000\u0000\u0193\u0194\u0005&\u0000\u0000\u0194\u0195\u0003F#\u0000"+
		"\u0195E\u0001\u0000\u0000\u0000\u0196\u019a\u00030\u0018\u0000\u0197\u019a"+
		"\u0003H$\u0000\u0198\u019a\u0003P(\u0000\u0199\u0196\u0001\u0000\u0000"+
		"\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u0199\u0198\u0001\u0000\u0000"+
		"\u0000\u019aG\u0001\u0000\u0000\u0000\u019b\u01a2\u0005/\u0000\u0000\u019c"+
		"\u01a2\u00052\u0000\u0000\u019d\u01a2\u0005-\u0000\u0000\u019e\u01a2\u0005"+
		".\u0000\u0000\u019f\u01a2\u0003\"\u0011\u0000\u01a0\u01a2\u0003>\u001f"+
		"\u0000\u01a1\u019b\u0001\u0000\u0000\u0000\u01a1\u019c\u0001\u0000\u0000"+
		"\u0000\u01a1\u019d\u0001\u0000\u0000\u0000\u01a1\u019e\u0001\u0000\u0000"+
		"\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a0\u0001\u0000\u0000"+
		"\u0000\u01a2I\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005*\u0000\u0000\u01a4"+
		"\u01a5\u00050\u0000\u0000\u01a5\u01aa\u0005\t\u0000\u0000\u01a6\u01a9"+
		"\u0003L&\u0000\u01a7\u01a9\u0003\u0002\u0001\u0000\u01a8\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000"+
		"\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0005\u000b\u0000\u0000\u01aeK\u0001\u0000\u0000"+
		"\u0000\u01af\u01b0\u0005/\u0000\u0000\u01b0\u01b1\u0005\u0005\u0000\u0000"+
		"\u01b1\u01b2\u00036\u001b\u0000\u01b2M\u0001\u0000\u0000\u0000\u01b3\u01b6"+
		"\u0003P(\u0000\u01b4\u01b5\u0005&\u0000\u0000\u01b5\u01b7\u0003F#\u0000"+
		"\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b7O\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005/\u0000\u0000\u01b9\u01ba"+
		"\u0005+\u0000\u0000\u01ba\u01bf\u0003R)\u0000\u01bb\u01bc\u0005+\u0000"+
		"\u0000\u01bc\u01be\u0003R)\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be"+
		"\u01c1\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c0Q\u0001\u0000\u0000\u0000\u01c1\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c2\u01c5\u0003\u0012\t\u0000\u01c3\u01c5\u0005"+
		"/\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c5S\u0001\u0000\u0000\u0000%Xky\u0083\u008f\u009a\u00a6"+
		"\u00af\u00b4\u00c1\u00c7\u00cf\u00d3\u00db\u00e6\u00f0\u00ff\u010c\u0117"+
		"\u012a\u0133\u013e\u0142\u0147\u0150\u0158\u015d\u0161\u0177\u0191\u0199"+
		"\u01a1\u01a8\u01aa\u01b6\u01bf\u01c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}