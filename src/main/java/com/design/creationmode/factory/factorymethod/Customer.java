package com.design.creationmode.factory.factorymethod;

import com.design.creationmode.factory.simple.BaoMa;

public class Customer {
    public static void main(String[] args) {
        Factory320 factory320 = new Factory320();
        BaoMa baoMa = factory320.create();

        Factory325 factory325 = new Factory325();
        BaoMa baoMa1 = factory325.create();
    }
}
