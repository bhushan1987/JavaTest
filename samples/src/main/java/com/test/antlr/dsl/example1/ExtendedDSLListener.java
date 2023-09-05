package com.test.antlr.dsl.example1;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * @Author bhushank
 */
public class ExtendedDSLListener extends DSLBaseListener {
    @Override public void visitTerminal(TerminalNode node) {
//        System.out.println("TERMINAL NODE:"+node.getSymbol());
    }

    @Override public void enterScript(DSLParser.ScriptContext ctx) {
        System.out.println("ENTER SCRIPT:"+ctx.children);
    }

    @Override public void exitEveryRule(ParserRuleContext ctx) {
        System.out.println("ENTER RULE:"+ctx.children);
    }
}
