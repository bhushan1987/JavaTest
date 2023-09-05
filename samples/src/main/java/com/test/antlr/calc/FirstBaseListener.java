package com.test.antlr.calc;// Generated from First.g4 by ANTLR 4.7.1

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.Stack;

/**
 * This class provides an empty implementation of {@link FirstListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class FirstBaseListener implements FirstListener {
	Stack<Integer> stack = new Stack<>();
	Boolean operationExited = false;
	String inBetweenOperator = null;

	public Stack<Integer> getStack() {
		return stack;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(FirstParser.StatementContext ctx) {
		System.out.println("Enter Statement" + ctx.children);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(FirstParser.StatementContext ctx) {
		System.out.println("Exit Statement " +ctx);
		System.out.println("Final Result: " + stack.pop());
	}

	private Integer calculate(String op, Integer first, Integer second) {
		Integer result = 0;
		switch (op) {
			case "+": {
				result = first + second;
				break;
			} case "-": {
				result = first - second;
				break;
			} case "*": {
				result = first * second;
				break;
			} case "/": {
				result = first / second;
				break;
			}
			default: break;
		}
		return result;
	}

	@Override
	public void enterOperation(FirstParser.OperationContext ctx) {
		System.out.println("Enter Operation" + ctx.children);

	}

	@Override
	public void exitOperation(FirstParser.OperationContext ctx) {
		System.out.println("Exit Operation" + ctx.children);

		if(ctx.children.size() == 5) {
			Integer firstNumber = stack.pop();
			Integer secondNumber = stack.pop();
			String op = ((TerminalNodeImpl) ctx.children.get(2)).symbol.getText();
			Integer thisResult = calculate(op, firstNumber, secondNumber);
			System.out.println("Operation result: " + thisResult); // this is result of each operation

			if(inBetweenOperator != null) {
				// calculate previous result and this result and push it in stack
				Integer previousResult = stack.pop();
				Integer calculate = calculate(inBetweenOperator, previousResult, thisResult);
				stack.push(calculate);
				inBetweenOperator = null;
			} else {
				stack.push(thisResult);
			}
		}
		operationExited = true;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) {
		System.out.println("Enter Every Rule" + ctx.children);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) {
//		System.out.println("Exit Every Rule" + ctx.children);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) {
		Token symbol = node.getSymbol();
		if (symbol.getType() == FirstParser.NUMBER) {
			stack.push( Integer.valueOf(symbol.getText()) );
		} else if(symbol.getType() == FirstParser.OPERATOR && operationExited) { // last operation is exited and this is middle operator between two operations
			operationExited = false;
			inBetweenOperator = symbol.getText();
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) {
		System.out.println("Visit error node" + node);
	}
}