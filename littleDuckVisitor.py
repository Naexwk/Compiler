# Generated from littleDuck.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .littleDuckParser import littleDuckParser
else:
    from littleDuckParser import littleDuckParser

# This class defines a complete generic visitor for a parse tree produced by littleDuckParser.

class littleDuckVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by littleDuckParser#programa.
    def visitPrograma(self, ctx:littleDuckParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#opc_vars.
    def visitOpc_vars(self, ctx:littleDuckParser.Opc_varsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#optional_funcs.
    def visitOptional_funcs(self, ctx:littleDuckParser.Optional_funcsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#vars.
    def visitVars(self, ctx:littleDuckParser.VarsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#mas_vars.
    def visitMas_vars(self, ctx:littleDuckParser.Mas_varsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#mas_dec_vars.
    def visitMas_dec_vars(self, ctx:littleDuckParser.Mas_dec_varsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#type.
    def visitType(self, ctx:littleDuckParser.TypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#body.
    def visitBody(self, ctx:littleDuckParser.BodyContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#statement.
    def visitStatement(self, ctx:littleDuckParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#options_statement.
    def visitOptions_statement(self, ctx:littleDuckParser.Options_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#assign.
    def visitAssign(self, ctx:littleDuckParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#condition.
    def visitCondition(self, ctx:littleDuckParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#else.
    def visitElse(self, ctx:littleDuckParser.ElseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#cycle.
    def visitCycle(self, ctx:littleDuckParser.CycleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#f_call.
    def visitF_call(self, ctx:littleDuckParser.F_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#opc_f_call.
    def visitOpc_f_call(self, ctx:littleDuckParser.Opc_f_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#mas_f_call.
    def visitMas_f_call(self, ctx:littleDuckParser.Mas_f_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#print.
    def visitPrint(self, ctx:littleDuckParser.PrintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#opc_print.
    def visitOpc_print(self, ctx:littleDuckParser.Opc_printContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#mas_print.
    def visitMas_print(self, ctx:littleDuckParser.Mas_printContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#funcs.
    def visitFuncs(self, ctx:littleDuckParser.FuncsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#opc_funcs.
    def visitOpc_funcs(self, ctx:littleDuckParser.Opc_funcsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#mas_opc_funcs.
    def visitMas_opc_funcs(self, ctx:littleDuckParser.Mas_opc_funcsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#next_opc_funcs.
    def visitNext_opc_funcs(self, ctx:littleDuckParser.Next_opc_funcsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#vars_funcs.
    def visitVars_funcs(self, ctx:littleDuckParser.Vars_funcsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#cte.
    def visitCte(self, ctx:littleDuckParser.CteContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#expresion.
    def visitExpresion(self, ctx:littleDuckParser.ExpresionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#opc_expresion.
    def visitOpc_expresion(self, ctx:littleDuckParser.Opc_expresionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#exp.
    def visitExp(self, ctx:littleDuckParser.ExpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#mas_exp.
    def visitMas_exp(self, ctx:littleDuckParser.Mas_expContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#signo.
    def visitSigno(self, ctx:littleDuckParser.SignoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#termino.
    def visitTermino(self, ctx:littleDuckParser.TerminoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#mas_termino.
    def visitMas_termino(self, ctx:littleDuckParser.Mas_terminoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#signo_factor.
    def visitSigno_factor(self, ctx:littleDuckParser.Signo_factorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#factor.
    def visitFactor(self, ctx:littleDuckParser.FactorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#opc_factor.
    def visitOpc_factor(self, ctx:littleDuckParser.Opc_factorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#opc_signo.
    def visitOpc_signo(self, ctx:littleDuckParser.Opc_signoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by littleDuckParser#opc_factor_prime.
    def visitOpc_factor_prime(self, ctx:littleDuckParser.Opc_factor_primeContext):
        return self.visitChildren(ctx)



del littleDuckParser