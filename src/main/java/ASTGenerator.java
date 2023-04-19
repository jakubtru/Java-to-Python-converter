import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class ASTGenerator {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("/Users/jangi/IdeaProjects/JavaToPython/src/main/java/helloworld.java");
        Java9Lexer lexer = new Java9Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java9Parser parser = new Java9Parser(tokens);

        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener listener = new MyListener();
        walker.walk(listener, tree);
    }
}

class MyListener extends Java9BaseListener {
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("Entering " + ctx.getClass().getSimpleName() + ": " + ctx.getText());
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        System.out.println("Exiting " + ctx.getClass().getSimpleName() + ": " + ctx.getText());
    }
}

