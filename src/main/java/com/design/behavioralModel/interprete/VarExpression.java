package com.design.behavioralModel.interprete;

import java.util.HashMap;

public class VarExpression implements AbstractExpression {


    private String key;

    public VarExpression(String key) {
        this.key = key;
    }


    @Override
    public Integer interprete(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
