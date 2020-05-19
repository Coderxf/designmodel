package com.design.behavioralModel.command;

public class Client {

    public static void main(String[] args) {
        Tv myTv = new Tv();

        CommandOn on = new CommandOn(myTv);

        CommandOff off = new CommandOff(myTv);

        CommandChange change = new CommandChange(myTv);

        Control control = new Control(on, off, change);


        control.turnOn();

        control.turnChange();

        control.turnOff();
    }
}
