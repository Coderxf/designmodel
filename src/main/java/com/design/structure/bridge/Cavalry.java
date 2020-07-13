package com.design.structure.bridge;

public class Cavalry extends Soldier{
    public Cavalry(Rank rank, String name) {
        super(rank, name);
    }

    @Override
    void type() {
        System.out.print("我是骑兵" + this.getName() + ",");
        rank.rankByAchieve();
    }
}
