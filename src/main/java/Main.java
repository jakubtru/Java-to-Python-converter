import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String javaCode = "public class HelloWorld{"+
                "String slowo;"+
//                "HelloWorld(int k){"+
//                "}"+
                "public void funkcja(String s){"+
                "int x = 5;"+
                "x++;"+
                "x--;"+
                "System.out.println(s);"+
                "}"+
                "public static void main(String[] args){"+
                "System.out.println(\"Hello World\");"+
                "}"+
                "}"+
                "public class Goodbye{" +
                "boolean b;}" ;

        SimpleJavaLexer lexer = new SimpleJavaLexer(CharStreams.fromString(javaCode));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleJavaParser parser = new SimpleJavaParser(tokens);
        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        JavaToPythonConverter converter = new JavaToPythonConverter();
        walker.walk(converter, tree);
        System.out.println(converter.getPythonCode());





    }
}
