package com.test.javadsl.bsh;

import bsh.EvalError;
import bsh.Interpreter;
import bsh.ParseException;

import java.util.HashMap;
import java.util.Map;

/**
 * Overrides the default script with user defined script, composes the implementation for the script class and executes the DSL.
 *
 * @Project : Security service
 * @author : bhushan.karmarkar@1eq.com
 * @Date : 05-12-2019
 * @since :
 */

public class DSLExecutor {

    public static void main(String[] args) throws EvalError {
        DSLExecutor dslExecutor = new DSLExecutor();
        dslExecutor.execute();
    }


    public Object execute() throws EvalError {
        Interpreter interpreter = new Interpreter();
        interpreter.setStrictJava(true);
        interpreter.setClassLoader(this.getClass().getClassLoader());
        Map eval = null;
        String javaSourceCode = getJavaSourceCode();
        try {
            interpreter.eval(javaSourceCode);
            eval = (Map) interpreter.eval("new ScriptImpl().execute()");
        } catch (ParseException e) {
            System.out.println(e);
        }
        return eval;
    }

    private String getJavaSourceCode() {
        String scriptImpl = "import json.util.Map;"+
                "import com.test.javadsl.bsh.AbstractScript;"+
                "class ScriptImpl extends AbstractScript { " +
                "public Map execute() {"+
                "return super.execute();"+ // to be replaced by the actual defn
                "}"+
                "}";
        scriptImpl = scriptImpl.replace("return super.execute();", getUserDefinedDSL());
        return scriptImpl;
    }

    private String getUserDefinedDSL(){
        return "System.out.println(\"This is user defined DSL !\")" +
            "return new HashMap();";
    }
}
