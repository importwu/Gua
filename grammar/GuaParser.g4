parser grammar GuaParser;

options {tokenVocab = GuaLexer;}

program
    : source+
    ;

source
    : definition
    | expression
    ;

expression
    : variable
    | literal
    | condition
    | localBind
    | assignment
    | sequence
    | iteration
    | delayEval
    | lambda
    | procedureCall
    ;

literal
    : booleanLiteral         
    | numberLiteral
    | characterLiteral
    | stringLiteral
    | quotation
    ;
 
variable   
    : Identifier 
    ;

booleanLiteral  
    : Boolean    
    ;

numberLiteral
    : Number     
    ;

characterLiteral
    : Character  
    ;

stringLiteral    
    : String     
    ;

symbolLiteral   
    : Identifier 
    ;

quotation
    : '\'' dataum
    | '('  QUOTE   dataum ')'
    ;  
 
dataum
    : booleanLiteral
    | numberLiteral
    | characterLiteral  
    | stringLiteral  
    | symbolLiteral
    | list    
    | vector              
    | map           
    ;

list
    : '(' dataum*                   ')'     #properList
    | '(' dataum+ '.' last = dataum ')'     #pairOrImproperList
    | abbrev dataum                         #abbrevList
    ;

abbrev
    : '\''
    ;

vector
    : '#(' dataum* ')'
    ;  

map
    : '#hash(' member* ')'
    ;

member
    : '(' key = dataum '.' value = dataum ')'
    ;

condition
    : ifCondition
    | condCondition
    | caseCondition
    | andCondition
    | orCondition
    ;

ifCondition
    : '(' IF test = expression consequent = expression alternate = expression? ')' 
    ;

condCondition
    : '(' COND condClause* elseClause? ')'
    ;

condClause
    : '(' test = expression order += expression*               ')'     #condClauseOrder
    | '(' test = expression '=>' operator = expression         ')'     #condClauseArrow
    ;
  
caseCondition
    : '(' CASE key = expression caseClause* elseClause? ')'
    ;

caseClause
    : '(' '(' dataum* ')' expression+ ')'
    ;

elseClause
    : '(' ELSE order += expression* ')'
    ;

andCondition
    : '(' AND expression* ')'
    ;

orCondition
    : '(' OR expression* ')'
    ;

localBind
    : letBind
    | letStarBind
    | letRecBind
    ;

letBind
    : '(' LET binds body ')'
    ;

letStarBind
    : '(' LETSTAR binds body ')'
    ;

letRecBind
    : '(' LETREC binds body ')'
    ;
 
binds
    : '(' bind+ ')'
    ;

bind
    : '(' varname = Identifier init = expression ')'
    ;

assignment
    : setAssignment
    ;

setAssignment
    : '(' SET varname = Identifier expression ')'
    ;

sequence
    : beginSequence
    ;

beginSequence
    : '(' BEGIN action* ')'
    ;

action
    : expression
    | definition
    ;

iteration
    : doIteration
    ;

doIteration
    : '(' DO '(' doBinds ')' 
        '(' test = expression order += expression* ')' 
        command += expression* ')'
    ;

doBinds
    :   '(' doBind+ ')'
    ;

doBind
    : varname = Identifier init = expression step = expression 
    ;

delayEval
    : '(' DELAY expression+ ')'
    ;

lambda
    : '(' LAMBDA '(' formals += Identifier* ')' body ')'        #lambdaFixedArguments          
    | '(' LAMBDA      formal = Identifier       body ')'        #lambdaAnyArguments
    | '(' LAMBDA      '('    rest    ')'        body ')'        #lambdaRestArguments
    ;

rest 
    : Identifier+ . last = Identifier
    ;

procedureCall
    : '(' operator = expression operands += expression* ')'
    ;
 
definition
    : '(' DEFINE '(' varname = Identifier formals += Identifier*  ')'  body ')'  #defineProcedure
    | '(' DEFINE '(' varname = Identifier '.' formal = Identifier ')'  body ')'  #defineLambdaRestArguments
    | '(' DEFINE     varname = Identifier expression                        ')'  #defineVariable
    ;

body
    : definition* expression+
    ;