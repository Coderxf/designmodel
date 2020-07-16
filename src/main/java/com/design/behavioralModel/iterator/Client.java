package com.design.behavioralModel.iterator;

public class Client {

    public static void main(String[] args) {
        Object[] objArray = {"One","Two","Three","Four","Five","Six"};

        Aggregate agg = new ConcreteAggregate(objArray);
        Iterator iterator = agg.createIterator();

        while(!iterator.isDone()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
