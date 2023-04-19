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

/* operatory */
Add : '+';
Subtract : '-';
Multiply : '*';
Divide : '/';

/* znaki interpunkcyjne */
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

/* literały */

IntegerLiteral : [0-9]+;

/* identyfikatory */
Identifier : [a-zA-Z_] [a-zA-Z_0-9]*;

/* reguły */

/* deklaracja klasy*/
compilationUnit : classDeclaration;

/* deklaracja składa się z słowa kluczowego 'class', identyfikatora klasy i  ciała klasy */
classDeclaration : Class Identifier classBody;

/* ciało klasy jest otoczone klamrami i składa się z deklaracji pól i metod*/
classBody : LeftCurly classBodyDeclaration* RightCurly;

/*Deklaracja w klasie może być deklaracją metody lub pola.*/
classBodyDeclaration : methodDeclaration | fieldDeclaration;

/*Deklaracja pola składa się z typu, identyfikatora i średnika*/
fieldDeclaration : type Identifier Semicolon;

/* deklaracja metody main musi mieć określony zestaw argumentów i zwracać typ void */
methodDeclaration : Public Static Void Main LeftParen String LeftSquareBracket RightSquareBracket Identifier RightParen methodBody;

/* ciało metody składa się z instrukcji i otoczone jest klamrami */
methodBody : LeftCurly statement* RightCurly;

/* typ może być typem wbudowanym lub identyfikatorem użytkownika */
type : Int | Identifier;

/* instrukcja składa się z przypisania, instrukcji warunkowej, instrukcji pętli, instrukcji return lub wyrażenia */
statement : assignmentStatement | ifStatement | whileStatement | returnStatement | expressionStatement;

/* przypisanie zmiennej wartości składa się z identyfikatora, znaku równości, wyrażenia i średnika */
assignmentStatement : Identifier Equals expression Semicolon;

/* instrukcja warunkowa składa się z instrukcji if i opcjonalnej instrukcji else */
ifStatement : If LeftParen expression RightParen statement (Else statement)?;

/* instrukcja pętli składa się z instrukcji while, warunku i instrukcji pętli */
whileStatement : While LeftParen expression RightParen statement;

/* instrukcja return może zwrócić wartość wyrażenia lub zakończyć funkcję */
returnStatement : Return expression? Semicolon;

/* wyrażenie może składać się z wyrażeń arytmetycznych, ciągów znaków, identyfikatorów lub nawiasów */
expressionStatement : expression Semicolon;

expression : additiveExpression;

/* wyrażenie składa się z jednego lub więcej wyrażeń mnożenia/dzielenia, po których następuje jeden lub więcej operatorów dodawania lub odejmowania */
additiveExpression : multiplicativeExpression (Add multiplicativeExpression)*;

/* wyrażenie składa się z jednego lub więcej wyrażeń, po których następuje jeden lub więcej operatorów mnożenia lub dzielenia */
multiplicativeExpression : primaryExpression (Multiply primaryExpression)*;

/* wyrażenie może być liczbą całkowitą, łańcuchem znaków, identyfikatorem lub wyrażeniem zdefiniowanym w nawiasach okrągłych */
primaryExpression : IntegerLiteral | StringLiteral | Identifier | LeftParen expression RightParen;
