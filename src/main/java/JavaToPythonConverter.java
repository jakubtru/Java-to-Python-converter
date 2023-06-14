import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.*;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.io.PrintWriter;

public class JavaToPythonConverter extends SimpleJavaBaseListener {

    private StringBuilder pythonCode;
    private final PrintWriter writer;
    private final String tab = "    ";
    private int indentationLevel = 0;
    private StringBuilder mainMethodCode = new StringBuilder();

    public JavaToPythonConverter(String outputFileName) throws IOException {
        writer = new PrintWriter(new FileWriter(outputFileName));
        pythonCode = new StringBuilder();
    }

    @Override
    public void enterCompilationUnit(SimpleJavaParser.CompilationUnitContext ctx) {
        pythonCode.append("import sys\n\n");
        writer.write(pythonCode.toString());
    }

    @Override
    public void enterClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx) {
//        writer.println("class " + ctx.Identifier().getText() + ":");
        pythonCode.append("class ").append(ctx.Identifier().getText()).append(":\n");
        writer.write(pythonCode.toString());
        indentationLevel++;

    }

    @Override
    public void enterNormalMethodDeclaration(SimpleJavaParser.NormalMethodDeclarationContext ctx) {
        String[] identifier = ctx.Identifier().toString().substring(1, ctx.Identifier().toString().length() - 1).replace(",", "").split(" ");
        String methodName = identifier[0];
        String methodArgs = Arrays.stream(identifier).skip(1).collect(Collectors.joining(","));
//        String methodArgs = ctx.Identifier().toString().substring(1, ctx.Identifier().toString().length() - 1).replace(",", "").split(" ")[
//        writer.println(tab + "def "+ methodName + "(self, " + methodArgs + "):");
//
        pythonCode.append(tab).append("def ").append(methodName).append("(self, ").append(methodArgs).append("):\n");
        writer.write(pythonCode.toString());
        indentationLevel++;
    }


    @Override
    public void enterMainMethodDeclaration(SimpleJavaParser.MainMethodDeclarationContext ctx) {
//        writer.println(tab + "def main(args):");
        pythonCode.append(tab).append("def main(args):\n");
        writer.write(pythonCode.toString()+"\n");
        indentationLevel++;
    }

    @Override
    public void exitMainMethodDeclaration(SimpleJavaParser.MainMethodDeclarationContext ctx) {
        SimpleJavaParser.ClassDeclarationContext classCtx = null;
        ParseTree parent = ctx.getParent();
        while (parent != null) {
            if (parent instanceof SimpleJavaParser.ClassDeclarationContext) {
                classCtx = (SimpleJavaParser.ClassDeclarationContext) parent;
                break;
            }
            parent = parent.getParent();
        }
        assert classCtx != null;
        String className = classCtx.Identifier().getText();
        pythonCode.append("\n");
        mainMethodCode.append("\nif __name__ == \"__main__\":\n" + "    " + className + ".main(sys.argv[1:])");
    }

    @Override public void exitCompilationUnit(SimpleJavaParser.CompilationUnitContext ctx) {
        pythonCode.append(mainMethodCode);
    }

    @Override
    public void enterPrintStatement(SimpleJavaParser.PrintStatementContext ctx) {
        if (ctx.StringLiteral() != null) {
//            writer.println(tab + tab + "print(\"" + ctx.getTokens(SimpleJavaParser.StringLiteral).stream().map(token -> token.getText().substring(1, token.getText().length() - 1)).collect(Collectors.joining(" + ")) + "\")");
//
            pythonCode.append(tab.repeat(Math.max(0, indentationLevel)));
            pythonCode.append("print(\"").append(ctx.getTokens(SimpleJavaParser.StringLiteral).stream().map(token -> token.getText().substring(1, token.getText().length() - 1)).collect(Collectors.joining(" + "))).append("\")\n");
            writer.write(pythonCode.toString());

        } else if (ctx.Identifier() != null) {
//            writer.println(tab + tab +"print(" + ctx.Identifier().getText() + ")");
            pythonCode.append(tab.repeat(Math.max(0, indentationLevel)));
            pythonCode.append("print(").append(ctx.Identifier().getText()).append(")\n");
            writer.write(pythonCode.toString());
        }

    }

    @Override
    public void enterDeclarationStatement(SimpleJavaParser.DeclarationStatementContext ctx) {
        String type = ctx.type().getText();
        String identifier = ctx.Identifier().getText();
        String expression = ctx.primaryExpression().getText();

        pythonCode.append(tab.repeat(Math.max(0, indentationLevel)));

        pythonCode.append(identifier).append(" = ").append(expression).append("\n");
        writer.write(pythonCode.toString());
//        writer.println(tab + tab + identifier + " = " + expression);

    }

    @Override
    public void enterAssignmentStatement(SimpleJavaParser.AssignmentStatementContext ctx) {
        String identifier = ctx.Identifier().getText();
        String expression = ctx.expression().getText();
        pythonCode.append(identifier).append(" = ").append(expression).append("\n");
        writer.write(pythonCode.toString());
//        writer.println(tab + tab + identifier + " = " + expression);

    }

    @Override
    public void enterFieldDeclaration(SimpleJavaParser.FieldDeclarationContext ctx) {
        String type = ctx.type().getText();
        if (ctx.assignmentStatement() == null) {
            String identifier = ctx.Identifier().getText();
            if (type.equals("int") || type.equals("float")) {
                pythonCode.append(tab.repeat(Math.max(0, indentationLevel)));
                pythonCode.append(identifier).append(" = 0\n");
//                writer.println(tab + identifier + " = 0");
                writer.write(pythonCode.toString());
            }
            if (type.equals("char") || type.equals("String")) {
                pythonCode.append(tab.repeat(Math.max(0, indentationLevel)));
//                writer.println(tab + identifier + " = \"\"");
                pythonCode.append(identifier).append(" = \"\"\n");
                writer.write(pythonCode.toString());
            }
            if (type.equals("boolean")) {
                pythonCode.append(tab.repeat(Math.max(0, indentationLevel)));
//                writer.println(tab + identifier + " = False");
                pythonCode.append(identifier).append(" = False\n");
                writer.write(pythonCode.toString());
            }
        } else {
            //pythonCode.append(ctx.assignmentStatement().getText()).append("\n");
            //writer.write(pythonCode.toString());
//            writer.println(ctx.assignmentStatement().getText());
        }

    }

    @Override
    public void enterIncrementStatement(SimpleJavaParser.IncrementStatementContext ctx) {
        pythonCode.append(tab.repeat(Math.max(0, indentationLevel)));
        pythonCode.append(ctx.Identifier().getText()).append(" += 1\n");
        writer.write(pythonCode.toString());
//        writer.println(tab + tab +ctx.Identifier().getText() + " += 1");


    }

    @Override
    public void enterDecrementStatement(SimpleJavaParser.DecrementStatementContext ctx) {
//        writer.println(tab + tab + ctx.Identifier().getText() + " -= 1");
        pythonCode.append(tab.repeat(Math.max(0, indentationLevel)));
        pythonCode.append(ctx.Identifier().getText()).append(" -= 1\n");
        writer.write(pythonCode.toString());
    }

    @Override
    public void enterIfStatement(SimpleJavaParser.IfStatementContext ctx) {
        ctx.toString();
        pythonCode.append(tab.repeat(Math.max(0, indentationLevel)));
        pythonCode.append(ctx.If()).append(" ").append(ctx.expression().logicalExpression().getText()).append(":\n");
        writer.write(pythonCode.toString());
        indentationLevel++;
    }

    @Override
    public void enterStatement(SimpleJavaParser.StatementContext ctx) {
        //pythonCode.append(tab.repeat(Math.max(0, indentationLevel)));
    }


    @Override
    public void exitIfStatement(SimpleJavaParser.IfStatementContext ctx) {
        writer.println("\n");
        indentationLevel--;
    }

    @Override public void enterWhileStatement(SimpleJavaParser.WhileStatementContext ctx) {
        pythonCode.append(tab.repeat(Math.max(0, indentationLevel)));
        pythonCode.append(ctx.While()).append(" ").append(ctx.expression().logicalExpression().getText()).append(":\n");
        writer.write(pythonCode.toString());

        indentationLevel++;
    }

    @Override public void exitWhileStatement(SimpleJavaParser.WhileStatementContext ctx) {
        writer.println("\n");
        indentationLevel--;
    }

    public String getPythonCode() {
        return pythonCode.toString();
    }

    @Override
    public void exitClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx) {
        writer.println("\n");
        indentationLevel--;
    }

    @Override
    public void exitNormalMethodDeclaration(SimpleJavaParser.NormalMethodDeclarationContext ctx) {
//        writer.println("\n");
        pythonCode.append("\n");
        writer.write(pythonCode.toString());
        indentationLevel--;
    }

    @Override
    public void enterReturnStatement(SimpleJavaParser.ReturnStatementContext ctx) {
        ctx.toString();
        pythonCode.append(tab.repeat(Math.max(0, indentationLevel)));
        pythonCode.append("return ").append(ctx.expression().getText()).append("\n");
        writer.write(pythonCode.toString());
    }






    public void close() {
        writer.close();
    }
//    @Override
//    public void enterConstructorDeclaration(SimpleJavaParser.ConstructorDeclarationContext ctx){
//        pythonCode.append("init");
//    }


}


class SimpleJavaErrorListener extends BaseErrorListener {
    private JTextArea textArea;

    public SimpleJavaErrorListener(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        super.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);

        highlightLineWithError(line);

        JOptionPane.showMessageDialog(null, "Błąd w linii " + line + ": " + msg, "Syntax Error", JOptionPane.ERROR_MESSAGE);
    }

    private void highlightLineWithError(int line) {
        try {
            int startOffset = textArea.getLineStartOffset(line - 1);
            int endOffset = textArea.getLineEndOffset(line - 1);
            textArea.getHighlighter().addHighlight(startOffset, endOffset, new DefaultHighlighter.DefaultHighlightPainter(Color.RED));
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }
}



