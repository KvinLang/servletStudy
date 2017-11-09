package com.tpadsz.servlet.design.pattern.strategy;

/**
 *  The public interface to support varies arithmetic
 */
public interface Strategy {
    public void drawText(String s, int lineWidth, int lineCount);
}