package com.design.structure.adapter;

/**
 * 
 * 类适配器
 *
 * @author xufeng
 * @create: 2020/7/7
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.specific();
    }
}
