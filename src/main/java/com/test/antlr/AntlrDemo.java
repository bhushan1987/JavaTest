package com.test.antlr;

import com.test.antlr.calc.FirstBaseListener;
import com.test.antlr.calc.FirstLexer;
import com.test.antlr.calc.FirstParser;
import com.test.antlr.dsl.example1.DSLLexer;
import com.test.antlr.dsl.example1.DSLParser;
import com.test.antlr.dsl.example1.ExtendedDSLVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.StringReader;

/**
 * @Author bhushank
 */
public class AntlrDemo {

    public static void main(String[] args) throws IOException {
//        first();
        dsl();

    }

    private static void dsl() throws IOException {
        CodePointCharStream codePointCharStream = CharStreams.fromReader(new StringReader(
                "AUTHENTICATE USER ON NTLM;" +
                   "AUTHENTICATE USER ON KERBEROS;" +
                   "AUTHENTICATE USER ON KERBEROS AND DELEGATE CREDENTIALS;" +
                   "AUTHENTICATE USER ON KERBEROSAND DELEGATE CREDENTIALS AND GET TGS FOR SERVICE http://www.google.com/app1/demo;"));

        DSLLexer lexer = new DSLLexer(codePointCharStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        DSLParser parser = new DSLParser(commonTokenStream);
        parser.setBuildParseTree(true);
        DSLParser.ScriptContext scriptContext = parser.script();
        ExtendedDSLVisitor extendedDSLVisitor = new ExtendedDSLVisitor();
        extendedDSLVisitor.visit(scriptContext);
    }

    private static void first() throws IOException {
        CodePointCharStream codePointCharStream = CharStreams.fromReader(new StringReader("(10/10) + (10*10) + (10/10);"));
        FirstLexer lexer = new FirstLexer(codePointCharStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        FirstParser parser = new FirstParser(commonTokenStream);
        parser.setBuildParseTree(true);
        FirstParser.StatementContext statement = parser.statement();
        FirstBaseListener firstBaseListener = new FirstBaseListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(firstBaseListener, statement);
    }


}
