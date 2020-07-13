package com.design.structure.decorator;

public class DecoratorSecond extends Decorator{
    public DecoratorSecond(Human human) {
        super(human);
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        System.out.println("去衣柜找找看。。");

    }

    @Override
    public void walkTo() {
        super.walkTo();
        System.out.println("在Map上找找。。");
    }
}
