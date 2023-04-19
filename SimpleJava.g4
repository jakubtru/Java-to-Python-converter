 grammar SimpleJava;
 /* keywords */
Class : 'class';
Public : 'public';
Static : 'static';
Void : 'void';
Main : 'main';
String : 'String';
Extends : 'extends';
Return : 'return';
Int : 'int';
If : 'if';
Else : 'else';
While : 'while';

/* operators */
Add : '+';
Subtract : '-';
Multiply : '*';
Divide : '/';

/* punctuation */
Semicolon : ';';
Comma : ',';
LeftParen : '(';
RightParen : ')';
LeftCurly : '{';
RightCurly : '}';
Equals : '=';
GreaterThan : '>';
LessThan : '<';
DoubleQuote : '"';

/* literals */

IntegerLiteral : [0-9]+;

/* identifiers */
Identifier : [a-zA-Z_] [a-zA-Z_0-9]*;

/* rules */
compilationUnit : classDeclaration;
classDeclaration : Class Identifier classBody;
classBody : LeftCurly classBodyDeclaration* RightCurly;
classBodyDeclaration : methodDeclaration | fieldDeclaration;
fieldDeclaration : type Identifier Semicolon;
methodDeclaration : Public Static Void Main LeftParen String LeftSquareBracket RightSquareBracket Identifier RightParen methodBody;
methodBody : LeftCurly statement* RightCurly;
type : Int | Identifier;

statement : assignmentStatement | ifStatement | whileStatement | returnStatement | expressionStatement;
assignmentStatement : Identifier Equals expression Semicolon;
ifStatement : If LeftParen expression RightParen statement (Else statement)?;
whileStatement : While LeftParen expression RightParen statement;
returnStatement : Return expression? Semicolon;
expressionStatement : expression Semicolon;

expression : additiveExpression;
additiveExpression : multiplicativeExpression (Add multiplicativeExpression)*;
multiplicativeExpression : primaryExpression (Multiply primaryExpression)*;
primaryExpression : IntegerLiteral | StringLiteral | Identifier | LeftParen expression RightParen;
