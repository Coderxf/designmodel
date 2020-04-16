package com.design.behavioralModel.responsibility;


/**
 *
 *责任链实现类
 *
 * @author xf
 * @create: 2020/4/17
 */
public class UserHandler extends Hander{
    @Override
    public void deal() {
        //具体逻辑
        System.out.println("无法实现，调用变量的方法");
        Hander hander = getHander();
        if (hander != null) {
            hander.deal();
        }
    }
}
