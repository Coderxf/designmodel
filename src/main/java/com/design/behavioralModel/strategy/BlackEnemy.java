package com.design.behavioralModel.strategy;

/**
 *妙计三：孙夫人断后，挡住追兵
 *
 * @author xf
 * @create: 2020/4/16
 */
public class BlackEnemy implements Strategy{
    @Override
    public void openKit() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
