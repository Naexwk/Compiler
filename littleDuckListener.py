# Generated from littleDuck.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .littleDuckParser import littleDuckParser
else:
    from littleDuckParser import littleDuckParser

# This class defines a complete listener for a parse tree produced by littleDuckParser.
class littleDuckListener(ParseTreeListener):

    # Enter a parse tree produced by littleDuckParser#programa.
    def enterPrograma(self, ctx:littleDuckParser.ProgramaContext):
        pass

    # Exit a parse tree produced by littleDuckParser#programa.
    def exitPrograma(self, ctx:littleDuckParser.ProgramaContext):
        pass


    # Enter a parse tree produced by littleDuckParser#opc_vars.
    def enterOpc_vars(self, ctx:littleDuckParser.Opc_varsContext):
        pass

    # Exit a parse tree produced by littleDuckParser#opc_vars.
    def exitOpc_vars(self, ctx:littleDuckParser.Opc_varsContext):
        pass


    # Enter a parse tree produced by littleDuckParser#optional_funcs.
    def enterOptional_funcs(self, ctx:littleDuckParser.Optional_funcsContext):
        pass

    # Exit a parse tree produced by littleDuckParser#optional_funcs.
    def exitOptional_funcs(self, ctx:littleDuckParser.Optional_funcsContext):
        pass


    # Enter a parse tree produced by littleDuckParser#vars.
    def enterVars(self, ctx:littleDuckParser.VarsContext):
        pass

    # Exit a parse tree produced by littleDuckParser#vars.
    def exitVars(self, ctx:littleDuckParser.VarsContext):
        pass


    # Enter a parse tree produced by littleDuckParser#mas_vars.
    def enterMas_vars(self, ctx:littleDuckParser.Mas_varsContext):
        pass

    # Exit a parse tree produced by littleDuckParser#mas_vars.
    def exitMas_vars(self, ctx:littleDuckParser.Mas_varsContext):
        pass


    # Enter a parse tree produced by littleDuckParser#mas_dec_vars.
    def enterMas_dec_vars(self, ctx:littleDuckParser.Mas_dec_varsContext):
        pass

    # Exit a parse tree produced by littleDuckParser#mas_dec_vars.
    def exitMas_dec_vars(self, ctx:littleDuckParser.Mas_dec_varsContext):
        pass


    # Enter a parse tree produced by littleDuckParser#type.
    def enterType(self, ctx:littleDuckParser.TypeContext):
        pass

    # Exit a parse tree produced by littleDuckParser#type.
    def exitType(self, ctx:littleDuckParser.TypeContext):
        pass


    # Enter a parse tree produced by littleDuckParser#body.
    def enterBody(self, ctx:littleDuckParser.BodyContext):
        pass

    # Exit a parse tree produced by littleDuckParser#body.
    def exitBody(self, ctx:littleDuckParser.BodyContext):
        pass


    # Enter a parse tree produced by littleDuckParser#statement.
    def enterStatement(self, ctx:littleDuckParser.StatementContext):
        pass

    # Exit a parse tree produced by littleDuckParser#statement.
    def exitStatement(self, ctx:littleDuckParser.StatementContext):
        pass


    # Enter a parse tree produced by littleDuckParser#options_statement.
    def enterOptions_statement(self, ctx:littleDuckParser.Options_statementContext):
        pass

    # Exit a parse tree produced by littleDuckParser#options_statement.
    def exitOptions_statement(self, ctx:littleDuckParser.Options_statementContext):
        pass


    # Enter a parse tree produced by littleDuckParser#assign.
    def enterAssign(self, ctx:littleDuckParser.AssignContext):
        pass

    # Exit a parse tree produced by littleDuckParser#assign.
    def exitAssign(self, ctx:littleDuckParser.AssignContext):
        pass


    # Enter a parse tree produced by littleDuckParser#condition.
    def enterCondition(self, ctx:littleDuckParser.ConditionContext):
        pass

    # Exit a parse tree produced by littleDuckParser#condition.
    def exitCondition(self, ctx:littleDuckParser.ConditionContext):
        pass


    # Enter a parse tree produced by littleDuckParser#else.
    def enterElse(self, ctx:littleDuckParser.ElseContext):
        pass

    # Exit a parse tree produced by littleDuckParser#else.
    def exitElse(self, ctx:littleDuckParser.ElseContext):
        pass


    # Enter a parse tree produced by littleDuckParser#cycle.
    def enterCycle(self, ctx:littleDuckParser.CycleContext):
        pass

    # Exit a parse tree produced by littleDuckParser#cycle.
    def exitCycle(self, ctx:littleDuckParser.CycleContext):
        pass


    # Enter a parse tree produced by littleDuckParser#f_call.
    def enterF_call(self, ctx:littleDuckParser.F_callContext):
        pass

    # Exit a parse tree produced by littleDuckParser#f_call.
    def exitF_call(self, ctx:littleDuckParser.F_callContext):
        pass


    # Enter a parse tree produced by littleDuckParser#opc_f_call.
    def enterOpc_f_call(self, ctx:littleDuckParser.Opc_f_callContext):
        pass

    # Exit a parse tree produced by littleDuckParser#opc_f_call.
    def exitOpc_f_call(self, ctx:littleDuckParser.Opc_f_callContext):
        pass


    # Enter a parse tree produced by littleDuckParser#mas_f_call.
    def enterMas_f_call(self, ctx:littleDuckParser.Mas_f_callContext):
        pass

    # Exit a parse tree produced by littleDuckParser#mas_f_call.
    def exitMas_f_call(self, ctx:littleDuckParser.Mas_f_callContext):
        pass


    # Enter a parse tree produced by littleDuckParser#print.
    def enterPrint(self, ctx:littleDuckParser.PrintContext):
        pass

    # Exit a parse tree produced by littleDuckParser#print.
    def exitPrint(self, ctx:littleDuckParser.PrintContext):
        pass


    # Enter a parse tree produced by littleDuckParser#opc_print.
    def enterOpc_print(self, ctx:littleDuckParser.Opc_printContext):
        pass

    # Exit a parse tree produced by littleDuckParser#opc_print.
    def exitOpc_print(self, ctx:littleDuckParser.Opc_printContext):
        pass


    # Enter a parse tree produced by littleDuckParser#mas_print.
    def enterMas_print(self, ctx:littleDuckParser.Mas_printContext):
        pass

    # Exit a parse tree produced by littleDuckParser#mas_print.
    def exitMas_print(self, ctx:littleDuckParser.Mas_printContext):
        pass


    # Enter a parse tree produced by littleDuckParser#funcs.
    def enterFuncs(self, ctx:littleDuckParser.FuncsContext):
        pass

    # Exit a parse tree produced by littleDuckParser#funcs.
    def exitFuncs(self, ctx:littleDuckParser.FuncsContext):
        pass


    # Enter a parse tree produced by littleDuckParser#opc_funcs.
    def enterOpc_funcs(self, ctx:littleDuckParser.Opc_funcsContext):
        pass

    # Exit a parse tree produced by littleDuckParser#opc_funcs.
    def exitOpc_funcs(self, ctx:littleDuckParser.Opc_funcsContext):
        pass


    # Enter a parse tree produced by littleDuckParser#mas_opc_funcs.
    def enterMas_opc_funcs(self, ctx:littleDuckParser.Mas_opc_funcsContext):
        pass

    # Exit a parse tree produced by littleDuckParser#mas_opc_funcs.
    def exitMas_opc_funcs(self, ctx:littleDuckParser.Mas_opc_funcsContext):
        pass


    # Enter a parse tree produced by littleDuckParser#next_opc_funcs.
    def enterNext_opc_funcs(self, ctx:littleDuckParser.Next_opc_funcsContext):
        pass

    # Exit a parse tree produced by littleDuckParser#next_opc_funcs.
    def exitNext_opc_funcs(self, ctx:littleDuckParser.Next_opc_funcsContext):
        pass


    # Enter a parse tree produced by littleDuckParser#vars_funcs.
    def enterVars_funcs(self, ctx:littleDuckParser.Vars_funcsContext):
        pass

    # Exit a parse tree produced by littleDuckParser#vars_funcs.
    def exitVars_funcs(self, ctx:littleDuckParser.Vars_funcsContext):
        pass


    # Enter a parse tree produced by littleDuckParser#cte.
    def enterCte(self, ctx:littleDuckParser.CteContext):
        pass

    # Exit a parse tree produced by littleDuckParser#cte.
    def exitCte(self, ctx:littleDuckParser.CteContext):
        pass


    # Enter a parse tree produced by littleDuckParser#expresion.
    def enterExpresion(self, ctx:littleDuckParser.ExpresionContext):
        pass

    # Exit a parse tree produced by littleDuckParser#expresion.
    def exitExpresion(self, ctx:littleDuckParser.ExpresionContext):
        pass


    # Enter a parse tree produced by littleDuckParser#opc_expresion.
    def enterOpc_expresion(self, ctx:littleDuckParser.Opc_expresionContext):
        pass

    # Exit a parse tree produced by littleDuckParser#opc_expresion.
    def exitOpc_expresion(self, ctx:littleDuckParser.Opc_expresionContext):
        pass


    # Enter a parse tree produced by littleDuckParser#exp.
    def enterExp(self, ctx:littleDuckParser.ExpContext):
        pass

    # Exit a parse tree produced by littleDuckParser#exp.
    def exitExp(self, ctx:littleDuckParser.ExpContext):
        pass


    # Enter a parse tree produced by littleDuckParser#mas_exp.
    def enterMas_exp(self, ctx:littleDuckParser.Mas_expContext):
        pass

    # Exit a parse tree produced by littleDuckParser#mas_exp.
    def exitMas_exp(self, ctx:littleDuckParser.Mas_expContext):
        pass


    # Enter a parse tree produced by littleDuckParser#signo.
    def enterSigno(self, ctx:littleDuckParser.SignoContext):
        pass

    # Exit a parse tree produced by littleDuckParser#signo.
    def exitSigno(self, ctx:littleDuckParser.SignoContext):
        pass


    # Enter a parse tree produced by littleDuckParser#termino.
    def enterTermino(self, ctx:littleDuckParser.TerminoContext):
        pass

    # Exit a parse tree produced by littleDuckParser#termino.
    def exitTermino(self, ctx:littleDuckParser.TerminoContext):
        pass


    # Enter a parse tree produced by littleDuckParser#mas_termino.
    def enterMas_termino(self, ctx:littleDuckParser.Mas_terminoContext):
        pass

    # Exit a parse tree produced by littleDuckParser#mas_termino.
    def exitMas_termino(self, ctx:littleDuckParser.Mas_terminoContext):
        pass


    # Enter a parse tree produced by littleDuckParser#signo_factor.
    def enterSigno_factor(self, ctx:littleDuckParser.Signo_factorContext):
        pass

    # Exit a parse tree produced by littleDuckParser#signo_factor.
    def exitSigno_factor(self, ctx:littleDuckParser.Signo_factorContext):
        pass


    # Enter a parse tree produced by littleDuckParser#factor.
    def enterFactor(self, ctx:littleDuckParser.FactorContext):
        pass

    # Exit a parse tree produced by littleDuckParser#factor.
    def exitFactor(self, ctx:littleDuckParser.FactorContext):
        pass


    # Enter a parse tree produced by littleDuckParser#opc_factor.
    def enterOpc_factor(self, ctx:littleDuckParser.Opc_factorContext):
        pass

    # Exit a parse tree produced by littleDuckParser#opc_factor.
    def exitOpc_factor(self, ctx:littleDuckParser.Opc_factorContext):
        pass


    # Enter a parse tree produced by littleDuckParser#opc_signo.
    def enterOpc_signo(self, ctx:littleDuckParser.Opc_signoContext):
        pass

    # Exit a parse tree produced by littleDuckParser#opc_signo.
    def exitOpc_signo(self, ctx:littleDuckParser.Opc_signoContext):
        pass


    # Enter a parse tree produced by littleDuckParser#opc_factor_prime.
    def enterOpc_factor_prime(self, ctx:littleDuckParser.Opc_factor_primeContext):
        pass

    # Exit a parse tree produced by littleDuckParser#opc_factor_prime.
    def exitOpc_factor_prime(self, ctx:littleDuckParser.Opc_factor_primeContext):
        pass



del littleDuckParser