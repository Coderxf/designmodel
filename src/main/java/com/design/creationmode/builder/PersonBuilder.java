package com.design.creationmode.builder;

/**
 *
 * 建造者
 *
 * @author xufeng
 * @create: 2020/7/1
 */
public interface PersonBuilder {
    Person buildPerson();
    void buildHead();
    void buildBody();
    void buildFoot();
}
