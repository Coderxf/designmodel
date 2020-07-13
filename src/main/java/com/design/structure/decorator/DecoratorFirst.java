package com.design.structure.decorator;

public class DecoratorFirst extends Decorator{

    public DecoratorFirst(Human human) {
        super(human);
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        System.out.println("进房子。。");
    }

    @Override
    public void walkTo() {
        super.walkTo();
        System.out.println("书房找找Map。。");
    }
}
