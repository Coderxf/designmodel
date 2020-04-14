package com.design.behavioralModel.observer;

/**
 * 观察者 窃贼
 *
 * @author x
 * @create: 2020/4/15
 */
public class Thief implements Watcher{
    @Override
    public void view() {
        System.out.println("货物在路上，准备行窃");
    }
}
