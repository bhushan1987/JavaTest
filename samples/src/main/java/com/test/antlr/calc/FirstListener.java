package com.test.antlr.calc;// Generated from First.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FirstParser}.
 */
public interface FirstListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FirstParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FirstParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FirstParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FirstParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(FirstParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FirstParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(FirstParser.OperationContext ctx);
}