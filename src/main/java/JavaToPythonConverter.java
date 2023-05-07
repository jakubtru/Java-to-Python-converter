import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.io.PrintWriter;
public class JavaToPythonConverter extends SimpleJavaBaseListener {

    private StringBuilder pythonCode = new StringBuilder();
    private final PrintWriter writer;
    private final String tab = "    ";

    public JavaToPythonConverter(String outputFileName)throws IOException {
        writer = new PrintWriter(new FileWriter(outputFileName));
    }

    @Override
    public void enterClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx) {
        writer.println("class " + ctx.Identifier().getText() + ":");
    }

    @Override
    public void enterNormalMethodDeclaration(SimpleJavaParser.NormalMethodDeclarationContext ctx) {
        String[] identifier = ctx.Identifier().toString().substring(1, ctx.Identifier().toString().length() - 1).replace(",", "").split(" ");
        String methodName = identifier[0];
        String methodArgs = Arrays.stream(identifier).skip(1).collect(Collectors.joining(","));
//        String methodArgs = ctx.Identifier().toString().substring(1, ctx.Identifier().toString().length() - 1).replace(",", "").split(" ")[
        writer.println(tab + "def "+ methodName + "(self, " + methodArgs + "):");
    }

    @Override
    public void enterMainMethodDeclaration(SimpleJavaParser.MainMethodDeclarationContext ctx) {
        writer.println(tab + "def main(args):");
    }
    @Override
    public void exitMainMethodDeclaration(SimpleJavaParser.MainMethodDeclarationContext ctx){
        SimpleJavaParser.ClassDeclarationContext classCtx = null;
        ParseTree parent = ctx.getParent();
        while (parent != null) {
            if (parent instanceof SimpleJavaParser.ClassDeclarationContext) {
                classCtx = (SimpleJavaParser.ClassDeclarationContext) parent;
                break;
            }
            parent = parent.getParent();
        }
        assert parent != null;
        String className = ((SimpleJavaParser.ClassDeclarationContext) parent).Identifier().getText();
        writer.println("\nif __name__ == \"__main__\":\n" + "    " + className + ".main(sys.argv[1:])");
    }

    @Override
    public void enterPrintStatement(SimpleJavaParser.PrintStatementContext ctx) {
        if (ctx.StringLiteral() != null) {
            writer.println(tab + tab + "print(\"" + ctx.getTokens(SimpleJavaParser.StringLiteral).stream().map(token -> token.getText().substring(1, token.getText().length() - 1)).collect(Collectors.joining(" + ")) + "\")");
        }
        else if (ctx.Identifier() != null) {
            writer.println(tab + tab +"print(" + ctx.Identifier().getText() + ")");
        }

    }
    @Override
    public void enterDeclarationStatement(SimpleJavaParser.DeclarationStatementContext ctx) {
        String type = ctx.type().getText();
        String identifier = ctx.Identifier().getText();
        String expression = ctx.primaryExpression().getText();
        writer.println(tab + tab + identifier + " = " + expression);

    }
    @Override
    public void enterAssignmentStatement(SimpleJavaParser.AssignmentStatementContext ctx) {
        String identifier = ctx.Identifier().getText();
        String expression = ctx.expression().getText();
        writer.println(tab + tab + identifier + " = " + expression);

    }
    @Override
    public void enterFieldDeclaration(SimpleJavaParser.FieldDeclarationContext ctx){
        String type = ctx.type().getText();
        if (ctx.assignmentStatement()==null) {
            String identifier = ctx.Identifier().getText();
            if (type.equals("int") || type.equals("float")) {
                writer.println(tab + identifier + " = 0");
            }
            if (type.equals("char") || type.equals("String")) {
                writer.println(tab + identifier + " = \"\"");
            }
            if (type.equals("boolean")) {
                writer.println(tab + identifier + " = False");
            }
        }
        else{
            writer.println(ctx.assignmentStatement().getText());
        }

    }

    @Override
    public void enterIncrementStatement(SimpleJavaParser.IncrementStatementContext ctx) {

        writer.println(tab + tab +ctx.Identifier().getText() + " += 1");


    }

    @Override
    public void enterDecrementStatement(SimpleJavaParser.DecrementStatementContext ctx) {
        writer.println(tab + tab + ctx.Identifier().getText() + " -= 1");
    }


//    @Override
//    public void enterIncrementStatement(SimpleJavaParser.IncrementStatementContext ctx) {
//        pythonCode.append("    ").append(ctx.Identifier().getText()).append(" += 1\n");
//    }

    public String getPythonCode() {
        return pythonCode.toString();
    }

    @Override
    public void exitClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx) {
        writer.println("\n");
    }

    @Override
    public void exitNormalMethodDeclaration(SimpleJavaParser.NormalMethodDeclarationContext ctx) {
        writer.println("\n");
    }

    public void close(){
        writer.close();
    }
//    @Override
//    public void enterConstructorDeclaration(SimpleJavaParser.ConstructorDeclarationContext ctx){
//        pythonCode.append("init");
//    }







}
