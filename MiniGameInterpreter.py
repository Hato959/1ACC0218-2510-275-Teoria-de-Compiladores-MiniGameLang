from antlr4 import *
from MiniGameLexer import MiniGameLexer
from MiniGameParser import MiniGameParser
from MiniGameVisitor import MiniGameVisitor

class MiniGameInterpreter(MiniGameVisitor):
    def __init__(self):
        self.sprites = {}
        self.running = True

    def visitProgram(self, ctx: MiniGameParser.ProgramContext):
        game_name = ctx.CADENA().getText().strip('"')
        print(f"🎮 Iniciando juego: {game_name}")
        for instr in ctx.instruccion():
            self.visit(instr)
        return None

    def visitCrearSprite(self, ctx: MiniGameParser.CrearSpriteContext):
        sprite_name = ctx.ID().getText()
        x = int(ctx.NUM(0).getText())
        y = int(ctx.NUM(1).getText())
        image = ctx.CADENA().getText().strip('"')
        self.sprites[sprite_name] = {"x": x, "y": y, "image": image}
        print(f"🧱 Sprite '{sprite_name}' creado en ({x}, {y}) con imagen '{image}'")
        return None

    def visitEventoTecla(self, ctx: MiniGameParser.EventoTeclaContext):
        key = ctx.CADENA().getText().strip('"')
        print(f"🕹️ Evento: al presionar '{key}' → ejecutando acción")

        action_ctx = ctx.accion()
        if action_ctx:
            self.visit(action_ctx)
        return None

    def visitAccion(self, ctx: MiniGameParser.AccionContext):
        sprite_name = ctx.ID().getText()
        dx = int(ctx.NUM(0).getText())
        dy = int(ctx.NUM(1).getText())

        if sprite_name in self.sprites:
            sprite = self.sprites[sprite_name]
            sprite["x"] += dx
            sprite["y"] += dy
            print(f"➡️  '{sprite_name}' se movió a ({sprite['x']}, {sprite['y']})")
        else:
            print(f"⚠️ El sprite '{sprite_name}' no existe.")
        return None

    def visitColision(self, ctx: MiniGameParser.ColisionContext):
        sprite1_name = ctx.ID(0).getText()
        sprite2_name = ctx.ID(1).getText()

        if sprite1_name in self.sprites and sprite2_name in self.sprites:
            s1 = self.sprites[sprite1_name]
            s2 = self.sprites[sprite2_name]
            if s1["x"] == s2["x"] and s1["y"] == s2["y"]:
                print(f"❌ Colisión entre '{sprite1_name}' y '{sprite2_name}'!")

                for instr in ctx.instruccion():
                    self.visit(instr)
            else:
                print(f"✅ No hay colisión entre '{sprite1_name}' y '{sprite2_name}'")
        else:
            print(f"⚠️ Uno de los sprites no existe para verificar colisión.")
        return None

    def visitMostrarTexto(self, ctx: MiniGameParser.MostrarTextoContext):
        texto = ctx.CADENA().getText().strip('"')
        print(f"💬 Mostrar: {texto}")
        return None

    def visitDetener(self, ctx: MiniGameParser.DetenerContext):
        print("⏹️ Juego detenido.")
        self.running = False
        return None