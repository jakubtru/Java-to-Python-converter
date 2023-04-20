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
Space: ' ';

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

fragment Digit: [0-9];
fragment EscapeSequence: '\\' [btnfr"'\\"];

/* identyfikatory */
Identifier : [a-zA-Z_] [a-zA-Z_0-9]*;

/* reguły */

/* deklaracja klasy*/
compilationUnit : classDeclaration;

/* deklaracja składa się z słowa kluczowego 'class', identyfikatora klasy i ciała klasy */
classDeclaration : Class Space Identifier classBody ;

/* ciało klasy jest otoczone klamrami i składa się z deklaracji pól i metod*/
classBody : LeftCurly NewLine classBodyDeclaration* NewLine RightCurly;

/* Deklaracja w klasie może być deklaracją metody lub pola. */
classBodyDeclaration : methodDeclaration | fieldDeclaration;

/* Deklaracja pola składa się z typu, identyfikatora i średnika */
fieldDeclaration : type Identifier Semicolon;

/* deklaracja metody main musi mieć określony zestaw argumentów i zwracać typ void */
methodDeclaration : Public Space Static Space Void Space Main LeftParen String LeftSquareBracket RightSquareBracket Identifier RightParen methodBody;

/* ciało metody składa się z instrukcji i otoczone jest klamrami */
methodBody : LeftCurly NewLine statement* RightCurly;

/* typ może być typem wbudowanym lub identyfikatorem użytkownika */
type : Int | Char | Bool | Float | String | Identifier;

/* instrukcja składa się z przypisania, instrukcji warunkowej, instrukcji pętli, instrukcji return lub wyrażenia */
statement : (assignmentStatement | ifStatement | whileStatement | returnStatement | expressionStatement) NewLine;

/* przypisanie zmiennej wartości składa się z identyfikatora, znaku równości, wyrażenia i średnika */
assignmentStatement : Identifier Equals expression Semicolon;


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
