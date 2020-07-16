package com.design.behavioralModel.interprete;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        HashMap<String, Integer> ctx = new HashMap<String, Integer>();
        ctx.put("a", 10);
        ctx.put("b", 20);
        ctx.put("c", 30);
        ctx.put("d", 40);
        ctx.put("e", 50);
        ctx.put("f", 60);
        Calculator calc = new Calculator("a+b-c");
        int result = calc.calculate(ctx);
        System.out.println("Result of a+b-c: " + result);
        calc = new Calculator("d-a-b+c");
        result = calc.calculate(ctx);
        System.out.println("Result of d-a-b+c: " + result);
    }
}
