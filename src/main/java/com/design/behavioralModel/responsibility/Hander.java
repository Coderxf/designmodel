package com.design.behavioralModel.responsibility;

/**
 *
 *责任链基类
 *
 * @author xf
 * @create: 2020/4/17
 */
public abstract class Hander {
    private Hander hander;
    /**
    * 设置变量
    */
    public void setHander(Hander hander) {
        this.hander = hander;
    }
    /**
     * 获取变量
     */
    public Hander getHander() {
        return this.hander;
    }
    public abstract void deal();
}
