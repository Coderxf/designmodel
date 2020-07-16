package com.design.behavioralModel.visitor;

import java.util.Random;

public abstract class Staff {

    public String name;
    /**
     * 员工KPI
     */
    public int kpi;

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public abstract void accept(Visitor visitor);
}
