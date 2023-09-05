// Generated from DSL2.g4 by ANTLR 4.7.1
package com.test.antlr.dsl.example2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DSL2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DSL2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DSL2Parser#dsl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsl(DSL2Parser.DslContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSL2Parser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(DSL2Parser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSL2Parser#get_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_token(DSL2Parser.Get_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSL2Parser#get_token_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_token_command(DSL2Parser.Get_token_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSL2Parser#get_token_and_delegate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_token_and_delegate(DSL2Parser.Get_token_and_delegateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSL2Parser#invoke_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoke_service(DSL2Parser.Invoke_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSL2Parser#invoke_service_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoke_service_command(DSL2Parser.Invoke_service_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSL2Parser#invoke_service_impersonate_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoke_service_impersonate_command(DSL2Parser.Invoke_service_impersonate_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSL2Parser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(DSL2Parser.MathContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSL2Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DSL2Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSL2Parser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(DSL2Parser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSL2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DSL2Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSL2Parser#baseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseExpr(DSL2Parser.BaseExprContext ctx);
}