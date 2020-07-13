package com.design.structure.bridge;

public abstract class Soldier {

    private String name;

    Rank rank;

    public Soldier(Rank rank, String name){
        this.rank = rank;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void type();

}
