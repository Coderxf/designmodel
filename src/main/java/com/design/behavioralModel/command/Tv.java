package com.design.behavioralModel.command;

/**
 *
 *
 * @author xf
 * @create: 2020/4/18
 */
public class Tv {
    public int currentChannel = 0;
    public void turnOn(){
        System.out.println("打开电视机");
    }
    public void turnOff() {
        System.out.println("关闭电视机");
    }
    public void change() {
        System.out.println("换台");
    }
}
