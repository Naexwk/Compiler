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
        4,1,35,300,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,
        2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,
        7,33,2,34,7,34,2,35,7,35,2,36,7,36,2,37,7,37,1,0,1,0,1,0,1,0,1,0,
        1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,3,1,91,8,1,1,2,1,2,1,2,1,2,3,
        2,97,8,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,
        1,4,3,4,114,8,4,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,3,5,125,8,5,
        1,6,1,6,1,7,1,7,1,7,1,7,1,8,1,8,1,8,1,8,3,8,137,8,8,1,9,1,9,1,9,
        1,9,1,9,3,9,144,8,9,1,10,1,10,1,10,1,10,1,10,1,10,1,11,1,11,1,11,
        1,11,1,11,1,11,1,11,1,11,1,12,1,12,1,12,3,12,163,8,12,1,13,1,13,
        1,13,1,13,1,13,1,13,1,13,1,13,1,14,1,14,1,14,1,14,1,14,1,14,1,15,
        1,15,1,15,1,15,3,15,183,8,15,1,16,1,16,1,16,3,16,188,8,16,1,17,1,
        17,1,17,1,17,1,17,1,17,1,18,1,18,1,18,1,18,1,18,3,18,201,8,18,1,
        19,1,19,1,19,3,19,206,8,19,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,
        20,1,20,1,20,1,20,1,20,1,21,1,21,1,21,1,21,1,21,1,21,1,21,3,21,227,
        8,21,1,22,1,22,1,22,3,22,232,8,22,1,23,1,23,1,23,1,23,1,23,1,23,
        1,24,1,24,3,24,242,8,24,1,25,1,25,1,26,1,26,1,26,1,27,1,27,1,27,
        1,27,1,27,1,27,1,27,3,27,256,8,27,1,28,1,28,1,28,1,29,1,29,1,29,
        1,29,3,29,265,8,29,1,30,1,30,1,31,1,31,1,31,1,32,1,32,1,32,1,32,
        3,32,276,8,32,1,33,1,33,1,34,1,34,1,35,1,35,1,35,1,35,1,35,1,35,
        1,35,3,35,289,8,35,1,36,1,36,3,36,293,8,36,1,37,1,37,1,37,3,37,298,
        8,37,1,37,0,0,38,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,
        36,38,40,42,44,46,48,50,52,54,56,58,60,62,64,66,68,70,72,74,0,4,
        1,0,8,9,1,0,32,33,1,0,26,27,1,0,28,29,286,0,76,1,0,0,0,2,90,1,0,
        0,0,4,96,1,0,0,0,6,98,1,0,0,0,8,113,1,0,0,0,10,124,1,0,0,0,12,126,
        1,0,0,0,14,128,1,0,0,0,16,136,1,0,0,0,18,143,1,0,0,0,20,145,1,0,
        0,0,22,151,1,0,0,0,24,162,1,0,0,0,26,164,1,0,0,0,28,172,1,0,0,0,
        30,182,1,0,0,0,32,187,1,0,0,0,34,189,1,0,0,0,36,200,1,0,0,0,38,205,
        1,0,0,0,40,207,1,0,0,0,42,226,1,0,0,0,44,231,1,0,0,0,46,233,1,0,
        0,0,48,241,1,0,0,0,50,243,1,0,0,0,52,245,1,0,0,0,54,255,1,0,0,0,
        56,257,1,0,0,0,58,264,1,0,0,0,60,266,1,0,0,0,62,268,1,0,0,0,64,275,
        1,0,0,0,66,277,1,0,0,0,68,279,1,0,0,0,70,288,1,0,0,0,72,292,1,0,
        0,0,74,297,1,0,0,0,76,77,5,1,0,0,77,78,5,35,0,0,78,79,6,0,-1,0,79,
        80,5,2,0,0,80,81,3,2,1,0,81,82,3,4,2,0,82,83,5,3,0,0,83,84,3,14,
        7,0,84,85,5,4,0,0,85,86,6,0,-1,0,86,1,1,0,0,0,87,88,6,1,-1,0,88,
        91,3,6,3,0,89,91,1,0,0,0,90,87,1,0,0,0,90,89,1,0,0,0,91,3,1,0,0,
        0,92,93,3,40,20,0,93,94,3,4,2,0,94,97,1,0,0,0,95,97,1,0,0,0,96,92,
        1,0,0,0,96,95,1,0,0,0,97,5,1,0,0,0,98,99,5,5,0,0,99,100,5,35,0,0,
        100,101,6,3,-1,0,101,102,3,8,4,0,102,103,5,6,0,0,103,104,3,12,6,
        0,104,105,5,2,0,0,105,106,6,3,-1,0,106,107,3,10,5,0,107,7,1,0,0,
        0,108,109,5,7,0,0,109,110,5,35,0,0,110,111,6,4,-1,0,111,114,3,8,
        4,0,112,114,1,0,0,0,113,108,1,0,0,0,113,112,1,0,0,0,114,9,1,0,0,
        0,115,116,5,35,0,0,116,117,3,8,4,0,117,118,5,6,0,0,118,119,3,12,
        6,0,119,120,5,2,0,0,120,121,6,5,-1,0,121,122,3,10,5,0,122,125,1,
        0,0,0,123,125,1,0,0,0,124,115,1,0,0,0,124,123,1,0,0,0,125,11,1,0,
        0,0,126,127,7,0,0,0,127,13,1,0,0,0,128,129,5,10,0,0,129,130,3,16,
        8,0,130,131,5,11,0,0,131,15,1,0,0,0,132,133,3,18,9,0,133,134,3,16,
        8,0,134,137,1,0,0,0,135,137,1,0,0,0,136,132,1,0,0,0,136,135,1,0,
        0,0,137,17,1,0,0,0,138,144,3,20,10,0,139,144,3,22,11,0,140,144,3,
        26,13,0,141,144,3,28,14,0,142,144,3,34,17,0,143,138,1,0,0,0,143,
        139,1,0,0,0,143,140,1,0,0,0,143,141,1,0,0,0,143,142,1,0,0,0,144,
        19,1,0,0,0,145,146,5,35,0,0,146,147,6,10,-1,0,147,148,5,12,0,0,148,
        149,3,52,26,0,149,150,5,2,0,0,150,21,1,0,0,0,151,152,5,13,0,0,152,
        153,5,14,0,0,153,154,3,52,26,0,154,155,5,15,0,0,155,156,3,14,7,0,
        156,157,3,24,12,0,157,158,5,2,0,0,158,23,1,0,0,0,159,160,5,16,0,
        0,160,163,3,14,7,0,161,163,1,0,0,0,162,159,1,0,0,0,162,161,1,0,0,
        0,163,25,1,0,0,0,164,165,5,17,0,0,165,166,3,14,7,0,166,167,5,18,
        0,0,167,168,5,14,0,0,168,169,3,52,26,0,169,170,5,15,0,0,170,171,
        5,2,0,0,171,27,1,0,0,0,172,173,5,35,0,0,173,174,5,14,0,0,174,175,
        3,30,15,0,175,176,5,15,0,0,176,177,5,2,0,0,177,29,1,0,0,0,178,179,
        3,52,26,0,179,180,3,32,16,0,180,183,1,0,0,0,181,183,1,0,0,0,182,
        178,1,0,0,0,182,181,1,0,0,0,183,31,1,0,0,0,184,185,5,7,0,0,185,188,
        3,30,15,0,186,188,1,0,0,0,187,184,1,0,0,0,187,186,1,0,0,0,188,33,
        1,0,0,0,189,190,5,19,0,0,190,191,5,14,0,0,191,192,3,36,18,0,192,
        193,5,15,0,0,193,194,5,2,0,0,194,35,1,0,0,0,195,196,3,52,26,0,196,
        197,3,38,19,0,197,201,1,0,0,0,198,199,5,34,0,0,199,201,3,38,19,0,
        200,195,1,0,0,0,200,198,1,0,0,0,201,37,1,0,0,0,202,203,5,7,0,0,203,
        206,3,36,18,0,204,206,1,0,0,0,205,202,1,0,0,0,205,204,1,0,0,0,206,
        39,1,0,0,0,207,208,5,20,0,0,208,209,5,35,0,0,209,210,6,20,-1,0,210,
        211,5,14,0,0,211,212,3,42,21,0,212,213,5,15,0,0,213,214,5,21,0,0,
        214,215,3,48,24,0,215,216,3,14,7,0,216,217,5,22,0,0,217,218,5,2,
        0,0,218,41,1,0,0,0,219,220,5,35,0,0,220,221,6,21,-1,0,221,222,5,
        6,0,0,222,223,3,12,6,0,223,224,3,44,22,0,224,227,1,0,0,0,225,227,
        1,0,0,0,226,219,1,0,0,0,226,225,1,0,0,0,227,43,1,0,0,0,228,229,5,
        7,0,0,229,232,3,46,23,0,230,232,1,0,0,0,231,228,1,0,0,0,231,230,
        1,0,0,0,232,45,1,0,0,0,233,234,5,35,0,0,234,235,6,23,-1,0,235,236,
        5,6,0,0,236,237,3,12,6,0,237,238,3,44,22,0,238,47,1,0,0,0,239,242,
        3,6,3,0,240,242,1,0,0,0,241,239,1,0,0,0,241,240,1,0,0,0,242,49,1,
        0,0,0,243,244,7,1,0,0,244,51,1,0,0,0,245,246,3,56,28,0,246,247,3,
        54,27,0,247,53,1,0,0,0,248,249,5,23,0,0,249,256,3,56,28,0,250,251,
        5,24,0,0,251,256,3,56,28,0,252,253,5,25,0,0,253,256,3,56,28,0,254,
        256,1,0,0,0,255,248,1,0,0,0,255,250,1,0,0,0,255,252,1,0,0,0,255,
        254,1,0,0,0,256,55,1,0,0,0,257,258,3,62,31,0,258,259,3,58,29,0,259,
        57,1,0,0,0,260,261,3,60,30,0,261,262,3,56,28,0,262,265,1,0,0,0,263,
        265,1,0,0,0,264,260,1,0,0,0,264,263,1,0,0,0,265,59,1,0,0,0,266,267,
        7,2,0,0,267,61,1,0,0,0,268,269,3,68,34,0,269,270,3,64,32,0,270,63,
        1,0,0,0,271,272,3,66,33,0,272,273,3,62,31,0,273,276,1,0,0,0,274,
        276,1,0,0,0,275,271,1,0,0,0,275,274,1,0,0,0,276,65,1,0,0,0,277,278,
        7,3,0,0,278,67,1,0,0,0,279,280,3,70,35,0,280,69,1,0,0,0,281,282,
        5,14,0,0,282,283,3,52,26,0,283,284,5,15,0,0,284,289,1,0,0,0,285,
        286,3,72,36,0,286,287,3,74,37,0,287,289,1,0,0,0,288,281,1,0,0,0,
        288,285,1,0,0,0,289,71,1,0,0,0,290,293,3,60,30,0,291,293,1,0,0,0,
        292,290,1,0,0,0,292,291,1,0,0,0,293,73,1,0,0,0,294,295,5,35,0,0,
        295,298,6,37,-1,0,296,298,3,50,25,0,297,294,1,0,0,0,297,296,1,0,
        0,0,298,75,1,0,0,0,20,90,96,113,124,136,143,162,182,187,200,205,
        226,231,241,255,264,275,288,292,297
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
    RULE_signo = 30
    RULE_termino = 31
    RULE_mas_termino = 32
    RULE_signo_factor = 33
    RULE_factor = 34
    RULE_opc_factor = 35
    RULE_opc_signo = 36
    RULE_opc_factor_prime = 37

    ruleNames =  [ "programa", "opc_vars", "optional_funcs", "vars", "mas_vars", 
                   "mas_dec_vars", "type", "body", "statement", "options_statement", 
                   "assign", "condition", "else", "cycle", "f_call", "opc_f_call", 
                   "mas_f_call", "print", "opc_print", "mas_print", "funcs", 
                   "opc_funcs", "mas_opc_funcs", "next_opc_funcs", "vars_funcs", 
                   "cte", "expresion", "opc_expresion", "exp", "mas_exp", 
                   "signo", "termino", "mas_termino", "signo_factor", "factor", 
                   "opc_factor", "opc_signo", "opc_factor_prime" ]

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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrograma" ):
                return visitor.visitPrograma(self)
            else:
                return visitor.visitChildren(self)




    def programa(self):

        localctx = littleDuckParser.ProgramaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_programa)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 76
            self.match(littleDuckParser.T__0)
            self.state = 77
            localctx._ID = self.match(littleDuckParser.ID)

            program.variableTable["owner"] = (None if localctx._ID is None else localctx._ID.text)

            self.state = 79
            self.match(littleDuckParser.T__1)
            self.state = 80
            self.opc_vars()
            self.state = 81
            self.optional_funcs()
            self.state = 82
            self.match(littleDuckParser.T__2)
            self.state = 83
            self.body()
            self.state = 84
            self.match(littleDuckParser.T__3)

            print(program.variableTable)

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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOpc_vars" ):
                return visitor.visitOpc_vars(self)
            else:
                return visitor.visitChildren(self)




    def opc_vars(self):

        localctx = littleDuckParser.Opc_varsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_opc_vars)
        try:
            self.state = 90
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [5]:
                self.enterOuterAlt(localctx, 1)

                program.currentLevel = "global"

                self.state = 88
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOptional_funcs" ):
                return visitor.visitOptional_funcs(self)
            else:
                return visitor.visitChildren(self)




    def optional_funcs(self):

        localctx = littleDuckParser.Optional_funcsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_optional_funcs)
        try:
            self.state = 96
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [20]:
                self.enterOuterAlt(localctx, 1)
                self.state = 92
                self.funcs()
                self.state = 93
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVars" ):
                return visitor.visitVars(self)
            else:
                return visitor.visitChildren(self)




    def vars_(self):

        localctx = littleDuckParser.VarsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_vars)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 98
            self.match(littleDuckParser.T__4)
            self.state = 99
            localctx._ID = self.match(littleDuckParser.ID)

            if not program.variableExists((None if localctx._ID is None else localctx._ID.text)):
                program.tempVarDeclarations.append((None if localctx._ID is None else localctx._ID.text))
            else:
                print("Variable " + (None if localctx._ID is None else localctx._ID.text) + " already declared")

            self.state = 101
            self.mas_vars()
            self.state = 102
            self.match(littleDuckParser.T__5)
            self.state = 103
            self.type_()
            self.state = 104
            self.match(littleDuckParser.T__1)
            program.clearTempVarDeclaration()
            self.state = 106
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMas_vars" ):
                return visitor.visitMas_vars(self)
            else:
                return visitor.visitChildren(self)




    def mas_vars(self):

        localctx = littleDuckParser.Mas_varsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_mas_vars)
        try:
            self.state = 113
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                self.enterOuterAlt(localctx, 1)
                self.state = 108
                self.match(littleDuckParser.T__6)
                self.state = 109
                localctx._ID = self.match(littleDuckParser.ID)

                if not program.variableExists((None if localctx._ID is None else localctx._ID.text)):
                    program.tempVarDeclarations.append((None if localctx._ID is None else localctx._ID.text))
                else:
                    print("Variable " + (None if localctx._ID is None else localctx._ID.text) + " already declared")

                self.state = 111
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMas_dec_vars" ):
                return visitor.visitMas_dec_vars(self)
            else:
                return visitor.visitChildren(self)




    def mas_dec_vars(self):

        localctx = littleDuckParser.Mas_dec_varsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_mas_dec_vars)
        try:
            self.state = 124
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [35]:
                self.enterOuterAlt(localctx, 1)
                self.state = 115
                self.match(littleDuckParser.ID)
                self.state = 116
                self.mas_vars()
                self.state = 117
                self.match(littleDuckParser.T__5)
                self.state = 118
                self.type_()
                self.state = 119
                self.match(littleDuckParser.T__1)
                program.clearTempVarDeclaration()
                self.state = 121
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitType" ):
                return visitor.visitType(self)
            else:
                return visitor.visitChildren(self)




    def type_(self):

        localctx = littleDuckParser.TypeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_type)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 126
            _la = self._input.LA(1)
            if not(_la==8 or _la==9):
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBody" ):
                return visitor.visitBody(self)
            else:
                return visitor.visitChildren(self)




    def body(self):

        localctx = littleDuckParser.BodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_body)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 128
            self.match(littleDuckParser.T__9)
            self.state = 129
            self.statement()
            self.state = 130
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = littleDuckParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_statement)
        try:
            self.state = 136
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [13, 17, 19, 35]:
                self.enterOuterAlt(localctx, 1)
                self.state = 132
                self.options_statement()
                self.state = 133
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOptions_statement" ):
                return visitor.visitOptions_statement(self)
            else:
                return visitor.visitChildren(self)




    def options_statement(self):

        localctx = littleDuckParser.Options_statementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_options_statement)
        try:
            self.state = 143
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 138
                self.assign()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 139
                self.condition()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 140
                self.cycle()
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 141
                self.f_call()
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 142
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssign" ):
                return visitor.visitAssign(self)
            else:
                return visitor.visitChildren(self)




    def assign(self):

        localctx = littleDuckParser.AssignContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_assign)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 145
            localctx._ID = self.match(littleDuckParser.ID)

            if not program.variableExists((None if localctx._ID is None else localctx._ID.text)):
                print((None if localctx._ID is None else localctx._ID.text) + " does not exist in current context")

            self.state = 147
            self.match(littleDuckParser.T__11)
            self.state = 148
            self.expresion()
            self.state = 149
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondition" ):
                return visitor.visitCondition(self)
            else:
                return visitor.visitChildren(self)




    def condition(self):

        localctx = littleDuckParser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_condition)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 151
            self.match(littleDuckParser.T__12)
            self.state = 152
            self.match(littleDuckParser.T__13)
            self.state = 153
            self.expresion()
            self.state = 154
            self.match(littleDuckParser.T__14)
            self.state = 155
            self.body()
            self.state = 156
            self.else_()
            self.state = 157
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElse" ):
                return visitor.visitElse(self)
            else:
                return visitor.visitChildren(self)




    def else_(self):

        localctx = littleDuckParser.ElseContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_else)
        try:
            self.state = 162
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [16]:
                self.enterOuterAlt(localctx, 1)
                self.state = 159
                self.match(littleDuckParser.T__15)
                self.state = 160
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCycle" ):
                return visitor.visitCycle(self)
            else:
                return visitor.visitChildren(self)




    def cycle(self):

        localctx = littleDuckParser.CycleContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_cycle)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 164
            self.match(littleDuckParser.T__16)
            self.state = 165
            self.body()
            self.state = 166
            self.match(littleDuckParser.T__17)
            self.state = 167
            self.match(littleDuckParser.T__13)
            self.state = 168
            self.expresion()
            self.state = 169
            self.match(littleDuckParser.T__14)
            self.state = 170
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitF_call" ):
                return visitor.visitF_call(self)
            else:
                return visitor.visitChildren(self)




    def f_call(self):

        localctx = littleDuckParser.F_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_f_call)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 172
            self.match(littleDuckParser.ID)
            self.state = 173
            self.match(littleDuckParser.T__13)
            self.state = 174
            self.opc_f_call()
            self.state = 175
            self.match(littleDuckParser.T__14)
            self.state = 176
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOpc_f_call" ):
                return visitor.visitOpc_f_call(self)
            else:
                return visitor.visitChildren(self)




    def opc_f_call(self):

        localctx = littleDuckParser.Opc_f_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_opc_f_call)
        try:
            self.state = 182
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14, 26, 27, 32, 33, 35]:
                self.enterOuterAlt(localctx, 1)
                self.state = 178
                self.expresion()
                self.state = 179
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMas_f_call" ):
                return visitor.visitMas_f_call(self)
            else:
                return visitor.visitChildren(self)




    def mas_f_call(self):

        localctx = littleDuckParser.Mas_f_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_mas_f_call)
        try:
            self.state = 187
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                self.enterOuterAlt(localctx, 1)
                self.state = 184
                self.match(littleDuckParser.T__6)
                self.state = 185
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrint" ):
                return visitor.visitPrint(self)
            else:
                return visitor.visitChildren(self)




    def print_(self):

        localctx = littleDuckParser.PrintContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_print)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 189
            self.match(littleDuckParser.T__18)
            self.state = 190
            self.match(littleDuckParser.T__13)
            self.state = 191
            self.opc_print()
            self.state = 192
            self.match(littleDuckParser.T__14)
            self.state = 193
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOpc_print" ):
                return visitor.visitOpc_print(self)
            else:
                return visitor.visitChildren(self)




    def opc_print(self):

        localctx = littleDuckParser.Opc_printContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_opc_print)
        try:
            self.state = 200
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14, 26, 27, 32, 33, 35]:
                self.enterOuterAlt(localctx, 1)
                self.state = 195
                self.expresion()
                self.state = 196
                self.mas_print()
                pass
            elif token in [34]:
                self.enterOuterAlt(localctx, 2)
                self.state = 198
                self.match(littleDuckParser.CTE_STRING)
                self.state = 199
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMas_print" ):
                return visitor.visitMas_print(self)
            else:
                return visitor.visitChildren(self)




    def mas_print(self):

        localctx = littleDuckParser.Mas_printContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_mas_print)
        try:
            self.state = 205
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                self.enterOuterAlt(localctx, 1)
                self.state = 202
                self.match(littleDuckParser.T__6)
                self.state = 203
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFuncs" ):
                return visitor.visitFuncs(self)
            else:
                return visitor.visitChildren(self)




    def funcs(self):

        localctx = littleDuckParser.FuncsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_funcs)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 207
            self.match(littleDuckParser.T__19)
            self.state = 208
            localctx._ID = self.match(littleDuckParser.ID)

            if not program.functionExists((None if localctx._ID is None else localctx._ID.text)):
                program.functionTable.append((None if localctx._ID is None else localctx._ID.text))
                program.currentLevel = (None if localctx._ID is None else localctx._ID.text)
                program.variableTable[program.currentLevel] = []
            else:
                print("Function " + (None if localctx._ID is None else localctx._ID.text) + " already declared")

            self.state = 210
            self.match(littleDuckParser.T__13)
            self.state = 211
            self.opc_funcs()
            self.state = 212
            self.match(littleDuckParser.T__14)
            self.state = 213
            self.match(littleDuckParser.T__20)
            self.state = 214
            self.vars_funcs()
            self.state = 215
            self.body()
            self.state = 216
            self.match(littleDuckParser.T__21)
            self.state = 217
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOpc_funcs" ):
                return visitor.visitOpc_funcs(self)
            else:
                return visitor.visitChildren(self)




    def opc_funcs(self):

        localctx = littleDuckParser.Opc_funcsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_opc_funcs)
        try:
            self.state = 226
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [35]:
                self.enterOuterAlt(localctx, 1)
                self.state = 219
                localctx._ID = self.match(littleDuckParser.ID)

                if not program.variableExists((None if localctx._ID is None else localctx._ID.text)):
                    program.tempVarDeclarations.append((None if localctx._ID is None else localctx._ID.text))
                else:
                    print("Variable " + (None if localctx._ID is None else localctx._ID.text) + " already declared")

                self.state = 221
                self.match(littleDuckParser.T__5)
                self.state = 222
                self.type_()
                self.state = 223
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMas_opc_funcs" ):
                return visitor.visitMas_opc_funcs(self)
            else:
                return visitor.visitChildren(self)




    def mas_opc_funcs(self):

        localctx = littleDuckParser.Mas_opc_funcsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_mas_opc_funcs)
        try:
            self.state = 231
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [7]:
                self.enterOuterAlt(localctx, 1)
                self.state = 228
                self.match(littleDuckParser.T__6)
                self.state = 229
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNext_opc_funcs" ):
                return visitor.visitNext_opc_funcs(self)
            else:
                return visitor.visitChildren(self)




    def next_opc_funcs(self):

        localctx = littleDuckParser.Next_opc_funcsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_next_opc_funcs)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 233
            localctx._ID = self.match(littleDuckParser.ID)

            if not program.variableExists((None if localctx._ID is None else localctx._ID.text)):
                program.tempVarDeclarations.append((None if localctx._ID is None else localctx._ID.text))
            else:
                print("Variable " + (None if localctx._ID is None else localctx._ID.text) + " already declared")

            self.state = 235
            self.match(littleDuckParser.T__5)
            self.state = 236
            self.type_()
            self.state = 237
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVars_funcs" ):
                return visitor.visitVars_funcs(self)
            else:
                return visitor.visitChildren(self)




    def vars_funcs(self):

        localctx = littleDuckParser.Vars_funcsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_vars_funcs)
        try:
            self.state = 241
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [5]:
                self.enterOuterAlt(localctx, 1)
                self.state = 239
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCte" ):
                return visitor.visitCte(self)
            else:
                return visitor.visitChildren(self)




    def cte(self):

        localctx = littleDuckParser.CteContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_cte)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 243
            _la = self._input.LA(1)
            if not(_la==32 or _la==33):
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpresion" ):
                return visitor.visitExpresion(self)
            else:
                return visitor.visitChildren(self)




    def expresion(self):

        localctx = littleDuckParser.ExpresionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 52, self.RULE_expresion)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 245
            self.exp()
            self.state = 246
            self.opc_expresion()
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOpc_expresion" ):
                return visitor.visitOpc_expresion(self)
            else:
                return visitor.visitChildren(self)




    def opc_expresion(self):

        localctx = littleDuckParser.Opc_expresionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_opc_expresion)
        try:
            self.state = 255
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [23]:
                self.enterOuterAlt(localctx, 1)
                self.state = 248
                self.match(littleDuckParser.T__22)
                self.state = 249
                self.exp()
                pass
            elif token in [24]:
                self.enterOuterAlt(localctx, 2)
                self.state = 250
                self.match(littleDuckParser.T__23)
                self.state = 251
                self.exp()
                pass
            elif token in [25]:
                self.enterOuterAlt(localctx, 3)
                self.state = 252
                self.match(littleDuckParser.T__24)
                self.state = 253
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExp" ):
                return visitor.visitExp(self)
            else:
                return visitor.visitChildren(self)




    def exp(self):

        localctx = littleDuckParser.ExpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_exp)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 257
            self.termino()
            self.state = 258
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

        def signo(self):
            return self.getTypedRuleContext(littleDuckParser.SignoContext,0)


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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMas_exp" ):
                return visitor.visitMas_exp(self)
            else:
                return visitor.visitChildren(self)




    def mas_exp(self):

        localctx = littleDuckParser.Mas_expContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_mas_exp)
        try:
            self.state = 264
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [26, 27]:
                self.enterOuterAlt(localctx, 1)
                self.state = 260
                self.signo()
                self.state = 261
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSigno" ):
                return visitor.visitSigno(self)
            else:
                return visitor.visitChildren(self)




    def signo(self):

        localctx = littleDuckParser.SignoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_signo)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 266
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTermino" ):
                return visitor.visitTermino(self)
            else:
                return visitor.visitChildren(self)




    def termino(self):

        localctx = littleDuckParser.TerminoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_termino)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 268
            self.factor()
            self.state = 269
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMas_termino" ):
                return visitor.visitMas_termino(self)
            else:
                return visitor.visitChildren(self)




    def mas_termino(self):

        localctx = littleDuckParser.Mas_terminoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 64, self.RULE_mas_termino)
        try:
            self.state = 275
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [28, 29]:
                self.enterOuterAlt(localctx, 1)
                self.state = 271
                self.signo_factor()
                self.state = 272
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitSigno_factor" ):
                return visitor.visitSigno_factor(self)
            else:
                return visitor.visitChildren(self)




    def signo_factor(self):

        localctx = littleDuckParser.Signo_factorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 66, self.RULE_signo_factor)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 277
            _la = self._input.LA(1)
            if not(_la==28 or _la==29):
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFactor" ):
                return visitor.visitFactor(self)
            else:
                return visitor.visitChildren(self)




    def factor(self):

        localctx = littleDuckParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 68, self.RULE_factor)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 279
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOpc_factor" ):
                return visitor.visitOpc_factor(self)
            else:
                return visitor.visitChildren(self)




    def opc_factor(self):

        localctx = littleDuckParser.Opc_factorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 70, self.RULE_opc_factor)
        try:
            self.state = 288
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [14]:
                self.enterOuterAlt(localctx, 1)
                self.state = 281
                self.match(littleDuckParser.T__13)
                self.state = 282
                self.expresion()
                self.state = 283
                self.match(littleDuckParser.T__14)
                pass
            elif token in [26, 27, 32, 33, 35]:
                self.enterOuterAlt(localctx, 2)
                self.state = 285
                self.opc_signo()
                self.state = 286
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOpc_signo" ):
                return visitor.visitOpc_signo(self)
            else:
                return visitor.visitChildren(self)




    def opc_signo(self):

        localctx = littleDuckParser.Opc_signoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 72, self.RULE_opc_signo)
        try:
            self.state = 292
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [26, 27]:
                self.enterOuterAlt(localctx, 1)
                self.state = 290
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

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOpc_factor_prime" ):
                return visitor.visitOpc_factor_prime(self)
            else:
                return visitor.visitChildren(self)




    def opc_factor_prime(self):

        localctx = littleDuckParser.Opc_factor_primeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 74, self.RULE_opc_factor_prime)
        try:
            self.state = 297
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [35]:
                self.enterOuterAlt(localctx, 1)
                self.state = 294
                localctx._ID = self.match(littleDuckParser.ID)

                if not program.variableExists((None if localctx._ID is None else localctx._ID.text)):
                    print((None if localctx._ID is None else localctx._ID.text) + " does not exist in current context")

                pass
            elif token in [32, 33]:
                self.enterOuterAlt(localctx, 2)
                self.state = 296
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





