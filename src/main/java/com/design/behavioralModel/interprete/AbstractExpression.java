package com.design.behavioralModel.interprete;

import java.util.HashMap;

/**
 *
 * 解释器
 *
 * @author xufeng
 * @create: 2020/7/17
 */
public interface  AbstractExpression {
     Integer interprete(HashMap<String, Integer> var);
}
