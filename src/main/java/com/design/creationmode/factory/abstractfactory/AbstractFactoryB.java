package com.design.creationmode.factory.abstractfactory;

public class AbstractFactoryB implements AbstractFactory {
    @Override
    public Engine createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
