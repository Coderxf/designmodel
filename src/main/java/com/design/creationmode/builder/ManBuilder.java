package com.design.creationmode.builder;

public class ManBuilder implements PersonBuilder{
    Person person;

    public ManBuilder() {
        this.person = new Man();
    }

    @Override
    public Person buildPerson() {
        return person;
    }
    @Override
    public void buildBody() {
        person.setBody("建造男人的身体");
    }
    @Override
    public void buildFoot() {
        person.setFoot("建造男人的脚");
    }
    @Override
    public void buildHead() {
        person.setHead("建造男人的头");
    }

}
