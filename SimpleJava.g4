grammar SimpleJava;

/* keywords */
Class : 'class';
Public : 'public';
Static : 'static';
Void : 'void';
Main : 'main';
String: 'String';
Int: 'int';
Char: 'char';
Bool: 'bool';
Float: 'float';
Extends : 'extends';
Return : 'return';
If : 'if';
Else : 'else';
While : 'while';
Print : 'System.out.println';

/* operatory i znaki interpunkcyjne */
Plus : '+';
Minus : '-';
Multiply : '*';
Divide : '/';
Equals : '=';
GreaterThan : '>';
LessThan : '<';
DoubleQuote : '"';
LessThanOrEqual: '<=';
GreaterThanOrEqual: '>=';
Equal: '==';
NotEqual: '!=';
And: '&&';
Or: '||';
Dot: '.';

Semicolon : ';';
Comma : ',';
LeftParen : '(';
RightParen : ')';
LeftCurly : '{';
RightCurly : '}';
LeftSquareBracket: '[';
RightSquareBracket: ']';
NewLine: '\n';


/* literały */

IntegerLiteral : [0-9]+;
FloatLiteral: Digit+ '.' Digit+;
CharLiteral: '\'' ~('\'' | '\\') '\'';
BoolLiteral: 'true' | 'false';
StringLiteral: '"' (~('"' | '\\') | EscapeSequence)* '"';
Whitespace: [ \t\r\n\u000C]+ -> skip;
fragment Digit: [0-9];
fragment EscapeSequence: '\\' [btnfr"'\\"];

/* identyfikatory */
Identifier : [a-zA-Z_] [a-zA-Z_0-9]*;

/* reguły */

/* deklaracja klasy*/
compilationUnit : classDeclaration* EOF;

/* deklaracja składa się z słowa kluczowego 'class', identyfikatora klasy i ciała klasy */
classDeclaration : Public Class Identifier classBody;

/* ciało klasy jest otoczone klamrami i składa się z deklaracji pól i metod*/
classBody : LeftCurly classBodyDeclaration (RightCurly | NewLine RightCurly);

/* Deklaracja w klasie może być deklaracją metody lub pola. */
classBodyDeclaration : (methodDeclaration | fieldDeclaration)*;

/* Deklaracja pola składa się z typu, identyfikatora i średnika */
fieldDeclaration : type Identifier Semicolon (fieldDeclaration|methodDeclaration)* | type  assignmentStatement (fieldDeclaration|methodDeclaration)*;

/* deklaracja metody main musi mieć określony zestaw argumentów i zwracać typ void */
methodDeclaration : (Public Static Void Main LeftParen String LeftSquareBracket RightSquareBracket Identifier RightParen methodBody)|(Public (Void|Int|String|Char|Bool|Float) Identifier LeftParen  (Void|Int|String|Char|Bool|Float) Identifier RightParen methodBody);

/* ciało metody składa się z instrukcji i otoczone jest klamrami */
methodBody : LeftCurly statement* (RightCurly| NewLine RightCurly);

/* typ może być typem wbudowanym lub identyfikatorem użytkownika */
type : Int | Char | Bool | Float | String | Identifier;

/* inkrementacja zmiennej */
incrementStatement : Identifier Plus Plus Semicolon;

/* dekrementacja zmiennej */
decrementStatement : Identifier Minus Minus Semicolon;

declarationStatement : type Identifier Equals primaryExpression Semicolon;
/* instrukcja składa się z przypisania, instrukcji warunkowej, instrukcji pętli, instrukcji return, wyrażenia, inkrementacji lub dekrementacji */
statement : (declarationStatement | assignmentStatement | ifStatement | whileStatement | returnStatement | expressionStatement | incrementStatement | decrementStatement|printStatement);


/* przypisanie zmiennej wartości składa się z identyfikatora, znaku równości, wyrażenia i średnika */
assignmentStatement : Identifier Equals expression Semicolon | Identifier Equals (CharLiteral|FloatLiteral|StringLiteral|IntegerLiteral|BoolLiteral)Semicolon;

printStatement : Print LeftParen StringLiteral RightParen Semicolon;
/* instrukcja warunkowa składa się z instrukcji if i opcjonalnej instrukcji else */
ifStatement : If LeftParen expression RightParen statement (Else statement)?;

/* instrukcja pętli składa się z instrukcji while, warunku i instrukcji pętli */
whileStatement : While LeftParen expression RightParen statement;

/* instrukcja return może zwrócić wartość wyrażenia lub zakończyć funkcję */
returnStatement : Return expression? Semicolon;

expressionStatement: expression Semicolon;

/* wyrażenie może być wyrażeniem logicznym, porównaniem lub operacją matematyczną */
expression : logicalExpression;

logicalExpression : comparisonExpression ( ( '&&' | '||' ) comparisonExpression )*;

comparisonExpression : mathExpression ( ( '<' | '>' | '<=' | '>=' | '==' | '!=' ) mathExpression )*;

mathExpression : unaryExpression ( ( '+' | '-' | '*' | '/' ) unaryExpression )*;

unaryExpression : primaryExpression | ( ( '+' | '-' ) unaryExpression );

primaryExpression : IntegerLiteral | FloatLiteral | CharLiteral | BoolLiteral | StringLiteral | Identifier | LeftParen expression RightParen;
