// Generated from DSL2.g4 by ANTLR 4.7.1
package com.test.antlr.dsl.example2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSL2Parser}.
 */
public interface DSL2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSL2Parser#dsl}.
	 * @param ctx the parse tree
	 */
	void enterDsl(DSL2Parser.DslContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL2Parser#dsl}.
	 * @param ctx the parse tree
	 */
	void exitDsl(DSL2Parser.DslContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL2Parser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(DSL2Parser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL2Parser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(DSL2Parser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL2Parser#get_token}.
	 * @param ctx the parse tree
	 */
	void enterGet_token(DSL2Parser.Get_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL2Parser#get_token}.
	 * @param ctx the parse tree
	 */
	void exitGet_token(DSL2Parser.Get_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL2Parser#get_token_command}.
	 * @param ctx the parse tree
	 */
	void enterGet_token_command(DSL2Parser.Get_token_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL2Parser#get_token_command}.
	 * @param ctx the parse tree
	 */
	void exitGet_token_command(DSL2Parser.Get_token_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL2Parser#get_token_and_delegate}.
	 * @param ctx the parse tree
	 */
	void enterGet_token_and_delegate(DSL2Parser.Get_token_and_delegateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL2Parser#get_token_and_delegate}.
	 * @param ctx the parse tree
	 */
	void exitGet_token_and_delegate(DSL2Parser.Get_token_and_delegateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL2Parser#invoke_service}.
	 * @param ctx the parse tree
	 */
	void enterInvoke_service(DSL2Parser.Invoke_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL2Parser#invoke_service}.
	 * @param ctx the parse tree
	 */
	void exitInvoke_service(DSL2Parser.Invoke_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL2Parser#invoke_service_command}.
	 * @param ctx the parse tree
	 */
	void enterInvoke_service_command(DSL2Parser.Invoke_service_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL2Parser#invoke_service_command}.
	 * @param ctx the parse tree
	 */
	void exitInvoke_service_command(DSL2Parser.Invoke_service_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL2Parser#invoke_service_impersonate_command}.
	 * @param ctx the parse tree
	 */
	void enterInvoke_service_impersonate_command(DSL2Parser.Invoke_service_impersonate_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL2Parser#invoke_service_impersonate_command}.
	 * @param ctx the parse tree
	 */
	void exitInvoke_service_impersonate_command(DSL2Parser.Invoke_service_impersonate_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL2Parser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(DSL2Parser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL2Parser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(DSL2Parser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DSL2Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DSL2Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL2Parser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(DSL2Parser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL2Parser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(DSL2Parser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DSL2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DSL2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSL2Parser#baseExpr}.
	 * @param ctx the parse tree
	 */
	void enterBaseExpr(DSL2Parser.BaseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSL2Parser#baseExpr}.
	 * @param ctx the parse tree
	 */
	void exitBaseExpr(DSL2Parser.BaseExprContext ctx);
}