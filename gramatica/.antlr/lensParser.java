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
		T__31=32, T__32=33, STRING=34, INT=35, VAR=36, DUPONT=37, BOOL=38, WS=39;
	public static final int
		RULE_lens = 0, RULE_comando = 1, RULE_imprime = 2, RULE_concat = 3, RULE_ler = 4, 
		RULE_condicao = 5, RULE_ifcond = 6, RULE_elifcond = 7, RULE_elcond = 8, 
		RULE_lacofor = 9, RULE_lacowhile = 10, RULE_arit = 11, RULE_oparit = 12, 
		RULE_opalogi = 13, RULE_comparacao = 14, RULE_expcomp = 15, RULE_explogi = 16, 
		RULE_exp = 17, RULE_expcond = 18, RULE_dec = 19, RULE_class = 20, RULE_atrsolta = 21, 
		RULE_atr = 22, RULE_rolav = 23, RULE_valor = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"lens", "comando", "imprime", "concat", "ler", "condicao", "ifcond", 
			"elifcond", "elcond", "lacofor", "lacowhile", "arit", "oparit", "opalogi", 
			"comparacao", "expcomp", "explogi", "exp", "expcond", "dec", "class", 
			"atrsolta", "atr", "rolav", "valor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@start'", "'@end'", "'print'", "'+'", "'input'", "'('", "')'", 
			"'if'", "'{'", "'}'", "'elseif'", "'else'", "'for'", "'in'", "'..'", 
			"'while'", "'*'", "'/'", "'-'", "'&&'", "'||'", "'!='", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'let'", "':'", "'int'", "'bool'", "'String'", 
			"'='", null, null, null, "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "STRING", 
			"INT", "VAR", "DUPONT", "BOOL", "WS"
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
		public TerminalNode EOF() { return getToken(lensParser.EOF, 0); }
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
			setState(50);
			match(T__0);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68987986216L) != 0)) {
				{
				{
				setState(51);
				comando();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(T__1);
			setState(58);
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
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comando);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				imprime();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				atrsolta();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				dec();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				ler();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				condicao();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				lacofor();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				lacowhile();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImprimeContext extends ParserRuleContext {
		public TerminalNode DUPONT() { return getToken(lensParser.DUPONT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ImprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprime; }
	}

	public final ImprimeContext imprime() throws RecognitionException {
		ImprimeContext _localctx = new ImprimeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imprime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__2);
			setState(70);
			match(DUPONT);
			setState(71);
			exp();
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
		public List<TerminalNode> STRING() { return getTokens(lensParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(lensParser.STRING, i);
		}
		public List<TerminalNode> VAR() { return getTokens(lensParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(lensParser.VAR, i);
		}
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_concat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(STRING);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(74);
				match(T__3);
				setState(75);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==VAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(80);
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
		enterRule(_localctx, 8, RULE_ler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__4);
			setState(82);
			match(T__5);
			setState(83);
			match(VAR);
			setState(84);
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
		enterRule(_localctx, 10, RULE_condicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			ifcond();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(87);
				elifcond();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(93);
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
		enterRule(_localctx, 12, RULE_ifcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__7);
			setState(97);
			expcond();
			setState(98);
			match(T__8);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68987986216L) != 0)) {
				{
				{
				setState(99);
				comando();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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
		enterRule(_localctx, 14, RULE_elifcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__10);
			setState(108);
			expcond();
			setState(109);
			match(T__8);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68987986216L) != 0)) {
				{
				{
				setState(110);
				comando();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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
		enterRule(_localctx, 16, RULE_elcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__11);
			setState(119);
			match(T__8);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68987986216L) != 0)) {
				{
				{
				setState(120);
				comando();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
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
		enterRule(_localctx, 18, RULE_lacofor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__12);
			setState(129);
			match(VAR);
			setState(130);
			match(T__13);
			setState(131);
			match(INT);
			setState(132);
			match(T__14);
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(134);
			match(T__8);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68987986216L) != 0)) {
				{
				{
				setState(135);
				comando();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
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
		enterRule(_localctx, 20, RULE_lacowhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__15);
			setState(144);
			match(VAR);
			setState(145);
			comparacao();
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==VAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(147);
			match(T__8);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68987986216L) != 0)) {
				{
				{
				setState(148);
				comando();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
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
		enterRule(_localctx, 22, RULE_arit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			valor();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 917520L) != 0)) {
				{
				{
				setState(157);
				oparit();
				setState(158);
				valor();
				}
				}
				setState(164);
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
	public static class OparitContext extends ParserRuleContext {
		public OparitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oparit; }
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_oparit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917520L) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_opalogi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
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
		enterRule(_localctx, 28, RULE_comparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_expcomp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			valor();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0)) {
				{
				{
				setState(172);
				comparacao();
				setState(173);
				valor();
				}
				}
				setState(179);
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
		enterRule(_localctx, 32, RULE_explogi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(VAR);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19 || _la==T__20) {
				{
				{
				setState(181);
				opalogi();
				setState(182);
				match(VAR);
				}
				}
				setState(188);
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
	public static class ExpContext extends ParserRuleContext {
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
		public ConcatContext concat() {
			return getRuleContext(ConcatContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(VAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				arit();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				explogi();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(195);
				expcomp();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(196);
				concat();
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
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expcond);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				explogi();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				expcomp();
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
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
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
		enterRule(_localctx, 38, RULE_dec);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(T__27);
				setState(204);
				match(VAR);
				setState(205);
				match(T__28);
				setState(206);
				class_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(T__27);
				setState(208);
				match(VAR);
				setState(209);
				match(T__28);
				setState(210);
				class_();
				setState(211);
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
		enterRule(_localctx, 40, RULE_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) ) {
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
		enterRule(_localctx, 42, RULE_atrsolta);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(VAR);
				setState(218);
				match(T__32);
				setState(219);
				rolav();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(VAR);
				setState(221);
				oparit();
				setState(222);
				match(T__32);
				setState(223);
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
		enterRule(_localctx, 44, RULE_atr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__32);
			setState(228);
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
		enterRule(_localctx, 46, RULE_rolav);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
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
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 377957122048L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\'\u00ed\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0005\u00005\b\u0000\n\u0000\f\u00008\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001D\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003M\b\u0003\n\u0003\f\u0003P\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0005\u0005Y\b\u0005\n\u0005\f\u0005\\\t\u0005\u0001\u0005\u0003\u0005"+
		"_\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"e\b\u0006\n\u0006\f\u0006h\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007p\b\u0007\n\u0007\f\u0007"+
		"s\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\bz\b\b"+
		"\n\b\f\b}\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0005\t\u0089\b\t\n\t\f\t\u008c\t\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0096\b\n\n"+
		"\n\f\n\u0099\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00a1\b\u000b\n\u000b\f\u000b\u00a4\t\u000b\u0001\f"+
		"\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u00b0\b\u000f\n\u000f\f\u000f\u00b3"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00b9"+
		"\b\u0010\n\u0010\f\u0010\u00bc\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00c6\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00ca\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00d6\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00e2\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u00e9"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.0\u0000\u0007\u0002\u0000\"\"$$\u0001\u0000#$\u0002\u0000\u0004"+
		"\u0004\u0011\u0013\u0001\u0000\u0014\u0015\u0001\u0000\u0016\u001b\u0001"+
		"\u0000\u001e \u0002\u0000#$&&\u00f0\u00002\u0001\u0000\u0000\u0000\u0002"+
		"C\u0001\u0000\u0000\u0000\u0004E\u0001\u0000\u0000\u0000\u0006I\u0001"+
		"\u0000\u0000\u0000\bQ\u0001\u0000\u0000\u0000\nV\u0001\u0000\u0000\u0000"+
		"\f`\u0001\u0000\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010v\u0001"+
		"\u0000\u0000\u0000\u0012\u0080\u0001\u0000\u0000\u0000\u0014\u008f\u0001"+
		"\u0000\u0000\u0000\u0016\u009c\u0001\u0000\u0000\u0000\u0018\u00a5\u0001"+
		"\u0000\u0000\u0000\u001a\u00a7\u0001\u0000\u0000\u0000\u001c\u00a9\u0001"+
		"\u0000\u0000\u0000\u001e\u00ab\u0001\u0000\u0000\u0000 \u00b4\u0001\u0000"+
		"\u0000\u0000\"\u00c5\u0001\u0000\u0000\u0000$\u00c9\u0001\u0000\u0000"+
		"\u0000&\u00d5\u0001\u0000\u0000\u0000(\u00d7\u0001\u0000\u0000\u0000*"+
		"\u00e1\u0001\u0000\u0000\u0000,\u00e3\u0001\u0000\u0000\u0000.\u00e8\u0001"+
		"\u0000\u0000\u00000\u00ea\u0001\u0000\u0000\u000026\u0005\u0001\u0000"+
		"\u000035\u0003\u0002\u0001\u000043\u0001\u0000\u0000\u000058\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u0002\u0000\u0000"+
		":;\u0005\u0000\u0000\u0001;\u0001\u0001\u0000\u0000\u0000<D\u0003\u0004"+
		"\u0002\u0000=D\u0003*\u0015\u0000>D\u0003&\u0013\u0000?D\u0003\b\u0004"+
		"\u0000@D\u0003\n\u0005\u0000AD\u0003\u0012\t\u0000BD\u0003\u0014\n\u0000"+
		"C<\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000\u0000C>\u0001\u0000\u0000"+
		"\u0000C?\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000CB\u0001\u0000\u0000\u0000D\u0003\u0001\u0000\u0000\u0000"+
		"EF\u0005\u0003\u0000\u0000FG\u0005%\u0000\u0000GH\u0003\"\u0011\u0000"+
		"H\u0005\u0001\u0000\u0000\u0000IN\u0005\"\u0000\u0000JK\u0005\u0004\u0000"+
		"\u0000KM\u0007\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MP\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\u0007"+
		"\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\u0005\u0000"+
		"\u0000RS\u0005\u0006\u0000\u0000ST\u0005$\u0000\u0000TU\u0005\u0007\u0000"+
		"\u0000U\t\u0001\u0000\u0000\u0000VZ\u0003\f\u0006\u0000WY\u0003\u000e"+
		"\u0007\u0000XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000ZX\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000"+
		"\\Z\u0001\u0000\u0000\u0000]_\u0003\u0010\b\u0000^]\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_\u000b\u0001\u0000\u0000\u0000`a\u0005"+
		"\b\u0000\u0000ab\u0003$\u0012\u0000bf\u0005\t\u0000\u0000ce\u0003\u0002"+
		"\u0001\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000ij\u0005\n\u0000\u0000j\r\u0001\u0000\u0000"+
		"\u0000kl\u0005\u000b\u0000\u0000lm\u0003$\u0012\u0000mq\u0005\t\u0000"+
		"\u0000np\u0003\u0002\u0001\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000"+
		"\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001"+
		"\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tu\u0005\n\u0000\u0000u\u000f"+
		"\u0001\u0000\u0000\u0000vw\u0005\f\u0000\u0000w{\u0005\t\u0000\u0000x"+
		"z\u0003\u0002\u0001\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005\n\u0000\u0000\u007f"+
		"\u0011\u0001\u0000\u0000\u0000\u0080\u0081\u0005\r\u0000\u0000\u0081\u0082"+
		"\u0005$\u0000\u0000\u0082\u0083\u0005\u000e\u0000\u0000\u0083\u0084\u0005"+
		"#\u0000\u0000\u0084\u0085\u0005\u000f\u0000\u0000\u0085\u0086\u0007\u0001"+
		"\u0000\u0000\u0086\u008a\u0005\t\u0000\u0000\u0087\u0089\u0003\u0002\u0001"+
		"\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0005\n\u0000\u0000\u008e\u0013\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0005\u0010\u0000\u0000\u0090\u0091\u0005$\u0000\u0000\u0091"+
		"\u0092\u0003\u001c\u000e\u0000\u0092\u0093\u0007\u0001\u0000\u0000\u0093"+
		"\u0097\u0005\t\u0000\u0000\u0094\u0096\u0003\u0002\u0001\u0000\u0095\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009a"+
		"\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0005\n\u0000\u0000\u009b\u0015\u0001\u0000\u0000\u0000\u009c\u00a2\u0003"+
		"0\u0018\u0000\u009d\u009e\u0003\u0018\f\u0000\u009e\u009f\u00030\u0018"+
		"\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u0017\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6\u0007\u0002\u0000"+
		"\u0000\u00a6\u0019\u0001\u0000\u0000\u0000\u00a7\u00a8\u0007\u0003\u0000"+
		"\u0000\u00a8\u001b\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007\u0004\u0000"+
		"\u0000\u00aa\u001d\u0001\u0000\u0000\u0000\u00ab\u00b1\u00030\u0018\u0000"+
		"\u00ac\u00ad\u0003\u001c\u000e\u0000\u00ad\u00ae\u00030\u0018\u0000\u00ae"+
		"\u00b0\u0001\u0000\u0000\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b2\u001f\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b4\u00ba\u0005$\u0000\u0000\u00b5\u00b6"+
		"\u0003\u001a\r\u0000\u00b6\u00b7\u0005$\u0000\u0000\u00b7\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb!\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c6\u0005\"\u0000\u0000\u00be\u00c6\u0005#\u0000"+
		"\u0000\u00bf\u00c6\u0005$\u0000\u0000\u00c0\u00c6\u0005&\u0000\u0000\u00c1"+
		"\u00c6\u0003\u0016\u000b\u0000\u00c2\u00c6\u0003 \u0010\u0000\u00c3\u00c6"+
		"\u0003\u001e\u000f\u0000\u00c4\u00c6\u0003\u0006\u0003\u0000\u00c5\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c5\u00be\u0001\u0000\u0000\u0000\u00c5\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c0\u0001\u0000\u0000\u0000\u00c5\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6#\u0001"+
		"\u0000\u0000\u0000\u00c7\u00ca\u0003 \u0010\u0000\u00c8\u00ca\u0003\u001e"+
		"\u000f\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ca%\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u001c\u0000"+
		"\u0000\u00cc\u00cd\u0005$\u0000\u0000\u00cd\u00ce\u0005\u001d\u0000\u0000"+
		"\u00ce\u00d6\u0003(\u0014\u0000\u00cf\u00d0\u0005\u001c\u0000\u0000\u00d0"+
		"\u00d1\u0005$\u0000\u0000\u00d1\u00d2\u0005\u001d\u0000\u0000\u00d2\u00d3"+
		"\u0003(\u0014\u0000\u00d3\u00d4\u0003,\u0016\u0000\u00d4\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d5\u00cb\u0001\u0000\u0000\u0000\u00d5\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d6\'\u0001\u0000\u0000\u0000\u00d7\u00d8\u0007\u0005\u0000"+
		"\u0000\u00d8)\u0001\u0000\u0000\u0000\u00d9\u00da\u0005$\u0000\u0000\u00da"+
		"\u00db\u0005!\u0000\u0000\u00db\u00e2\u0003.\u0017\u0000\u00dc\u00dd\u0005"+
		"$\u0000\u0000\u00dd\u00de\u0003\u0018\f\u0000\u00de\u00df\u0005!\u0000"+
		"\u0000\u00df\u00e0\u0003.\u0017\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e1\u00d9\u0001\u0000\u0000\u0000\u00e1\u00dc\u0001\u0000\u0000\u0000"+
		"\u00e2+\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005!\u0000\u0000\u00e4\u00e5"+
		"\u0003.\u0017\u0000\u00e5-\u0001\u0000\u0000\u0000\u00e6\u00e9\u0003\""+
		"\u0011\u0000\u00e7\u00e9\u00030\u0018\u0000\u00e8\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9/\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0007\u0006\u0000\u0000\u00eb1\u0001\u0000\u0000\u0000\u0012"+
		"6CNZ^fq{\u008a\u0097\u00a2\u00b1\u00ba\u00c5\u00c9\u00d5\u00e1\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}