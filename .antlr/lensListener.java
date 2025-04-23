// Generated from c:/Users/augus/compilador_lens/lens.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lensParser}.
 */
public interface lensListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lensParser#lens}.
	 * @param ctx the parse tree
	 */
	void enterLens(lensParser.LensContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#lens}.
	 * @param ctx the parse tree
	 */
	void exitLens(lensParser.LensContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(lensParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(lensParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#imprime}.
	 * @param ctx the parse tree
	 */
	void enterImprime(lensParser.ImprimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#imprime}.
	 * @param ctx the parse tree
	 */
	void exitImprime(lensParser.ImprimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#concat}.
	 * @param ctx the parse tree
	 */
	void enterConcat(lensParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#concat}.
	 * @param ctx the parse tree
	 */
	void exitConcat(lensParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#ler}.
	 * @param ctx the parse tree
	 */
	void enterLer(lensParser.LerContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#ler}.
	 * @param ctx the parse tree
	 */
	void exitLer(lensParser.LerContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(lensParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(lensParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#ifcond}.
	 * @param ctx the parse tree
	 */
	void enterIfcond(lensParser.IfcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#ifcond}.
	 * @param ctx the parse tree
	 */
	void exitIfcond(lensParser.IfcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#elifcond}.
	 * @param ctx the parse tree
	 */
	void enterElifcond(lensParser.ElifcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#elifcond}.
	 * @param ctx the parse tree
	 */
	void exitElifcond(lensParser.ElifcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#elcond}.
	 * @param ctx the parse tree
	 */
	void enterElcond(lensParser.ElcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#elcond}.
	 * @param ctx the parse tree
	 */
	void exitElcond(lensParser.ElcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#lacofor}.
	 * @param ctx the parse tree
	 */
	void enterLacofor(lensParser.LacoforContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#lacofor}.
	 * @param ctx the parse tree
	 */
	void exitLacofor(lensParser.LacoforContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#lacowhile}.
	 * @param ctx the parse tree
	 */
	void enterLacowhile(lensParser.LacowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#lacowhile}.
	 * @param ctx the parse tree
	 */
	void exitLacowhile(lensParser.LacowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#arit}.
	 * @param ctx the parse tree
	 */
	void enterArit(lensParser.AritContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#arit}.
	 * @param ctx the parse tree
	 */
	void exitArit(lensParser.AritContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#aritp}.
	 * @param ctx the parse tree
	 */
	void enterAritp(lensParser.AritpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#aritp}.
	 * @param ctx the parse tree
	 */
	void exitAritp(lensParser.AritpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#oparit}.
	 * @param ctx the parse tree
	 */
	void enterOparit(lensParser.OparitContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#oparit}.
	 * @param ctx the parse tree
	 */
	void exitOparit(lensParser.OparitContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#opalogi}.
	 * @param ctx the parse tree
	 */
	void enterOpalogi(lensParser.OpalogiContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#opalogi}.
	 * @param ctx the parse tree
	 */
	void exitOpalogi(lensParser.OpalogiContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void enterComparacao(lensParser.ComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#comparacao}.
	 * @param ctx the parse tree
	 */
	void exitComparacao(lensParser.ComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#expcomp}.
	 * @param ctx the parse tree
	 */
	void enterExpcomp(lensParser.ExpcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#expcomp}.
	 * @param ctx the parse tree
	 */
	void exitExpcomp(lensParser.ExpcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#explogi}.
	 * @param ctx the parse tree
	 */
	void enterExplogi(lensParser.ExplogiContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#explogi}.
	 * @param ctx the parse tree
	 */
	void exitExplogi(lensParser.ExplogiContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#expTemplate}.
	 * @param ctx the parse tree
	 */
	void enterExpTemplate(lensParser.ExpTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#expTemplate}.
	 * @param ctx the parse tree
	 */
	void exitExpTemplate(lensParser.ExpTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(lensParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(lensParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#expcond}.
	 * @param ctx the parse tree
	 */
	void enterExpcond(lensParser.ExpcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#expcond}.
	 * @param ctx the parse tree
	 */
	void exitExpcond(lensParser.ExpcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(lensParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(lensParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(lensParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(lensParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#letvar}.
	 * @param ctx the parse tree
	 */
	void enterLetvar(lensParser.LetvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#letvar}.
	 * @param ctx the parse tree
	 */
	void exitLetvar(lensParser.LetvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#atrsolta}.
	 * @param ctx the parse tree
	 */
	void enterAtrsolta(lensParser.AtrsoltaContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#atrsolta}.
	 * @param ctx the parse tree
	 */
	void exitAtrsolta(lensParser.AtrsoltaContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtr(lensParser.AtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtr(lensParser.AtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#rolav}.
	 * @param ctx the parse tree
	 */
	void enterRolav(lensParser.RolavContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#rolav}.
	 * @param ctx the parse tree
	 */
	void exitRolav(lensParser.RolavContext ctx);
	/**
	 * Enter a parse tree produced by {@link lensParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(lensParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lensParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(lensParser.ValorContext ctx);
}