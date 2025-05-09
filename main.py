# main.py
from antlr4 import *
from antlr4 import InputStream
from MiniGameLexer import MiniGameLexer
from MiniGameParser import MiniGameParser
from MiniGameInterpreter import MiniGameInterpreter

def main():
    with open("test.mg", "r", encoding="utf-8") as f:
        input_stream = InputStream(f.read())

    lexer = MiniGameLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = MiniGameParser(stream)
    tree = parser.program()

    interpreter = MiniGameInterpreter()
    interpreter.visit(tree)

if __name__ == "__main__":
    main()
