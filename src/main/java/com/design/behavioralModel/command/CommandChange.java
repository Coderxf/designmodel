package com.design.behavioralModel.command;

public class CommandChange implements Command{


    private Tv tv;

    public CommandChange(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execure() {
        tv.change();
    }
}
