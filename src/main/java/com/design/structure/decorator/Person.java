package com.design.structure.decorator;

public class Person implements Human{
    @Override
    public void wearClothes() {
        System.out.println("穿什么？");
    }

    @Override
    public void walkTo() {
        System.out.println("去哪里？");
    }
}
