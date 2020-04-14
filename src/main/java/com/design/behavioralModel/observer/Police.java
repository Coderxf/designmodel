package com.design.behavioralModel.observer;

/**
 * 观察者 警察
 *
 * @author x
 * @create: 2020/4/15
 */
public class Police implements Watcher{

    @Override
    public void view() {
        System.out.println("警察护航");
    }
}
