package com.design.creationmode.factory.abstractfactory;

public class Customer {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = null;

        abstractFactory = new AbstractFactoryA();

        abstractFactory.createEngine();
        abstractFactory.createAircondition();

        abstractFactory = new AbstractFactoryB();

        abstractFactory.createEngine();
        abstractFactory.createAircondition();

    }
}
