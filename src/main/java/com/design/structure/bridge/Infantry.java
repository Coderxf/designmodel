package com.design.structure.bridge;

public class Infantry extends Soldier{


    public Infantry(Rank rank, String name) {
        super(rank, name);
    }

    @Override
    void type() {
        System.out.print("我是步兵" + this.getName() + ",");
        rank.rankByAchieve();
    }
}
