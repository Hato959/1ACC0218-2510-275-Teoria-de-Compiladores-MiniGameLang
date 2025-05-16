# main.py
from antlr4 import *
from antlr4 import InputStream
from antlr4.tree.Trees import Trees
from MiniGameLexer import MiniGameLexer
from MiniGameParser import MiniGameParser
from MiniGameInterpreter import MiniGameInterpreter

def main():
    # Leer el archivo fuente del juego
    with open("test.mg", "r", encoding="utf-8") as f:
        input_code = f.read()

    input_stream = InputStream(input_code)

    lexer = MiniGameLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = MiniGameParser(token_stream)

    tree = parser.program()

    interpreter = MiniGameInterpreter()
    interpreter.visit(tree)

    dot_str = Trees.toStringTree(tree, None, parser)
    print(dot_str)


if __name__ == "__main__":
    main()
