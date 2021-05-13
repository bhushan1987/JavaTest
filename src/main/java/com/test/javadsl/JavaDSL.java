package com.test.javadsl;

import bsh.Interpreter;
import com.test.javadsl.jdkcompiler.RuntimeCompiler;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * An example showing how to use the RuntimeCompiler utility class.<p>
 * Copied from https://stackoverflow.com/questions/935175/convert-string-to-code
 */

//Modified further based on understanding.
public class JavaDSL {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
//        simpleExample();
        new JavaDSL().testDSLWithBSH();
    }

    /**
     * Simple example: Shows how to add and compile a class, and then
     * invoke a static method on the loaded class.
     */
    private static void simpleExample() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        String classNameA = "ExampleClass";
        String codeA =
                "public class ExampleClass {" + "\n" +
                        "    public void exampleMethod(String name) {" + "\n" +
                        "        System.out.println(\"Hello, \"+name);" + "\n" +
                        "    }" + "\n" +
                        "}" + "\n";

        RuntimeCompiler r = new RuntimeCompiler();
        r.addClass(classNameA, codeA);
        r.compile();

        Class<?> compiledClass = r.getCompiledClass(classNameA);
        Object o = compiledClass.newInstance();
        Method exampleMethod = compiledClass.getMethod("exampleMethod", String.class);
        Object invoke = exampleMethod.invoke(o, "Bhushan !");
    }



    public void testDSLWithBSH() {
        long past = System.currentTimeMillis();

        Interpreter interpreter = new Interpreter();
        interpreter.setStrictJava(true);
        interpreter.setClassLoader(this.getClass().getClassLoader());
        try {
            String javaSourceCode = getJavaSourceCode();
            interpreter.eval(javaSourceCode);
            Object exampleClass = interpreter.eval("new ExampleClass()");
            Method exampleMethod = exampleClass.getClass().getMethod("exampleMethod", String.class);
            exampleMethod.invoke(exampleClass, "eQ !");

            javaSourceCode = getJavaSourceCode1();
            interpreter.eval(javaSourceCode);
            exampleClass = interpreter.eval("new ExampleClass()");
            exampleMethod = exampleClass.getClass().getMethod("exampleMethod", String.class);
            exampleMethod.invoke(exampleClass, "eQ !");
            interpreter.eval(javaSourceCode);

        } catch (Exception e) {
            e.printStackTrace();
        }
        long present = System.currentTimeMillis();
        System.out.println("BeanShell: Time taken > " +(present-past) + " milliseconds" );
    }

    private String getJavaSourceCode(){
        return  "package abc.pqr;" +
                "public class ExampleClass {" + "\n" +
                "    public void exampleMethod(String name) {" + "\n" +
                " int a = 10; int b = 10; int c = a+b;" +
                "System.out.println(new json.util.Date());" +
                "    }" + "\n" +
                "}" + "\n";
    }

    private String getJavaSourceCode1(){
        return  "package abc.pqr;" +
                "public class ExampleClass {" + "\n" +
                "    public void exampleMethod(String name) {" + "\n" +
                " int a = 10; int b = 10; int c = a+b;" +
                "System.out.println(\"YES IT WORKS !\");" +
                "System.out.println(\"package abc.pqr !\");" +
                "    }" + "\n" +
                "}" + "\n";
    }
}