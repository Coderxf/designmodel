package com.design.behavioralModel.interprete;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

    private AbstractExpression expression;


    public Calculator(String str) {
        Stack<AbstractExpression> stack = new Stack<>();
        char[] charArray = str.toCharArray();
        AbstractExpression left = null;
        AbstractExpression right = null;
        for (Integer i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-': // 减法
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default: // 公式中的变量
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        this.expression = stack.pop();
    }


    // 计算结果
    public int calculate(HashMap<String, Integer> var) {
        return this.expression.interprete(var);
    }
}
