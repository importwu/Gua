package wuz.gua.interpreter;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import scala.tools.jline.console.ConsoleReader;
import wuz.gua.exception.InterpreterException;
import wuz.gua.generate.GuaLexer;
import wuz.gua.generate.GuaParser;
import wuz.gua.std.GuaStd;
import wuz.gua.type.GuaObject;
import wuz.gua.type.GuaType;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Optional;

public class GuaEvaluator {

    private Optional<String> command;
    private GuaAstVisitor visitor = new GuaAstVisitor();

    public GuaEvaluator(Optional<String> command) {
        this.command = command;
    }

    public void eval() {
        Environment global = new Environment();
        LinkedList<Environment> envs = visitor.getEnvironments();
        envs.push(global);
        envs.addFirst(GuaStd.getEnvironment());
        if(command.isPresent()) {
            processFile(command.get());
        }else {
            repl();
        }
        envs.pop();
    }

    private void processFile(String file) {
        try {
            CharStream input = new ANTLRFileStream(file);
            GuaObject ret = visitor.visit(parseProgram(input));
            Optional.ofNullable(ret).ifPresent(System.out::println);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void repl() {
        try {
            ConsoleReader console = new ConsoleReader();
            console.println("Welcome to Gua v0.0.1.");
            console.setPrompt("> ");
            while (true) {
                try {
                    String source = console.readLine();
                    CharStream input = new ANTLRInputStream(source);
                    GuaObject ret = visitor.visit(parseProgram(input));
                    System.out.println(show(ret));
                }catch (InterpreterException e) {System.out.println(e.getMessage());}
            }
        }catch (IOException e) {System.out.println(e.getMessage());
        }catch (NullPointerException e) {
            System.out.println("bye!");
        }
    }

    private ParseTree parseProgram(CharStream input) {
        GuaLexer lexer = new GuaLexer(input);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        GuaParser parser = new GuaParser(tokenStream);
        return parser.program();
    }

    private String show(GuaObject GObject) {
        switch (GObject.getTypeid()) {
            case GuaType.LIST:
            case GuaType.PAIR:
            case GuaType.IMPROPER:
            case GuaType.MAP:
            case GuaType.SYMBOL:
                return "'" + GObject;
            default:
                return GObject.toString();
        }
    }
}
