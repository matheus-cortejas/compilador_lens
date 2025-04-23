# Generated from lens.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .lensParser import lensParser
else:
    from lensParser import lensParser

# This class defines a complete generic visitor for a parse tree produced by lensParser.

class lensVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by lensParser#lens.
    def visitLens(self, ctx:lensParser.LensContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#comando.
    def visitComando(self, ctx:lensParser.ComandoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#imprime.
    def visitImprime(self, ctx:lensParser.ImprimeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#concat.
    def visitConcat(self, ctx:lensParser.ConcatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#ler.
    def visitLer(self, ctx:lensParser.LerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#condicao.
    def visitCondicao(self, ctx:lensParser.CondicaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#ifcond.
    def visitIfcond(self, ctx:lensParser.IfcondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#elifcond.
    def visitElifcond(self, ctx:lensParser.ElifcondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#elcond.
    def visitElcond(self, ctx:lensParser.ElcondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#lacofor.
    def visitLacofor(self, ctx:lensParser.LacoforContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#lacowhile.
    def visitLacowhile(self, ctx:lensParser.LacowhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#arit.
    def visitArit(self, ctx:lensParser.AritContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#aritp.
    def visitAritp(self, ctx:lensParser.AritpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#oparit.
    def visitOparit(self, ctx:lensParser.OparitContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#opalogi.
    def visitOpalogi(self, ctx:lensParser.OpalogiContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#comparacao.
    def visitComparacao(self, ctx:lensParser.ComparacaoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#expcomp.
    def visitExpcomp(self, ctx:lensParser.ExpcompContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#explogi.
    def visitExplogi(self, ctx:lensParser.ExplogiContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#expTemplate.
    def visitExpTemplate(self, ctx:lensParser.ExpTemplateContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#exp.
    def visitExp(self, ctx:lensParser.ExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#expcond.
    def visitExpcond(self, ctx:lensParser.ExpcondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#dec.
    def visitDec(self, ctx:lensParser.DecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#class.
    def visitClass(self, ctx:lensParser.ClassContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#letvar.
    def visitLetvar(self, ctx:lensParser.LetvarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#atrsolta.
    def visitAtrsolta(self, ctx:lensParser.AtrsoltaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#atr.
    def visitAtr(self, ctx:lensParser.AtrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#rolav.
    def visitRolav(self, ctx:lensParser.RolavContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by lensParser#valor.
    def visitValor(self, ctx:lensParser.ValorContext):
        return self.visitChildren(ctx)



del lensParser