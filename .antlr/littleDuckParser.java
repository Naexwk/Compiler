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
		RULE_exp = 28, RULE_mas_exp = 29, RULE_signo = 30, RULE_termino = 31, 
		RULE_mas_termino = 32, RULE_signo_factor = 33, RULE_factor = 34, RULE_opc_factor = 35, 
		RULE_opc_signo = 36, RULE_opc_factor_prime = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "opc_vars", "optional_funcs", "vars", "mas_vars", "mas_dec_vars", 
			"type", "body", "statement", "options_statement", "assign", "condition", 
			"else", "cycle", "f_call", "opc_f_call", "mas_f_call", "print", "opc_print", 
			"mas_print", "funcs", "opc_funcs", "mas_opc_funcs", "next_opc_funcs", 
			"vars_funcs", "cte", "expresion", "opc_expresion", "exp", "mas_exp", 
			"signo", "termino", "mas_termino", "signo_factor", "factor", "opc_factor", 
			"opc_signo", "opc_factor_prime"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__0);
			setState(77);
			((ProgramaContext)_localctx).ID = match(ID);

			program.variableTable["owner"] = (((ProgramaContext)_localctx).ID!=null?((ProgramaContext)_localctx).ID.getText():null)

			setState(79);
			match(T__1);
			setState(80);
			opc_vars();
			setState(81);
			optional_funcs();
			setState(82);
			match(T__2);
			setState(83);
			body();
			setState(84);
			match(T__3);

			print(program.variableTable)

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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterOpc_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitOpc_vars(this);
		}
	}

	public final Opc_varsContext opc_vars() throws RecognitionException {
		Opc_varsContext _localctx = new Opc_varsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_opc_vars);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{

				program.currentLevel = "global"

				setState(88);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterOptional_funcs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitOptional_funcs(this);
		}
	}

	public final Optional_funcsContext optional_funcs() throws RecognitionException {
		Optional_funcsContext _localctx = new Optional_funcsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_optional_funcs);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				funcs();
				setState(93);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__4);
			setState(99);
			((VarsContext)_localctx).ID = match(ID);

			if not program.variableExists((((VarsContext)_localctx).ID!=null?((VarsContext)_localctx).ID.getText():null)):
			    program.tempVarDeclarations.append((((VarsContext)_localctx).ID!=null?((VarsContext)_localctx).ID.getText():null))
			else:
			    print("Variable " + (((VarsContext)_localctx).ID!=null?((VarsContext)_localctx).ID.getText():null) + " already declared")

			setState(101);
			mas_vars();
			setState(102);
			match(T__5);
			setState(103);
			type();
			setState(104);
			match(T__1);
			program.clearTempVarDeclaration()
			setState(106);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterMas_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitMas_vars(this);
		}
	}

	public final Mas_varsContext mas_vars() throws RecognitionException {
		Mas_varsContext _localctx = new Mas_varsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mas_vars);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(T__6);
				setState(109);
				((Mas_varsContext)_localctx).ID = match(ID);

				if not program.variableExists((((Mas_varsContext)_localctx).ID!=null?((Mas_varsContext)_localctx).ID.getText():null)):
				    program.tempVarDeclarations.append((((Mas_varsContext)_localctx).ID!=null?((Mas_varsContext)_localctx).ID.getText():null))
				else:
				    print("Variable " + (((Mas_varsContext)_localctx).ID!=null?((Mas_varsContext)_localctx).ID.getText():null) + " already declared")

				setState(111);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterMas_dec_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitMas_dec_vars(this);
		}
	}

	public final Mas_dec_varsContext mas_dec_vars() throws RecognitionException {
		Mas_dec_varsContext _localctx = new Mas_dec_varsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mas_dec_vars);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(ID);
				setState(116);
				mas_vars();
				setState(117);
				match(T__5);
				setState(118);
				type();
				setState(119);
				match(T__1);
				program.clearTempVarDeclaration()
				setState(121);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
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
	public static class BodyContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__9);
			setState(129);
			statement();
			setState(130);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__16:
			case T__18:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				options_statement();
				setState(133);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterOptions_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitOptions_statement(this);
		}
	}

	public final Options_statementContext options_statement() throws RecognitionException {
		Options_statementContext _localctx = new Options_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_options_statement);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				cycle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				f_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((AssignContext)_localctx).ID = match(ID);

			if not program.variableExists((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null)):
			    print((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null) + " does not exist in current context")

			setState(147);
			match(T__11);
			setState(148);
			expresion();
			setState(149);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__12);
			setState(152);
			match(T__13);
			setState(153);
			expresion();
			setState(154);
			match(T__14);
			setState(155);
			body();
			setState(156);
			else_();
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
	public static class ElseContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitElse(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_else);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(T__15);
				setState(160);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitCycle(this);
		}
	}

	public final CycleContext cycle() throws RecognitionException {
		CycleContext _localctx = new CycleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__16);
			setState(165);
			body();
			setState(166);
			match(T__17);
			setState(167);
			match(T__13);
			setState(168);
			expresion();
			setState(169);
			match(T__14);
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
	public static class F_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(littleDuckParser.ID, 0); }
		public Opc_f_callContext opc_f_call() {
			return getRuleContext(Opc_f_callContext.class,0);
		}
		public F_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterF_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitF_call(this);
		}
	}

	public final F_callContext f_call() throws RecognitionException {
		F_callContext _localctx = new F_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_f_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ID);
			setState(173);
			match(T__13);
			setState(174);
			opc_f_call();
			setState(175);
			match(T__14);
			setState(176);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterOpc_f_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitOpc_f_call(this);
		}
	}

	public final Opc_f_callContext opc_f_call() throws RecognitionException {
		Opc_f_callContext _localctx = new Opc_f_callContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_opc_f_call);
		try {
			setState(182);
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
				setState(178);
				expresion();
				setState(179);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterMas_f_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitMas_f_call(this);
		}
	}

	public final Mas_f_callContext mas_f_call() throws RecognitionException {
		Mas_f_callContext _localctx = new Mas_f_callContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mas_f_call);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(T__6);
				setState(185);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__18);
			setState(190);
			match(T__13);
			setState(191);
			opc_print();
			setState(192);
			match(T__14);
			setState(193);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterOpc_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitOpc_print(this);
		}
	}

	public final Opc_printContext opc_print() throws RecognitionException {
		Opc_printContext _localctx = new Opc_printContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_opc_print);
		try {
			setState(200);
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
				setState(195);
				expresion();
				setState(196);
				mas_print();
				}
				break;
			case CTE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(CTE_STRING);
				setState(199);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterMas_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitMas_print(this);
		}
	}

	public final Mas_printContext mas_print() throws RecognitionException {
		Mas_printContext _localctx = new Mas_printContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mas_print);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(T__6);
				setState(203);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterFuncs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitFuncs(this);
		}
	}

	public final FuncsContext funcs() throws RecognitionException {
		FuncsContext _localctx = new FuncsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__19);
			setState(208);
			((FuncsContext)_localctx).ID = match(ID);

			if not program.functionExists((((FuncsContext)_localctx).ID!=null?((FuncsContext)_localctx).ID.getText():null)):
			    program.functionTable.append((((FuncsContext)_localctx).ID!=null?((FuncsContext)_localctx).ID.getText():null))
			    program.currentLevel = (((FuncsContext)_localctx).ID!=null?((FuncsContext)_localctx).ID.getText():null)
			    program.variableTable[program.currentLevel] = []
			else:
			    print("Function " + (((FuncsContext)_localctx).ID!=null?((FuncsContext)_localctx).ID.getText():null) + " already declared")

			setState(210);
			match(T__13);
			setState(211);
			opc_funcs();
			setState(212);
			match(T__14);
			setState(213);
			match(T__20);
			setState(214);
			vars_funcs();
			setState(215);
			body();
			setState(216);
			match(T__21);
			setState(217);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterOpc_funcs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitOpc_funcs(this);
		}
	}

	public final Opc_funcsContext opc_funcs() throws RecognitionException {
		Opc_funcsContext _localctx = new Opc_funcsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_opc_funcs);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				((Opc_funcsContext)_localctx).ID = match(ID);

				if not program.variableExists((((Opc_funcsContext)_localctx).ID!=null?((Opc_funcsContext)_localctx).ID.getText():null)):
				    program.tempVarDeclarations.append((((Opc_funcsContext)_localctx).ID!=null?((Opc_funcsContext)_localctx).ID.getText():null))
				else:
				    print("Variable " + (((Opc_funcsContext)_localctx).ID!=null?((Opc_funcsContext)_localctx).ID.getText():null) + " already declared")

				setState(221);
				match(T__5);
				setState(222);
				type();
				setState(223);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterMas_opc_funcs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitMas_opc_funcs(this);
		}
	}

	public final Mas_opc_funcsContext mas_opc_funcs() throws RecognitionException {
		Mas_opc_funcsContext _localctx = new Mas_opc_funcsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mas_opc_funcs);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(T__6);
				setState(229);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterNext_opc_funcs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitNext_opc_funcs(this);
		}
	}

	public final Next_opc_funcsContext next_opc_funcs() throws RecognitionException {
		Next_opc_funcsContext _localctx = new Next_opc_funcsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_next_opc_funcs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			((Next_opc_funcsContext)_localctx).ID = match(ID);

			if not program.variableExists((((Next_opc_funcsContext)_localctx).ID!=null?((Next_opc_funcsContext)_localctx).ID.getText():null)):
			    program.tempVarDeclarations.append((((Next_opc_funcsContext)_localctx).ID!=null?((Next_opc_funcsContext)_localctx).ID.getText():null))
			else:
			    print("Variable " + (((Next_opc_funcsContext)_localctx).ID!=null?((Next_opc_funcsContext)_localctx).ID.getText():null) + " already declared")

			setState(235);
			match(T__5);
			setState(236);
			type();
			setState(237);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterVars_funcs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitVars_funcs(this);
		}
	}

	public final Vars_funcsContext vars_funcs() throws RecognitionException {
		Vars_funcsContext _localctx = new Vars_funcsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_vars_funcs);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
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
		public TerminalNode CTE_INT() { return getToken(littleDuckParser.CTE_INT, 0); }
		public TerminalNode CTE_FLOAT() { return getToken(littleDuckParser.CTE_FLOAT, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitCte(this);
		}
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !(_la==CTE_INT || _la==CTE_FLOAT) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			exp();
			setState(246);
			opc_expresion();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterOpc_expresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitOpc_expresion(this);
		}
	}

	public final Opc_expresionContext opc_expresion() throws RecognitionException {
		Opc_expresionContext _localctx = new Opc_expresionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_opc_expresion);
		try {
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(T__22);
				setState(249);
				exp();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__23);
				setState(251);
				exp();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(T__24);
				setState(253);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			termino();
			setState(258);
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
		public SignoContext signo() {
			return getRuleContext(SignoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Mas_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mas_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterMas_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitMas_exp(this);
		}
	}

	public final Mas_expContext mas_exp() throws RecognitionException {
		Mas_expContext _localctx = new Mas_expContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mas_exp);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				signo();
				setState(261);
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
	public static class SignoContext extends ParserRuleContext {
		public SignoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterSigno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitSigno(this);
		}
	}

	public final SignoContext signo() throws RecognitionException {
		SignoContext _localctx = new SignoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_signo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			factor();
			setState(269);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterMas_termino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitMas_termino(this);
		}
	}

	public final Mas_terminoContext mas_termino() throws RecognitionException {
		Mas_terminoContext _localctx = new Mas_terminoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mas_termino);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				signo_factor();
				setState(272);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterSigno_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitSigno_factor(this);
		}
	}

	public final Signo_factorContext signo_factor() throws RecognitionException {
		Signo_factorContext _localctx = new Signo_factorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_signo_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
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
	public static class FactorContext extends ParserRuleContext {
		public Opc_factorContext opc_factor() {
			return getRuleContext(Opc_factorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterOpc_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitOpc_factor(this);
		}
	}

	public final Opc_factorContext opc_factor() throws RecognitionException {
		Opc_factorContext _localctx = new Opc_factorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_opc_factor);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(T__13);
				setState(282);
				expresion();
				setState(283);
				match(T__14);
				}
				break;
			case T__25:
			case T__26:
			case CTE_INT:
			case CTE_FLOAT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				opc_signo();
				setState(286);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterOpc_signo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitOpc_signo(this);
		}
	}

	public final Opc_signoContext opc_signo() throws RecognitionException {
		Opc_signoContext _localctx = new Opc_signoContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_opc_signo);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).enterOpc_factor_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof littleDuckListener ) ((littleDuckListener)listener).exitOpc_factor_prime(this);
		}
	}

	public final Opc_factor_primeContext opc_factor_prime() throws RecognitionException {
		Opc_factor_primeContext _localctx = new Opc_factor_primeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_opc_factor_prime);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				((Opc_factor_primeContext)_localctx).ID = match(ID);

				if not program.variableExists((((Opc_factor_primeContext)_localctx).ID!=null?((Opc_factor_primeContext)_localctx).ID.getText():null)):
				    print((((Opc_factor_primeContext)_localctx).ID!=null?((Opc_factor_primeContext)_localctx).ID.getText():null) + " does not exist in current context")

				}
				break;
			case CTE_INT:
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
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
		"\u0004\u0001#\u012c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"[\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"a\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004r\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005}\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0089\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0090\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00a3\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00b7\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00bc\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00c9\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00ce\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00e3\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00e8\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u00f2\b\u0018\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0100\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u0109\b\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u0114\b \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0121\b#\u0001$\u0001$\u0003$\u0125\b$\u0001%\u0001%\u0001%\u0003%\u012a"+
		"\b%\u0001%\u0000\u0000&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0004"+
		"\u0001\u0000\b\t\u0001\u0000 !\u0001\u0000\u001a\u001b\u0001\u0000\u001c"+
		"\u001d\u011e\u0000L\u0001\u0000\u0000\u0000\u0002Z\u0001\u0000\u0000\u0000"+
		"\u0004`\u0001\u0000\u0000\u0000\u0006b\u0001\u0000\u0000\u0000\bq\u0001"+
		"\u0000\u0000\u0000\n|\u0001\u0000\u0000\u0000\f~\u0001\u0000\u0000\u0000"+
		"\u000e\u0080\u0001\u0000\u0000\u0000\u0010\u0088\u0001\u0000\u0000\u0000"+
		"\u0012\u008f\u0001\u0000\u0000\u0000\u0014\u0091\u0001\u0000\u0000\u0000"+
		"\u0016\u0097\u0001\u0000\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000"+
		"\u001a\u00a4\u0001\u0000\u0000\u0000\u001c\u00ac\u0001\u0000\u0000\u0000"+
		"\u001e\u00b6\u0001\u0000\u0000\u0000 \u00bb\u0001\u0000\u0000\u0000\""+
		"\u00bd\u0001\u0000\u0000\u0000$\u00c8\u0001\u0000\u0000\u0000&\u00cd\u0001"+
		"\u0000\u0000\u0000(\u00cf\u0001\u0000\u0000\u0000*\u00e2\u0001\u0000\u0000"+
		"\u0000,\u00e7\u0001\u0000\u0000\u0000.\u00e9\u0001\u0000\u0000\u00000"+
		"\u00f1\u0001\u0000\u0000\u00002\u00f3\u0001\u0000\u0000\u00004\u00f5\u0001"+
		"\u0000\u0000\u00006\u00ff\u0001\u0000\u0000\u00008\u0101\u0001\u0000\u0000"+
		"\u0000:\u0108\u0001\u0000\u0000\u0000<\u010a\u0001\u0000\u0000\u0000>"+
		"\u010c\u0001\u0000\u0000\u0000@\u0113\u0001\u0000\u0000\u0000B\u0115\u0001"+
		"\u0000\u0000\u0000D\u0117\u0001\u0000\u0000\u0000F\u0120\u0001\u0000\u0000"+
		"\u0000H\u0124\u0001\u0000\u0000\u0000J\u0129\u0001\u0000\u0000\u0000L"+
		"M\u0005\u0001\u0000\u0000MN\u0005#\u0000\u0000NO\u0006\u0000\uffff\uffff"+
		"\u0000OP\u0005\u0002\u0000\u0000PQ\u0003\u0002\u0001\u0000QR\u0003\u0004"+
		"\u0002\u0000RS\u0005\u0003\u0000\u0000ST\u0003\u000e\u0007\u0000TU\u0005"+
		"\u0004\u0000\u0000UV\u0006\u0000\uffff\uffff\u0000V\u0001\u0001\u0000"+
		"\u0000\u0000WX\u0006\u0001\uffff\uffff\u0000X[\u0003\u0006\u0003\u0000"+
		"Y[\u0001\u0000\u0000\u0000ZW\u0001\u0000\u0000\u0000ZY\u0001\u0000\u0000"+
		"\u0000[\u0003\u0001\u0000\u0000\u0000\\]\u0003(\u0014\u0000]^\u0003\u0004"+
		"\u0002\u0000^a\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`\\\u0001"+
		"\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000a\u0005\u0001\u0000\u0000"+
		"\u0000bc\u0005\u0005\u0000\u0000cd\u0005#\u0000\u0000de\u0006\u0003\uffff"+
		"\uffff\u0000ef\u0003\b\u0004\u0000fg\u0005\u0006\u0000\u0000gh\u0003\f"+
		"\u0006\u0000hi\u0005\u0002\u0000\u0000ij\u0006\u0003\uffff\uffff\u0000"+
		"jk\u0003\n\u0005\u0000k\u0007\u0001\u0000\u0000\u0000lm\u0005\u0007\u0000"+
		"\u0000mn\u0005#\u0000\u0000no\u0006\u0004\uffff\uffff\u0000or\u0003\b"+
		"\u0004\u0000pr\u0001\u0000\u0000\u0000ql\u0001\u0000\u0000\u0000qp\u0001"+
		"\u0000\u0000\u0000r\t\u0001\u0000\u0000\u0000st\u0005#\u0000\u0000tu\u0003"+
		"\b\u0004\u0000uv\u0005\u0006\u0000\u0000vw\u0003\f\u0006\u0000wx\u0005"+
		"\u0002\u0000\u0000xy\u0006\u0005\uffff\uffff\u0000yz\u0003\n\u0005\u0000"+
		"z}\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|s\u0001\u0000\u0000"+
		"\u0000|{\u0001\u0000\u0000\u0000}\u000b\u0001\u0000\u0000\u0000~\u007f"+
		"\u0007\u0000\u0000\u0000\u007f\r\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"\n\u0000\u0000\u0081\u0082\u0003\u0010\b\u0000\u0082\u0083\u0005\u000b"+
		"\u0000\u0000\u0083\u000f\u0001\u0000\u0000\u0000\u0084\u0085\u0003\u0012"+
		"\t\u0000\u0085\u0086\u0003\u0010\b\u0000\u0086\u0089\u0001\u0000\u0000"+
		"\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0084\u0001\u0000\u0000"+
		"\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u0011\u0001\u0000\u0000"+
		"\u0000\u008a\u0090\u0003\u0014\n\u0000\u008b\u0090\u0003\u0016\u000b\u0000"+
		"\u008c\u0090\u0003\u001a\r\u0000\u008d\u0090\u0003\u001c\u000e\u0000\u008e"+
		"\u0090\u0003\"\u0011\u0000\u008f\u008a\u0001\u0000\u0000\u0000\u008f\u008b"+
		"\u0001\u0000\u0000\u0000\u008f\u008c\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u0090\u0013"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0005#\u0000\u0000\u0092\u0093\u0006"+
		"\n\uffff\uffff\u0000\u0093\u0094\u0005\f\u0000\u0000\u0094\u0095\u0003"+
		"4\u001a\u0000\u0095\u0096\u0005\u0002\u0000\u0000\u0096\u0015\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005\r\u0000\u0000\u0098\u0099\u0005\u000e\u0000"+
		"\u0000\u0099\u009a\u00034\u001a\u0000\u009a\u009b\u0005\u000f\u0000\u0000"+
		"\u009b\u009c\u0003\u000e\u0007\u0000\u009c\u009d\u0003\u0018\f\u0000\u009d"+
		"\u009e\u0005\u0002\u0000\u0000\u009e\u0017\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0005\u0010\u0000\u0000\u00a0\u00a3\u0003\u000e\u0007\u0000\u00a1"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u0019\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005\u0011\u0000\u0000\u00a5\u00a6\u0003\u000e\u0007\u0000\u00a6"+
		"\u00a7\u0005\u0012\u0000\u0000\u00a7\u00a8\u0005\u000e\u0000\u0000\u00a8"+
		"\u00a9\u00034\u001a\u0000\u00a9\u00aa\u0005\u000f\u0000\u0000\u00aa\u00ab"+
		"\u0005\u0002\u0000\u0000\u00ab\u001b\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005#\u0000\u0000\u00ad\u00ae\u0005\u000e\u0000\u0000\u00ae\u00af\u0003"+
		"\u001e\u000f\u0000\u00af\u00b0\u0005\u000f\u0000\u0000\u00b0\u00b1\u0005"+
		"\u0002\u0000\u0000\u00b1\u001d\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003"+
		"4\u001a\u0000\u00b3\u00b4\u0003 \u0010\u0000\u00b4\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u001f\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0005\u0007\u0000\u0000\u00b9\u00bc\u0003\u001e\u000f"+
		"\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc!\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0005\u0013\u0000\u0000\u00be\u00bf\u0005\u000e\u0000\u0000"+
		"\u00bf\u00c0\u0003$\u0012\u0000\u00c0\u00c1\u0005\u000f\u0000\u0000\u00c1"+
		"\u00c2\u0005\u0002\u0000\u0000\u00c2#\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u00034\u001a\u0000\u00c4\u00c5\u0003&\u0013\u0000\u00c5\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0005\"\u0000\u0000\u00c7\u00c9\u0003&\u0013"+
		"\u0000\u00c8\u00c3\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c9%\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0007\u0000\u0000"+
		"\u00cb\u00ce\u0003$\u0012\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\'\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u0014\u0000\u0000\u00d0\u00d1"+
		"\u0005#\u0000\u0000\u00d1\u00d2\u0006\u0014\uffff\uffff\u0000\u00d2\u00d3"+
		"\u0005\u000e\u0000\u0000\u00d3\u00d4\u0003*\u0015\u0000\u00d4\u00d5\u0005"+
		"\u000f\u0000\u0000\u00d5\u00d6\u0005\u0015\u0000\u0000\u00d6\u00d7\u0003"+
		"0\u0018\u0000\u00d7\u00d8\u0003\u000e\u0007\u0000\u00d8\u00d9\u0005\u0016"+
		"\u0000\u0000\u00d9\u00da\u0005\u0002\u0000\u0000\u00da)\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0005#\u0000\u0000\u00dc\u00dd\u0006\u0015\uffff\uffff"+
		"\u0000\u00dd\u00de\u0005\u0006\u0000\u0000\u00de\u00df\u0003\f\u0006\u0000"+
		"\u00df\u00e0\u0003,\u0016\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e2\u00db\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e3+\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0005\u0007\u0000\u0000\u00e5\u00e8\u0003.\u0017\u0000\u00e6\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e8-\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005#\u0000"+
		"\u0000\u00ea\u00eb\u0006\u0017\uffff\uffff\u0000\u00eb\u00ec\u0005\u0006"+
		"\u0000\u0000\u00ec\u00ed\u0003\f\u0006\u0000\u00ed\u00ee\u0003,\u0016"+
		"\u0000\u00ee/\u0001\u0000\u0000\u0000\u00ef\u00f2\u0003\u0006\u0003\u0000"+
		"\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f21\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0007\u0001\u0000\u0000\u00f43\u0001\u0000\u0000\u0000\u00f5\u00f6"+
		"\u00038\u001c\u0000\u00f6\u00f7\u00036\u001b\u0000\u00f75\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0005\u0017\u0000\u0000\u00f9\u0100\u00038\u001c"+
		"\u0000\u00fa\u00fb\u0005\u0018\u0000\u0000\u00fb\u0100\u00038\u001c\u0000"+
		"\u00fc\u00fd\u0005\u0019\u0000\u0000\u00fd\u0100\u00038\u001c\u0000\u00fe"+
		"\u0100\u0001\u0000\u0000\u0000\u00ff\u00f8\u0001\u0000\u0000\u0000\u00ff"+
		"\u00fa\u0001\u0000\u0000\u0000\u00ff\u00fc\u0001\u0000\u0000\u0000\u00ff"+
		"\u00fe\u0001\u0000\u0000\u0000\u01007\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0003>\u001f\u0000\u0102\u0103\u0003:\u001d\u0000\u01039\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0003<\u001e\u0000\u0105\u0106\u00038\u001c\u0000"+
		"\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000"+
		"\u0108\u0104\u0001\u0000\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000"+
		"\u0109;\u0001\u0000\u0000\u0000\u010a\u010b\u0007\u0002\u0000\u0000\u010b"+
		"=\u0001\u0000\u0000\u0000\u010c\u010d\u0003D\"\u0000\u010d\u010e\u0003"+
		"@ \u0000\u010e?\u0001\u0000\u0000\u0000\u010f\u0110\u0003B!\u0000\u0110"+
		"\u0111\u0003>\u001f\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0114"+
		"\u0001\u0000\u0000\u0000\u0113\u010f\u0001\u0000\u0000\u0000\u0113\u0112"+
		"\u0001\u0000\u0000\u0000\u0114A\u0001\u0000\u0000\u0000\u0115\u0116\u0007"+
		"\u0003\u0000\u0000\u0116C\u0001\u0000\u0000\u0000\u0117\u0118\u0003F#"+
		"\u0000\u0118E\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u000e\u0000\u0000"+
		"\u011a\u011b\u00034\u001a\u0000\u011b\u011c\u0005\u000f\u0000\u0000\u011c"+
		"\u0121\u0001\u0000\u0000\u0000\u011d\u011e\u0003H$\u0000\u011e\u011f\u0003"+
		"J%\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u0119\u0001\u0000\u0000"+
		"\u0000\u0120\u011d\u0001\u0000\u0000\u0000\u0121G\u0001\u0000\u0000\u0000"+
		"\u0122\u0125\u0003<\u001e\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124"+
		"\u0122\u0001\u0000\u0000\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0125"+
		"I\u0001\u0000\u0000\u0000\u0126\u0127\u0005#\u0000\u0000\u0127\u012a\u0006"+
		"%\uffff\uffff\u0000\u0128\u012a\u00032\u0019\u0000\u0129\u0126\u0001\u0000"+
		"\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000\u012aK\u0001\u0000\u0000"+
		"\u0000\u0014Z`q|\u0088\u008f\u00a2\u00b6\u00bb\u00c8\u00cd\u00e2\u00e7"+
		"\u00f1\u00ff\u0108\u0113\u0120\u0124\u0129";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}