package com.design.creationmode.factory.abstractfactory;

/**
 *
 * 抽象工厂基类
 *
 * @author xufeng
 * @create: 2020/7/1
 */
public interface AbstractFactory {
    Engine createEngine();

    Aircondition createAircondition();
}
