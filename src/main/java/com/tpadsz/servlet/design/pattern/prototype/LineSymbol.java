package com.tpadsz.servlet.design.pattern.prototype;

import com.tpadsz.servlet.design.pattern.prototype.mypackage.Graphic;

/*
 *  A concrete prototype to draw a line
 */
public class LineSymbol extends Graphic {
    public LineSymbol() {
    }

    public void DoSomething() {
        System.out.println("I am used to draw a line !");
    }
}