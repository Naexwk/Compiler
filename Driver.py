import sys
from antlr4 import *
from antlr4.tree.Trees import Trees
from littleDuckLexer import littleDuckLexer
from littleDuckParser import littleDuckParser

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = littleDuckLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = littleDuckParser(stream)
    tree = parser.programa()
    #print(tree.toStringTree(recog=parser))

if __name__ == '__main__':
    main(sys.argv)