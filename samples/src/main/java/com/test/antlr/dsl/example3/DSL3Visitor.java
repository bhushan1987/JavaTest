// Generated from DSL3.g4 by ANTLR 4.7.1
package com.test.antlr.dsl.example3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DSL3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DSL3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DSL3Parser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(DSL3Parser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSL3Parser#code_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_line(DSL3Parser.Code_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSL3Parser#define_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_var(DSL3Parser.Define_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSL3Parser#call_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_fun(DSL3Parser.Call_funContext ctx);
}