package com.design.structure.decorator;

public abstract class Decorator implements Human{

    Human human;

    public Decorator(Human human) {
        this.human = human;
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
    }

    @Override
    public void walkTo() {
        human.walkTo();
    }
}
