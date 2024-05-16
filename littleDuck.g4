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
print(program.variableTable)
};

opc_vars: 
{
program.currentLevel = "global"
}
vars | ;

optional_funcs: funcs optional_funcs | ;

vars: 'var' ID 
{
if not program.variableExists($ID.text):
    program.tempVarDeclarations.append($ID.text)
else:
    print("Variable " + $ID.text + " already declared")
}
mas_vars ':' type ';' {program.clearTempVarDeclaration()} mas_dec_vars;

mas_vars: ',' ID 
{
if not program.variableExists($ID.text):
    program.tempVarDeclarations.append($ID.text)
else:
    print("Variable " + $ID.text + " already declared")
} 
mas_vars | ;

mas_dec_vars: ID mas_vars ':' type ';' {program.clearTempVarDeclaration()} mas_dec_vars | ;

type: 'int' | 'float';

body: '{' statement '}';

statement: options_statement statement | ;

options_statement: assign | condition | cycle | f_call | print;

assign: ID 
{
if not program.variableExists($ID.text):
    print($ID.text + " does not exist in current context")
}
 '=' expresion ';';

condition: 'if' '(' expresion ')' body else ';';

else: 'else' body | ;

cycle: 'do' body 'while' '(' expresion ')' ';';

f_call: ID '(' opc_f_call ')' ';';

opc_f_call: expresion mas_f_call | ;

mas_f_call: ',' opc_f_call | ;

print: 'print' '(' opc_print ')' ';';

opc_print: expresion mas_print | CTE_STRING mas_print;

mas_print: ',' opc_print | ;

funcs: 'void' ID 
{
if not program.functionExists($ID.text):
    program.functionTable.append($ID.text)
    program.currentLevel = $ID.text
    program.variableTable[program.currentLevel] = []
else:
    print("Function " + $ID.text + " already declared")
}

'(' opc_funcs ')' '[' vars_funcs body ']' ';';

opc_funcs: ID 
{
if not program.variableExists($ID.text):
    program.tempVarDeclarations.append($ID.text)
else:
    print("Variable " + $ID.text + " already declared")
}
':' type mas_opc_funcs | ;

mas_opc_funcs: ',' next_opc_funcs | ;

next_opc_funcs: ID
{
if not program.variableExists($ID.text):
    program.tempVarDeclarations.append($ID.text)
else:
    print("Variable " + $ID.text + " already declared")
}
 ':' type mas_opc_funcs;

vars_funcs: vars | ;

cte: CTE_INT | CTE_FLOAT;

expresion: exp opc_expresion;

opc_expresion: '>' exp | '<' exp | '!=' exp | ;

exp: termino  mas_exp;

mas_exp: signo exp | ;

signo: '+' | '-';

termino: factor mas_termino;

mas_termino: signo_factor termino | ;

signo_factor: '*' | '/';

factor: opc_factor;

opc_factor: '(' expresion ')' | opc_signo opc_factor_prime;

opc_signo: signo | ;

opc_factor_prime: ID
{
if not program.variableExists($ID.text):
    print($ID.text + " does not exist in current context")
}
 | cte;


NEWLINE: [\r\n\t]+ -> skip;
WHITESPACE: ' ' -> skip;
CTE_INT: [0-9]+;
CTE_FLOAT: '-'?[0-9]+('.'[0-9]+)?;
CTE_STRING: '"'~["]*'"';
ID: [a-zA-Z_]([a-zA-Z0-9_])*;











