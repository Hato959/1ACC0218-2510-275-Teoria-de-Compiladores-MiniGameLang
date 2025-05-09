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


    # Visit a parse tree produced by MiniGameParser#statement.
    def visitStatement(self, ctx:MiniGameParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGameParser#spriteDecl.
    def visitSpriteDecl(self, ctx:MiniGameParser.SpriteDeclContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGameParser#eventHandler.
    def visitEventHandler(self, ctx:MiniGameParser.EventHandlerContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGameParser#action.
    def visitAction(self, ctx:MiniGameParser.ActionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGameParser#collisionStmt.
    def visitCollisionStmt(self, ctx:MiniGameParser.CollisionStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGameParser#showStmt.
    def visitShowStmt(self, ctx:MiniGameParser.ShowStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MiniGameParser#stopStmt.
    def visitStopStmt(self, ctx:MiniGameParser.StopStmtContext):
        return self.visitChildren(ctx)



del MiniGameParser