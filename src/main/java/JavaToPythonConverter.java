import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JavaToPythonConverter extends SimpleJavaBaseListener {

    private StringBuilder pythonCode = new StringBuilder();

    @Override
    public void enterClassDeclaration(SimpleJavaParser.ClassDeclarationContext ctx) {
        pythonCode.append("class ").append(ctx.Identifier().getText()).append(":\n");
    }

    @Override
    public void enterNormalMethodDeclaration(SimpleJavaParser.NormalMethodDeclarationContext ctx) {
        String[] identifier = ctx.Identifier().toString().substring(1, ctx.Identifier().toString().length() - 1).replace(",", "").split(" ");
        String methodName = identifier[0];
        String methodArgs = Arrays.stream(identifier).skip(1).collect(Collectors.joining(","));
//        String methodArgs = ctx.Identifier().toString().substring(1, ctx.Identifier().toString().length() - 1).replace(",", "").split(" ")[
        pythonCode.append("    def ").append(methodName).append("(self, ").append(methodArgs).append("):\n");
    }

    @Override
    public void enterMainMethodDeclaration(SimpleJavaParser.MainMethodDeclarationContext ctx) {
        pythonCode.append("    def main(args):\n");
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
        pythonCode.append("\n    if __name__ == \"__main__\":\n").append("        ").append(className).append(".main(sys.argv[1:])\n");
    }

    @Override
    public void enterPrintStatement(SimpleJavaParser.PrintStatementContext ctx) {
        if (ctx.StringLiteral() != null) {
            pythonCode.append("        print(\"").append(ctx.getTokens(SimpleJavaParser.StringLiteral).stream().map(token -> token.getText().substring(1, token.getText().length() - 1)).collect(Collectors.joining(" + "))).append("\")\n");
        }
        else if (ctx.Identifier() != null) {
            pythonCode.append("        print(").append(ctx.Identifier().getText()).append(")\n");
        }

    }
    @Override
    public void enterDeclarationStatement(SimpleJavaParser.DeclarationStatementContext ctx) {
        String type = ctx.type().getText();
        String identifier = ctx.Identifier().getText();
        String expression = ctx.primaryExpression().getText();
        pythonCode.append("        ").append(identifier).append(" = ").append(expression).append("\n");

    }
    @Override
    public void enterAssignmentStatement(SimpleJavaParser.AssignmentStatementContext ctx) {
        String identifier = ctx.Identifier().getText();
        String expression = ctx.expression().getText();
        pythonCode.append("        ").append(identifier).append(" = ").append(expression).append("\n");

    }
    @Override
    public void enterFieldDeclaration(SimpleJavaParser.FieldDeclarationContext ctx){
        String type = ctx.type().getText();
        if (ctx.assignmentStatement()==null) {
            String identifier = ctx.Identifier().getText();
            if (type.equals("int") || type.equals("float")) {
                pythonCode.append("    ").append(identifier).append(" = 0\n");
            }
            if (type.equals("char") || type.equals("String")) {
                pythonCode.append("    ").append(identifier).append(" = \"\"\n");
            }
            if (type.equals("boolean")) {
                pythonCode.append("    ").append(identifier).append(" = False\n");
            }
        }
        else{
            pythonCode.append(ctx.assignmentStatement().getText());
        }

    }

    @Override
    public void enterIncrementStatement(SimpleJavaParser.IncrementStatementContext ctx) {

            pythonCode.append("        ").append(ctx.Identifier().getText()).append(" += 1\n");


    }

    @Override
    public void enterDecrementStatement(SimpleJavaParser.DecrementStatementContext ctx) {
        pythonCode.append("        ").append(ctx.Identifier().getText()).append(" -= 1\n");
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
        pythonCode.append("\n");
    }

    @Override
    public void exitNormalMethodDeclaration(SimpleJavaParser.NormalMethodDeclarationContext ctx) {
        pythonCode.append("\n");
    }
//    @Override
//    public void enterConstructorDeclaration(SimpleJavaParser.ConstructorDeclarationContext ctx){
//        pythonCode.append("init");
//    }







}
