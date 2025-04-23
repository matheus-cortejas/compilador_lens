# Generated from lens.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .lensParser import lensParser
else:
    from lensParser import lensParser

# This class defines a complete listener for a parse tree produced by lensParser.
class lensListener(ParseTreeListener):

    # Enter a parse tree produced by lensParser#lens.
    def enterLens(self, ctx:lensParser.LensContext):
        pass

    # Exit a parse tree produced by lensParser#lens.
    def exitLens(self, ctx:lensParser.LensContext):
        pass


    # Enter a parse tree produced by lensParser#comando.
    def enterComando(self, ctx:lensParser.ComandoContext):
        pass

    # Exit a parse tree produced by lensParser#comando.
    def exitComando(self, ctx:lensParser.ComandoContext):
        pass


    # Enter a parse tree produced by lensParser#imprime.
    def enterImprime(self, ctx:lensParser.ImprimeContext):
        pass

    # Exit a parse tree produced by lensParser#imprime.
    def exitImprime(self, ctx:lensParser.ImprimeContext):
        pass


    # Enter a parse tree produced by lensParser#concat.
    def enterConcat(self, ctx:lensParser.ConcatContext):
        pass

    # Exit a parse tree produced by lensParser#concat.
    def exitConcat(self, ctx:lensParser.ConcatContext):
        pass


    # Enter a parse tree produced by lensParser#ler.
    def enterLer(self, ctx:lensParser.LerContext):
        pass

    # Exit a parse tree produced by lensParser#ler.
    def exitLer(self, ctx:lensParser.LerContext):
        pass


    # Enter a parse tree produced by lensParser#condicao.
    def enterCondicao(self, ctx:lensParser.CondicaoContext):
        pass

    # Exit a parse tree produced by lensParser#condicao.
    def exitCondicao(self, ctx:lensParser.CondicaoContext):
        pass


    # Enter a parse tree produced by lensParser#ifcond.
    def enterIfcond(self, ctx:lensParser.IfcondContext):
        pass

    # Exit a parse tree produced by lensParser#ifcond.
    def exitIfcond(self, ctx:lensParser.IfcondContext):
        pass


    # Enter a parse tree produced by lensParser#elifcond.
    def enterElifcond(self, ctx:lensParser.ElifcondContext):
        pass

    # Exit a parse tree produced by lensParser#elifcond.
    def exitElifcond(self, ctx:lensParser.ElifcondContext):
        pass


    # Enter a parse tree produced by lensParser#elcond.
    def enterElcond(self, ctx:lensParser.ElcondContext):
        pass

    # Exit a parse tree produced by lensParser#elcond.
    def exitElcond(self, ctx:lensParser.ElcondContext):
        pass


    # Enter a parse tree produced by lensParser#lacofor.
    def enterLacofor(self, ctx:lensParser.LacoforContext):
        pass

    # Exit a parse tree produced by lensParser#lacofor.
    def exitLacofor(self, ctx:lensParser.LacoforContext):
        pass


    # Enter a parse tree produced by lensParser#lacowhile.
    def enterLacowhile(self, ctx:lensParser.LacowhileContext):
        pass

    # Exit a parse tree produced by lensParser#lacowhile.
    def exitLacowhile(self, ctx:lensParser.LacowhileContext):
        pass


    # Enter a parse tree produced by lensParser#arit.
    def enterArit(self, ctx:lensParser.AritContext):
        pass

    # Exit a parse tree produced by lensParser#arit.
    def exitArit(self, ctx:lensParser.AritContext):
        pass


    # Enter a parse tree produced by lensParser#aritp.
    def enterAritp(self, ctx:lensParser.AritpContext):
        pass

    # Exit a parse tree produced by lensParser#aritp.
    def exitAritp(self, ctx:lensParser.AritpContext):
        pass


    # Enter a parse tree produced by lensParser#oparit.
    def enterOparit(self, ctx:lensParser.OparitContext):
        pass

    # Exit a parse tree produced by lensParser#oparit.
    def exitOparit(self, ctx:lensParser.OparitContext):
        pass


    # Enter a parse tree produced by lensParser#opalogi.
    def enterOpalogi(self, ctx:lensParser.OpalogiContext):
        pass

    # Exit a parse tree produced by lensParser#opalogi.
    def exitOpalogi(self, ctx:lensParser.OpalogiContext):
        pass


    # Enter a parse tree produced by lensParser#comparacao.
    def enterComparacao(self, ctx:lensParser.ComparacaoContext):
        pass

    # Exit a parse tree produced by lensParser#comparacao.
    def exitComparacao(self, ctx:lensParser.ComparacaoContext):
        pass


    # Enter a parse tree produced by lensParser#expcomp.
    def enterExpcomp(self, ctx:lensParser.ExpcompContext):
        pass

    # Exit a parse tree produced by lensParser#expcomp.
    def exitExpcomp(self, ctx:lensParser.ExpcompContext):
        pass


    # Enter a parse tree produced by lensParser#explogi.
    def enterExplogi(self, ctx:lensParser.ExplogiContext):
        pass

    # Exit a parse tree produced by lensParser#explogi.
    def exitExplogi(self, ctx:lensParser.ExplogiContext):
        pass


    # Enter a parse tree produced by lensParser#expTemplate.
    def enterExpTemplate(self, ctx:lensParser.ExpTemplateContext):
        pass

    # Exit a parse tree produced by lensParser#expTemplate.
    def exitExpTemplate(self, ctx:lensParser.ExpTemplateContext):
        pass


    # Enter a parse tree produced by lensParser#exp.
    def enterExp(self, ctx:lensParser.ExpContext):
        pass

    # Exit a parse tree produced by lensParser#exp.
    def exitExp(self, ctx:lensParser.ExpContext):
        pass


    # Enter a parse tree produced by lensParser#expcond.
    def enterExpcond(self, ctx:lensParser.ExpcondContext):
        pass

    # Exit a parse tree produced by lensParser#expcond.
    def exitExpcond(self, ctx:lensParser.ExpcondContext):
        pass


    # Enter a parse tree produced by lensParser#dec.
    def enterDec(self, ctx:lensParser.DecContext):
        pass

    # Exit a parse tree produced by lensParser#dec.
    def exitDec(self, ctx:lensParser.DecContext):
        pass


    # Enter a parse tree produced by lensParser#class.
    def enterClass(self, ctx:lensParser.ClassContext):
        pass

    # Exit a parse tree produced by lensParser#class.
    def exitClass(self, ctx:lensParser.ClassContext):
        pass


    # Enter a parse tree produced by lensParser#letvar.
    def enterLetvar(self, ctx:lensParser.LetvarContext):
        pass

    # Exit a parse tree produced by lensParser#letvar.
    def exitLetvar(self, ctx:lensParser.LetvarContext):
        pass


    # Enter a parse tree produced by lensParser#atrsolta.
    def enterAtrsolta(self, ctx:lensParser.AtrsoltaContext):
        pass

    # Exit a parse tree produced by lensParser#atrsolta.
    def exitAtrsolta(self, ctx:lensParser.AtrsoltaContext):
        pass


    # Enter a parse tree produced by lensParser#atr.
    def enterAtr(self, ctx:lensParser.AtrContext):
        pass

    # Exit a parse tree produced by lensParser#atr.
    def exitAtr(self, ctx:lensParser.AtrContext):
        pass


    # Enter a parse tree produced by lensParser#rolav.
    def enterRolav(self, ctx:lensParser.RolavContext):
        pass

    # Exit a parse tree produced by lensParser#rolav.
    def exitRolav(self, ctx:lensParser.RolavContext):
        pass


    # Enter a parse tree produced by lensParser#valor.
    def enterValor(self, ctx:lensParser.ValorContext):
        pass

    # Exit a parse tree produced by lensParser#valor.
    def exitValor(self, ctx:lensParser.ValorContext):
        pass



del lensParser