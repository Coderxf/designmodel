package com.design.behavioralModel.command;



/**
 * 
 * 开机命令
 *
 * @author xufeng
 * @create: 2020/5/20
 */
public class CommandOn implements Command{

    private Tv tv;

    public CommandOn(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execure() {
        tv.turnOn();
    }
}
