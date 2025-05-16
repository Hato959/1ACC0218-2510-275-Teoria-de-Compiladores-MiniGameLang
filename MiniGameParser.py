# Generated from MiniGame.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,23,87,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,1,0,1,0,1,0,1,0,5,0,21,8,0,10,0,12,0,24,9,0,1,0,1,0,1,
        1,1,1,1,1,1,1,1,1,3,1,33,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,
        1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,
        1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,5,5,73,8,5,10,
        5,12,5,76,9,5,1,5,1,5,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,0,0,8,0,2,
        4,6,8,10,12,14,0,0,84,0,16,1,0,0,0,2,32,1,0,0,0,4,34,1,0,0,0,6,46,
        1,0,0,0,8,53,1,0,0,0,10,62,1,0,0,0,12,79,1,0,0,0,14,83,1,0,0,0,16,
        17,5,1,0,0,17,18,5,20,0,0,18,22,5,22,0,0,19,21,3,2,1,0,20,19,1,0,
        0,0,21,24,1,0,0,0,22,20,1,0,0,0,22,23,1,0,0,0,23,25,1,0,0,0,24,22,
        1,0,0,0,25,26,5,0,0,1,26,1,1,0,0,0,27,33,3,4,2,0,28,33,3,6,3,0,29,
        33,3,10,5,0,30,33,3,12,6,0,31,33,3,14,7,0,32,27,1,0,0,0,32,28,1,
        0,0,0,32,29,1,0,0,0,32,30,1,0,0,0,32,31,1,0,0,0,33,3,1,0,0,0,34,
        35,5,2,0,0,35,36,5,19,0,0,36,37,5,3,0,0,37,38,5,4,0,0,38,39,5,21,
        0,0,39,40,5,5,0,0,40,41,5,21,0,0,41,42,5,6,0,0,42,43,5,7,0,0,43,
        44,5,20,0,0,44,45,5,22,0,0,45,5,1,0,0,0,46,47,5,8,0,0,47,48,5,9,
        0,0,48,49,5,20,0,0,49,50,5,10,0,0,50,51,3,8,4,0,51,52,5,22,0,0,52,
        7,1,0,0,0,53,54,5,11,0,0,54,55,5,19,0,0,55,56,5,12,0,0,56,57,5,4,
        0,0,57,58,5,21,0,0,58,59,5,5,0,0,59,60,5,21,0,0,60,61,5,6,0,0,61,
        9,1,0,0,0,62,63,5,13,0,0,63,64,5,14,0,0,64,65,5,4,0,0,65,66,5,19,
        0,0,66,67,5,5,0,0,67,68,5,19,0,0,68,69,5,6,0,0,69,70,5,15,0,0,70,
        74,5,22,0,0,71,73,3,2,1,0,72,71,1,0,0,0,73,76,1,0,0,0,74,72,1,0,
        0,0,74,75,1,0,0,0,75,77,1,0,0,0,76,74,1,0,0,0,77,78,5,16,0,0,78,
        11,1,0,0,0,79,80,5,17,0,0,80,81,5,20,0,0,81,82,5,22,0,0,82,13,1,
        0,0,0,83,84,5,18,0,0,84,85,5,22,0,0,85,15,1,0,0,0,3,22,32,74
    ]

class MiniGameParser ( Parser ):

    grammarFileName = "MiniGame.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'juego'", "'sprite'", "'en'", "'('", 
                     "','", "')'", "'imagen'", "'al'", "'presionar'", "'hacer'", 
                     "'mover'", "'por'", "'si'", "'colisionan'", "'entonces'", 
                     "'fin'", "'mostrar'", "'detener'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "ID", "CADENA", 
                      "NUM", "NL", "ESPACIOS" ]

    RULE_program = 0
    RULE_instruccion = 1
    RULE_crearSprite = 2
    RULE_eventoTecla = 3
    RULE_accion = 4
    RULE_colision = 5
    RULE_mostrarTexto = 6
    RULE_detener = 7

    ruleNames =  [ "program", "instruccion", "crearSprite", "eventoTecla", 
                   "accion", "colision", "mostrarTexto", "detener" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    ID=19
    CADENA=20
    NUM=21
    NL=22
    ESPACIOS=23

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CADENA(self):
            return self.getToken(MiniGameParser.CADENA, 0)

        def NL(self):
            return self.getToken(MiniGameParser.NL, 0)

        def EOF(self):
            return self.getToken(MiniGameParser.EOF, 0)

        def instruccion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniGameParser.InstruccionContext)
            else:
                return self.getTypedRuleContext(MiniGameParser.InstruccionContext,i)


        def getRuleIndex(self):
            return MiniGameParser.RULE_program

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = MiniGameParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 16
            self.match(MiniGameParser.T__0)
            self.state = 17
            self.match(MiniGameParser.CADENA)
            self.state = 18
            self.match(MiniGameParser.NL)
            self.state = 22
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 401668) != 0):
                self.state = 19
                self.instruccion()
                self.state = 24
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 25
            self.match(MiniGameParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InstruccionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def crearSprite(self):
            return self.getTypedRuleContext(MiniGameParser.CrearSpriteContext,0)


        def eventoTecla(self):
            return self.getTypedRuleContext(MiniGameParser.EventoTeclaContext,0)


        def colision(self):
            return self.getTypedRuleContext(MiniGameParser.ColisionContext,0)


        def mostrarTexto(self):
            return self.getTypedRuleContext(MiniGameParser.MostrarTextoContext,0)


        def detener(self):
            return self.getTypedRuleContext(MiniGameParser.DetenerContext,0)


        def getRuleIndex(self):
            return MiniGameParser.RULE_instruccion

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInstruccion" ):
                return visitor.visitInstruccion(self)
            else:
                return visitor.visitChildren(self)




    def instruccion(self):

        localctx = MiniGameParser.InstruccionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_instruccion)
        try:
            self.state = 32
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [2]:
                self.enterOuterAlt(localctx, 1)
                self.state = 27
                self.crearSprite()
                pass
            elif token in [8]:
                self.enterOuterAlt(localctx, 2)
                self.state = 28
                self.eventoTecla()
                pass
            elif token in [13]:
                self.enterOuterAlt(localctx, 3)
                self.state = 29
                self.colision()
                pass
            elif token in [17]:
                self.enterOuterAlt(localctx, 4)
                self.state = 30
                self.mostrarTexto()
                pass
            elif token in [18]:
                self.enterOuterAlt(localctx, 5)
                self.state = 31
                self.detener()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CrearSpriteContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(MiniGameParser.ID, 0)

        def NUM(self, i:int=None):
            if i is None:
                return self.getTokens(MiniGameParser.NUM)
            else:
                return self.getToken(MiniGameParser.NUM, i)

        def CADENA(self):
            return self.getToken(MiniGameParser.CADENA, 0)

        def NL(self):
            return self.getToken(MiniGameParser.NL, 0)

        def getRuleIndex(self):
            return MiniGameParser.RULE_crearSprite

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCrearSprite" ):
                return visitor.visitCrearSprite(self)
            else:
                return visitor.visitChildren(self)




    def crearSprite(self):

        localctx = MiniGameParser.CrearSpriteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_crearSprite)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 34
            self.match(MiniGameParser.T__1)
            self.state = 35
            self.match(MiniGameParser.ID)
            self.state = 36
            self.match(MiniGameParser.T__2)
            self.state = 37
            self.match(MiniGameParser.T__3)
            self.state = 38
            self.match(MiniGameParser.NUM)
            self.state = 39
            self.match(MiniGameParser.T__4)
            self.state = 40
            self.match(MiniGameParser.NUM)
            self.state = 41
            self.match(MiniGameParser.T__5)
            self.state = 42
            self.match(MiniGameParser.T__6)
            self.state = 43
            self.match(MiniGameParser.CADENA)
            self.state = 44
            self.match(MiniGameParser.NL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EventoTeclaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CADENA(self):
            return self.getToken(MiniGameParser.CADENA, 0)

        def accion(self):
            return self.getTypedRuleContext(MiniGameParser.AccionContext,0)


        def NL(self):
            return self.getToken(MiniGameParser.NL, 0)

        def getRuleIndex(self):
            return MiniGameParser.RULE_eventoTecla

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEventoTecla" ):
                return visitor.visitEventoTecla(self)
            else:
                return visitor.visitChildren(self)




    def eventoTecla(self):

        localctx = MiniGameParser.EventoTeclaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_eventoTecla)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 46
            self.match(MiniGameParser.T__7)
            self.state = 47
            self.match(MiniGameParser.T__8)
            self.state = 48
            self.match(MiniGameParser.CADENA)
            self.state = 49
            self.match(MiniGameParser.T__9)
            self.state = 50
            self.accion()
            self.state = 51
            self.match(MiniGameParser.NL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AccionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(MiniGameParser.ID, 0)

        def NUM(self, i:int=None):
            if i is None:
                return self.getTokens(MiniGameParser.NUM)
            else:
                return self.getToken(MiniGameParser.NUM, i)

        def getRuleIndex(self):
            return MiniGameParser.RULE_accion

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAccion" ):
                return visitor.visitAccion(self)
            else:
                return visitor.visitChildren(self)




    def accion(self):

        localctx = MiniGameParser.AccionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_accion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 53
            self.match(MiniGameParser.T__10)
            self.state = 54
            self.match(MiniGameParser.ID)
            self.state = 55
            self.match(MiniGameParser.T__11)
            self.state = 56
            self.match(MiniGameParser.T__3)
            self.state = 57
            self.match(MiniGameParser.NUM)
            self.state = 58
            self.match(MiniGameParser.T__4)
            self.state = 59
            self.match(MiniGameParser.NUM)
            self.state = 60
            self.match(MiniGameParser.T__5)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ColisionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(MiniGameParser.ID)
            else:
                return self.getToken(MiniGameParser.ID, i)

        def NL(self):
            return self.getToken(MiniGameParser.NL, 0)

        def instruccion(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MiniGameParser.InstruccionContext)
            else:
                return self.getTypedRuleContext(MiniGameParser.InstruccionContext,i)


        def getRuleIndex(self):
            return MiniGameParser.RULE_colision

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitColision" ):
                return visitor.visitColision(self)
            else:
                return visitor.visitChildren(self)




    def colision(self):

        localctx = MiniGameParser.ColisionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_colision)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 62
            self.match(MiniGameParser.T__12)
            self.state = 63
            self.match(MiniGameParser.T__13)
            self.state = 64
            self.match(MiniGameParser.T__3)
            self.state = 65
            self.match(MiniGameParser.ID)
            self.state = 66
            self.match(MiniGameParser.T__4)
            self.state = 67
            self.match(MiniGameParser.ID)
            self.state = 68
            self.match(MiniGameParser.T__5)
            self.state = 69
            self.match(MiniGameParser.T__14)
            self.state = 70
            self.match(MiniGameParser.NL)
            self.state = 74
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 401668) != 0):
                self.state = 71
                self.instruccion()
                self.state = 76
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 77
            self.match(MiniGameParser.T__15)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class MostrarTextoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CADENA(self):
            return self.getToken(MiniGameParser.CADENA, 0)

        def NL(self):
            return self.getToken(MiniGameParser.NL, 0)

        def getRuleIndex(self):
            return MiniGameParser.RULE_mostrarTexto

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMostrarTexto" ):
                return visitor.visitMostrarTexto(self)
            else:
                return visitor.visitChildren(self)




    def mostrarTexto(self):

        localctx = MiniGameParser.MostrarTextoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_mostrarTexto)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 79
            self.match(MiniGameParser.T__16)
            self.state = 80
            self.match(MiniGameParser.CADENA)
            self.state = 81
            self.match(MiniGameParser.NL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DetenerContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NL(self):
            return self.getToken(MiniGameParser.NL, 0)

        def getRuleIndex(self):
            return MiniGameParser.RULE_detener

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDetener" ):
                return visitor.visitDetener(self)
            else:
                return visitor.visitChildren(self)




    def detener(self):

        localctx = MiniGameParser.DetenerContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_detener)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 83
            self.match(MiniGameParser.T__17)
            self.state = 84
            self.match(MiniGameParser.NL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





