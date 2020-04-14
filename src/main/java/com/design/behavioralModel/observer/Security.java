package com.design.behavioralModel.observer;

/**
 * 观察者 保镖
 *
 * @author x
 * @create: 2020/4/15
 */
public class Security implements Watcher{
    @Override
    public void view() {
        System.out.println("货物正在运输中");
    }
}

