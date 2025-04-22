// Generated from c:/Users/augus/compilador_lens/lens.g4 by ANTLR 4.13.1
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
		STRING=1, INT=2, FLOAT=3, BOOL=4, VAR=5, START=6, END=7, LET=8, PRINT=9, 
		INPUT=10, FUNC=11, OP=12, OBJ=13, RETURN=14, IF=15, ELSEIF=16, ELSE=17, 
		FOR=18, IN=19, RANGE=20, WHILE=21, INT_T=22, BOOL_T=23, STRING_T=24, FLOAT_T=25, 
		ARROW=26, DUPONT=27, AND=28, OR=29, NEQ=30, EQ=31, LT=32, GT=33, LTE=34, 
		GTE=35, ASSIGN=36, COMMA=37, COLON=38, LPAREN=39, RPAREN=40, LBRACE=41, 
		RBRACE=42, LBRACK=43, RBRACK=44, DOT=45, MUL=46, DIV=47, ADD=48, SUB=49, 
		ANY=50, LINE_COMMENT=51, WS=52;
	public static final int
		RULE_lens = 0, RULE_bloco = 1, RULE_stmt = 2, RULE_retorno = 3, RULE_declaracao = 4, 
		RULE_tipo = 5, RULE_atribuicao = 6, RULE_setarray = 7, RULE_arrayDecl = 8, 
		RULE_arrayLiteral = 9, RULE_objeto = 10, RULE_objMember = 11, RULE_objAccess = 12, 
		RULE_membro = 13, RULE_atrobj = 14, RULE_funcDef = 15, RULE_opperDef = 16, 
		RULE_parametros = 17, RULE_chamadaFuncao = 18, RULE_argList = 19, RULE_imprime = 20, 
		RULE_concat = 21, RULE_leitura = 22, RULE_condicao = 23, RULE_blocoBraces = 24, 
		RULE_lacofor = 25, RULE_lacowhile = 26, RULE_expr = 27, RULE_logicExpr = 28, 
		RULE_compExpr = 29, RULE_arithExpr = 30, RULE_term = 31, RULE_factor = 32, 
		RULE_arrayAccess = 33, RULE_literal = 34, RULE_exprCond = 35, RULE_opArit = 36, 
		RULE_opalogic = 37, RULE_comparacao = 38, RULE_opalogi = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"lens", "bloco", "stmt", "retorno", "declaracao", "tipo", "atribuicao", 
			"setarray", "arrayDecl", "arrayLiteral", "objeto", "objMember", "objAccess", 
			"membro", "atrobj", "funcDef", "opperDef", "parametros", "chamadaFuncao", 
			"argList", "imprime", "concat", "leitura", "condicao", "blocoBraces", 
			"lacofor", "lacowhile", "expr", "logicExpr", "compExpr", "arithExpr", 
			"term", "factor", "arrayAccess", "literal", "exprCond", "opArit", "opalogic", 
			"comparacao", "opalogi"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'@start'", "'@end'", "'let'", "'print'", 
			"'input'", "'func'", "'op'", "'obj'", "'return'", "'if'", "'elseif'", 
			"'else'", "'for'", "'in'", "'..'", "'while'", "'int'", "'bool'", "'String'", 
			"'float'", "'->'", "'::'", "'&&'", "'||'", "'!='", "'=='", "'<'", "'>'", 
			"'<='", "'>='", "'='", "','", "':'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'.'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRING", "INT", "FLOAT", "BOOL", "VAR", "START", "END", "LET", 
			"PRINT", "INPUT", "FUNC", "OP", "OBJ", "RETURN", "IF", "ELSEIF", "ELSE", 
			"FOR", "IN", "RANGE", "WHILE", "INT_T", "BOOL_T", "STRING_T", "FLOAT_T", 
			"ARROW", "DUPONT", "AND", "OR", "NEQ", "EQ", "LT", "GT", "LTE", "GTE", 
			"ASSIGN", "COMMA", "COLON", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "DOT", "MUL", "DIV", "ADD", "SUB", "ANY", "LINE_COMMENT", "WS"
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
		public TerminalNode START() { return getToken(lensParser.START, 0); }
		public TerminalNode END() { return getToken(lensParser.END, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
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
			setState(80);
			match(START);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2424608L) != 0)) {
				{
				{
				setState(81);
				bloco();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(END);
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
	public static class BlocoContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case LET:
			case PRINT:
			case INPUT:
			case FUNC:
			case OP:
			case RETURN:
			case IF:
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				stmt();
				}
				break;
			case OBJ:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				objeto();
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
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtRetornoContext extends StmtContext {
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public StmtRetornoContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtDeclaracaoContext extends StmtContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public StmtDeclaracaoContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtArrayDeclContext extends StmtContext {
		public ArrayDeclContext arrayDecl() {
			return getRuleContext(ArrayDeclContext.class,0);
		}
		public StmtArrayDeclContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtImprimeContext extends StmtContext {
		public ImprimeContext imprime() {
			return getRuleContext(ImprimeContext.class,0);
		}
		public StmtImprimeContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtCondicaoContext extends StmtContext {
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public StmtCondicaoContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtAtribuicaoContext extends StmtContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public StmtAtribuicaoContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtSetarrayContext extends StmtContext {
		public SetarrayContext setarray() {
			return getRuleContext(SetarrayContext.class,0);
		}
		public StmtSetarrayContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtLacoforContext extends StmtContext {
		public LacoforContext lacofor() {
			return getRuleContext(LacoforContext.class,0);
		}
		public StmtLacoforContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtLeituraContext extends StmtContext {
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public StmtLeituraContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtOpperContext extends StmtContext {
		public OpperDefContext opperDef() {
			return getRuleContext(OpperDefContext.class,0);
		}
		public StmtOpperContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtCallContext extends StmtContext {
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public StmtCallContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtLacowhileContext extends StmtContext {
		public LacowhileContext lacowhile() {
			return getRuleContext(LacowhileContext.class,0);
		}
		public StmtLacowhileContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtFuncDefContext extends StmtContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public StmtFuncDefContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new StmtDeclaracaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				declaracao();
				}
				break;
			case 2:
				_localctx = new StmtAtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				atribuicao();
				}
				break;
			case 3:
				_localctx = new StmtImprimeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				imprime();
				}
				break;
			case 4:
				_localctx = new StmtLeituraContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				leitura();
				}
				break;
			case 5:
				_localctx = new StmtCondicaoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				condicao();
				}
				break;
			case 6:
				_localctx = new StmtLacoforContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				lacofor();
				}
				break;
			case 7:
				_localctx = new StmtLacowhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				lacowhile();
				}
				break;
			case 8:
				_localctx = new StmtFuncDefContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				funcDef();
				}
				break;
			case 9:
				_localctx = new StmtCallContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				chamadaFuncao();
				}
				break;
			case 10:
				_localctx = new StmtOpperContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(102);
				opperDef();
				}
				break;
			case 11:
				_localctx = new StmtArrayDeclContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(103);
				arrayDecl();
				}
				break;
			case 12:
				_localctx = new StmtSetarrayContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(104);
				setarray();
				}
				break;
			case 13:
				_localctx = new StmtRetornoContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(105);
				retorno();
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
	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(lensParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(RETURN);
			setState(109);
			expr();
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(lensParser.LET, 0); }
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode COLON() { return getToken(lensParser.COLON, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(lensParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(LET);
			setState(112);
			match(VAR);
			setState(113);
			match(COLON);
			setState(114);
			tipo();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(115);
				match(ASSIGN);
				setState(116);
				expr();
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT_T() { return getToken(lensParser.INT_T, 0); }
		public TerminalNode BOOL_T() { return getToken(lensParser.BOOL_T, 0); }
		public TerminalNode STRING_T() { return getToken(lensParser.STRING_T, 0); }
		public TerminalNode FLOAT_T() { return getToken(lensParser.FLOAT_T, 0); }
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914592L) != 0)) ) {
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	 
		public AtribuicaoContext() { }
		public void copyFrom(AtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpAssignContext extends AtribuicaoContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public OpAritContext opArit() {
			return getRuleContext(OpAritContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(lensParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpAssignContext(AtribuicaoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAssignContext extends AtribuicaoContext {
		public SetarrayContext setarray() {
			return getRuleContext(SetarrayContext.class,0);
		}
		public ArrayAssignContext(AtribuicaoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleAssignContext extends AtribuicaoContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(lensParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SimpleAssignContext(AtribuicaoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjAssignContext extends AtribuicaoContext {
		public AtrobjContext atrobj() {
			return getRuleContext(AtrobjContext.class,0);
		}
		public ObjAssignContext(AtribuicaoContext ctx) { copyFrom(ctx); }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atribuicao);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new SimpleAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(VAR);
				setState(122);
				match(ASSIGN);
				setState(123);
				expr();
				}
				break;
			case 2:
				_localctx = new OpAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(VAR);
				setState(125);
				opArit();
				setState(126);
				match(ASSIGN);
				setState(127);
				expr();
				}
				break;
			case 3:
				_localctx = new ArrayAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				setarray();
				}
				break;
			case 4:
				_localctx = new ObjAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
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
	public static class SetarrayContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode LBRACK() { return getToken(lensParser.LBRACK, 0); }
		public TerminalNode INT() { return getToken(lensParser.INT, 0); }
		public TerminalNode RBRACK() { return getToken(lensParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(lensParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SetarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setarray; }
	}

	public final SetarrayContext setarray() throws RecognitionException {
		SetarrayContext _localctx = new SetarrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setarray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(VAR);
			setState(134);
			match(LBRACK);
			setState(135);
			match(INT);
			setState(136);
			match(RBRACK);
			setState(137);
			match(ASSIGN);
			setState(138);
			expr();
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
	public static class ArrayDeclContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(lensParser.LET, 0); }
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode COLON() { return getToken(lensParser.COLON, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(lensParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(lensParser.LBRACK, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> RBRACK() { return getTokens(lensParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(lensParser.RBRACK, i);
		}
		public TerminalNode INT() { return getToken(lensParser.INT, 0); }
		public TerminalNode ASSIGN() { return getToken(lensParser.ASSIGN, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDecl; }
	}

	public final ArrayDeclContext arrayDecl() throws RecognitionException {
		ArrayDeclContext _localctx = new ArrayDeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(LET);
			setState(141);
			match(VAR);
			setState(142);
			match(COLON);
			setState(143);
			match(LBRACK);
			setState(144);
			tipo();
			setState(145);
			match(RBRACK);
			setState(146);
			match(LBRACK);
			setState(147);
			match(INT);
			setState(148);
			match(RBRACK);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(149);
				match(ASSIGN);
				setState(150);
				arrayLiteral();
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(lensParser.LBRACK, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(lensParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(lensParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(lensParser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(LBRACK);
			setState(154);
			expr();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(155);
				match(COMMA);
				setState(156);
				expr();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(RBRACK);
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
		public TerminalNode OBJ() { return getToken(lensParser.OBJ, 0); }
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode LBRACE() { return getToken(lensParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(lensParser.RBRACE, 0); }
		public List<ObjMemberContext> objMember() {
			return getRuleContexts(ObjMemberContext.class);
		}
		public ObjMemberContext objMember(int i) {
			return getRuleContext(ObjMemberContext.class,i);
		}
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(OBJ);
			setState(165);
			match(VAR);
			setState(166);
			match(LBRACE);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET || _la==FUNC) {
				{
				{
				setState(167);
				objMember();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(RBRACE);
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
	public static class ObjMemberContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public ObjMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objMember; }
	}

	public final ObjMemberContext objMember() throws RecognitionException {
		ObjMemberContext _localctx = new ObjMemberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objMember);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				declaracao();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				funcDef();
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
	public static class ObjAccessContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public List<TerminalNode> DOT() { return getTokens(lensParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(lensParser.DOT, i);
		}
		public List<MembroContext> membro() {
			return getRuleContexts(MembroContext.class);
		}
		public MembroContext membro(int i) {
			return getRuleContext(MembroContext.class,i);
		}
		public ObjAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objAccess; }
	}

	public final ObjAccessContext objAccess() throws RecognitionException {
		ObjAccessContext _localctx = new ObjAccessContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_objAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(VAR);
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				match(DOT);
				setState(181);
				membro();
				}
				}
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
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
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MembroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_membro; }
	}

	public final MembroContext membro() throws RecognitionException {
		MembroContext _localctx = new MembroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_membro);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				chamadaFuncao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(VAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				arrayAccess();
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
	public static class AtrobjContext extends ParserRuleContext {
		public ObjAccessContext objAccess() {
			return getRuleContext(ObjAccessContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(lensParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtrobjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrobj; }
	}

	public final AtrobjContext atrobj() throws RecognitionException {
		AtrobjContext _localctx = new AtrobjContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_atrobj);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			objAccess();
			setState(192);
			match(ASSIGN);
			setState(193);
			expr();
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
	public static class FuncDefContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(lensParser.FUNC, 0); }
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode LPAREN() { return getToken(lensParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(lensParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(lensParser.ARROW, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(lensParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(lensParser.RBRACE, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(FUNC);
			setState(196);
			match(VAR);
			setState(197);
			match(LPAREN);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(198);
				parametros();
				}
			}

			setState(201);
			match(RPAREN);
			setState(202);
			match(ARROW);
			setState(203);
			tipo();
			setState(204);
			match(LBRACE);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					stmt();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(211);
				retorno();
				}
			}

			setState(214);
			match(RBRACE);
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
	public static class OpperDefContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(lensParser.OP, 0); }
		public TerminalNode ANY() { return getToken(lensParser.ANY, 0); }
		public TerminalNode LPAREN() { return getToken(lensParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(lensParser.RPAREN, 0); }
		public TerminalNode ARROW() { return getToken(lensParser.ARROW, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(lensParser.LBRACE, 0); }
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(lensParser.RBRACE, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public OpperDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opperDef; }
	}

	public final OpperDefContext opperDef() throws RecognitionException {
		OpperDefContext _localctx = new OpperDefContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_opperDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(OP);
			setState(217);
			match(ANY);
			setState(218);
			match(LPAREN);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(219);
				parametros();
				}
			}

			setState(222);
			match(RPAREN);
			setState(223);
			match(ARROW);
			setState(224);
			tipo();
			setState(225);
			match(LBRACE);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(226);
					stmt();
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(232);
			retorno();
			setState(233);
			match(RBRACE);
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
		public List<TerminalNode> COLON() { return getTokens(lensParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(lensParser.COLON, i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(lensParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(lensParser.COMMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(VAR);
			setState(236);
			match(COLON);
			setState(237);
			tipo();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(238);
				match(COMMA);
				setState(239);
				match(VAR);
				setState(240);
				match(COLON);
				setState(241);
				tipo();
				}
				}
				setState(246);
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
	public static class ChamadaFuncaoContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode LPAREN() { return getToken(lensParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(lensParser.RPAREN, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public ChamadaFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFuncao; }
	}

	public final ChamadaFuncaoContext chamadaFuncao() throws RecognitionException {
		ChamadaFuncaoContext _localctx = new ChamadaFuncaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_chamadaFuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(VAR);
			setState(248);
			match(LPAREN);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549755813950L) != 0)) {
				{
				setState(249);
				argList();
				}
			}

			setState(252);
			match(RPAREN);
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
	public static class ArgListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(lensParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(lensParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			expr();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(255);
				match(COMMA);
				setState(256);
				expr();
				}
				}
				setState(261);
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
	public static class ImprimeContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(lensParser.PRINT, 0); }
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
		enterRule(_localctx, 40, RULE_imprime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(PRINT);
			setState(263);
			match(DUPONT);
			setState(264);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(lensParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(lensParser.COMMA, i);
		}
		public ConcatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concat; }
	}

	public final ConcatContext concat() throws RecognitionException {
		ConcatContext _localctx = new ConcatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_concat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			expr();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(267);
				match(COMMA);
				setState(268);
				expr();
				}
				}
				setState(273);
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
	public static class LeituraContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(lensParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(lensParser.LPAREN, 0); }
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode RPAREN() { return getToken(lensParser.RPAREN, 0); }
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(INPUT);
			setState(275);
			match(LPAREN);
			setState(276);
			match(VAR);
			setState(277);
			match(RPAREN);
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
		public TerminalNode IF() { return getToken(lensParser.IF, 0); }
		public List<ExprCondContext> exprCond() {
			return getRuleContexts(ExprCondContext.class);
		}
		public ExprCondContext exprCond(int i) {
			return getRuleContext(ExprCondContext.class,i);
		}
		public List<BlocoBracesContext> blocoBraces() {
			return getRuleContexts(BlocoBracesContext.class);
		}
		public BlocoBracesContext blocoBraces(int i) {
			return getRuleContext(BlocoBracesContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(lensParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(lensParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(lensParser.ELSE, 0); }
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(IF);
			setState(280);
			exprCond();
			setState(281);
			blocoBraces();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(282);
				match(ELSEIF);
				setState(283);
				exprCond();
				setState(284);
				blocoBraces();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(291);
				match(ELSE);
				setState(292);
				blocoBraces();
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
	public static class BlocoBracesContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(lensParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(lensParser.RBRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlocoBracesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocoBraces; }
	}

	public final BlocoBracesContext blocoBraces() throws RecognitionException {
		BlocoBracesContext _localctx = new BlocoBracesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_blocoBraces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(LBRACE);
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2416416L) != 0)) {
				{
				{
				setState(296);
				stmt();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			match(RBRACE);
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
		public TerminalNode FOR() { return getToken(lensParser.FOR, 0); }
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode IN() { return getToken(lensParser.IN, 0); }
		public List<TerminalNode> INT() { return getTokens(lensParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(lensParser.INT, i);
		}
		public TerminalNode RANGE() { return getToken(lensParser.RANGE, 0); }
		public BlocoBracesContext blocoBraces() {
			return getRuleContext(BlocoBracesContext.class,0);
		}
		public LacoforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lacofor; }
	}

	public final LacoforContext lacofor() throws RecognitionException {
		LacoforContext _localctx = new LacoforContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lacofor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(FOR);
			setState(305);
			match(VAR);
			setState(306);
			match(IN);
			setState(307);
			match(INT);
			setState(308);
			match(RANGE);
			setState(309);
			match(INT);
			setState(310);
			blocoBraces();
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
		public TerminalNode WHILE() { return getToken(lensParser.WHILE, 0); }
		public ExprCondContext exprCond() {
			return getRuleContext(ExprCondContext.class,0);
		}
		public BlocoBracesContext blocoBraces() {
			return getRuleContext(BlocoBracesContext.class,0);
		}
		public LacowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lacowhile; }
	}

	public final LacowhileContext lacowhile() throws RecognitionException {
		LacowhileContext _localctx = new LacowhileContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lacowhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(WHILE);
			setState(313);
			exprCond();
			setState(314);
			blocoBraces();
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
	public static class ExprContext extends ParserRuleContext {
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			logicExpr();
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
	public static class LogicExprContext extends ParserRuleContext {
		public List<CompExprContext> compExpr() {
			return getRuleContexts(CompExprContext.class);
		}
		public CompExprContext compExpr(int i) {
			return getRuleContext(CompExprContext.class,i);
		}
		public List<OpalogiContext> opalogi() {
			return getRuleContexts(OpalogiContext.class);
		}
		public OpalogiContext opalogi(int i) {
			return getRuleContext(OpalogiContext.class,i);
		}
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		LogicExprContext _localctx = new LogicExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_logicExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			compExpr();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(319);
				opalogi();
				setState(320);
				compExpr();
				}
				}
				setState(326);
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
	public static class CompExprContext extends ParserRuleContext {
		public List<ArithExprContext> arithExpr() {
			return getRuleContexts(ArithExprContext.class);
		}
		public ArithExprContext arithExpr(int i) {
			return getRuleContext(ArithExprContext.class,i);
		}
		public ComparacaoContext comparacao() {
			return getRuleContext(ComparacaoContext.class,0);
		}
		public CompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr; }
	}

	public final CompExprContext compExpr() throws RecognitionException {
		CompExprContext _localctx = new CompExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_compExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			arithExpr();
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) {
				{
				{
				setState(328);
				comparacao();
				}
				setState(329);
				arithExpr();
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
	public static class ArithExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(lensParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(lensParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(lensParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(lensParser.SUB, i);
		}
		public ArithExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpr; }
	}

	public final ArithExprContext arithExpr() throws RecognitionException {
		ArithExprContext _localctx = new ArithExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arithExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			term();
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(334);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(335);
				term();
				}
				}
				setState(340);
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(lensParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(lensParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(lensParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(lensParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			factor();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(342);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(343);
				factor();
				}
				}
				setState(348);
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
	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(lensParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(lensParser.RPAREN, 0); }
		public ChamadaFuncaoContext chamadaFuncao() {
			return getRuleContext(ChamadaFuncaoContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ObjAccessContext objAccess() {
			return getRuleContext(ObjAccessContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_factor);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				match(LPAREN);
				setState(350);
				expr();
				setState(351);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				chamadaFuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				arrayAccess();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(355);
				objAccess();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(356);
				literal();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(357);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(lensParser.VAR, 0); }
		public TerminalNode LBRACK() { return getToken(lensParser.LBRACK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(lensParser.RBRACK, 0); }
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(VAR);
			setState(361);
			match(LBRACK);
			setState(362);
			expr();
			setState(363);
			match(RBRACK);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(lensParser.STRING, 0); }
		public TerminalNode INT() { return getToken(lensParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(lensParser.FLOAT, 0); }
		public TerminalNode BOOL() { return getToken(lensParser.BOOL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30L) != 0)) ) {
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
	public static class ExprCondContext extends ParserRuleContext {
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public ExprCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCond; }
	}

	public final ExprCondContext exprCond() throws RecognitionException {
		ExprCondContext _localctx = new ExprCondContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exprCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			logicExpr();
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
	public static class OpAritContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(lensParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(lensParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(lensParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(lensParser.DIV, 0); }
		public OpAritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opArit; }
	}

	public final OpAritContext opArit() throws RecognitionException {
		OpAritContext _localctx = new OpAritContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_opArit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1055531162664960L) != 0)) ) {
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
	public static class OpalogicContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(lensParser.AND, 0); }
		public TerminalNode OR() { return getToken(lensParser.OR, 0); }
		public OpalogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opalogic; }
	}

	public final OpalogicContext opalogic() throws RecognitionException {
		OpalogicContext _localctx = new OpalogicContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_opalogic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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
		public TerminalNode NEQ() { return getToken(lensParser.NEQ, 0); }
		public TerminalNode EQ() { return getToken(lensParser.EQ, 0); }
		public TerminalNode LT() { return getToken(lensParser.LT, 0); }
		public TerminalNode GT() { return getToken(lensParser.GT, 0); }
		public TerminalNode LTE() { return getToken(lensParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(lensParser.GTE, 0); }
		public ComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacao; }
	}

	public final ComparacaoContext comparacao() throws RecognitionException {
		ComparacaoContext _localctx = new ComparacaoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_comparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
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
		public TerminalNode AND() { return getToken(lensParser.AND, 0); }
		public TerminalNode OR() { return getToken(lensParser.OR, 0); }
		public OpalogiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opalogi; }
	}

	public final OpalogiContext opalogi() throws RecognitionException {
		OpalogiContext _localctx = new OpalogiContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_opalogi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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
		"\u0004\u00014\u017a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0005\u0000S\b\u0000\n\u0000\f\u0000V\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001\\\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002k\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004v\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0084\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u0098\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u009e\b\t"+
		"\n\t\f\t\u00a1\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00a9\b\n\n\n\f\n\u00ac\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00b2\b\u000b\u0001\f\u0001\f\u0001\f\u0004\f\u00b7\b\f\u000b"+
		"\f\f\f\u00b8\u0001\r\u0001\r\u0001\r\u0003\r\u00be\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00c8\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u00cf\b\u000f\n\u000f\f\u000f\u00d2\t\u000f"+
		"\u0001\u000f\u0003\u000f\u00d5\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00dd\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e4\b\u0010"+
		"\n\u0010\f\u0010\u00e7\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00f3\b\u0011\n\u0011\f\u0011\u00f6\t\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00fb\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0102\b\u0013\n\u0013"+
		"\f\u0013\u0105\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u010e\b\u0015\n\u0015"+
		"\f\u0015\u0111\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u011f\b\u0017\n\u0017\f\u0017\u0122"+
		"\t\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0126\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u012a\b\u0018\n\u0018\f\u0018\u012d\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u0143\b\u001c\n\u001c\f\u001c\u0146\t\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u014c\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0151\b\u001e\n\u001e"+
		"\f\u001e\u0154\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u0159\b\u001f\n\u001f\f\u001f\u015c\t\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0167\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001"+
		"%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0000\u0000(\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLN\u0000\u0007\u0002\u0000\u0005\u0005\u0016\u0019"+
		"\u0001\u000001\u0001\u0000./\u0001\u0000\u0001\u0004\u0001\u0000.1\u0001"+
		"\u0000\u001c\u001d\u0001\u0000\u001e#\u017f\u0000P\u0001\u0000\u0000\u0000"+
		"\u0002[\u0001\u0000\u0000\u0000\u0004j\u0001\u0000\u0000\u0000\u0006l"+
		"\u0001\u0000\u0000\u0000\bo\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000"+
		"\u0000\f\u0083\u0001\u0000\u0000\u0000\u000e\u0085\u0001\u0000\u0000\u0000"+
		"\u0010\u008c\u0001\u0000\u0000\u0000\u0012\u0099\u0001\u0000\u0000\u0000"+
		"\u0014\u00a4\u0001\u0000\u0000\u0000\u0016\u00b1\u0001\u0000\u0000\u0000"+
		"\u0018\u00b3\u0001\u0000\u0000\u0000\u001a\u00bd\u0001\u0000\u0000\u0000"+
		"\u001c\u00bf\u0001\u0000\u0000\u0000\u001e\u00c3\u0001\u0000\u0000\u0000"+
		" \u00d8\u0001\u0000\u0000\u0000\"\u00eb\u0001\u0000\u0000\u0000$\u00f7"+
		"\u0001\u0000\u0000\u0000&\u00fe\u0001\u0000\u0000\u0000(\u0106\u0001\u0000"+
		"\u0000\u0000*\u010a\u0001\u0000\u0000\u0000,\u0112\u0001\u0000\u0000\u0000"+
		".\u0117\u0001\u0000\u0000\u00000\u0127\u0001\u0000\u0000\u00002\u0130"+
		"\u0001\u0000\u0000\u00004\u0138\u0001\u0000\u0000\u00006\u013c\u0001\u0000"+
		"\u0000\u00008\u013e\u0001\u0000\u0000\u0000:\u0147\u0001\u0000\u0000\u0000"+
		"<\u014d\u0001\u0000\u0000\u0000>\u0155\u0001\u0000\u0000\u0000@\u0166"+
		"\u0001\u0000\u0000\u0000B\u0168\u0001\u0000\u0000\u0000D\u016d\u0001\u0000"+
		"\u0000\u0000F\u016f\u0001\u0000\u0000\u0000H\u0171\u0001\u0000\u0000\u0000"+
		"J\u0173\u0001\u0000\u0000\u0000L\u0175\u0001\u0000\u0000\u0000N\u0177"+
		"\u0001\u0000\u0000\u0000PT\u0005\u0006\u0000\u0000QS\u0003\u0002\u0001"+
		"\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000WX\u0005\u0007\u0000\u0000X\u0001\u0001\u0000\u0000"+
		"\u0000Y\\\u0003\u0004\u0002\u0000Z\\\u0003\u0014\n\u0000[Y\u0001\u0000"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\u0003\u0001\u0000\u0000\u0000"+
		"]k\u0003\b\u0004\u0000^k\u0003\f\u0006\u0000_k\u0003(\u0014\u0000`k\u0003"+
		",\u0016\u0000ak\u0003.\u0017\u0000bk\u00032\u0019\u0000ck\u00034\u001a"+
		"\u0000dk\u0003\u001e\u000f\u0000ek\u0003$\u0012\u0000fk\u0003 \u0010\u0000"+
		"gk\u0003\u0010\b\u0000hk\u0003\u000e\u0007\u0000ik\u0003\u0006\u0003\u0000"+
		"j]\u0001\u0000\u0000\u0000j^\u0001\u0000\u0000\u0000j_\u0001\u0000\u0000"+
		"\u0000j`\u0001\u0000\u0000\u0000ja\u0001\u0000\u0000\u0000jb\u0001\u0000"+
		"\u0000\u0000jc\u0001\u0000\u0000\u0000jd\u0001\u0000\u0000\u0000je\u0001"+
		"\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000k\u0005\u0001\u0000"+
		"\u0000\u0000lm\u0005\u000e\u0000\u0000mn\u00036\u001b\u0000n\u0007\u0001"+
		"\u0000\u0000\u0000op\u0005\b\u0000\u0000pq\u0005\u0005\u0000\u0000qr\u0005"+
		"&\u0000\u0000ru\u0003\n\u0005\u0000st\u0005$\u0000\u0000tv\u00036\u001b"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\t\u0001\u0000"+
		"\u0000\u0000wx\u0007\u0000\u0000\u0000x\u000b\u0001\u0000\u0000\u0000"+
		"yz\u0005\u0005\u0000\u0000z{\u0005$\u0000\u0000{\u0084\u00036\u001b\u0000"+
		"|}\u0005\u0005\u0000\u0000}~\u0003H$\u0000~\u007f\u0005$\u0000\u0000\u007f"+
		"\u0080\u00036\u001b\u0000\u0080\u0084\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0003\u000e\u0007\u0000\u0082\u0084\u0003\u001c\u000e\u0000\u0083y\u0001"+
		"\u0000\u0000\u0000\u0083|\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\r\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005\u0005\u0000\u0000\u0086\u0087\u0005+\u0000\u0000"+
		"\u0087\u0088\u0005\u0002\u0000\u0000\u0088\u0089\u0005,\u0000\u0000\u0089"+
		"\u008a\u0005$\u0000\u0000\u008a\u008b\u00036\u001b\u0000\u008b\u000f\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005\b\u0000\u0000\u008d\u008e\u0005\u0005"+
		"\u0000\u0000\u008e\u008f\u0005&\u0000\u0000\u008f\u0090\u0005+\u0000\u0000"+
		"\u0090\u0091\u0003\n\u0005\u0000\u0091\u0092\u0005,\u0000\u0000\u0092"+
		"\u0093\u0005+\u0000\u0000\u0093\u0094\u0005\u0002\u0000\u0000\u0094\u0097"+
		"\u0005,\u0000\u0000\u0095\u0096\u0005$\u0000\u0000\u0096\u0098\u0003\u0012"+
		"\t\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u0011\u0001\u0000\u0000\u0000\u0099\u009a\u0005+\u0000\u0000"+
		"\u009a\u009f\u00036\u001b\u0000\u009b\u009c\u0005%\u0000\u0000\u009c\u009e"+
		"\u00036\u001b\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a1\u0001"+
		"\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0005,\u0000\u0000\u00a3\u0013\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005\r\u0000\u0000\u00a5\u00a6\u0005\u0005\u0000"+
		"\u0000\u00a6\u00aa\u0005)\u0000\u0000\u00a7\u00a9\u0003\u0016\u000b\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0005*\u0000\u0000\u00ae\u0015\u0001\u0000\u0000\u0000\u00af"+
		"\u00b2\u0003\b\u0004\u0000\u00b0\u00b2\u0003\u001e\u000f\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u0017"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b6\u0005\u0005\u0000\u0000\u00b4\u00b5"+
		"\u0005-\u0000\u0000\u00b5\u00b7\u0003\u001a\r\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u0019\u0001"+
		"\u0000\u0000\u0000\u00ba\u00be\u0003$\u0012\u0000\u00bb\u00be\u0005\u0005"+
		"\u0000\u0000\u00bc\u00be\u0003B!\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bb\u0001\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000"+
		"\u00be\u001b\u0001\u0000\u0000\u0000\u00bf\u00c0\u0003\u0018\f\u0000\u00c0"+
		"\u00c1\u0005$\u0000\u0000\u00c1\u00c2\u00036\u001b\u0000\u00c2\u001d\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0005\u000b\u0000\u0000\u00c4\u00c5\u0005"+
		"\u0005\u0000\u0000\u00c5\u00c7\u0005\'\u0000\u0000\u00c6\u00c8\u0003\""+
		"\u0011\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005(\u0000"+
		"\u0000\u00ca\u00cb\u0005\u001a\u0000\u0000\u00cb\u00cc\u0003\n\u0005\u0000"+
		"\u00cc\u00d0\u0005)\u0000\u0000\u00cd\u00cf\u0003\u0004\u0002\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d5\u0003\u0006\u0003\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0005*\u0000\u0000\u00d7\u001f\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0005\f\u0000\u0000\u00d9\u00da\u00052\u0000\u0000\u00da\u00dc\u0005"+
		"\'\u0000\u0000\u00db\u00dd\u0003\"\u0011\u0000\u00dc\u00db\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005(\u0000\u0000\u00df\u00e0\u0005\u001a\u0000"+
		"\u0000\u00e0\u00e1\u0003\n\u0005\u0000\u00e1\u00e5\u0005)\u0000\u0000"+
		"\u00e2\u00e4\u0003\u0004\u0002\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9\u0003\u0006\u0003\u0000"+
		"\u00e9\u00ea\u0005*\u0000\u0000\u00ea!\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0005\u0005\u0000\u0000\u00ec\u00ed\u0005&\u0000\u0000\u00ed\u00f4\u0003"+
		"\n\u0005\u0000\u00ee\u00ef\u0005%\u0000\u0000\u00ef\u00f0\u0005\u0005"+
		"\u0000\u0000\u00f0\u00f1\u0005&\u0000\u0000\u00f1\u00f3\u0003\n\u0005"+
		"\u0000\u00f2\u00ee\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f5#\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0005\u0005\u0000\u0000\u00f8\u00fa\u0005\'\u0000\u0000\u00f9"+
		"\u00fb\u0003&\u0013\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0005(\u0000\u0000\u00fd%\u0001\u0000\u0000\u0000\u00fe\u0103\u00036"+
		"\u001b\u0000\u00ff\u0100\u0005%\u0000\u0000\u0100\u0102\u00036\u001b\u0000"+
		"\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\'\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0005\t\u0000\u0000\u0107\u0108\u0005\u001b\u0000\u0000\u0108\u0109"+
		"\u0003*\u0015\u0000\u0109)\u0001\u0000\u0000\u0000\u010a\u010f\u00036"+
		"\u001b\u0000\u010b\u010c\u0005%\u0000\u0000\u010c\u010e\u00036\u001b\u0000"+
		"\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000"+
		"\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000"+
		"\u0110+\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0005\n\u0000\u0000\u0113\u0114\u0005\'\u0000\u0000\u0114\u0115"+
		"\u0005\u0005\u0000\u0000\u0115\u0116\u0005(\u0000\u0000\u0116-\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0005\u000f\u0000\u0000\u0118\u0119\u0003F#\u0000"+
		"\u0119\u0120\u00030\u0018\u0000\u011a\u011b\u0005\u0010\u0000\u0000\u011b"+
		"\u011c\u0003F#\u0000\u011c\u011d\u00030\u0018\u0000\u011d\u011f\u0001"+
		"\u0000\u0000\u0000\u011e\u011a\u0001\u0000\u0000\u0000\u011f\u0122\u0001"+
		"\u0000\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001"+
		"\u0000\u0000\u0000\u0121\u0125\u0001\u0000\u0000\u0000\u0122\u0120\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0005\u0011\u0000\u0000\u0124\u0126\u0003"+
		"0\u0018\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000"+
		"\u0000\u0000\u0126/\u0001\u0000\u0000\u0000\u0127\u012b\u0005)\u0000\u0000"+
		"\u0128\u012a\u0003\u0004\u0002\u0000\u0129\u0128\u0001\u0000\u0000\u0000"+
		"\u012a\u012d\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012e\u0001\u0000\u0000\u0000"+
		"\u012d\u012b\u0001\u0000\u0000\u0000\u012e\u012f\u0005*\u0000\u0000\u012f"+
		"1\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u0012\u0000\u0000\u0131\u0132"+
		"\u0005\u0005\u0000\u0000\u0132\u0133\u0005\u0013\u0000\u0000\u0133\u0134"+
		"\u0005\u0002\u0000\u0000\u0134\u0135\u0005\u0014\u0000\u0000\u0135\u0136"+
		"\u0005\u0002\u0000\u0000\u0136\u0137\u00030\u0018\u0000\u01373\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0005\u0015\u0000\u0000\u0139\u013a\u0003F#\u0000"+
		"\u013a\u013b\u00030\u0018\u0000\u013b5\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u00038\u001c\u0000\u013d7\u0001\u0000\u0000\u0000\u013e\u0144\u0003:"+
		"\u001d\u0000\u013f\u0140\u0003N\'\u0000\u0140\u0141\u0003:\u001d\u0000"+
		"\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u013f\u0001\u0000\u0000\u0000"+
		"\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0001\u0000\u0000\u0000\u01459\u0001\u0000\u0000\u0000\u0146"+
		"\u0144\u0001\u0000\u0000\u0000\u0147\u014b\u0003<\u001e\u0000\u0148\u0149"+
		"\u0003L&\u0000\u0149\u014a\u0003<\u001e\u0000\u014a\u014c\u0001\u0000"+
		"\u0000\u0000\u014b\u0148\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000"+
		"\u0000\u0000\u014c;\u0001\u0000\u0000\u0000\u014d\u0152\u0003>\u001f\u0000"+
		"\u014e\u014f\u0007\u0001\u0000\u0000\u014f\u0151\u0003>\u001f\u0000\u0150"+
		"\u014e\u0001\u0000\u0000\u0000\u0151\u0154\u0001\u0000\u0000\u0000\u0152"+
		"\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153"+
		"=\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u015a"+
		"\u0003@ \u0000\u0156\u0157\u0007\u0002\u0000\u0000\u0157\u0159\u0003@"+
		" \u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000"+
		"\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000"+
		"\u0000\u015b?\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0005\'\u0000\u0000\u015e\u015f\u00036\u001b\u0000\u015f"+
		"\u0160\u0005(\u0000\u0000\u0160\u0167\u0001\u0000\u0000\u0000\u0161\u0167"+
		"\u0003$\u0012\u0000\u0162\u0167\u0003B!\u0000\u0163\u0167\u0003\u0018"+
		"\f\u0000\u0164\u0167\u0003D\"\u0000\u0165\u0167\u0005\u0005\u0000\u0000"+
		"\u0166\u015d\u0001\u0000\u0000\u0000\u0166\u0161\u0001\u0000\u0000\u0000"+
		"\u0166\u0162\u0001\u0000\u0000\u0000\u0166\u0163\u0001\u0000\u0000\u0000"+
		"\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000"+
		"\u0167A\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u0005\u0000\u0000\u0169"+
		"\u016a\u0005+\u0000\u0000\u016a\u016b\u00036\u001b\u0000\u016b\u016c\u0005"+
		",\u0000\u0000\u016cC\u0001\u0000\u0000\u0000\u016d\u016e\u0007\u0003\u0000"+
		"\u0000\u016eE\u0001\u0000\u0000\u0000\u016f\u0170\u00038\u001c\u0000\u0170"+
		"G\u0001\u0000\u0000\u0000\u0171\u0172\u0007\u0004\u0000\u0000\u0172I\u0001"+
		"\u0000\u0000\u0000\u0173\u0174\u0007\u0005\u0000\u0000\u0174K\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0007\u0006\u0000\u0000\u0176M\u0001\u0000\u0000"+
		"\u0000\u0177\u0178\u0007\u0005\u0000\u0000\u0178O\u0001\u0000\u0000\u0000"+
		"\u001cT[ju\u0083\u0097\u009f\u00aa\u00b1\u00b8\u00bd\u00c7\u00d0\u00d4"+
		"\u00dc\u00e5\u00f4\u00fa\u0103\u010f\u0120\u0125\u012b\u0144\u014b\u0152"+
		"\u015a\u0166";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}