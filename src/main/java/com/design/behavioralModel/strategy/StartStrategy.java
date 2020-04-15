package com.design.behavioralModel.strategy;

/**
 *妙计一：初到吴国
 *
 * @author xf
 * @create: 2020/4/16
 */
public class StartStrategy implements Strategy{
    @Override
    public void openKit() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力，使孙权不能杀刘备");
    }
}
