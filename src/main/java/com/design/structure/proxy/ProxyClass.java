package com.design.structure.proxy;

public class ProxyClass implements Buy{

    private People people;


    public void setPeople(People people) {
        this.people = people;
    }

    @Override
    public void buyCar() {
        if (people.isVip()) {
            people.buyCar();
            return;
        }
        if (people.getMoney() > 50000) {
            System.out.println(people.getUserName()+"买了新车，交易结束！");
        }
        else
        {
            System.out.println(people.getUserName()+"钱不够，不能买车！");
        }
    }
}
