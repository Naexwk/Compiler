# Generated from littleDuck.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

 
from Middleman import *

def serializedATN():
    return [
        4,1,35,338,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,
        2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,
        7,33,2,34,7,34,2,35,7,35,2,36,7,36,2,37,7,37,2,38,7,38,1,0,1,0,1,
        0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,3,1,93,8,1,1,2,1,2,
        1,2,1,2,3,2,99,8,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,
        4,1,4,1,4,1,4,3,4,116,8,4,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,
        5,3,5,128,8,5,1,6,1,6,1,6,1,6,3,6,134,8,6,1,7,1,7,1,7,1,7,1,8,1,
        8,1,8,1,8,3,8,144,8,8,1,9,1,9,1,9,1,9,1,9,3,9,151,8,9,1,10,1,10,
        1,10,1,10,1,10,1,10,1,10,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,
        1,11,1,11,1,12,1,12,1,12,1,12,3,12,174,8,12,1,13,1,13,1,13,1,13,
        1,13,1,13,1,13,1,13,1,13,1,13,1,14,1,14,1,14,1,14,1,14,1,14,1,15,
        1,15,1,15,1,15,3,15,196,8,15,1,16,1,16,1,16,3,16,201,8,16,1,17,1,
        17,1,17,1,17,1,17,1,17,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,18,3,
        18,217,8,18,1,19,1,19,1,19,3,19,222,8,19,1,20,1,20,1,20,1,20,1,20,
        1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,21,1,21,1,21,1,21,1,21,1,21,
        1,21,3,21,243,8,21,1,22,1,22,1,22,3,22,248,8,22,1,23,1,23,1,23,1,
        23,1,23,1,23,1,24,1,24,3,24,258,8,24,1,25,1,25,1,25,1,25,3,25,264,
        8,25,1,26,1,26,1,26,1,26,1,26,1,27,1,27,1,27,1,27,1,27,1,27,1,27,
        1,27,1,27,1,27,3,27,281,8,27,1,28,1,28,1,28,1,28,1,29,1,29,1,29,
        1,29,3,29,291,8,29,1,30,1,30,1,30,1,30,3,30,297,8,30,1,31,1,31,1,
        31,1,32,1,32,1,32,1,32,3,32,306,8,32,1,33,1,33,1,33,1,33,3,33,312,
        8,33,1,34,1,34,1,35,1,35,1,35,1,35,1,35,1,35,1,35,1,35,1,35,3,35,
        325,8,35,1,36,1,36,3,36,329,8,36,1,37,1,37,1,38,1,38,1,38,3,38,336,
        8,38,1,38,0,0,39,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,
        36,38,40,42,44,46,48,50,52,54,56,58,60,62,64,66,68,70,72,74,76,0,
        1,1,0,26,27,327,0,78,1,0,0,0,2,92,1,0,0,0,4,98,1,0,0,0,6,100,1,0,
        0,0,8,115,1,0,0,0,10,127,1,0,0,0,12,133,1,0,0,0,14,135,1,0,0,0,16,
        143,1,0,0,0,18,150,1,0,0,0,20,152,1,0,0,0,22,159,1,0,0,0,24,173,
        1,0,0,0,26,175,1,0,0,0,28,185,1,0,0,0,30,195,1,0,0,0,32,200,1,0,
        0,0,34,202,1,0,0,0,36,216,1,0,0,0,38,221,1,0,0,0,40,223,1,0,0,0,
        42,242,1,0,0,0,44,247,1,0,0,0,46,249,1,0,0,0,48,257,1,0,0,0,50,263,
        1,0,0,0,52,265,1,0,0,0,54,280,1,0,0,0,56,282,1,0,0,0,58,290,1,0,
        0,0,60,296,1,0,0,0,62,298,1,0,0,0,64,305,1,0,0,0,66,311,1,0,0,0,
        68,313,1,0,0,0,70,324,1,0,0,0,72,328,1,0,0,0,74,330,1,0,0,0,76,335,
        1,0,0,0,78,79,5,1,0,0,79,80,5,35,0,0,80,81,6,0,-1,0,81,82,5,2,0,
        0,82,83,3,2,1,0,83,84,3,4,2,0,84,85,5,3,0,0,85,86,3,14,7,0,86,87,
        5,4,0,0,87,88,6,0,-1,0,88,1,1,0,0,0,89,90,6,1,-1,0,90,93,3,6,3,0,
        91,93,1,0,0,0,92,89,1,0,0,0,92,91,1,0,0,0,93,3,1,0,0,0,94,95,3,40,
        20,0,95,96,3,4,2,0,96,99,1,0,0,0,97,99,1,0,0,0,98,94,1,0,0,0,98,
        97,1,0,0,0,99,5,1,0,0,0,100,101,5,5,0,0,101,102,5,35,0,0,102,103,
        6,3,-1,0,103,104,3,8,4,0,104,105,5,6,0,0,105,106,3,12,6,0,106,107,
        5,2,0,0,107,108,6,3,-1,0,108,109,3,10,5,0,109,7,1,0,0,0,110,111,
        5,7,0,0,111,112,5,35,0,0,112,113,6,4,-1,0,113,116,3,8,4,0,114,116,
        1,0,0,0,115,110,1,0,0,0,115,114,1,0,0,0,116,9,1,0,0,0,117,118,5,
        35,0,0,118,119,6,5,-1,0,119,120,3,8,4,0,120,121,5,6,0,0,121,122,
        3,12,6,0,122,123,5,2,0,0,123,124,6,5,-1,0,124,125,3,10,5,0,125,128,
        1,0,0,0,126,128,1,0,0,0,127,117,1,0,0,0,127,126,1,0,0,0,128,11,1,
        0,0,0,129,130,5,8,0,0,130,134,6,6,-1,0,131,132,5,9,0,0,132,134,6,
        6,-1,0,133,129,1,0,0,0,133,131,1,0,0,0,134,13,1,0,0,0,135,136,5,
        10,0,0,136,137,3,16,8,0,137,138,5,11,0,0,138,15,1,0,0,0,139,140,
        3,18,9,0,140,141,3,16,8,0,141,144,1,0,0,0,142,144,1,0,0,0,143,139,
        1,0,0,0,143,142,1,0,0,0,144,17,1,0,0,0,145,151,3,20,10,0,146,151,
        3,22,11,0,147,151,3,26,13,0,148,151,3,28,14,0,149,151,3,34,17,0,
        150,145,1,0,0,0,150,146,1,0,0,0,150,147,1,0,0,0,150,148,1,0,0,0,
        150,149,1,0,0,0,151,19,1,0,0,0,152,153,5,35,0,0,153,154,6,10,-1,
        0,154,155,5,12,0,0,155,156,3,52,26,0,156,157,6,10,-1,0,157,158,5,
        2,0,0,158,21,1,0,0,0,159,160,5,13,0,0,160,161,5,14,0,0,161,162,3,
        52,26,0,162,163,5,15,0,0,163,164,6,11,-1,0,164,165,3,14,7,0,165,
        166,3,24,12,0,166,167,6,11,-1,0,167,168,5,2,0,0,168,23,1,0,0,0,169,
        170,5,16,0,0,170,171,6,12,-1,0,171,174,3,14,7,0,172,174,1,0,0,0,
        173,169,1,0,0,0,173,172,1,0,0,0,174,25,1,0,0,0,175,176,5,17,0,0,
        176,177,6,13,-1,0,177,178,3,14,7,0,178,179,5,18,0,0,179,180,5,14,
        0,0,180,181,3,52,26,0,181,182,5,15,0,0,182,183,6,13,-1,0,183,184,
        5,2,0,0,184,27,1,0,0,0,185,186,5,35,0,0,186,187,5,14,0,0,187,188,
        3,30,15,0,188,189,5,15,0,0,189,190,5,2,0,0,190,29,1,0,0,0,191,192,
        3,52,26,0,192,193,3,32,16,0,193,196,1,0,0,0,194,196,1,0,0,0,195,
        191,1,0,0,0,195,194,1,0,0,0,196,31,1,0,0,0,197,198,5,7,0,0,198,201,
        3,30,15,0,199,201,1,0,0,0,200,197,1,0,0,0,200,199,1,0,0,0,201,33,
        1,0,0,0,202,203,5,19,0,0,203,204,5,14,0,0,204,205,3,36,18,0,205,
        206,5,15,0,0,206,207,5,2,0,0,207,35,1,0,0,0,208,209,6,18,-1,0,209,
        210,3,52,26,0,210,211,6,18,-1,0,211,212,3,38,19,0,212,217,1,0,0,
        0,213,214,5,34,0,0,214,215,6,18,-1,0,215,217,3,38,19,0,216,208,1,
        0,0,0,216,213,1,0,0,0,217,37,1,0,0,0,218,219,5,7,0,0,219,222,3,36,
        18,0,220,222,1,0,0,0,221,218,1,0,0,0,221,220,1,0,0,0,222,39,1,0,
        0,0,223,224,5,20,0,0,224,225,5,35,0,0,225,226,6,20,-1,0,226,227,
        5,14,0,0,227,228,3,42,21,0,228,229,5,15,0,0,229,230,5,21,0,0,230,
        231,3,48,24,0,231,232,3,14,7,0,232,233,5,22,0,0,233,234,5,2,0,0,
        234,41,1,0,0,0,235,236,5,35,0,0,236,237,6,21,-1,0,237,238,5,6,0,
        0,238,239,3,12,6,0,239,240,3,44,22,0,240,243,1,0,0,0,241,243,1,0,
        0,0,242,235,1,0,0,0,242,241,1,0,0,0,243,43,1,0,0,0,244,245,5,7,0,
        0,245,248,3,46,23,0,246,248,1,0,0,0,247,244,1,0,0,0,247,246,1,0,
        0,0,248,45,1,0,0,0,249,250,5,35,0,0,250,251,6,23,-1,0,251,252,5,
        6,0,0,252,253,3,12,6,0,253,254,3,44,22,0,254,47,1,0,0,0,255,258,
        3,6,3,0,256,258,1,0,0,0,257,255,1,0,0,0,257,256,1,0,0,0,258,49,1,
        0,0,0,259,260,5,32,0,0,260,264,6,25,-1,0,261,262,5,33,0,0,262,264,
        6,25,-1,0,263,259,1,0,0,0,263,261,1,0,0,0,264,51,1,0,0,0,265,266,
        3,56,28,0,266,267,6,26,-1,0,267,268,3,54,27,0,268,269,6,26,-1,0,
        269,53,1,0,0,0,270,271,5,23,0,0,271,272,6,27,-1,0,272,281,3,56,28,
        0,273,274,5,24,0,0,274,275,6,27,-1,0,275,281,3,56,28,0,276,277,5,
        25,0,0,277,278,6,27,-1,0,278,281,3,56,28,0,279,281,1,0,0,0,280,270,
        1,0,0,0,280,273,1,0,0,0,280,276,1,0,0,0,280,279,1,0,0,0,281,55,1,
        0,0,0,282,283,3,62,31,0,283,284,6,28,-1,0,284,285,3,58,29,0,285,
        57,1,0,0,0,286,287,3,60,30,0,287,288,3,56,28,0,288,291,1,0,0,0,289,
        291,1,0,0,0,290,286,1,0,0,0,290,289,1,0,0,0,291,59,1,0,0,0,292,293,
        5,26,0,0,293,297,6,30,-1,0,294,295,5,27,0,0,295,297,6,30,-1,0,296,
        292,1,0,0,0,296,294,1,0,0,0,297,61,1,0,0,0,298,299,3,68,34,0,299,
        300,3,64,32,0,300,63,1,0,0,0,301,302,3,66,33,0,302,303,3,62,31,0,
        303,306,1,0,0,0,304,306,1,0,0,0,305,301,1,0,0,0,305,304,1,0,0,0,
        306,65,1,0,0,0,307,308,5,28,0,0,308,312,6,33,-1,0,309,310,5,29,0,
        0,310,312,6,33,-1,0,311,307,1,0,0,0,311,309,1,0,0,0,312,67,1,0,0,
        0,313,314,3,70,35,0,314,69,1,0,0,0,315,316,5,14,0,0,316,317,6,35,
        -1,0,317,318,3,52,26,0,318,319,5,15,0,0,319,320,6,35,-1,0,320,325,
        1,0,0,0,321,322,3,72,36,0,322,323,3,76,38,0,323,325,1,0,0,0,324,
        315,1,0,0,0,324,321,1,0,0,0,325,71,1,0,0,0,326,329,3,74,37,0,327,
        329,1,0,0,0,328,326,1,0,0,0,328,327,1,0,0,0,329,73,1,0,0,0,330,331,
        7,0,0,0,331,75,1,0,0,0,332,333,5,35,0,0,333,336,6,38,-1,0,334,336,
        3,50,25,0,335,332,1,0,0,0,335,334,1,0,0,0,336,77,1,0,0,0,24,92,98,
        115,127,133,143,150,173,195,200,216,221,242,247,257,263,280,290,
        296,305,311,324,328,335
    ]

class littleDuckParser ( Parser ):

    grammarFileName = "littleDuck.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'program'", "';'", "'main'", "'end'", 
                     "'var'", "':'", "','", "'int'", "'float'", "'{'", "'}'", 
                     "'='", "'if'", "'('", "')'", "'else'", "'do'", "'while'", 
                     "'print'", "'void'", "'['", "']'", "'>'", "'<'", "'!='", 
                     "'+'", "'-'", "'*'", "'/'", "<INVALID>", "' '" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "NEWLINE", "WHITESPACE", 
                      "CTE_INT", "CTE_FLOAT", "CTE_STRING", "ID" ]

    RULE_programa = 0
    RULE_opc_vars = 1
    RULE_optional_funcs = 2
    RULE_vars = 3
    RULE_mas_vars = 4
    RULE_mas_dec_vars = 5
    RULE_type = 6
    RULE_body = 7
    RULE_statement = 8
    RULE_options_statement = 9
    RULE_assign = 10
    RULE_condition = 11
    RULE_else = 12
    RULE_cycle = 13
    RULE_f_call = 14
    RULE_opc_f_call = 15
    RULE_mas_f_call = 16
    RULE_print = 17
    RULE_opc_print = 18
    RULE_mas_print = 19
    RULE_funcs = 20
    RULE_opc_funcs = 21
    RULE_mas_opc_funcs = 22
    RULE_next_opc_funcs = 23
    RULE_vars_funcs = 24
    RULE_cte = 25
    RULE_expresion = 26
    RULE_opc_expresion = 27
    RULE_exp = 28
    RULE_mas_exp = 29
    RULE_exp_signo = 30
    RULE_termino = 31
    RULE_mas_termino = 32
    RULE_signo_factor = 33
    RULE_factor = 34
    RULE_opc_factor = 35
    RULE_opc_signo = 36
    RULE_signo = 37
    RULE_opc_factor_prime = 38

    ruleNames =  [ "programa", "opc_vars", "optional_funcs", "vars", "mas_vars", 
                   "mas_dec_vars", "type", "body", "statement", "options_statement", 
                   "assign", "condition", "else", "cycle", "f_call", "opc_f_call", 
                   "mas_f_call", "print", "opc_print", "mas_print", "funcs", 
                   "opc_funcs", "mas_opc_funcs", "next_opc_funcs", "vars_funcs", 
                   "cte", "expresion", "opc_expresion", "exp", "mas_exp", 
                   "exp_signo", "termino", "mas_termino", "signo_factor", 
                   "factor", "opc_factor", "opc_signo", "signo", "opc_factor_prime" ]

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
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    T__23=24
    T__24=25
    T__25=26
    T__26=27
    T__27=28
    T__28=29
    NEWLINE=30
    WHITESPACE=31
    CTE_INT=32
    CTE_FLOAT=33
    CTE_STRING=34
    ID=35

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramaContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(littleDuckParser.ID, 0)

        def opc_vars(self):
            return self.getTypedRuleContext(littleDuckParser.Opc_varsContext,0)


        def optional_funcs(self):
            return self.getTypedRuleContext(littleDuckParser.Optional_funcsContext,0)


        def body(self):
            return self.getTypedRuleContext(littleDuckParser.BodyContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_programa

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrograma" ):
                listener.enterPrograma(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrograma" ):
                listener.exitPrograma(self)




    def programa(self):

        localctx = littleDuckParser.ProgramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_programa)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.match(littleDuckParser.T__0)
            self.state = 79
            localctx._ID = self.match(littleDuckParser.ID)

            program.variableTable["owner"] = (None if localctx._ID is None else localctx._ID.text)

            self.state = 81
            self.match(littleDuckParser.T__1)
            self.state = 82
            self.opc_vars()
            self.state = 83
            self.optional_funcs()
            self.state = 84
            self.match(littleDuckParser.T__2)
            self.state = 85
            self.body()
            self.state = 86
            self.match(littleDuckParser.T__3)

            program.insertQuad('end', None, None, None)
            print(program.variableTable)
            print(program.quadruples)
            print(program.stack_operands)
            print(program.stack_operator)
            print(program.stack_jumps)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Opc_varsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def vars_(self):
            return self.getTypedRuleContext(littleDuckParser.VarsContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_opc_vars

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpc_vars" ):
                listener.enterOpc_vars(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpc_vars" ):
                listener.exitOpc_vars(self)




    def opc_vars(self):

        localctx = littleDuckParser.Opc_varsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_opc_vars)
        try:
            self.state = 92
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [5]:
                self.enterOuterAlt(localctx, 1)

                program.currentLevel = "global"

                self.state = 90
                self.vars_()
                pass
            elif token in [3, 20]:
                self.enterOuterAlt(localctx, 2)

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


    class Optional_funcsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def funcs(self):
            return self.getTypedRuleContext(littleDuckParser.FuncsContext,0)


        def optional_funcs(self):
            return self.getTypedRuleContext(littleDuckParser.Optional_funcsContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_optional_funcs

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOptional_funcs" ):
                listener.enterOptional_funcs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOptional_funcs" ):
                listener.exitOptional_funcs(self)




    def optional_funcs(self):

        localctx = littleDuckParser.Optional_funcsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_optional_funcs)
        try:
            self.state = 98
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [20]:
                self.enterOuterAlt(localctx, 1)
                self.state = 94
                self.funcs()
                self.state = 95
                self.optional_funcs()
                pass
            elif token in [3]:
                self.enterOuterAlt(localctx, 2)

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


    class VarsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(littleDuckParser.ID, 0)

        def mas_vars(self):
            return self.getTypedRuleContext(littleDuckParser.Mas_varsContext,0)


        def type_(self):
            return self.getTypedRuleContext(littleDuckParser.TypeContext,0)


        def mas_dec_vars(self):
            return self.getTypedRuleContext(littleDuckParser.Mas_dec_varsContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_vars

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVars" ):
                listener.enterVars(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVars" ):
                listener.exitVars(self)




    def vars_(self):

        localctx = littleDuckParser.VarsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_vars)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 100
            self.match(littleDuckParser.T__4)
            self.state = 101
            localctx._ID = self.match(littleDuckParser.ID)

            program.declareNewVariable((None if localctx._ID is None else localctx._ID.text))

            self.state = 103
            self.mas_vars()
            self.state = 104
            self.match(littleDuckParser.T__5)
            self.state = 105
            self.type_()
            self.state = 106
            self.match(littleDuckParser.T__1)
            program.clearTempVarDeclaration()
            self.state = 108
            self.mas_dec_vars()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Mas_varsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(littleDuckParser.ID, 0)

        def mas_vars(self):
            return self.getTypedRuleContext(littleDuckParser.Mas_varsContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_mas_vars

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMas_vars" ):
                listener.enterMas_vars(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMas_vars" ):
                listener.exitMas_vars(self)




    def mas_vars(self):

        localctx = littleDuckParser.Mas_varsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_mas_vars)
        try:
            self.state = 115
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                self.enterOuterAlt(localctx, 1)
                self.state = 110
                self.match(littleDuckParser.T__6)
                self.state = 111
                localctx._ID = self.match(littleDuckParser.ID)

                program.declareNewVariable((None if localctx._ID is None else localctx._ID.text))

                self.state = 113
                self.mas_vars()
                pass
            elif token in [6]:
                self.enterOuterAlt(localctx, 2)

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


    class Mas_dec_varsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(littleDuckParser.ID, 0)

        def mas_vars(self):
            return self.getTypedRuleContext(littleDuckParser.Mas_varsContext,0)


        def type_(self):
            return self.getTypedRuleContext(littleDuckParser.TypeContext,0)


        def mas_dec_vars(self):
            return self.getTypedRuleContext(littleDuckParser.Mas_dec_varsContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_mas_dec_vars

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMas_dec_vars" ):
                listener.enterMas_dec_vars(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMas_dec_vars" ):
                listener.exitMas_dec_vars(self)




    def mas_dec_vars(self):

        localctx = littleDuckParser.Mas_dec_varsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_mas_dec_vars)
        try:
            self.state = 127
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [35]:
                self.enterOuterAlt(localctx, 1)
                self.state = 117
                localctx._ID = self.match(littleDuckParser.ID)

                program.declareNewVariable((None if localctx._ID is None else localctx._ID.text))

                self.state = 119
                self.mas_vars()
                self.state = 120
                self.match(littleDuckParser.T__5)
                self.state = 121
                self.type_()
                self.state = 122
                self.match(littleDuckParser.T__1)
                program.clearTempVarDeclaration()
                self.state = 124
                self.mas_dec_vars()
                pass
            elif token in [3, 10, 20]:
                self.enterOuterAlt(localctx, 2)

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


    class TypeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return littleDuckParser.RULE_type

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterType" ):
                listener.enterType(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitType" ):
                listener.exitType(self)




    def type_(self):

        localctx = littleDuckParser.TypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_type)
        try:
            self.state = 133
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [8]:
                self.enterOuterAlt(localctx, 1)
                self.state = 129
                self.match(littleDuckParser.T__7)
                program.currentType = "int"
                pass
            elif token in [9]:
                self.enterOuterAlt(localctx, 2)
                self.state = 131
                self.match(littleDuckParser.T__8)
                program.currentType = "float"
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


    class BodyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self):
            return self.getTypedRuleContext(littleDuckParser.StatementContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_body

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBody" ):
                listener.enterBody(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBody" ):
                listener.exitBody(self)




    def body(self):

        localctx = littleDuckParser.BodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_body)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 135
            self.match(littleDuckParser.T__9)
            self.state = 136
            self.statement()
            self.state = 137
            self.match(littleDuckParser.T__10)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def options_statement(self):
            return self.getTypedRuleContext(littleDuckParser.Options_statementContext,0)


        def statement(self):
            return self.getTypedRuleContext(littleDuckParser.StatementContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)




    def statement(self):

        localctx = littleDuckParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_statement)
        try:
            self.state = 143
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13, 17, 19, 35]:
                self.enterOuterAlt(localctx, 1)
                self.state = 139
                self.options_statement()
                self.state = 140
                self.statement()
                pass
            elif token in [11]:
                self.enterOuterAlt(localctx, 2)

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


    class Options_statementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assign(self):
            return self.getTypedRuleContext(littleDuckParser.AssignContext,0)


        def condition(self):
            return self.getTypedRuleContext(littleDuckParser.ConditionContext,0)


        def cycle(self):
            return self.getTypedRuleContext(littleDuckParser.CycleContext,0)


        def f_call(self):
            return self.getTypedRuleContext(littleDuckParser.F_callContext,0)


        def print_(self):
            return self.getTypedRuleContext(littleDuckParser.PrintContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_options_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOptions_statement" ):
                listener.enterOptions_statement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOptions_statement" ):
                listener.exitOptions_statement(self)




    def options_statement(self):

        localctx = littleDuckParser.Options_statementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_options_statement)
        try:
            self.state = 150
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 145
                self.assign()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 146
                self.condition()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 147
                self.cycle()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 148
                self.f_call()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 149
                self.print_()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(littleDuckParser.ID, 0)

        def expresion(self):
            return self.getTypedRuleContext(littleDuckParser.ExpresionContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_assign

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssign" ):
                listener.enterAssign(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssign" ):
                listener.exitAssign(self)




    def assign(self):

        localctx = littleDuckParser.AssignContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_assign)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 152
            localctx._ID = self.match(littleDuckParser.ID)

            program.variableDeclared((None if localctx._ID is None else localctx._ID.text))

            self.state = 154
            self.match(littleDuckParser.T__11)
            self.state = 155
            self.expresion()

            if program.variableDeclared((None if localctx._ID is None else localctx._ID.text)):
                program.assignInsertQuad('=', program.stack_operands.pop(), None, (None if localctx._ID is None else localctx._ID.text))
                program.clearTempVars()

            self.state = 157
            self.match(littleDuckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self):
            return self.getTypedRuleContext(littleDuckParser.ExpresionContext,0)


        def body(self):
            return self.getTypedRuleContext(littleDuckParser.BodyContext,0)


        def else_(self):
            return self.getTypedRuleContext(littleDuckParser.ElseContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondition" ):
                listener.enterCondition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondition" ):
                listener.exitCondition(self)




    def condition(self):

        localctx = littleDuckParser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_condition)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 159
            self.match(littleDuckParser.T__12)
            self.state = 160
            self.match(littleDuckParser.T__13)
            self.state = 161
            self.expresion()
            self.state = 162
            self.match(littleDuckParser.T__14)

            if program.checkBoolExpression():
                program.insertQuad('GOTOF', program.stack_operands.pop(), None, None)
                program.stack_jumps.append(len(program.quadruples) - 1)
            self.state = 164
            self.body()
            self.state = 165
            self.else_()

            program.editQuad(2, len(program.quadruples), program.stack_jumps.pop())

            self.state = 167
            self.match(littleDuckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElseContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def body(self):
            return self.getTypedRuleContext(littleDuckParser.BodyContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_else

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElse" ):
                listener.enterElse(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElse" ):
                listener.exitElse(self)




    def else_(self):

        localctx = littleDuckParser.ElseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_else)
        try:
            self.state = 173
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [16]:
                self.enterOuterAlt(localctx, 1)
                self.state = 169
                self.match(littleDuckParser.T__15)

                program.insertQuad('GOTO', None, None, None)
                program.editQuad(2, len(program.quadruples), program.stack_jumps.pop())
                program.stack_jumps.append(len(program.quadruples) - 1)

                self.state = 171
                self.body()
                pass
            elif token in [2]:
                self.enterOuterAlt(localctx, 2)

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


    class CycleContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def body(self):
            return self.getTypedRuleContext(littleDuckParser.BodyContext,0)


        def expresion(self):
            return self.getTypedRuleContext(littleDuckParser.ExpresionContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_cycle

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCycle" ):
                listener.enterCycle(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCycle" ):
                listener.exitCycle(self)




    def cycle(self):

        localctx = littleDuckParser.CycleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_cycle)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 175
            self.match(littleDuckParser.T__16)
            program.stack_jumps.append(len(program.quadruples))
            self.state = 177
            self.body()
            self.state = 178
            self.match(littleDuckParser.T__17)
            self.state = 179
            self.match(littleDuckParser.T__13)
            self.state = 180
            self.expresion()
            self.state = 181
            self.match(littleDuckParser.T__14)

            if program.checkBoolExpression():
                program.insertQuad('GOTOT', program.stack_operands.pop(), program.stack_jumps.pop(), None)

            self.state = 183
            self.match(littleDuckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class F_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(littleDuckParser.ID, 0)

        def opc_f_call(self):
            return self.getTypedRuleContext(littleDuckParser.Opc_f_callContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_f_call

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterF_call" ):
                listener.enterF_call(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitF_call" ):
                listener.exitF_call(self)




    def f_call(self):

        localctx = littleDuckParser.F_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_f_call)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 185
            self.match(littleDuckParser.ID)
            self.state = 186
            self.match(littleDuckParser.T__13)
            self.state = 187
            self.opc_f_call()
            self.state = 188
            self.match(littleDuckParser.T__14)
            self.state = 189
            self.match(littleDuckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Opc_f_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self):
            return self.getTypedRuleContext(littleDuckParser.ExpresionContext,0)


        def mas_f_call(self):
            return self.getTypedRuleContext(littleDuckParser.Mas_f_callContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_opc_f_call

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpc_f_call" ):
                listener.enterOpc_f_call(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpc_f_call" ):
                listener.exitOpc_f_call(self)




    def opc_f_call(self):

        localctx = littleDuckParser.Opc_f_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_opc_f_call)
        try:
            self.state = 195
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14, 26, 27, 32, 33, 35]:
                self.enterOuterAlt(localctx, 1)
                self.state = 191
                self.expresion()
                self.state = 192
                self.mas_f_call()
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 2)

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


    class Mas_f_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def opc_f_call(self):
            return self.getTypedRuleContext(littleDuckParser.Opc_f_callContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_mas_f_call

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMas_f_call" ):
                listener.enterMas_f_call(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMas_f_call" ):
                listener.exitMas_f_call(self)




    def mas_f_call(self):

        localctx = littleDuckParser.Mas_f_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_mas_f_call)
        try:
            self.state = 200
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                self.enterOuterAlt(localctx, 1)
                self.state = 197
                self.match(littleDuckParser.T__6)
                self.state = 198
                self.opc_f_call()
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 2)

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


    class PrintContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def opc_print(self):
            return self.getTypedRuleContext(littleDuckParser.Opc_printContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_print

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrint" ):
                listener.enterPrint(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrint" ):
                listener.exitPrint(self)




    def print_(self):

        localctx = littleDuckParser.PrintContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_print)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 202
            self.match(littleDuckParser.T__18)
            self.state = 203
            self.match(littleDuckParser.T__13)
            self.state = 204
            self.opc_print()
            self.state = 205
            self.match(littleDuckParser.T__14)
            self.state = 206
            self.match(littleDuckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Opc_printContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._CTE_STRING = None # Token

        def expresion(self):
            return self.getTypedRuleContext(littleDuckParser.ExpresionContext,0)


        def mas_print(self):
            return self.getTypedRuleContext(littleDuckParser.Mas_printContext,0)


        def CTE_STRING(self):
            return self.getToken(littleDuckParser.CTE_STRING, 0)

        def getRuleIndex(self):
            return littleDuckParser.RULE_opc_print

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpc_print" ):
                listener.enterOpc_print(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpc_print" ):
                listener.exitOpc_print(self)




    def opc_print(self):

        localctx = littleDuckParser.Opc_printContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_opc_print)
        try:
            self.state = 216
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14, 26, 27, 32, 33, 35]:
                self.enterOuterAlt(localctx, 1)
                print("hanlo")
                self.state = 209
                self.expresion()
                program.insertQuad('print', program.stack_operands.pop(), None, None)
                program.clearTempVars()
                self.state = 211
                self.mas_print()
                pass
            elif token in [34]:
                self.enterOuterAlt(localctx, 2)
                self.state = 213
                localctx._CTE_STRING = self.match(littleDuckParser.CTE_STRING)
                program.insertQuad('print', (None if localctx._CTE_STRING is None else localctx._CTE_STRING.text), None, None)
                program.clearTempVars()
                self.state = 215
                self.mas_print()
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


    class Mas_printContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def opc_print(self):
            return self.getTypedRuleContext(littleDuckParser.Opc_printContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_mas_print

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMas_print" ):
                listener.enterMas_print(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMas_print" ):
                listener.exitMas_print(self)




    def mas_print(self):

        localctx = littleDuckParser.Mas_printContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_mas_print)
        try:
            self.state = 221
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                self.enterOuterAlt(localctx, 1)
                self.state = 218
                self.match(littleDuckParser.T__6)
                self.state = 219
                self.opc_print()
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 2)

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


    class FuncsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(littleDuckParser.ID, 0)

        def opc_funcs(self):
            return self.getTypedRuleContext(littleDuckParser.Opc_funcsContext,0)


        def vars_funcs(self):
            return self.getTypedRuleContext(littleDuckParser.Vars_funcsContext,0)


        def body(self):
            return self.getTypedRuleContext(littleDuckParser.BodyContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_funcs

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFuncs" ):
                listener.enterFuncs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFuncs" ):
                listener.exitFuncs(self)




    def funcs(self):

        localctx = littleDuckParser.FuncsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_funcs)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 223
            self.match(littleDuckParser.T__19)
            self.state = 224
            localctx._ID = self.match(littleDuckParser.ID)

            program.newFunction((None if localctx._ID is None else localctx._ID.text))

            self.state = 226
            self.match(littleDuckParser.T__13)
            self.state = 227
            self.opc_funcs()
            self.state = 228
            self.match(littleDuckParser.T__14)
            self.state = 229
            self.match(littleDuckParser.T__20)
            self.state = 230
            self.vars_funcs()
            self.state = 231
            self.body()
            self.state = 232
            self.match(littleDuckParser.T__21)
            self.state = 233
            self.match(littleDuckParser.T__1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Opc_funcsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(littleDuckParser.ID, 0)

        def type_(self):
            return self.getTypedRuleContext(littleDuckParser.TypeContext,0)


        def mas_opc_funcs(self):
            return self.getTypedRuleContext(littleDuckParser.Mas_opc_funcsContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_opc_funcs

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpc_funcs" ):
                listener.enterOpc_funcs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpc_funcs" ):
                listener.exitOpc_funcs(self)




    def opc_funcs(self):

        localctx = littleDuckParser.Opc_funcsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_opc_funcs)
        try:
            self.state = 242
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [35]:
                self.enterOuterAlt(localctx, 1)
                self.state = 235
                localctx._ID = self.match(littleDuckParser.ID)

                program.declareNewVariable((None if localctx._ID is None else localctx._ID.text))

                self.state = 237
                self.match(littleDuckParser.T__5)
                self.state = 238
                self.type_()
                self.state = 239
                self.mas_opc_funcs()
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 2)

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


    class Mas_opc_funcsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def next_opc_funcs(self):
            return self.getTypedRuleContext(littleDuckParser.Next_opc_funcsContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_mas_opc_funcs

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMas_opc_funcs" ):
                listener.enterMas_opc_funcs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMas_opc_funcs" ):
                listener.exitMas_opc_funcs(self)




    def mas_opc_funcs(self):

        localctx = littleDuckParser.Mas_opc_funcsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_mas_opc_funcs)
        try:
            self.state = 247
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                self.enterOuterAlt(localctx, 1)
                self.state = 244
                self.match(littleDuckParser.T__6)
                self.state = 245
                self.next_opc_funcs()
                pass
            elif token in [15]:
                self.enterOuterAlt(localctx, 2)

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


    class Next_opc_funcsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(littleDuckParser.ID, 0)

        def type_(self):
            return self.getTypedRuleContext(littleDuckParser.TypeContext,0)


        def mas_opc_funcs(self):
            return self.getTypedRuleContext(littleDuckParser.Mas_opc_funcsContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_next_opc_funcs

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNext_opc_funcs" ):
                listener.enterNext_opc_funcs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNext_opc_funcs" ):
                listener.exitNext_opc_funcs(self)




    def next_opc_funcs(self):

        localctx = littleDuckParser.Next_opc_funcsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_next_opc_funcs)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 249
            localctx._ID = self.match(littleDuckParser.ID)

            program.declareNewVariable((None if localctx._ID is None else localctx._ID.text))

            self.state = 251
            self.match(littleDuckParser.T__5)
            self.state = 252
            self.type_()
            self.state = 253
            self.mas_opc_funcs()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Vars_funcsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def vars_(self):
            return self.getTypedRuleContext(littleDuckParser.VarsContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_vars_funcs

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVars_funcs" ):
                listener.enterVars_funcs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVars_funcs" ):
                listener.exitVars_funcs(self)




    def vars_funcs(self):

        localctx = littleDuckParser.Vars_funcsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_vars_funcs)
        try:
            self.state = 257
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [5]:
                self.enterOuterAlt(localctx, 1)
                self.state = 255
                self.vars_()
                pass
            elif token in [10]:
                self.enterOuterAlt(localctx, 2)

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


    class CteContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._CTE_INT = None # Token
            self._CTE_FLOAT = None # Token

        def CTE_INT(self):
            return self.getToken(littleDuckParser.CTE_INT, 0)

        def CTE_FLOAT(self):
            return self.getToken(littleDuckParser.CTE_FLOAT, 0)

        def getRuleIndex(self):
            return littleDuckParser.RULE_cte

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCte" ):
                listener.enterCte(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCte" ):
                listener.exitCte(self)




    def cte(self):

        localctx = littleDuckParser.CteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_cte)
        try:
            self.state = 263
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [32]:
                self.enterOuterAlt(localctx, 1)
                self.state = 259
                localctx._CTE_INT = self.match(littleDuckParser.CTE_INT)
                program.stack_operands.append(int((None if localctx._CTE_INT is None else localctx._CTE_INT.text)))
                pass
            elif token in [33]:
                self.enterOuterAlt(localctx, 2)
                self.state = 261
                localctx._CTE_FLOAT = self.match(littleDuckParser.CTE_FLOAT)
                program.stack_operands.append(float((None if localctx._CTE_FLOAT is None else localctx._CTE_FLOAT.text)))
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


    class ExpresionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp(self):
            return self.getTypedRuleContext(littleDuckParser.ExpContext,0)


        def opc_expresion(self):
            return self.getTypedRuleContext(littleDuckParser.Opc_expresionContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_expresion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpresion" ):
                listener.enterExpresion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpresion" ):
                listener.exitExpresion(self)




    def expresion(self):

        localctx = littleDuckParser.ExpresionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_expresion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 265
            self.exp()
            program.clearQuadrupleList('+')
            self.state = 267
            self.opc_expresion()
            program.clearQuadrupleList('eoe')
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Opc_expresionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp(self):
            return self.getTypedRuleContext(littleDuckParser.ExpContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_opc_expresion

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpc_expresion" ):
                listener.enterOpc_expresion(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpc_expresion" ):
                listener.exitOpc_expresion(self)




    def opc_expresion(self):

        localctx = littleDuckParser.Opc_expresionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_opc_expresion)
        try:
            self.state = 280
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [23]:
                self.enterOuterAlt(localctx, 1)
                self.state = 270
                self.match(littleDuckParser.T__22)

                program.stack_operator.append('>')

                self.state = 272
                self.exp()
                pass
            elif token in [24]:
                self.enterOuterAlt(localctx, 2)
                self.state = 273
                self.match(littleDuckParser.T__23)

                program.stack_operator.append('<')

                self.state = 275
                self.exp()
                pass
            elif token in [25]:
                self.enterOuterAlt(localctx, 3)
                self.state = 276
                self.match(littleDuckParser.T__24)

                program.stack_operator.append('!=')

                self.state = 278
                self.exp()
                pass
            elif token in [2, 7, 15]:
                self.enterOuterAlt(localctx, 4)

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


    class ExpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def termino(self):
            return self.getTypedRuleContext(littleDuckParser.TerminoContext,0)


        def mas_exp(self):
            return self.getTypedRuleContext(littleDuckParser.Mas_expContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_exp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExp" ):
                listener.enterExp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExp" ):
                listener.exitExp(self)




    def exp(self):

        localctx = littleDuckParser.ExpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_exp)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 282
            self.termino()
            program.clearQuadrupleList('*')
            self.state = 284
            self.mas_exp()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Mas_expContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def exp_signo(self):
            return self.getTypedRuleContext(littleDuckParser.Exp_signoContext,0)


        def exp(self):
            return self.getTypedRuleContext(littleDuckParser.ExpContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_mas_exp

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMas_exp" ):
                listener.enterMas_exp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMas_exp" ):
                listener.exitMas_exp(self)




    def mas_exp(self):

        localctx = littleDuckParser.Mas_expContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_mas_exp)
        try:
            self.state = 290
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [26, 27]:
                self.enterOuterAlt(localctx, 1)
                self.state = 286
                self.exp_signo()
                self.state = 287
                self.exp()
                pass
            elif token in [2, 7, 15, 23, 24, 25]:
                self.enterOuterAlt(localctx, 2)

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


    class Exp_signoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return littleDuckParser.RULE_exp_signo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExp_signo" ):
                listener.enterExp_signo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExp_signo" ):
                listener.exitExp_signo(self)




    def exp_signo(self):

        localctx = littleDuckParser.Exp_signoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_exp_signo)
        try:
            self.state = 296
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [26]:
                self.enterOuterAlt(localctx, 1)
                self.state = 292
                self.match(littleDuckParser.T__25)

                program.stack_operator.append('+')

                pass
            elif token in [27]:
                self.enterOuterAlt(localctx, 2)
                self.state = 294
                self.match(littleDuckParser.T__26)

                program.stack_operator.append('-')

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


    class TerminoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def factor(self):
            return self.getTypedRuleContext(littleDuckParser.FactorContext,0)


        def mas_termino(self):
            return self.getTypedRuleContext(littleDuckParser.Mas_terminoContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_termino

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTermino" ):
                listener.enterTermino(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTermino" ):
                listener.exitTermino(self)




    def termino(self):

        localctx = littleDuckParser.TerminoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_termino)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 298
            self.factor()
            self.state = 299
            self.mas_termino()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Mas_terminoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def signo_factor(self):
            return self.getTypedRuleContext(littleDuckParser.Signo_factorContext,0)


        def termino(self):
            return self.getTypedRuleContext(littleDuckParser.TerminoContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_mas_termino

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMas_termino" ):
                listener.enterMas_termino(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMas_termino" ):
                listener.exitMas_termino(self)




    def mas_termino(self):

        localctx = littleDuckParser.Mas_terminoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 64, self.RULE_mas_termino)
        try:
            self.state = 305
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [28, 29]:
                self.enterOuterAlt(localctx, 1)
                self.state = 301
                self.signo_factor()
                self.state = 302
                self.termino()
                pass
            elif token in [2, 7, 15, 23, 24, 25, 26, 27]:
                self.enterOuterAlt(localctx, 2)

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


    class Signo_factorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return littleDuckParser.RULE_signo_factor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSigno_factor" ):
                listener.enterSigno_factor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSigno_factor" ):
                listener.exitSigno_factor(self)




    def signo_factor(self):

        localctx = littleDuckParser.Signo_factorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 66, self.RULE_signo_factor)
        try:
            self.state = 311
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [28]:
                self.enterOuterAlt(localctx, 1)
                self.state = 307
                self.match(littleDuckParser.T__27)
                program.stack_operator.append('*')
                pass
            elif token in [29]:
                self.enterOuterAlt(localctx, 2)
                self.state = 309
                self.match(littleDuckParser.T__28)
                program.stack_operator.append('/')
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


    class FactorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def opc_factor(self):
            return self.getTypedRuleContext(littleDuckParser.Opc_factorContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_factor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFactor" ):
                listener.enterFactor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFactor" ):
                listener.exitFactor(self)




    def factor(self):

        localctx = littleDuckParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 68, self.RULE_factor)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 313
            self.opc_factor()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Opc_factorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expresion(self):
            return self.getTypedRuleContext(littleDuckParser.ExpresionContext,0)


        def opc_signo(self):
            return self.getTypedRuleContext(littleDuckParser.Opc_signoContext,0)


        def opc_factor_prime(self):
            return self.getTypedRuleContext(littleDuckParser.Opc_factor_primeContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_opc_factor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpc_factor" ):
                listener.enterOpc_factor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpc_factor" ):
                listener.exitOpc_factor(self)




    def opc_factor(self):

        localctx = littleDuckParser.Opc_factorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 70, self.RULE_opc_factor)
        try:
            self.state = 324
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14]:
                self.enterOuterAlt(localctx, 1)
                self.state = 315
                self.match(littleDuckParser.T__13)

                program.stack_operator.append('(')

                self.state = 317
                self.expresion()
                self.state = 318
                self.match(littleDuckParser.T__14)

                program.clearQuadrupleList(')')

                pass
            elif token in [26, 27, 32, 33, 35]:
                self.enterOuterAlt(localctx, 2)
                self.state = 321
                self.opc_signo()
                self.state = 322
                self.opc_factor_prime()
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


    class Opc_signoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def signo(self):
            return self.getTypedRuleContext(littleDuckParser.SignoContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_opc_signo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpc_signo" ):
                listener.enterOpc_signo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpc_signo" ):
                listener.exitOpc_signo(self)




    def opc_signo(self):

        localctx = littleDuckParser.Opc_signoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 72, self.RULE_opc_signo)
        try:
            self.state = 328
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [26, 27]:
                self.enterOuterAlt(localctx, 1)
                self.state = 326
                self.signo()
                pass
            elif token in [32, 33, 35]:
                self.enterOuterAlt(localctx, 2)

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


    class SignoContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return littleDuckParser.RULE_signo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterSigno" ):
                listener.enterSigno(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitSigno" ):
                listener.exitSigno(self)




    def signo(self):

        localctx = littleDuckParser.SignoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 74, self.RULE_signo)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 330
            _la = self._input.LA(1)
            if not(_la==26 or _la==27):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Opc_factor_primeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token

        def ID(self):
            return self.getToken(littleDuckParser.ID, 0)

        def cte(self):
            return self.getTypedRuleContext(littleDuckParser.CteContext,0)


        def getRuleIndex(self):
            return littleDuckParser.RULE_opc_factor_prime

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOpc_factor_prime" ):
                listener.enterOpc_factor_prime(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOpc_factor_prime" ):
                listener.exitOpc_factor_prime(self)




    def opc_factor_prime(self):

        localctx = littleDuckParser.Opc_factor_primeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 76, self.RULE_opc_factor_prime)
        try:
            self.state = 335
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [35]:
                self.enterOuterAlt(localctx, 1)
                self.state = 332
                localctx._ID = self.match(littleDuckParser.ID)

                if program.variableDeclared((None if localctx._ID is None else localctx._ID.text)):
                    program.stack_operands.append((None if localctx._ID is None else localctx._ID.text))

                pass
            elif token in [32, 33]:
                self.enterOuterAlt(localctx, 2)
                self.state = 334
                self.cte()
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





