package com.design.behavioralModel.template;


/**
 *
 * 模板模式
 *
 * @create: 2020/7/14
 */
public abstract class AbstractPerson {

    public final void prepareGotoSchool() {
        dressUp();
        eatBreakfast();
        takeThings();
    }

    protected abstract void dressUp();

    protected abstract void eatBreakfast();
    protected abstract void takeThings();
}
