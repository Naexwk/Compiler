// Generated from c:/Docs/Compiler/littleDuck.g4 by ANTLR 4.13.1
 
from Middleman import *

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class littleDuckParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, NEWLINE=30, WHITESPACE=31, 
		CTE_INT=32, CTE_FLOAT=33, CTE_STRING=34, ID=35;
	public static final int
		RULE_programa = 0, RULE_opc_vars = 1, RULE_optional_funcs = 2, RULE_vars = 3, 
		RULE_mas_vars = 4, RULE_mas_dec_vars = 5, RULE_type = 6, RULE_body = 7, 
		RULE_statement = 8, RULE_options_statement = 9, RULE_assign = 10, RULE_condition = 11, 
		RULE_else = 12, RULE_cycle = 13, RULE_f_call = 14, RULE_opc_f_call = 15, 
		RULE_mas_f_call = 16, RULE_print = 17, RULE_opc_print = 18, RULE_mas_print = 19, 
		RULE_funcs = 20, RULE_opc_funcs = 21, RULE_mas_opc_funcs = 22, RULE_next_opc_funcs = 23, 
		RULE_vars_funcs = 24, RULE_cte = 25, RULE_expresion = 26, RULE_opc_expresion = 27, 
		RULE_exp = 28, RULE_mas_exp = 29, RULE_exp_signo = 30, RULE_termino = 31, 
		RULE_mas_termino = 32, RULE_signo_factor = 33, RULE_factor = 34, RULE_opc_factor = 35, 
		RULE_opc_signo = 36, RULE_signo = 37, RULE_opc_factor_prime = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "opc_vars", "optional_funcs", "vars", "mas_vars", "mas_dec_vars", 
			"type", "body", "statement", "options_statement", "assign", "condition", 
			"else", "cycle", "f_call", "opc_f_call", "mas_f_call", "print", "opc_print", 
			"mas_print", "funcs", "opc_funcs", "mas_opc_funcs", "next_opc_funcs", 
			"vars_funcs", "cte", "expresion", "opc_expresion", "exp", "mas_exp", 
			"exp_signo", "termino", "mas_termino", "signo_factor", "factor", "opc_factor", 
			"opc_signo", "signo", "opc_factor_prime"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'main'", "'end'", "'var'", "':'", "','", "'int'", 
			"'float'", "'{'", "'}'", "'='", "'if'", "'('", "')'", "'else'", "'do'", 
			"'while'", "'print'", "'void'", "'['", "']'", "'>'", "'<'", "'!='", "'+'", 
			"'-'", "'*'", "'/'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "NEWLINE", "WHITESPACE", "CTE_INT", 
			"CTE_FLOAT", "CTE_STRING", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "littleDuck.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public littleDuckParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(littleDuckParser.ID, 0); }
		public Opc_varsContext opc_vars() {
			return getRuleContext(Opc_varsContext.class,0);
		}
		public Optional_funcsContext optional_funcs() {
			return getRuleContext(Optional_funcsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			((ProgramaContext)_localctx).ID = match(ID);

			program.variableTable["owner"] = (((ProgramaContext)_localctx).ID!=null?((ProgramaContext)_localctx).ID.getText():null)

			setState(81);
			match(T__1);
			setState(82);
			opc_vars();
			setState(83);
			optional_funcs();
			setState(84);
			match(T__2);
			setState(85);
			body();
			setState(86);
			match(T__3);

			program.insertQuad('end', None, None, None)
			print(program.variableTable)
			print(program.quadruples)
			print(program.stack_operands)
			print(program.stack_operator)
			print(program.stack_jumps)

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Opc_varsContext extends ParserRuleContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public Opc_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opc_vars; }
	}

	public final Opc_varsContext opc_vars() throws RecognitionException {
		Opc_varsContext _localctx = new Opc_varsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_opc_vars);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{

				program.currentLevel = "global"

				setState(90);
				vars();
				}
				break;
			case T__2:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Optional_funcsContext extends ParserRuleContext {
		public FuncsContext funcs() {
			return getRuleContext(FuncsContext.class,0);
		}
		public Optional_funcsContext optional_funcs() {
			return getRuleContext(Optional_funcsContext.class,0);
		}
		public Optional_funcsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_funcs; }
	}

	public final Optional_funcsContext optional_funcs() throws RecognitionException {
		Optional_funcsContext _localctx = new Optional_funcsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_optional_funcs);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				funcs();
				setState(95);
				optional_funcs();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarsContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(littleDuckParser.ID, 0); }
		public Mas_varsContext mas_vars() {
			return getRuleContext(Mas_varsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Mas_dec_varsContext mas_dec_vars() {
			return getRuleContext(Mas_dec_varsContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__4);
			setState(101);
			((VarsContext)_localctx).ID = match(ID);

			program.declareNewVariable((((VarsContext)_localctx).ID!=null?((VarsContext)_localctx).ID.getText():null))

			setState(103);
			mas_vars();
			setState(104);
			match(T__5);
			setState(105);
			type();
			setState(106);
			match(T__1);
			program.clearTempVarDeclaration()
			setState(108);
			mas_dec_vars();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mas_varsContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(littleDuckParser.ID, 0); }
		public Mas_varsContext mas_vars() {
			return getRuleContext(Mas_varsContext.class,0);
		}
		public Mas_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_vars; }
	}

	public final Mas_varsContext mas_vars() throws RecognitionException {
		Mas_varsContext _localctx = new Mas_varsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mas_vars);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(T__6);
				setState(111);
				((Mas_varsContext)_localctx).ID = match(ID);

				program.declareNewVariable((((Mas_varsContext)_localctx).ID!=null?((Mas_varsContext)_localctx).ID.getText():null))

				setState(113);
				mas_vars();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mas_dec_varsContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(littleDuckParser.ID, 0); }
		public Mas_varsContext mas_vars() {
			return getRuleContext(Mas_varsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Mas_dec_varsContext mas_dec_vars() {
			return getRuleContext(Mas_dec_varsContext.class,0);
		}
		public Mas_dec_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_dec_vars; }
	}

	public final Mas_dec_varsContext mas_dec_vars() throws RecognitionException {
		Mas_dec_varsContext _localctx = new Mas_dec_varsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mas_dec_vars);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				((Mas_dec_varsContext)_localctx).ID = match(ID);

				program.declareNewVariable((((Mas_dec_varsContext)_localctx).ID!=null?((Mas_dec_varsContext)_localctx).ID.getText():null))

				setState(119);
				mas_vars();
				setState(120);
				match(T__5);
				setState(121);
				type();
				setState(122);
				match(T__1);
				program.clearTempVarDeclaration()
				setState(124);
				mas_dec_vars();
				}
				break;
			case T__2:
			case T__9:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__7);
				program.currentType = "int"
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__8);
				program.currentType = "float"
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__9);
			setState(136);
			statement();
			setState(137);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Options_statementContext options_statement() {
			return getRuleContext(Options_statementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__16:
			case T__18:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				options_statement();
				setState(140);
				statement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Options_statementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CycleContext cycle() {
			return getRuleContext(CycleContext.class,0);
		}
		public F_callContext f_call() {
			return getRuleContext(F_callContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Options_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_options_statement; }
	}

	public final Options_statementContext options_statement() throws RecognitionException {
		Options_statementContext _localctx = new Options_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_options_statement);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				cycle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				f_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				print();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(littleDuckParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			((AssignContext)_localctx).ID = match(ID);

			program.variableDeclared((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null))

			setState(154);
			match(T__11);
			setState(155);
			expresion();

			if program.variableDeclared((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null)):
			    program.assignInsertQuad('=', program.stack_operands.pop(), None, (((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null))
			    program.clearTempVars()

			setState(157);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__12);
			setState(160);
			match(T__13);
			setState(161);
			expresion();
			setState(162);
			match(T__14);

			if program.checkBoolExpression():
			    program.insertQuad('GOTOF', program.stack_operands.pop(), None, None)
			    program.stack_jumps.append(len(program.quadruples) - 1)
			setState(164);
			body();
			setState(165);
			else_();

			program.editQuad(2, len(program.quadruples), program.stack_jumps.pop())

			setState(167);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_else);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__15);

				program.insertQuad('GOTO', None, None, None)
				program.editQuad(2, len(program.quadruples), program.stack_jumps.pop())
				program.stack_jumps.append(len(program.quadruples) - 1)

				setState(171);
				body();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CycleContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle; }
	}

	public final CycleContext cycle() throws RecognitionException {
		CycleContext _localctx = new CycleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__16);
			program.stack_jumps.append(len(program.quadruples))
			setState(177);
			body();
			setState(178);
			match(T__17);
			setState(179);
			match(T__13);
			setState(180);
			expresion();
			setState(181);
			match(T__14);

			if program.checkBoolExpression():
			    program.insertQuad('GOTOT', program.stack_operands.pop(), program.stack_jumps.pop(), None)

			setState(183);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class F_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(littleDuckParser.ID, 0); }
		public Opc_f_callContext opc_f_call() {
			return getRuleContext(Opc_f_callContext.class,0);
		}
		public F_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_call; }
	}

	public final F_callContext f_call() throws RecognitionException {
		F_callContext _localctx = new F_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_f_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ID);
			setState(186);
			match(T__13);
			setState(187);
			opc_f_call();
			setState(188);
			match(T__14);
			setState(189);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Opc_f_callContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Mas_f_callContext mas_f_call() {
			return getRuleContext(Mas_f_callContext.class,0);
		}
		public Opc_f_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opc_f_call; }
	}

	public final Opc_f_callContext opc_f_call() throws RecognitionException {
		Opc_f_callContext _localctx = new Opc_f_callContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_opc_f_call);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__25:
			case T__26:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				expresion();
				setState(192);
				mas_f_call();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mas_f_callContext extends ParserRuleContext {
		public Opc_f_callContext opc_f_call() {
			return getRuleContext(Opc_f_callContext.class,0);
		}
		public Mas_f_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_f_call; }
	}

	public final Mas_f_callContext mas_f_call() throws RecognitionException {
		Mas_f_callContext _localctx = new Mas_f_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mas_f_call);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(T__6);
				setState(198);
				opc_f_call();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public Opc_printContext opc_print() {
			return getRuleContext(Opc_printContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__18);
			setState(203);
			match(T__13);
			setState(204);
			opc_print();
			setState(205);
			match(T__14);
			setState(206);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Opc_printContext extends ParserRuleContext {
		public Token CTE_STRING;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Mas_printContext mas_print() {
			return getRuleContext(Mas_printContext.class,0);
		}
		public TerminalNode CTE_STRING() { return getToken(littleDuckParser.CTE_STRING, 0); }
		public Opc_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opc_print; }
	}

	public final Opc_printContext opc_print() throws RecognitionException {
		Opc_printContext _localctx = new Opc_printContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_opc_print);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__25:
			case T__26:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				print("hanlo")
				setState(209);
				expresion();
				program.insertQuad('print', program.stack_operands.pop(), None, None)
				program.clearTempVars()
				setState(211);
				mas_print();
				}
				break;
			case CTE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				((Opc_printContext)_localctx).CTE_STRING = match(CTE_STRING);
				program.insertQuad('print', (((Opc_printContext)_localctx).CTE_STRING!=null?((Opc_printContext)_localctx).CTE_STRING.getText():null), None, None)
				program.clearTempVars()
				setState(215);
				mas_print();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mas_printContext extends ParserRuleContext {
		public Opc_printContext opc_print() {
			return getRuleContext(Opc_printContext.class,0);
		}
		public Mas_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_print; }
	}

	public final Mas_printContext mas_print() throws RecognitionException {
		Mas_printContext _localctx = new Mas_printContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mas_print);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(T__6);
				setState(219);
				opc_print();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncsContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(littleDuckParser.ID, 0); }
		public Opc_funcsContext opc_funcs() {
			return getRuleContext(Opc_funcsContext.class,0);
		}
		public Vars_funcsContext vars_funcs() {
			return getRuleContext(Vars_funcsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public FuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs; }
	}

	public final FuncsContext funcs() throws RecognitionException {
		FuncsContext _localctx = new FuncsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__19);
			setState(224);
			((FuncsContext)_localctx).ID = match(ID);

			program.newFunction((((FuncsContext)_localctx).ID!=null?((FuncsContext)_localctx).ID.getText():null))

			setState(226);
			match(T__13);
			setState(227);
			opc_funcs();
			setState(228);
			match(T__14);
			setState(229);
			match(T__20);
			setState(230);
			vars_funcs();
			setState(231);
			body();
			setState(232);
			match(T__21);
			setState(233);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Opc_funcsContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(littleDuckParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Mas_opc_funcsContext mas_opc_funcs() {
			return getRuleContext(Mas_opc_funcsContext.class,0);
		}
		public Opc_funcsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opc_funcs; }
	}

	public final Opc_funcsContext opc_funcs() throws RecognitionException {
		Opc_funcsContext _localctx = new Opc_funcsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_opc_funcs);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				((Opc_funcsContext)_localctx).ID = match(ID);

				program.declareNewVariable((((Opc_funcsContext)_localctx).ID!=null?((Opc_funcsContext)_localctx).ID.getText():null))

				setState(237);
				match(T__5);
				setState(238);
				type();
				setState(239);
				mas_opc_funcs();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mas_opc_funcsContext extends ParserRuleContext {
		public Next_opc_funcsContext next_opc_funcs() {
			return getRuleContext(Next_opc_funcsContext.class,0);
		}
		public Mas_opc_funcsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_opc_funcs; }
	}

	public final Mas_opc_funcsContext mas_opc_funcs() throws RecognitionException {
		Mas_opc_funcsContext _localctx = new Mas_opc_funcsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mas_opc_funcs);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__6);
				setState(245);
				next_opc_funcs();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Next_opc_funcsContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(littleDuckParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Mas_opc_funcsContext mas_opc_funcs() {
			return getRuleContext(Mas_opc_funcsContext.class,0);
		}
		public Next_opc_funcsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_next_opc_funcs; }
	}

	public final Next_opc_funcsContext next_opc_funcs() throws RecognitionException {
		Next_opc_funcsContext _localctx = new Next_opc_funcsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_next_opc_funcs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			((Next_opc_funcsContext)_localctx).ID = match(ID);

			program.declareNewVariable((((Next_opc_funcsContext)_localctx).ID!=null?((Next_opc_funcsContext)_localctx).ID.getText():null))

			setState(251);
			match(T__5);
			setState(252);
			type();
			setState(253);
			mas_opc_funcs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Vars_funcsContext extends ParserRuleContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public Vars_funcsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars_funcs; }
	}

	public final Vars_funcsContext vars_funcs() throws RecognitionException {
		Vars_funcsContext _localctx = new Vars_funcsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_vars_funcs);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				vars();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CteContext extends ParserRuleContext {
		public Token CTE_INT;
		public Token CTE_FLOAT;
		public TerminalNode CTE_INT() { return getToken(littleDuckParser.CTE_INT, 0); }
		public TerminalNode CTE_FLOAT() { return getToken(littleDuckParser.CTE_FLOAT, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cte);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CTE_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				((CteContext)_localctx).CTE_INT = match(CTE_INT);
				program.stack_operands.append(int((((CteContext)_localctx).CTE_INT!=null?((CteContext)_localctx).CTE_INT.getText():null)))
				}
				break;
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				((CteContext)_localctx).CTE_FLOAT = match(CTE_FLOAT);
				program.stack_operands.append(float((((CteContext)_localctx).CTE_FLOAT!=null?((CteContext)_localctx).CTE_FLOAT.getText():null)))
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Opc_expresionContext opc_expresion() {
			return getRuleContext(Opc_expresionContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			exp();
			program.clearQuadrupleList('+')
			setState(267);
			opc_expresion();
			program.clearQuadrupleList('eoe')
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Opc_expresionContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Opc_expresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opc_expresion; }
	}

	public final Opc_expresionContext opc_expresion() throws RecognitionException {
		Opc_expresionContext _localctx = new Opc_expresionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_opc_expresion);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(T__22);

				program.stack_operator.append('>')

				setState(272);
				exp();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(T__23);

				program.stack_operator.append('<')

				setState(275);
				exp();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(T__24);

				program.stack_operator.append('!=')

				setState(278);
				exp();
				}
				break;
			case T__1:
			case T__6:
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Mas_expContext mas_exp() {
			return getRuleContext(Mas_expContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			termino();
			program.clearQuadrupleList('*')
			setState(284);
			mas_exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mas_expContext extends ParserRuleContext {
		public Exp_signoContext exp_signo() {
			return getRuleContext(Exp_signoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Mas_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_exp; }
	}

	public final Mas_expContext mas_exp() throws RecognitionException {
		Mas_expContext _localctx = new Mas_expContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mas_exp);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				exp_signo();
				setState(287);
				exp();
				}
				break;
			case T__1:
			case T__6:
			case T__14:
			case T__22:
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_signoContext extends ParserRuleContext {
		public Exp_signoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_signo; }
	}

	public final Exp_signoContext exp_signo() throws RecognitionException {
		Exp_signoContext _localctx = new Exp_signoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exp_signo);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(T__25);

				program.stack_operator.append('+')

				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(T__26);

				program.stack_operator.append('-')

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Mas_terminoContext mas_termino() {
			return getRuleContext(Mas_terminoContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			factor();
			setState(299);
			mas_termino();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mas_terminoContext extends ParserRuleContext {
		public Signo_factorContext signo_factor() {
			return getRuleContext(Signo_factorContext.class,0);
		}
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Mas_terminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_termino; }
	}

	public final Mas_terminoContext mas_termino() throws RecognitionException {
		Mas_terminoContext _localctx = new Mas_terminoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mas_termino);
		try {
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				signo_factor();
				setState(302);
				termino();
				}
				break;
			case T__1:
			case T__6:
			case T__14:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Signo_factorContext extends ParserRuleContext {
		public Signo_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signo_factor; }
	}

	public final Signo_factorContext signo_factor() throws RecognitionException {
		Signo_factorContext _localctx = new Signo_factorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_signo_factor);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(T__27);
				program.stack_operator.append('*')
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(T__28);
				program.stack_operator.append('/')
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public Opc_factorContext opc_factor() {
			return getRuleContext(Opc_factorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			opc_factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Opc_factorContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Opc_signoContext opc_signo() {
			return getRuleContext(Opc_signoContext.class,0);
		}
		public Opc_factor_primeContext opc_factor_prime() {
			return getRuleContext(Opc_factor_primeContext.class,0);
		}
		public Opc_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opc_factor; }
	}

	public final Opc_factorContext opc_factor() throws RecognitionException {
		Opc_factorContext _localctx = new Opc_factorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_opc_factor);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(T__13);

				program.stack_operator.append('(')

				setState(317);
				expresion();
				setState(318);
				match(T__14);

				program.clearQuadrupleList(')')

				}
				break;
			case T__25:
			case T__26:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				opc_signo();
				setState(322);
				opc_factor_prime();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Opc_signoContext extends ParserRuleContext {
		public SignoContext signo() {
			return getRuleContext(SignoContext.class,0);
		}
		public Opc_signoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opc_signo; }
	}

	public final Opc_signoContext opc_signo() throws RecognitionException {
		Opc_signoContext _localctx = new Opc_signoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_opc_signo);
		try {
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				signo();
				}
				break;
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignoContext extends ParserRuleContext {
		public SignoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signo; }
	}

	public final SignoContext signo() throws RecognitionException {
		SignoContext _localctx = new SignoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_signo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Opc_factor_primeContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(littleDuckParser.ID, 0); }
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public Opc_factor_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opc_factor_prime; }
	}

	public final Opc_factor_primeContext opc_factor_prime() throws RecognitionException {
		Opc_factor_primeContext _localctx = new Opc_factor_primeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_opc_factor_prime);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				((Opc_factor_primeContext)_localctx).ID = match(ID);

				if program.variableDeclared((((Opc_factor_primeContext)_localctx).ID!=null?((Opc_factor_primeContext)_localctx).ID.getText():null)):
				    program.stack_operands.append((((Opc_factor_primeContext)_localctx).ID!=null?((Opc_factor_primeContext)_localctx).ID.getText():null))

				}
				break;
			case CTE_INT:
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				cte();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001#\u0152\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001]\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002c\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"t\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0080\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0086\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u0090\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0097\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00ae\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00c4\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00c9\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d9"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00de\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u00f3\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u00f8\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0102\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0108\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0119\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0123\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u0129\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0003 \u0132\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u0138\b!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u0145\b#\u0001$\u0001$\u0003$\u0149\b$\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0003&\u0150\b&\u0001&\u0000\u0000\'\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJL\u0000\u0001\u0001\u0000\u001a\u001b\u0147"+
		"\u0000N\u0001\u0000\u0000\u0000\u0002\\\u0001\u0000\u0000\u0000\u0004"+
		"b\u0001\u0000\u0000\u0000\u0006d\u0001\u0000\u0000\u0000\bs\u0001\u0000"+
		"\u0000\u0000\n\u007f\u0001\u0000\u0000\u0000\f\u0085\u0001\u0000\u0000"+
		"\u0000\u000e\u0087\u0001\u0000\u0000\u0000\u0010\u008f\u0001\u0000\u0000"+
		"\u0000\u0012\u0096\u0001\u0000\u0000\u0000\u0014\u0098\u0001\u0000\u0000"+
		"\u0000\u0016\u009f\u0001\u0000\u0000\u0000\u0018\u00ad\u0001\u0000\u0000"+
		"\u0000\u001a\u00af\u0001\u0000\u0000\u0000\u001c\u00b9\u0001\u0000\u0000"+
		"\u0000\u001e\u00c3\u0001\u0000\u0000\u0000 \u00c8\u0001\u0000\u0000\u0000"+
		"\"\u00ca\u0001\u0000\u0000\u0000$\u00d8\u0001\u0000\u0000\u0000&\u00dd"+
		"\u0001\u0000\u0000\u0000(\u00df\u0001\u0000\u0000\u0000*\u00f2\u0001\u0000"+
		"\u0000\u0000,\u00f7\u0001\u0000\u0000\u0000.\u00f9\u0001\u0000\u0000\u0000"+
		"0\u0101\u0001\u0000\u0000\u00002\u0107\u0001\u0000\u0000\u00004\u0109"+
		"\u0001\u0000\u0000\u00006\u0118\u0001\u0000\u0000\u00008\u011a\u0001\u0000"+
		"\u0000\u0000:\u0122\u0001\u0000\u0000\u0000<\u0128\u0001\u0000\u0000\u0000"+
		">\u012a\u0001\u0000\u0000\u0000@\u0131\u0001\u0000\u0000\u0000B\u0137"+
		"\u0001\u0000\u0000\u0000D\u0139\u0001\u0000\u0000\u0000F\u0144\u0001\u0000"+
		"\u0000\u0000H\u0148\u0001\u0000\u0000\u0000J\u014a\u0001\u0000\u0000\u0000"+
		"L\u014f\u0001\u0000\u0000\u0000NO\u0005\u0001\u0000\u0000OP\u0005#\u0000"+
		"\u0000PQ\u0006\u0000\uffff\uffff\u0000QR\u0005\u0002\u0000\u0000RS\u0003"+
		"\u0002\u0001\u0000ST\u0003\u0004\u0002\u0000TU\u0005\u0003\u0000\u0000"+
		"UV\u0003\u000e\u0007\u0000VW\u0005\u0004\u0000\u0000WX\u0006\u0000\uffff"+
		"\uffff\u0000X\u0001\u0001\u0000\u0000\u0000YZ\u0006\u0001\uffff\uffff"+
		"\u0000Z]\u0003\u0006\u0003\u0000[]\u0001\u0000\u0000\u0000\\Y\u0001\u0000"+
		"\u0000\u0000\\[\u0001\u0000\u0000\u0000]\u0003\u0001\u0000\u0000\u0000"+
		"^_\u0003(\u0014\u0000_`\u0003\u0004\u0002\u0000`c\u0001\u0000\u0000\u0000"+
		"ac\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000"+
		"\u0000c\u0005\u0001\u0000\u0000\u0000de\u0005\u0005\u0000\u0000ef\u0005"+
		"#\u0000\u0000fg\u0006\u0003\uffff\uffff\u0000gh\u0003\b\u0004\u0000hi"+
		"\u0005\u0006\u0000\u0000ij\u0003\f\u0006\u0000jk\u0005\u0002\u0000\u0000"+
		"kl\u0006\u0003\uffff\uffff\u0000lm\u0003\n\u0005\u0000m\u0007\u0001\u0000"+
		"\u0000\u0000no\u0005\u0007\u0000\u0000op\u0005#\u0000\u0000pq\u0006\u0004"+
		"\uffff\uffff\u0000qt\u0003\b\u0004\u0000rt\u0001\u0000\u0000\u0000sn\u0001"+
		"\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\t\u0001\u0000\u0000\u0000"+
		"uv\u0005#\u0000\u0000vw\u0006\u0005\uffff\uffff\u0000wx\u0003\b\u0004"+
		"\u0000xy\u0005\u0006\u0000\u0000yz\u0003\f\u0006\u0000z{\u0005\u0002\u0000"+
		"\u0000{|\u0006\u0005\uffff\uffff\u0000|}\u0003\n\u0005\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007fu\u0001\u0000\u0000"+
		"\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u000b\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\b\u0000\u0000\u0082\u0086\u0006\u0006\uffff\uffff\u0000"+
		"\u0083\u0084\u0005\t\u0000\u0000\u0084\u0086\u0006\u0006\uffff\uffff\u0000"+
		"\u0085\u0081\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000"+
		"\u0086\r\u0001\u0000\u0000\u0000\u0087\u0088\u0005\n\u0000\u0000\u0088"+
		"\u0089\u0003\u0010\b\u0000\u0089\u008a\u0005\u000b\u0000\u0000\u008a\u000f"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0003\u0012\t\u0000\u008c\u008d\u0003"+
		"\u0010\b\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000"+
		"\u0000\u0000\u008f\u008b\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u0011\u0001\u0000\u0000\u0000\u0091\u0097\u0003\u0014"+
		"\n\u0000\u0092\u0097\u0003\u0016\u000b\u0000\u0093\u0097\u0003\u001a\r"+
		"\u0000\u0094\u0097\u0003\u001c\u000e\u0000\u0095\u0097\u0003\"\u0011\u0000"+
		"\u0096\u0091\u0001\u0000\u0000\u0000\u0096\u0092\u0001\u0000\u0000\u0000"+
		"\u0096\u0093\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0013\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005#\u0000\u0000\u0099\u009a\u0006\n\uffff\uffff\u0000"+
		"\u009a\u009b\u0005\f\u0000\u0000\u009b\u009c\u00034\u001a\u0000\u009c"+
		"\u009d\u0006\n\uffff\uffff\u0000\u009d\u009e\u0005\u0002\u0000\u0000\u009e"+
		"\u0015\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\r\u0000\u0000\u00a0\u00a1"+
		"\u0005\u000e\u0000\u0000\u00a1\u00a2\u00034\u001a\u0000\u00a2\u00a3\u0005"+
		"\u000f\u0000\u0000\u00a3\u00a4\u0006\u000b\uffff\uffff\u0000\u00a4\u00a5"+
		"\u0003\u000e\u0007\u0000\u00a5\u00a6\u0003\u0018\f\u0000\u00a6\u00a7\u0006"+
		"\u000b\uffff\uffff\u0000\u00a7\u00a8\u0005\u0002\u0000\u0000\u00a8\u0017"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\u0010\u0000\u0000\u00aa\u00ab"+
		"\u0006\f\uffff\uffff\u0000\u00ab\u00ae\u0003\u000e\u0007\u0000\u00ac\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ad\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u0019\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0005\u0011\u0000\u0000\u00b0\u00b1\u0006\r\uffff\uffff\u0000\u00b1\u00b2"+
		"\u0003\u000e\u0007\u0000\u00b2\u00b3\u0005\u0012\u0000\u0000\u00b3\u00b4"+
		"\u0005\u000e\u0000\u0000\u00b4\u00b5\u00034\u001a\u0000\u00b5\u00b6\u0005"+
		"\u000f\u0000\u0000\u00b6\u00b7\u0006\r\uffff\uffff\u0000\u00b7\u00b8\u0005"+
		"\u0002\u0000\u0000\u00b8\u001b\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		"#\u0000\u0000\u00ba\u00bb\u0005\u000e\u0000\u0000\u00bb\u00bc\u0003\u001e"+
		"\u000f\u0000\u00bc\u00bd\u0005\u000f\u0000\u0000\u00bd\u00be\u0005\u0002"+
		"\u0000\u0000\u00be\u001d\u0001\u0000\u0000\u0000\u00bf\u00c0\u00034\u001a"+
		"\u0000\u00c0\u00c1\u0003 \u0010\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u001f\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0005\u0007\u0000\u0000\u00c6\u00c9\u0003\u001e\u000f\u0000"+
		"\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9!\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0013\u0000\u0000\u00cb\u00cc\u0005\u000e\u0000\u0000\u00cc"+
		"\u00cd\u0003$\u0012\u0000\u00cd\u00ce\u0005\u000f\u0000\u0000\u00ce\u00cf"+
		"\u0005\u0002\u0000\u0000\u00cf#\u0001\u0000\u0000\u0000\u00d0\u00d1\u0006"+
		"\u0012\uffff\uffff\u0000\u00d1\u00d2\u00034\u001a\u0000\u00d2\u00d3\u0006"+
		"\u0012\uffff\uffff\u0000\u00d3\u00d4\u0003&\u0013\u0000\u00d4\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005\"\u0000\u0000\u00d6\u00d7\u0006\u0012"+
		"\uffff\uffff\u0000\u00d7\u00d9\u0003&\u0013\u0000\u00d8\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d5\u0001\u0000\u0000\u0000\u00d9%\u0001\u0000\u0000"+
		"\u0000\u00da\u00db\u0005\u0007\u0000\u0000\u00db\u00de\u0003$\u0012\u0000"+
		"\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00da\u0001\u0000\u0000\u0000"+
		"\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\'\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005\u0014\u0000\u0000\u00e0\u00e1\u0005#\u0000\u0000\u00e1\u00e2"+
		"\u0006\u0014\uffff\uffff\u0000\u00e2\u00e3\u0005\u000e\u0000\u0000\u00e3"+
		"\u00e4\u0003*\u0015\u0000\u00e4\u00e5\u0005\u000f\u0000\u0000\u00e5\u00e6"+
		"\u0005\u0015\u0000\u0000\u00e6\u00e7\u00030\u0018\u0000\u00e7\u00e8\u0003"+
		"\u000e\u0007\u0000\u00e8\u00e9\u0005\u0016\u0000\u0000\u00e9\u00ea\u0005"+
		"\u0002\u0000\u0000\u00ea)\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005#\u0000"+
		"\u0000\u00ec\u00ed\u0006\u0015\uffff\uffff\u0000\u00ed\u00ee\u0005\u0006"+
		"\u0000\u0000\u00ee\u00ef\u0003\f\u0006\u0000\u00ef\u00f0\u0003,\u0016"+
		"\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f2\u00eb\u0001\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f3+\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0007\u0000\u0000"+
		"\u00f5\u00f8\u0003.\u0017\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f8"+
		"-\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005#\u0000\u0000\u00fa\u00fb\u0006"+
		"\u0017\uffff\uffff\u0000\u00fb\u00fc\u0005\u0006\u0000\u0000\u00fc\u00fd"+
		"\u0003\f\u0006\u0000\u00fd\u00fe\u0003,\u0016\u0000\u00fe/\u0001\u0000"+
		"\u0000\u0000\u00ff\u0102\u0003\u0006\u0003\u0000\u0100\u0102\u0001\u0000"+
		"\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000"+
		"\u0000\u0000\u01021\u0001\u0000\u0000\u0000\u0103\u0104\u0005 \u0000\u0000"+
		"\u0104\u0108\u0006\u0019\uffff\uffff\u0000\u0105\u0106\u0005!\u0000\u0000"+
		"\u0106\u0108\u0006\u0019\uffff\uffff\u0000\u0107\u0103\u0001\u0000\u0000"+
		"\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u01083\u0001\u0000\u0000\u0000"+
		"\u0109\u010a\u00038\u001c\u0000\u010a\u010b\u0006\u001a\uffff\uffff\u0000"+
		"\u010b\u010c\u00036\u001b\u0000\u010c\u010d\u0006\u001a\uffff\uffff\u0000"+
		"\u010d5\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u0017\u0000\u0000\u010f"+
		"\u0110\u0006\u001b\uffff\uffff\u0000\u0110\u0119\u00038\u001c\u0000\u0111"+
		"\u0112\u0005\u0018\u0000\u0000\u0112\u0113\u0006\u001b\uffff\uffff\u0000"+
		"\u0113\u0119\u00038\u001c\u0000\u0114\u0115\u0005\u0019\u0000\u0000\u0115"+
		"\u0116\u0006\u001b\uffff\uffff\u0000\u0116\u0119\u00038\u001c\u0000\u0117"+
		"\u0119\u0001\u0000\u0000\u0000\u0118\u010e\u0001\u0000\u0000\u0000\u0118"+
		"\u0111\u0001\u0000\u0000\u0000\u0118\u0114\u0001\u0000\u0000\u0000\u0118"+
		"\u0117\u0001\u0000\u0000\u0000\u01197\u0001\u0000\u0000\u0000\u011a\u011b"+
		"\u0003>\u001f\u0000\u011b\u011c\u0006\u001c\uffff\uffff\u0000\u011c\u011d"+
		"\u0003:\u001d\u0000\u011d9\u0001\u0000\u0000\u0000\u011e\u011f\u0003<"+
		"\u001e\u0000\u011f\u0120\u00038\u001c\u0000\u0120\u0123\u0001\u0000\u0000"+
		"\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u011e\u0001\u0000\u0000"+
		"\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123;\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0005\u001a\u0000\u0000\u0125\u0129\u0006\u001e\uffff\uffff"+
		"\u0000\u0126\u0127\u0005\u001b\u0000\u0000\u0127\u0129\u0006\u001e\uffff"+
		"\uffff\u0000\u0128\u0124\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000"+
		"\u0000\u0000\u0129=\u0001\u0000\u0000\u0000\u012a\u012b\u0003D\"\u0000"+
		"\u012b\u012c\u0003@ \u0000\u012c?\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0003B!\u0000\u012e\u012f\u0003>\u001f\u0000\u012f\u0132\u0001\u0000"+
		"\u0000\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u012d\u0001\u0000"+
		"\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132A\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0005\u001c\u0000\u0000\u0134\u0138\u0006!\uffff\uffff"+
		"\u0000\u0135\u0136\u0005\u001d\u0000\u0000\u0136\u0138\u0006!\uffff\uffff"+
		"\u0000\u0137\u0133\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000"+
		"\u0000\u0138C\u0001\u0000\u0000\u0000\u0139\u013a\u0003F#\u0000\u013a"+
		"E\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u000e\u0000\u0000\u013c\u013d"+
		"\u0006#\uffff\uffff\u0000\u013d\u013e\u00034\u001a\u0000\u013e\u013f\u0005"+
		"\u000f\u0000\u0000\u013f\u0140\u0006#\uffff\uffff\u0000\u0140\u0145\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0003H$\u0000\u0142\u0143\u0003L&\u0000"+
		"\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u013b\u0001\u0000\u0000\u0000"+
		"\u0144\u0141\u0001\u0000\u0000\u0000\u0145G\u0001\u0000\u0000\u0000\u0146"+
		"\u0149\u0003J%\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0146\u0001"+
		"\u0000\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149I\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0007\u0000\u0000\u0000\u014bK\u0001\u0000\u0000"+
		"\u0000\u014c\u014d\u0005#\u0000\u0000\u014d\u0150\u0006&\uffff\uffff\u0000"+
		"\u014e\u0150\u00032\u0019\u0000\u014f\u014c\u0001\u0000\u0000\u0000\u014f"+
		"\u014e\u0001\u0000\u0000\u0000\u0150M\u0001\u0000\u0000\u0000\u0018\\"+
		"bs\u007f\u0085\u008f\u0096\u00ad\u00c3\u00c8\u00d8\u00dd\u00f2\u00f7\u0101"+
		"\u0107\u0118\u0122\u0128\u0131\u0137\u0144\u0148\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}