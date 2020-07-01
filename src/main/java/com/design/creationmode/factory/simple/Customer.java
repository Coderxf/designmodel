package com.design.creationmode.factory.simple;

public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BaoMa bm320 = factory.createBM(320);
        BaoMa bm325 = factory.createBM(325);
    }
}
