package com.design.creationmode.factory.factorymethod;

import com.design.creationmode.factory.simple.BM325;
import com.design.creationmode.factory.simple.BaoMa;

public class Factory325 implements FactoryInterface{
    @Override
    public BaoMa create() {
        return new BM325();
    }
}
