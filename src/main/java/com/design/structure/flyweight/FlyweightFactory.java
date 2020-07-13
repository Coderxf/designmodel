package com.design.structure.flyweight;

import java.util.Hashtable;

public class FlyweightFactory {

    private Hashtable flyweights = new Hashtable();

    public Flyweight getFlyWeight(Object obj) {
        Flyweight flyweight = (Flyweight) flyweights.get(obj);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight((String) obj);
            flyweights.put(obj, flyweight);
        }
        return flyweight;
    }

    public int getFlyweightSize() {
        return flyweights.size();
    }
}
