package com.design.creationmode.factory.factorymethod;

import com.design.creationmode.factory.simple.BM320;
import com.design.creationmode.factory.simple.BaoMa;

public class Factory320 implements FactoryInterface{
    @Override
    public BaoMa create() {
        return new BM320();
    }
}
