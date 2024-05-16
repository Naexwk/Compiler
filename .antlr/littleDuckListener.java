// Generated from c:/Docs/Compiler/littleDuck.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link littleDuckParser}.
 */
public interface littleDuckListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(littleDuckParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(littleDuckParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#opc_vars}.
	 * @param ctx the parse tree
	 */
	void enterOpc_vars(littleDuckParser.Opc_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#opc_vars}.
	 * @param ctx the parse tree
	 */
	void exitOpc_vars(littleDuckParser.Opc_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#optional_funcs}.
	 * @param ctx the parse tree
	 */
	void enterOptional_funcs(littleDuckParser.Optional_funcsContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#optional_funcs}.
	 * @param ctx the parse tree
	 */
	void exitOptional_funcs(littleDuckParser.Optional_funcsContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(littleDuckParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(littleDuckParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#mas_vars}.
	 * @param ctx the parse tree
	 */
	void enterMas_vars(littleDuckParser.Mas_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#mas_vars}.
	 * @param ctx the parse tree
	 */
	void exitMas_vars(littleDuckParser.Mas_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#mas_dec_vars}.
	 * @param ctx the parse tree
	 */
	void enterMas_dec_vars(littleDuckParser.Mas_dec_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#mas_dec_vars}.
	 * @param ctx the parse tree
	 */
	void exitMas_dec_vars(littleDuckParser.Mas_dec_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(littleDuckParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(littleDuckParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(littleDuckParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(littleDuckParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(littleDuckParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(littleDuckParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#options_statement}.
	 * @param ctx the parse tree
	 */
	void enterOptions_statement(littleDuckParser.Options_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#options_statement}.
	 * @param ctx the parse tree
	 */
	void exitOptions_statement(littleDuckParser.Options_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(littleDuckParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(littleDuckParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(littleDuckParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(littleDuckParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(littleDuckParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(littleDuckParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#cycle}.
	 * @param ctx the parse tree
	 */
	void enterCycle(littleDuckParser.CycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#cycle}.
	 * @param ctx the parse tree
	 */
	void exitCycle(littleDuckParser.CycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#f_call}.
	 * @param ctx the parse tree
	 */
	void enterF_call(littleDuckParser.F_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#f_call}.
	 * @param ctx the parse tree
	 */
	void exitF_call(littleDuckParser.F_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#opc_f_call}.
	 * @param ctx the parse tree
	 */
	void enterOpc_f_call(littleDuckParser.Opc_f_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#opc_f_call}.
	 * @param ctx the parse tree
	 */
	void exitOpc_f_call(littleDuckParser.Opc_f_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#mas_f_call}.
	 * @param ctx the parse tree
	 */
	void enterMas_f_call(littleDuckParser.Mas_f_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#mas_f_call}.
	 * @param ctx the parse tree
	 */
	void exitMas_f_call(littleDuckParser.Mas_f_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(littleDuckParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(littleDuckParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#opc_print}.
	 * @param ctx the parse tree
	 */
	void enterOpc_print(littleDuckParser.Opc_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#opc_print}.
	 * @param ctx the parse tree
	 */
	void exitOpc_print(littleDuckParser.Opc_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#mas_print}.
	 * @param ctx the parse tree
	 */
	void enterMas_print(littleDuckParser.Mas_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#mas_print}.
	 * @param ctx the parse tree
	 */
	void exitMas_print(littleDuckParser.Mas_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#funcs}.
	 * @param ctx the parse tree
	 */
	void enterFuncs(littleDuckParser.FuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#funcs}.
	 * @param ctx the parse tree
	 */
	void exitFuncs(littleDuckParser.FuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#opc_funcs}.
	 * @param ctx the parse tree
	 */
	void enterOpc_funcs(littleDuckParser.Opc_funcsContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#opc_funcs}.
	 * @param ctx the parse tree
	 */
	void exitOpc_funcs(littleDuckParser.Opc_funcsContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#mas_opc_funcs}.
	 * @param ctx the parse tree
	 */
	void enterMas_opc_funcs(littleDuckParser.Mas_opc_funcsContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#mas_opc_funcs}.
	 * @param ctx the parse tree
	 */
	void exitMas_opc_funcs(littleDuckParser.Mas_opc_funcsContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#next_opc_funcs}.
	 * @param ctx the parse tree
	 */
	void enterNext_opc_funcs(littleDuckParser.Next_opc_funcsContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#next_opc_funcs}.
	 * @param ctx the parse tree
	 */
	void exitNext_opc_funcs(littleDuckParser.Next_opc_funcsContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#vars_funcs}.
	 * @param ctx the parse tree
	 */
	void enterVars_funcs(littleDuckParser.Vars_funcsContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#vars_funcs}.
	 * @param ctx the parse tree
	 */
	void exitVars_funcs(littleDuckParser.Vars_funcsContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#cte}.
	 * @param ctx the parse tree
	 */
	void enterCte(littleDuckParser.CteContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#cte}.
	 * @param ctx the parse tree
	 */
	void exitCte(littleDuckParser.CteContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(littleDuckParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(littleDuckParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#opc_expresion}.
	 * @param ctx the parse tree
	 */
	void enterOpc_expresion(littleDuckParser.Opc_expresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#opc_expresion}.
	 * @param ctx the parse tree
	 */
	void exitOpc_expresion(littleDuckParser.Opc_expresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(littleDuckParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(littleDuckParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#mas_exp}.
	 * @param ctx the parse tree
	 */
	void enterMas_exp(littleDuckParser.Mas_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#mas_exp}.
	 * @param ctx the parse tree
	 */
	void exitMas_exp(littleDuckParser.Mas_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#signo}.
	 * @param ctx the parse tree
	 */
	void enterSigno(littleDuckParser.SignoContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#signo}.
	 * @param ctx the parse tree
	 */
	void exitSigno(littleDuckParser.SignoContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(littleDuckParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(littleDuckParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#mas_termino}.
	 * @param ctx the parse tree
	 */
	void enterMas_termino(littleDuckParser.Mas_terminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#mas_termino}.
	 * @param ctx the parse tree
	 */
	void exitMas_termino(littleDuckParser.Mas_terminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#signo_factor}.
	 * @param ctx the parse tree
	 */
	void enterSigno_factor(littleDuckParser.Signo_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#signo_factor}.
	 * @param ctx the parse tree
	 */
	void exitSigno_factor(littleDuckParser.Signo_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(littleDuckParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(littleDuckParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#opc_factor}.
	 * @param ctx the parse tree
	 */
	void enterOpc_factor(littleDuckParser.Opc_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#opc_factor}.
	 * @param ctx the parse tree
	 */
	void exitOpc_factor(littleDuckParser.Opc_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#opc_signo}.
	 * @param ctx the parse tree
	 */
	void enterOpc_signo(littleDuckParser.Opc_signoContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#opc_signo}.
	 * @param ctx the parse tree
	 */
	void exitOpc_signo(littleDuckParser.Opc_signoContext ctx);
	/**
	 * Enter a parse tree produced by {@link littleDuckParser#opc_factor_prime}.
	 * @param ctx the parse tree
	 */
	void enterOpc_factor_prime(littleDuckParser.Opc_factor_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link littleDuckParser#opc_factor_prime}.
	 * @param ctx the parse tree
	 */
	void exitOpc_factor_prime(littleDuckParser.Opc_factor_primeContext ctx);
}