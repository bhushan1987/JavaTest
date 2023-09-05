package com.test.antlr;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

/**
 * @Author bhushank
 */
public class ScriptManagerTest {
    public static void main(String[] args) {
        try {
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            // Get the file system manager of the compiler
            StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);



        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
