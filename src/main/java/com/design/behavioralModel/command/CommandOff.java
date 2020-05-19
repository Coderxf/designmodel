package com.design.behavioralModel.command;

public class CommandOff  implements  Command{
    private Tv tv;

    public CommandOff(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execure() {
        tv.turnOff();
    }
}
