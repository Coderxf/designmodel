package com.design.behavioralModel.interprete;

public abstract class SymbolExpression implements AbstractExpression{

    protected AbstractExpression left;
    protected AbstractExpression right;

    public SymbolExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }
}
