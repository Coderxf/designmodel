package com.design.creationmode.builder;

public class WomanBuilder implements PersonBuilder{

    Person person;

    public WomanBuilder() {
        person = new Woman();
    }

    @Override
    public Person buildPerson() {
        return person;
    }
    @Override
    public void buildBody() {
        person.setBody("建造女人的身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("建造女人的脚");
    }

    @Override
    public void buildHead() {
        person.setHead("建造女人的头");
    }

}
