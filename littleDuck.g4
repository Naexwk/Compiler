grammar littleDuck;

@parser::header { 
from Middleman import *
}

programa: 'program' ID 
{
program.variableTable["owner"] = $ID.text
}
 ';' opc_vars optional_funcs 'main' body 'end'
{
program.insertQuad('end', None, None, None)
program.Execute()
};

opc_vars: 
{
program.currentLevel = "global"
}
vars | ;

optional_funcs: funcs optional_funcs | ;

vars: 'var' ID 
{
program.declareNewVariable($ID.text)
}
mas_vars ':' type ';' {program.clearTempVarDeclaration()} mas_dec_vars;

mas_vars: ',' ID 
{
program.declareNewVariable($ID.text)
} 
mas_vars | ;

mas_dec_vars: ID
{
program.declareNewVariable($ID.text)
} mas_vars ':' type ';' {program.clearTempVarDeclaration()} mas_dec_vars | ;

type: 'int' {program.currentType = "int"}| 'float'
{program.currentType = "float"} | 'bool' {program.currentType = "bool"};

body: '{' statement '}';

statement: options_statement statement | ;

options_statement: assign | condition | cycle | f_call | print;

assign: ID 
{
program.variableDeclared($ID.text)
}
 '=' expresion
{
if program.variableDeclared($ID.text):
    program.assignInsertQuad('=', program.stack_operands.pop(), None, $ID.text)
} ';';

condition: 'if' '(' expresion ')' {
if program.checkBoolExpression():
    program.insertQuad('GOTOF', program.stack_operands.pop(), None, None)
    program.stack_jumps.append(len(program.quadruples) - 1)} body else {
program.editQuad(2, len(program.quadruples), program.stack_jumps.pop())
}';';
else: 'else' {
program.insertQuad('GOTO', None, None, None)
program.editQuad(2, len(program.quadruples), program.stack_jumps.pop())
program.stack_jumps.append(len(program.quadruples) - 1)
} body | ;

cycle: 'do' {program.stack_jumps.append(len(program.quadruples))} body 'while' '(' expresion ')' {
if program.checkBoolExpression():
    program.insertQuad('GOTOT', program.stack_operands.pop(), program.stack_jumps.pop(), None)
} ';';

f_call: ID '(' opc_f_call ')' ';';

opc_f_call: expresion mas_f_call | ;

mas_f_call: ',' opc_f_call | ;

print: 'print' '(' opc_print ')' ';';

opc_print: expresion 
{program.insertQuad('print', program.stack_operands.pop(), None, None)}
 mas_print | CTE_STRING {program.insertQuad('print', $CTE_STRING.text, None, None)} mas_print;

mas_print: ',' opc_print | ;

funcs: 'void' ID 
{
program.newFunction($ID.text)
}

'(' opc_funcs ')' '[' vars_funcs body ']' ';';

opc_funcs: ID 
{
program.declareNewVariable($ID.text)
}
':' type mas_opc_funcs | ;

mas_opc_funcs: ',' next_opc_funcs | ;

next_opc_funcs: ID {
program.declareNewVariable($ID.text)
}
':' type  mas_opc_funcs;

vars_funcs: vars | ;

cte: CTE_INT {program.stack_operands.append(int($CTE_INT.text))}  | CTE_FLOAT {
program.stack_operands.append(float($CTE_FLOAT.text))};

expresion: exp {program.clearQuadrupleList('+')} opc_expresion {program.clearQuadrupleList('eoe')};

opc_expresion: '>' 
{
program.stack_operator.append('>')
}  exp | '<'
{
program.stack_operator.append('<')
} exp | '!=' 
{
program.stack_operator.append('!=')
} exp | ;

exp: termino {program.clearQuadrupleList('*')} mas_exp;

mas_exp: exp_signo exp | ;

exp_signo: '+'
{
program.stack_operator.append('+')
} | '-'
{
program.stack_operator.append('-')
};

termino: factor mas_termino;

mas_termino: signo_factor termino | ;

signo_factor: '*' {program.stack_operator.append('*')} | '/' {program.stack_operator.append('/')};

factor: opc_factor;

opc_factor: '('
{
program.stack_operator.append('(')
} 
expresion ')' 
{
program.clearQuadrupleList(')')
}
| opc_signo opc_factor_prime {
if $opc_signo.text == "-":
    op1 = program.stack_operands.pop()
    type1 = type(op1).__name__
    if type1 == "str":
        type1 = program.getVariable(program.currentLevel, op1).vtype
    program.insertQuad('*', op1, -1, program.newTempVar('*', type1, "int"))
};

opc_signo: signo | ;

signo: '+' | '-' ;

opc_factor_prime: ID
{
if program.variableDeclared($ID.text):
    program.stack_operands.append($ID.text)
}
 | cte;


NEWLINE: [\r\n\t]+ -> skip;
WHITESPACE: ' ' -> skip;
CTE_INT: [0-9]+;
CTE_FLOAT: [0-9]+('.'[0-9]+)?;
CTE_STRING: '"'~["]*'"';
ID: [a-zA-Z_]([a-zA-Z0-9_])*;