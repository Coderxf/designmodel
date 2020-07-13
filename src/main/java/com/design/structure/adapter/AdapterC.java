package com.design.structure.adapter;

public class AdapterC implements Target{
    private Adaptee adaptee;

    public AdapterC(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specific();
    }
}
