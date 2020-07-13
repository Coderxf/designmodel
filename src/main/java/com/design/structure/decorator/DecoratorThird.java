package com.design.structure.decorator;

public class DecoratorThird extends Decorator{
    public DecoratorThird(Human human) {
        super(human);
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        System.out.println("找到一件D&G。。");
    }

    @Override
    public void walkTo() {
        super.walkTo();
        System.out.println("在Map上找到神秘花园和城堡。。");
    }
}
