# Generated from MiniGame.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .MiniGameParser import MiniGameParser
else:
    from MiniGameParser import MiniGameParser

# This class defines a complete generic visitor for a parse tree produced by MiniGameParser.

class MiniGameVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MiniGameParser#program.
    def visitProgram(self, ctx:MiniGameParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGameParser#instruccion.
    def visitInstruccion(self, ctx:MiniGameParser.InstruccionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGameParser#crearSprite.
    def visitCrearSprite(self, ctx:MiniGameParser.CrearSpriteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGameParser#eventoTecla.
    def visitEventoTecla(self, ctx:MiniGameParser.EventoTeclaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGameParser#accion.
    def visitAccion(self, ctx:MiniGameParser.AccionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGameParser#colision.
    def visitColision(self, ctx:MiniGameParser.ColisionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGameParser#mostrarTexto.
    def visitMostrarTexto(self, ctx:MiniGameParser.MostrarTextoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGameParser#detener.
    def visitDetener(self, ctx:MiniGameParser.DetenerContext):
        return self.visitChildren(ctx)



del MiniGameParser