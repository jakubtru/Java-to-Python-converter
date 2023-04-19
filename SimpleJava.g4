grammar SimpleJava;

/* keywords */
class : 'class';
public : 'public';
static : 'static';
void : 'void';
main : 'main';
String : 'String';
extends : 'extends';
return : 'return';
int : 'int';
if : 'if';
else : 'else';
while : 'while';

/* operators */
add : '+';
subtract : '-';
multiply : '*';
divide : '/';

/* punctuation */
semicolon : ';';
comma : ',';
leftParen : '(';
rightParen : ')';
leftCurly : '{';
rightCurly : '}';
equals : '=';
greaterThan : '>';
lessThan : '<';
doubleQuote : '"';

/* literals */
stringLiteral : doubleQuote (~["\\] | "\\\" | "\\\\])* doubleQuote;
integerLiteral : [0-9]+;

/* identifiers */
identifier : [a-zA-Z_] [a-zA-Z_0-9]*;

/* rules */
compilationUnit : classDeclaration;
classDeclaration : class identifier classBody;
classBody : leftCurly classBodyDeclaration* rightCurly;
classBodyDeclaration : methodDeclaration | fieldDeclaration;
fieldDeclaration : type identifier semicolon;
methodDeclaration : public static void main leftParen String leftSquareBracket rightSquareBracket identifier rightParen methodBody;
methodBody : leftCurly statement* rightCurly;
type : int | identifier;

statement : assignmentStatement | ifStatement | whileStatement | returnStatement | expressionStatement;
assignmentStatement : identifier equals expression semicolon;
ifStatement : if leftParen expression rightParen statement (else statement)?;
whileStatement : while leftParen expression rightParen statement;
returnStatement : return expression? semicolon;
expressionStatement : expression semicolon;

expression : additiveExpression;
additiveExpression : multiplicativeExpression (add multiplicativeExpression)*;
multiplicativeExpression : primaryExpression (multiply primaryExpression)*;
primaryExpression : integerLiteral | stringLiteral | identifier | leftParen expression rightParen;
