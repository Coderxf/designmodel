package com.design.behavioralModel.responsibility;

public class Client {

    public static void main(String[] args) {
        //组装责任链
        Hander handler1 = new UserHandler();
        Hander handler2 = new UserHandler();
        handler1.setHander(handler2);
        //提交请求
        handler1.deal();
    }
}
