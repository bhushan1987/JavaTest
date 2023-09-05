// Generated from DSL3.g4 by ANTLR 4.7.1
package com.test.antlr.dsl.example3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSL3Parser}.
 */
public interface DSL3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSL3Parser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(DSL3Parser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL3Parser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(DSL3Parser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL3Parser#code_line}.
	 * @param ctx the parse tree
	 */
	void enterCode_line(DSL3Parser.Code_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL3Parser#code_line}.
	 * @param ctx the parse tree
	 */
	void exitCode_line(DSL3Parser.Code_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL3Parser#define_var}.
	 * @param ctx the parse tree
	 */
	void enterDefine_var(DSL3Parser.Define_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL3Parser#define_var}.
	 * @param ctx the parse tree
	 */
	void exitDefine_var(DSL3Parser.Define_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL3Parser#call_fun}.
	 * @param ctx the parse tree
	 */
	void enterCall_fun(DSL3Parser.Call_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL3Parser#call_fun}.
	 * @param ctx the parse tree
	 */
	void exitCall_fun(DSL3Parser.Call_funContext ctx);
}