from MiniGameVisitor import MiniGameVisitor
from MiniGameParser import MiniGameParser

class MiniGameInterpreter(MiniGameVisitor):
    def __init__(self):
        self.sprites = {}  # Almacenar los sprites creados
        self.running = True  # Estado del juego

    def visitProgram(self, ctx: MiniGameParser.ProgramContext):
        # Obtener el nombre del juego (el primer STRING en la regla program)
        game_name = ctx.STRING().getText().strip('"')
        print(f"🎮 Iniciando juego: {game_name}")
        return self.visitChildren(ctx)

    def visitSpriteDecl(self, ctx: MiniGameParser.SpriteDeclContext):
        # Crea un sprite a partir de su declaración
        sprite_name = ctx.ID().getText()
        x = int(ctx.INT(0).getText())
        y = int(ctx.INT(1).getText())
        image = ctx.STRING().getText().strip('"')
        self.sprites[sprite_name] = {"x": x, "y": y, "image": image}
        print(f"🧱 Sprite '{sprite_name}' creado en ({x}, {y}) con imagen '{image}'")
        return self.visitChildren(ctx)

    def visitEventHandler(self, ctx: MiniGameParser.EventHandlerContext):
        # Obtener la tecla que activará el evento
        key = ctx.STRING().getText().strip('"')  # El nombre de la tecla entre comillas
        action = ctx.action()  # Obtenemos la acción

        # Imprimir el evento de tecla
        print(f"🕹️ Evento de tecla '{key}' → ejecutando acción")

        # Comprobar que la acción es 'move' y extraer los valores correspondientes
        if isinstance(action, MiniGameParser.ActionContext):
            sprite_name = action.ID().getText()  # Nombre del sprite
            dx = int(action.INT(0).getText())  # Movimiento en el eje X
            dy = int(action.INT(1).getText())  # Movimiento en el eje Y

            # Asegurarse de que el sprite existe
            if sprite_name in self.sprites:
                sprite = self.sprites[sprite_name]
                sprite["x"] += dx  # Mover el sprite
                sprite["y"] += dy
                print(f"➡️  '{sprite_name}' se movió a ({sprite['x']}, {sprite['y']})")
            else:
                print(f"⚠️ El sprite '{sprite_name}' no existe.")
        
        return self.visitChildren(ctx)

    def visitCollisionStmt(self, ctx: MiniGameParser.CollisionStmtContext):
        # Comprobación de colisiones entre dos sprites
        sprite1_name = ctx.ID(0).getText()  # Primer ID (sprite 1)
        sprite2_name = ctx.ID(1).getText()  # Segundo ID (sprite 2)

        if sprite1_name in self.sprites and sprite2_name in self.sprites:
            sprite1 = self.sprites[sprite1_name]
            sprite2 = self.sprites[sprite2_name]

            # Verifica si hay colisión (simulando que las coordenadas son iguales para colisión)
            if (sprite1["x"] == sprite2["x"] and sprite1["y"] == sprite2["y"]):
                print(f"❌ Colisión entre '{sprite1_name}' y '{sprite2_name}'!")
            else:
                print(f"✅ No hay colisión entre '{sprite1_name}' y '{sprite2_name}'")

        return self.visitChildren(ctx)

