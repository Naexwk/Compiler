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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, NEWLINE=31, 
		WHITESPACE=32, CTE_INT=33, CTE_FLOAT=34, CTE_STRING=35, ID=36;
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
			"'float'", "'bool'", "'{'", "'}'", "'='", "'if'", "'('", "')'", "'else'", 
			"'do'", "'while'", "'print'", "'void'", "'['", "']'", "'>'", "'<'", "'!='", 
			"'+'", "'-'", "'*'", "'/'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NEWLINE", "WHITESPACE", "CTE_INT", 
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
			program.pointer = len(program.quadruples)
			setState(86);
			body();
			setState(87);
			match(T__3);

			program.insertQuad('end', None, None, None)
			program.Execute()

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
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{

				program.currentLevel = "global"

				setState(91);
				vars();
				}
				break;
			case T__2:
			case T__20:
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
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				funcs();
				setState(96);
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
			setState(101);
			match(T__4);
			setState(102);
			((VarsContext)_localctx).ID = match(ID);

			program.declareNewVariable((((VarsContext)_localctx).ID!=null?((VarsContext)_localctx).ID.getText():null))

			setState(104);
			mas_vars();
			setState(105);
			match(T__5);
			setState(106);
			type();
			setState(107);
			match(T__1);
			program.clearTempVarDeclaration()
			setState(109);
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
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__6);
				setState(112);
				((Mas_varsContext)_localctx).ID = match(ID);

				program.declareNewVariable((((Mas_varsContext)_localctx).ID!=null?((Mas_varsContext)_localctx).ID.getText():null))

				setState(114);
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
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((Mas_dec_varsContext)_localctx).ID = match(ID);

				program.declareNewVariable((((Mas_dec_varsContext)_localctx).ID!=null?((Mas_dec_varsContext)_localctx).ID.getText():null))

				setState(120);
				mas_vars();
				setState(121);
				match(T__5);
				setState(122);
				type();
				setState(123);
				match(T__1);
				program.clearTempVarDeclaration()
				setState(125);
				mas_dec_vars();
				}
				break;
			case T__2:
			case T__10:
			case T__20:
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
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__7);
				program.currentType = "int"
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__8);
				program.currentType = "float"
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(T__9);
				program.currentType = "bool"
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
			setState(138);
			match(T__10);
			setState(139);
			statement();
			setState(140);
			match(T__11);
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
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__17:
			case T__19:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				options_statement();
				setState(143);
				statement();
				}
				break;
			case T__11:
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				cycle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				f_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
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
			setState(155);
			((AssignContext)_localctx).ID = match(ID);

			program.variableDeclared((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null))

			setState(157);
			match(T__12);
			setState(158);
			expresion();

			if program.variableDeclared((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null)):
			    program.assignInsertQuad('=', program.stack_operands.pop(), None, (((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null))

			setState(160);
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
			setState(162);
			match(T__13);
			setState(163);
			match(T__14);
			setState(164);
			expresion();
			setState(165);
			match(T__15);

			if program.checkBoolExpression():
			    program.insertQuad('GOTOF', program.stack_operands.pop(), None, None)
			    program.stack_jumps.append(len(program.quadruples) - 1)
			setState(167);
			body();
			setState(168);
			else_();

			program.editQuad(2, len(program.quadruples), program.stack_jumps.pop())

			setState(170);
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
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__16);

				program.insertQuad('GOTO', None, None, None)
				program.editQuad(2, len(program.quadruples), program.stack_jumps.pop())
				program.stack_jumps.append(len(program.quadruples) - 1)

				setState(174);
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
			setState(178);
			match(T__17);
			program.stack_jumps.append(len(program.quadruples))
			setState(180);
			body();
			setState(181);
			match(T__18);
			setState(182);
			match(T__14);
			setState(183);
			expresion();
			setState(184);
			match(T__15);

			if program.checkBoolExpression():
			    program.insertQuad('GOTOT', program.stack_operands.pop(), program.stack_jumps.pop(), None)

			setState(186);
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
			setState(188);
			match(ID);
			setState(189);
			match(T__14);
			setState(190);
			opc_f_call();
			setState(191);
			match(T__15);
			setState(192);
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
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__26:
			case T__27:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				expresion();
				setState(195);
				mas_f_call();
				}
				break;
			case T__15:
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
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(T__6);
				setState(201);
				opc_f_call();
				}
				break;
			case T__15:
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
			setState(205);
			match(T__19);
			setState(206);
			match(T__14);
			setState(207);
			opc_print();
			setState(208);
			match(T__15);
			setState(209);
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
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__26:
			case T__27:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				expresion();
				program.insertQuad('print', program.stack_operands.pop(), None, None)
				setState(213);
				mas_print();
				}
				break;
			case CTE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				((Opc_printContext)_localctx).CTE_STRING = match(CTE_STRING);
				program.insertQuad('print', (((Opc_printContext)_localctx).CTE_STRING!=null?((Opc_printContext)_localctx).CTE_STRING.getText():null)[1:-1], None, None)
				setState(217);
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
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__6);
				setState(221);
				opc_print();
				}
				break;
			case T__15:
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
			setState(225);
			match(T__20);
			setState(226);
			((FuncsContext)_localctx).ID = match(ID);

			program.newFunction((((FuncsContext)_localctx).ID!=null?((FuncsContext)_localctx).ID.getText():null))

			setState(228);
			match(T__14);
			setState(229);
			opc_funcs();
			setState(230);
			match(T__15);
			setState(231);
			match(T__21);
			setState(232);
			vars_funcs();
			setState(233);
			body();
			setState(234);
			match(T__22);
			setState(235);
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
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				((Opc_funcsContext)_localctx).ID = match(ID);

				program.declareNewVariable((((Opc_funcsContext)_localctx).ID!=null?((Opc_funcsContext)_localctx).ID.getText():null))

				setState(239);
				match(T__5);
				setState(240);
				type();
				setState(241);
				mas_opc_funcs();
				}
				break;
			case T__15:
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
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(T__6);
				setState(247);
				next_opc_funcs();
				}
				break;
			case T__15:
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
			setState(251);
			((Next_opc_funcsContext)_localctx).ID = match(ID);

			program.declareNewVariable((((Next_opc_funcsContext)_localctx).ID!=null?((Next_opc_funcsContext)_localctx).ID.getText():null))

			setState(253);
			match(T__5);
			setState(254);
			type();
			setState(255);
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
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				vars();
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
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CTE_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				((CteContext)_localctx).CTE_INT = match(CTE_INT);
				program.stack_operands.append(int((((CteContext)_localctx).CTE_INT!=null?((CteContext)_localctx).CTE_INT.getText():null)))
				}
				break;
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
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
			setState(267);
			exp();
			program.clearQuadrupleList('+')
			setState(269);
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
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(T__23);

				program.stack_operator.append('>')

				setState(274);
				exp();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(T__24);

				program.stack_operator.append('<')

				setState(277);
				exp();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(T__25);

				program.stack_operator.append('!=')

				setState(280);
				exp();
				}
				break;
			case T__1:
			case T__6:
			case T__15:
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
			setState(284);
			termino();
			program.clearQuadrupleList('*')
			setState(286);
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
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				exp_signo();
				setState(289);
				exp();
				}
				break;
			case T__1:
			case T__6:
			case T__15:
			case T__23:
			case T__24:
			case T__25:
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
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(T__26);

				program.stack_operator.append('+')

				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(T__27);

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
			setState(300);
			factor();
			setState(301);
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
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				signo_factor();
				setState(304);
				termino();
				}
				break;
			case T__1:
			case T__6:
			case T__15:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
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
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(T__28);
				program.stack_operator.append('*')
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(T__29);
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
			setState(315);
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
		public Opc_signoContext opc_signo;
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
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				match(T__14);

				program.stack_operator.append('(')

				setState(319);
				expresion();
				setState(320);
				match(T__15);

				program.clearQuadrupleList(')')

				}
				break;
			case T__26:
			case T__27:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				((Opc_factorContext)_localctx).opc_signo = opc_signo();
				setState(324);
				opc_factor_prime();

				if (((Opc_factorContext)_localctx).opc_signo!=null?_input.getText(((Opc_factorContext)_localctx).opc_signo.start,((Opc_factorContext)_localctx).opc_signo.stop):null) == "-":
				    op1 = program.stack_operands.pop()
				    type1 = type(op1).__name__
				    if type1 == "str":
				        type1 = program.getVariable(program.currentLevel, op1).vtype
				    program.insertQuad('*', op1, -1, program.newTempVar('*', type1, "int"))

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
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
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
			setState(333);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
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
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				((Opc_factor_primeContext)_localctx).ID = match(ID);

				if program.variableDeclared((((Opc_factor_primeContext)_localctx).ID!=null?((Opc_factor_primeContext)_localctx).ID.getText():null)):
				    program.stack_operands.append((((Opc_factor_primeContext)_localctx).ID!=null?((Opc_factor_primeContext)_localctx).ID.getText():null))

				}
				break;
			case CTE_INT:
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
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
		"\u0004\u0001$\u0155\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001^\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002d\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004u\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0081\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0089\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0093"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u009a\b\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b1"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00c7\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00cc\b"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00db\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00e0\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00f5\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00fa\b\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0104\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u010a\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u011b\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0125\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u012b\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u0134"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0003!\u013a\b!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0148\b#\u0001$\u0001$\u0003$\u014c\b$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0003&\u0153\b&\u0001&\u0000\u0000\'\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJL\u0000\u0001\u0001\u0000\u001b\u001c\u014b\u0000N\u0001\u0000\u0000"+
		"\u0000\u0002]\u0001\u0000\u0000\u0000\u0004c\u0001\u0000\u0000\u0000\u0006"+
		"e\u0001\u0000\u0000\u0000\bt\u0001\u0000\u0000\u0000\n\u0080\u0001\u0000"+
		"\u0000\u0000\f\u0088\u0001\u0000\u0000\u0000\u000e\u008a\u0001\u0000\u0000"+
		"\u0000\u0010\u0092\u0001\u0000\u0000\u0000\u0012\u0099\u0001\u0000\u0000"+
		"\u0000\u0014\u009b\u0001\u0000\u0000\u0000\u0016\u00a2\u0001\u0000\u0000"+
		"\u0000\u0018\u00b0\u0001\u0000\u0000\u0000\u001a\u00b2\u0001\u0000\u0000"+
		"\u0000\u001c\u00bc\u0001\u0000\u0000\u0000\u001e\u00c6\u0001\u0000\u0000"+
		"\u0000 \u00cb\u0001\u0000\u0000\u0000\"\u00cd\u0001\u0000\u0000\u0000"+
		"$\u00da\u0001\u0000\u0000\u0000&\u00df\u0001\u0000\u0000\u0000(\u00e1"+
		"\u0001\u0000\u0000\u0000*\u00f4\u0001\u0000\u0000\u0000,\u00f9\u0001\u0000"+
		"\u0000\u0000.\u00fb\u0001\u0000\u0000\u00000\u0103\u0001\u0000\u0000\u0000"+
		"2\u0109\u0001\u0000\u0000\u00004\u010b\u0001\u0000\u0000\u00006\u011a"+
		"\u0001\u0000\u0000\u00008\u011c\u0001\u0000\u0000\u0000:\u0124\u0001\u0000"+
		"\u0000\u0000<\u012a\u0001\u0000\u0000\u0000>\u012c\u0001\u0000\u0000\u0000"+
		"@\u0133\u0001\u0000\u0000\u0000B\u0139\u0001\u0000\u0000\u0000D\u013b"+
		"\u0001\u0000\u0000\u0000F\u0147\u0001\u0000\u0000\u0000H\u014b\u0001\u0000"+
		"\u0000\u0000J\u014d\u0001\u0000\u0000\u0000L\u0152\u0001\u0000\u0000\u0000"+
		"NO\u0005\u0001\u0000\u0000OP\u0005$\u0000\u0000PQ\u0006\u0000\uffff\uffff"+
		"\u0000QR\u0005\u0002\u0000\u0000RS\u0003\u0002\u0001\u0000ST\u0003\u0004"+
		"\u0002\u0000TU\u0005\u0003\u0000\u0000UV\u0006\u0000\uffff\uffff\u0000"+
		"VW\u0003\u000e\u0007\u0000WX\u0005\u0004\u0000\u0000XY\u0006\u0000\uffff"+
		"\uffff\u0000Y\u0001\u0001\u0000\u0000\u0000Z[\u0006\u0001\uffff\uffff"+
		"\u0000[^\u0003\u0006\u0003\u0000\\^\u0001\u0000\u0000\u0000]Z\u0001\u0000"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u0003\u0001\u0000\u0000\u0000"+
		"_`\u0003(\u0014\u0000`a\u0003\u0004\u0002\u0000ad\u0001\u0000\u0000\u0000"+
		"bd\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000"+
		"\u0000d\u0005\u0001\u0000\u0000\u0000ef\u0005\u0005\u0000\u0000fg\u0005"+
		"$\u0000\u0000gh\u0006\u0003\uffff\uffff\u0000hi\u0003\b\u0004\u0000ij"+
		"\u0005\u0006\u0000\u0000jk\u0003\f\u0006\u0000kl\u0005\u0002\u0000\u0000"+
		"lm\u0006\u0003\uffff\uffff\u0000mn\u0003\n\u0005\u0000n\u0007\u0001\u0000"+
		"\u0000\u0000op\u0005\u0007\u0000\u0000pq\u0005$\u0000\u0000qr\u0006\u0004"+
		"\uffff\uffff\u0000ru\u0003\b\u0004\u0000su\u0001\u0000\u0000\u0000to\u0001"+
		"\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000u\t\u0001\u0000\u0000\u0000"+
		"vw\u0005$\u0000\u0000wx\u0006\u0005\uffff\uffff\u0000xy\u0003\b\u0004"+
		"\u0000yz\u0005\u0006\u0000\u0000z{\u0003\f\u0006\u0000{|\u0005\u0002\u0000"+
		"\u0000|}\u0006\u0005\uffff\uffff\u0000}~\u0003\n\u0005\u0000~\u0081\u0001"+
		"\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080v\u0001\u0000"+
		"\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u000b\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\b\u0000\u0000\u0083\u0089\u0006\u0006\uffff"+
		"\uffff\u0000\u0084\u0085\u0005\t\u0000\u0000\u0085\u0089\u0006\u0006\uffff"+
		"\uffff\u0000\u0086\u0087\u0005\n\u0000\u0000\u0087\u0089\u0006\u0006\uffff"+
		"\uffff\u0000\u0088\u0082\u0001\u0000\u0000\u0000\u0088\u0084\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\r\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005\u000b\u0000\u0000\u008b\u008c\u0003\u0010\b\u0000"+
		"\u008c\u008d\u0005\f\u0000\u0000\u008d\u000f\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0003\u0012\t\u0000\u008f\u0090\u0003\u0010\b\u0000\u0090\u0093"+
		"\u0001\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u008e"+
		"\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0011"+
		"\u0001\u0000\u0000\u0000\u0094\u009a\u0003\u0014\n\u0000\u0095\u009a\u0003"+
		"\u0016\u000b\u0000\u0096\u009a\u0003\u001a\r\u0000\u0097\u009a\u0003\u001c"+
		"\u000e\u0000\u0098\u009a\u0003\"\u0011\u0000\u0099\u0094\u0001\u0000\u0000"+
		"\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u0096\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u0098\u0001\u0000\u0000"+
		"\u0000\u009a\u0013\u0001\u0000\u0000\u0000\u009b\u009c\u0005$\u0000\u0000"+
		"\u009c\u009d\u0006\n\uffff\uffff\u0000\u009d\u009e\u0005\r\u0000\u0000"+
		"\u009e\u009f\u00034\u001a\u0000\u009f\u00a0\u0006\n\uffff\uffff\u0000"+
		"\u00a0\u00a1\u0005\u0002\u0000\u0000\u00a1\u0015\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005\u000e\u0000\u0000\u00a3\u00a4\u0005\u000f\u0000\u0000"+
		"\u00a4\u00a5\u00034\u001a\u0000\u00a5\u00a6\u0005\u0010\u0000\u0000\u00a6"+
		"\u00a7\u0006\u000b\uffff\uffff\u0000\u00a7\u00a8\u0003\u000e\u0007\u0000"+
		"\u00a8\u00a9\u0003\u0018\f\u0000\u00a9\u00aa\u0006\u000b\uffff\uffff\u0000"+
		"\u00aa\u00ab\u0005\u0002\u0000\u0000\u00ab\u0017\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0005\u0011\u0000\u0000\u00ad\u00ae\u0006\f\uffff\uffff\u0000"+
		"\u00ae\u00b1\u0003\u000e\u0007\u0000\u00af\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u0019\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0012\u0000\u0000"+
		"\u00b3\u00b4\u0006\r\uffff\uffff\u0000\u00b4\u00b5\u0003\u000e\u0007\u0000"+
		"\u00b5\u00b6\u0005\u0013\u0000\u0000\u00b6\u00b7\u0005\u000f\u0000\u0000"+
		"\u00b7\u00b8\u00034\u001a\u0000\u00b8\u00b9\u0005\u0010\u0000\u0000\u00b9"+
		"\u00ba\u0006\r\uffff\uffff\u0000\u00ba\u00bb\u0005\u0002\u0000\u0000\u00bb"+
		"\u001b\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005$\u0000\u0000\u00bd\u00be"+
		"\u0005\u000f\u0000\u0000\u00be\u00bf\u0003\u001e\u000f\u0000\u00bf\u00c0"+
		"\u0005\u0010\u0000\u0000\u00c0\u00c1\u0005\u0002\u0000\u0000\u00c1\u001d"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u00034\u001a\u0000\u00c3\u00c4\u0003"+
		" \u0010\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c7\u001f\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0007"+
		"\u0000\u0000\u00c9\u00cc\u0003\u001e\u000f\u0000\u00ca\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc!\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u0014\u0000"+
		"\u0000\u00ce\u00cf\u0005\u000f\u0000\u0000\u00cf\u00d0\u0003$\u0012\u0000"+
		"\u00d0\u00d1\u0005\u0010\u0000\u0000\u00d1\u00d2\u0005\u0002\u0000\u0000"+
		"\u00d2#\u0001\u0000\u0000\u0000\u00d3\u00d4\u00034\u001a\u0000\u00d4\u00d5"+
		"\u0006\u0012\uffff\uffff\u0000\u00d5\u00d6\u0003&\u0013\u0000\u00d6\u00db"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005#\u0000\u0000\u00d8\u00d9\u0006"+
		"\u0012\uffff\uffff\u0000\u00d9\u00db\u0003&\u0013\u0000\u00da\u00d3\u0001"+
		"\u0000\u0000\u0000\u00da\u00d7\u0001\u0000\u0000\u0000\u00db%\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0005\u0007\u0000\u0000\u00dd\u00e0\u0003$\u0012"+
		"\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00dc\u0001\u0000\u0000"+
		"\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\'\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0005\u0015\u0000\u0000\u00e2\u00e3\u0005$\u0000\u0000\u00e3"+
		"\u00e4\u0006\u0014\uffff\uffff\u0000\u00e4\u00e5\u0005\u000f\u0000\u0000"+
		"\u00e5\u00e6\u0003*\u0015\u0000\u00e6\u00e7\u0005\u0010\u0000\u0000\u00e7"+
		"\u00e8\u0005\u0016\u0000\u0000\u00e8\u00e9\u00030\u0018\u0000\u00e9\u00ea"+
		"\u0003\u000e\u0007\u0000\u00ea\u00eb\u0005\u0017\u0000\u0000\u00eb\u00ec"+
		"\u0005\u0002\u0000\u0000\u00ec)\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005"+
		"$\u0000\u0000\u00ee\u00ef\u0006\u0015\uffff\uffff\u0000\u00ef\u00f0\u0005"+
		"\u0006\u0000\u0000\u00f0\u00f1\u0003\f\u0006\u0000\u00f1\u00f2\u0003,"+
		"\u0016\u0000\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f4\u00ed\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f5+\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u0007\u0000"+
		"\u0000\u00f7\u00fa\u0003.\u0017\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f6\u0001\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fa-\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005$\u0000\u0000\u00fc\u00fd"+
		"\u0006\u0017\uffff\uffff\u0000\u00fd\u00fe\u0005\u0006\u0000\u0000\u00fe"+
		"\u00ff\u0003\f\u0006\u0000\u00ff\u0100\u0003,\u0016\u0000\u0100/\u0001"+
		"\u0000\u0000\u0000\u0101\u0104\u0003\u0006\u0003\u0000\u0102\u0104\u0001"+
		"\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0102\u0001"+
		"\u0000\u0000\u0000\u01041\u0001\u0000\u0000\u0000\u0105\u0106\u0005!\u0000"+
		"\u0000\u0106\u010a\u0006\u0019\uffff\uffff\u0000\u0107\u0108\u0005\"\u0000"+
		"\u0000\u0108\u010a\u0006\u0019\uffff\uffff\u0000\u0109\u0105\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a3\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u00038\u001c\u0000\u010c\u010d\u0006\u001a\uffff\uffff"+
		"\u0000\u010d\u010e\u00036\u001b\u0000\u010e\u010f\u0006\u001a\uffff\uffff"+
		"\u0000\u010f5\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u0018\u0000\u0000"+
		"\u0111\u0112\u0006\u001b\uffff\uffff\u0000\u0112\u011b\u00038\u001c\u0000"+
		"\u0113\u0114\u0005\u0019\u0000\u0000\u0114\u0115\u0006\u001b\uffff\uffff"+
		"\u0000\u0115\u011b\u00038\u001c\u0000\u0116\u0117\u0005\u001a\u0000\u0000"+
		"\u0117\u0118\u0006\u001b\uffff\uffff\u0000\u0118\u011b\u00038\u001c\u0000"+
		"\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0110\u0001\u0000\u0000\u0000"+
		"\u011a\u0113\u0001\u0000\u0000\u0000\u011a\u0116\u0001\u0000\u0000\u0000"+
		"\u011a\u0119\u0001\u0000\u0000\u0000\u011b7\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0003>\u001f\u0000\u011d\u011e\u0006\u001c\uffff\uffff\u0000\u011e"+
		"\u011f\u0003:\u001d\u0000\u011f9\u0001\u0000\u0000\u0000\u0120\u0121\u0003"+
		"<\u001e\u0000\u0121\u0122\u00038\u001c\u0000\u0122\u0125\u0001\u0000\u0000"+
		"\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0120\u0001\u0000\u0000"+
		"\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125;\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0005\u001b\u0000\u0000\u0127\u012b\u0006\u001e\uffff\uffff"+
		"\u0000\u0128\u0129\u0005\u001c\u0000\u0000\u0129\u012b\u0006\u001e\uffff"+
		"\uffff\u0000\u012a\u0126\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000"+
		"\u0000\u0000\u012b=\u0001\u0000\u0000\u0000\u012c\u012d\u0003D\"\u0000"+
		"\u012d\u012e\u0003@ \u0000\u012e?\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0003B!\u0000\u0130\u0131\u0003>\u001f\u0000\u0131\u0134\u0001\u0000"+
		"\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u012f\u0001\u0000"+
		"\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134A\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0005\u001d\u0000\u0000\u0136\u013a\u0006!\uffff\uffff"+
		"\u0000\u0137\u0138\u0005\u001e\u0000\u0000\u0138\u013a\u0006!\uffff\uffff"+
		"\u0000\u0139\u0135\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000"+
		"\u0000\u013aC\u0001\u0000\u0000\u0000\u013b\u013c\u0003F#\u0000\u013c"+
		"E\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u000f\u0000\u0000\u013e\u013f"+
		"\u0006#\uffff\uffff\u0000\u013f\u0140\u00034\u001a\u0000\u0140\u0141\u0005"+
		"\u0010\u0000\u0000\u0141\u0142\u0006#\uffff\uffff\u0000\u0142\u0148\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0003H$\u0000\u0144\u0145\u0003L&\u0000"+
		"\u0145\u0146\u0006#\uffff\uffff\u0000\u0146\u0148\u0001\u0000\u0000\u0000"+
		"\u0147\u013d\u0001\u0000\u0000\u0000\u0147\u0143\u0001\u0000\u0000\u0000"+
		"\u0148G\u0001\u0000\u0000\u0000\u0149\u014c\u0003J%\u0000\u014a\u014c"+
		"\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014a"+
		"\u0001\u0000\u0000\u0000\u014cI\u0001\u0000\u0000\u0000\u014d\u014e\u0007"+
		"\u0000\u0000\u0000\u014eK\u0001\u0000\u0000\u0000\u014f\u0150\u0005$\u0000"+
		"\u0000\u0150\u0153\u0006&\uffff\uffff\u0000\u0151\u0153\u00032\u0019\u0000"+
		"\u0152\u014f\u0001\u0000\u0000\u0000\u0152\u0151\u0001\u0000\u0000\u0000"+
		"\u0153M\u0001\u0000\u0000\u0000\u0018]ct\u0080\u0088\u0092\u0099\u00b0"+
		"\u00c6\u00cb\u00da\u00df\u00f4\u00f9\u0103\u0109\u011a\u0124\u012a\u0133"+
		"\u0139\u0147\u014b\u0152";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}