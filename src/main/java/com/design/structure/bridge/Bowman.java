package com.design.structure.bridge;

public class Bowman extends Soldier{
    public Bowman(Rank rank, String name) {
        super(rank, name);
    }

    @Override
    void type() {
        System.out.print("我是弓箭手" + this.getName() + ",");
        rank.rankByAchieve();
    }
}
