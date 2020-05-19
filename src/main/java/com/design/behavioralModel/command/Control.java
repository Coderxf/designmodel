package com.design.behavioralModel.command;

public class Control {

    private Command commandOn, commandOff, commandChange;

    public Control(Command on, Command off, Command channel) {
        commandOn = on;
        commandOff = off;
        commandChange = channel;
    }


    public void turnOn() {
        commandOn.execure();
    }


    public void turnOff() {
        commandOff.execure();
    }


    public void turnChange() {
        commandChange.execure();
    }
}
