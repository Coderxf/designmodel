package com.design.structure.decorator;

public class Client {
    public static void main(String[] args) {
        Human person = new Person();

        Decorator decorator = new DecoratorThird(new DecoratorSecond(new DecoratorFirst(person)));

        decorator.wearClothes();

        decorator.walkTo();
    }
}
