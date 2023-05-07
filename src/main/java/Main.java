import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName("/Users/jangi/IdeaProjects/Java-to-Python-converter/src/main/java/Test.java");

        SimpleJavaLexer lexer = new SimpleJavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleJavaParser parser = new SimpleJavaParser(tokens);
        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();

        JavaToPythonConverter converter = new JavaToPythonConverter("PythonCode.py");
        walker.walk(converter, tree);
        converter.close();
        //System.out.println(converter.getPythonCode());





    }
}
