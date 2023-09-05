// Generated from DSL.g4 by ANTLR 4.7.1
package com.test.antlr.dsl.example1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSLParser}.
 */
public interface DSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(DSLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(DSLParser.ScriptContext ctx);
}