grammar gramatyka;

/* LEXER RULES */

// Keywords
CLASS : 'class';
PUBLIC : 'public';
PRIVATE : 'private';
STATIC : 'static';
VOID : 'void';
INT : 'int';
BOOLEAN : 'boolean';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
RETURN : 'return';

// Identifiers
ID : [a-zA-Z][a-zA-Z0-9]*;

// Literals
INT_LITERAL : [0-9]+;
BOOLEAN_LITERAL : ('true' | 'false');

// Operators
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
AND : '&&';
OR : '||';
NOT : '!';

// Punctuation
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
SEMICOLON : ';';
COMMA : ',';

// Whitespace
WS : [ \t\r\n]+ -> skip;

// Comments
SINGLE_LINE_COMMENT : '//' ~[\r\n]* -> skip;
MULTI_LINE_COMMENT : '/*' .*? '*/' -> skip;

/* PARSER RULES */

program : classDeclaration+;

classDeclaration : CLASS ID LBRACE memberDeclaration* RBRACE;

memberDeclaration : methodDeclaration | fieldDeclaration;

fieldDeclaration : (PUBLIC | PRIVATE) STATIC? (INT | BOOLEAN) ID SEMICOLON;

methodDeclaration : (PUBLIC | PRIVATE) STATIC? (VOID | INT) ID LPAREN parameterList? RPAREN block;

parameterList : parameter (COMMA parameter)*;

parameter : (INT | BOOLEAN) ID;

block : LBRACE statement* RBRACE;

statement : assignment | ifStatement | whileStatement | returnStatement | block;

assignment : ID '=' expression SEMICOLON;

ifStatement : IF LPAREN expression RPAREN statement (ELSE statement)?;

whileStatement : WHILE LPAREN expression RPAREN statement;

returnStatement : RETURN expression? SEMICOLON;

expression : literal | ID | expression op expression | LPAREN expression RPAREN;

op : PLUS | MINUS | MULT | DIV | MOD | AND | OR;

literal : INT_LITERAL | BOOLEAN_LITERAL;
// ERROR HANDLING

// Catch all lexer rule to match any character that doesn't fit any other rule
ERRCHAR : . -> channel(HIDDEN);

// Catch all parser rule to match any input that doesn't fit any other rule
// This will result in a syntax error, but prevents the parser from exiting with an exception
ERR : .+ -> channel(HIDDEN);


testProgram : classDeclaration EOF;

classDeclaration : CLASS ID LBRACE memberDeclaration* RBRACE;

memberDeclaration : methodDeclaration | fieldDeclaration;

fieldDeclaration : (PUBLIC | PRIVATE) STATIC? (INT | BOOLEAN) ID SEMICOLON;

methodDeclaration : (PUBLIC | PRIVATE) STATIC? (VOID | INT) ID LPAREN parameterList? RPAREN block;

parameterList : parameter (COMMA parameter)*;

parameter : (INT | BOOLEAN) ID;

block : LBRACE statement* RBRACE;

statement : assignment | ifStatement | whileStatement | returnStatement | block;

assignment : ID '=' expression SEMICOLON;

ifStatement : IF LPAREN expression RPAREN statement (ELSE statement)?;

whileStatement : WHILE LPAREN expression RPAREN statement;

returnStatement : RETURN expression? SEMICOLON;

expression : literal | ID | expression op expression | LPAREN expression RPAREN;

op : PLUS | MINUS | MULT | DIV | MOD | AND | OR;

literal : INT_LITERAL | BOOLEAN_LITERAL;

// Python code generator

@header {
    package com.example;
}

@members {

    // Main Python code generation method
    private String generatePython(ParseTree tree) {
        StringBuilder builder = new StringBuilder();

        if (tree instanceof TerminalNode) {
            builder.append(tree.getText());
        } else {
            switch (tree.getClass().getSimpleName()) {
                case "ProgramContext":
                    builder.append(generatePython(tree.getChild(0)));
                    break;
                case "ClassDeclarationContext":
                    builder.append("class ")
                            .append(generatePython(tree.getChild(1)))
                            .append(":\n");
                    builder.append(generatePython(tree.getChild(3)));
                    break;
                case "MethodDeclarationContext":
                    builder.append("@staticmethod\n");
                    builder.append("def ")
                            .append(generatePython(tree.getChild(3)))
                            .append("(");
                    if (tree.getChildCount() == 7) {
                        builder.append(generatePython(tree.getChild(5)));
                    }
                    builder.append("):\n");
                    builder.append(generatePython(tree.getChild(tree.getChildCount() - 1)));
                    break;
                case "ParameterContext":
                    builder.append(generatePython(tree.getChild(1)))
                            .append(": ");
                    builder.append(tree.getChild(0).getText())
                            .append(", ");
                    break;
                case "BlockContext":
                    builder.append(indent(generatePython(tree.getChild(0)), 1));
                    break;
                case "StatementContext":
                    builder.append(generatePython(tree.getChild(0)));
                    break;
                case "AssignmentContext":
                    builder.append(generatePython(tree.getChild(0)))
                            .append(" = ")
                            .append(generatePython(tree.getChild(2)))
                            .append("\n");
                    break;
                case "IfStatementContext":
                    builder.append("if ")
                            .append(generatePython(tree.getChild(2)))
                            .append(":\n");
                    builder.append
                builder.append(indent(generatePython(tree.getChild(4)), 1));
                if (tree.getChildCount() == 7) {
                    builder.append("else:\n")
                            .append(indent(generatePython(tree.getChild(6)), 1));
                }
                break;
            case "WhileStatementContext":
                builder.append("while ")
                        .append(generatePython(tree.getChild(2)))
                        .append(":\n");
                builder.append(indent(generatePython(tree.getChild(4)), 1));
                break;
            case "ReturnStatementContext":
                builder.append("return ");
                if (tree.getChildCount() == 3) {
                    builder.append(generatePython(tree.getChild(1)));
                }
                builder.append("\n");
                break;
            case "ExpressionContext":
                if (tree.getChildCount() == 1) {
                    builder.append(generatePython(tree.getChild(0)));
                } else if (tree.getChildCount() == 3) {
                    builder.append(generatePython(tree.getChild(0)))
                            .append(" ")
                            .append(generatePython(tree.getChild(1)))
                            .append(" ")
                            .append(generatePython(tree.getChild(2)));
                } else if (tree.getChildCount() == 2) {
                    builder.append(generatePython(tree.getChild(0)))
                            .append("(")
                            .append(generatePython(tree.getChild(1)))
                            .append(")");
                }
                break;
            case "LiteralContext":
                builder.append(tree.getChild(0).getText());
                break;
            default:
                // Ignore other node types
                break;
        }
    }

    return builder.toString();
}

// Utility method to add indentation to a string
private String indent(String input, int level) {
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < level; i++) {
        builder.append("    ");
    }

    String[] lines = input.split("\n");
    for (String line : lines) {
        builder.append(line).append("\n");
    }

    return builder.toString();
}
}