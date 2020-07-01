package com.design.creationmode.builder;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {

    private String head;
    private String body;
    private String foot;

    @Override
    public String toString() {
        return "Person{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", foot='" + foot + '\'' +
                '}';
    }

    private void  testP() {
        System.out.println("11111");
    }
}
