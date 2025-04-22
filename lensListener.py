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


    # Enter a parse tree produced by lensParser#opper.
    def enterOpper(self, ctx:lensParser.OpperContext):
        pass

    # Exit a parse tree produced by lensParser#opper.
    def exitOpper(self, ctx:lensParser.OpperContext):
        pass


    # Enter a parse tree produced by lensParser#expop.
    def enterExpop(self, ctx:lensParser.ExpopContext):
        pass

    # Exit a parse tree produced by lensParser#expop.
    def exitExpop(self, ctx:lensParser.ExpopContext):
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


    # Enter a parse tree produced by lensParser#funcaoW.
    def enterFuncaoW(self, ctx:lensParser.FuncaoWContext):
        pass

    # Exit a parse tree produced by lensParser#funcaoW.
    def exitFuncaoW(self, ctx:lensParser.FuncaoWContext):
        pass


    # Enter a parse tree produced by lensParser#parametros.
    def enterParametros(self, ctx:lensParser.ParametrosContext):
        pass

    # Exit a parse tree produced by lensParser#parametros.
    def exitParametros(self, ctx:lensParser.ParametrosContext):
        pass


    # Enter a parse tree produced by lensParser#funcaoD.
    def enterFuncaoD(self, ctx:lensParser.FuncaoDContext):
        pass

    # Exit a parse tree produced by lensParser#funcaoD.
    def exitFuncaoD(self, ctx:lensParser.FuncaoDContext):
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


    # Enter a parse tree produced by lensParser#tipo.
    def enterTipo(self, ctx:lensParser.TipoContext):
        pass

    # Exit a parse tree produced by lensParser#tipo.
    def exitTipo(self, ctx:lensParser.TipoContext):
        pass


    # Enter a parse tree produced by lensParser#atray.
    def enterAtray(self, ctx:lensParser.AtrayContext):
        pass

    # Exit a parse tree produced by lensParser#atray.
    def exitAtray(self, ctx:lensParser.AtrayContext):
        pass


    # Enter a parse tree produced by lensParser#arraysdec.
    def enterArraysdec(self, ctx:lensParser.ArraysdecContext):
        pass

    # Exit a parse tree produced by lensParser#arraysdec.
    def exitArraysdec(self, ctx:lensParser.ArraysdecContext):
        pass


    # Enter a parse tree produced by lensParser#letvar.
    def enterLetvar(self, ctx:lensParser.LetvarContext):
        pass

    # Exit a parse tree produced by lensParser#letvar.
    def exitLetvar(self, ctx:lensParser.LetvarContext):
        pass


    # Enter a parse tree produced by lensParser#arraysolto.
    def enterArraysolto(self, ctx:lensParser.ArraysoltoContext):
        pass

    # Exit a parse tree produced by lensParser#arraysolto.
    def exitArraysolto(self, ctx:lensParser.ArraysoltoContext):
        pass


    # Enter a parse tree produced by lensParser#setarray.
    def enterSetarray(self, ctx:lensParser.SetarrayContext):
        pass

    # Exit a parse tree produced by lensParser#setarray.
    def exitSetarray(self, ctx:lensParser.SetarrayContext):
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


    # Enter a parse tree produced by lensParser#objeto.
    def enterObjeto(self, ctx:lensParser.ObjetoContext):
        pass

    # Exit a parse tree produced by lensParser#objeto.
    def exitObjeto(self, ctx:lensParser.ObjetoContext):
        pass


    # Enter a parse tree produced by lensParser#decobj.
    def enterDecobj(self, ctx:lensParser.DecobjContext):
        pass

    # Exit a parse tree produced by lensParser#decobj.
    def exitDecobj(self, ctx:lensParser.DecobjContext):
        pass


    # Enter a parse tree produced by lensParser#atrobj.
    def enterAtrobj(self, ctx:lensParser.AtrobjContext):
        pass

    # Exit a parse tree produced by lensParser#atrobj.
    def exitAtrobj(self, ctx:lensParser.AtrobjContext):
        pass


    # Enter a parse tree produced by lensParser#obj.
    def enterObj(self, ctx:lensParser.ObjContext):
        pass

    # Exit a parse tree produced by lensParser#obj.
    def exitObj(self, ctx:lensParser.ObjContext):
        pass


    # Enter a parse tree produced by lensParser#membro.
    def enterMembro(self, ctx:lensParser.MembroContext):
        pass

    # Exit a parse tree produced by lensParser#membro.
    def exitMembro(self, ctx:lensParser.MembroContext):
        pass



del lensParser