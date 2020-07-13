package com.design.structure.flyweight;

public class ConcreteFlyweight extends Flyweight{

    private String name;

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    void operation() {
        System.out.println("Concrete---Flyweight : " + name);
    }
}
