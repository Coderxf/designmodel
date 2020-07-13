package com.design.structure.proxy;

public class Client {
    public static void main(String[] args) {
        People people_1 =new People();
        people_1.setMoney(60000D);
        people_1.setUserName("jeck");


        People people_2 =new People();
        people_2.setMoney(40000d);
        people_2.setUserName("rose");

        People people_3 =new People();

        people_3.setMoney(0d);
        people_3.setUserName("tom");
        people_3.setVip(true);

        ProxyClass proxy_buy = new ProxyClass();
        proxy_buy.setPeople(people_1);
        proxy_buy.buyCar();

        proxy_buy.setPeople(people_2);
        proxy_buy.buyCar();

        proxy_buy.setPeople(people_3);
        proxy_buy.buyCar();
    }
}
