package com.design.creationmode.builder;

public class Test {

    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person womanPerson = pd.constructPerson(new ManBuilder());
        System.out.println(womanPerson);
        Person manPerson = pd.constructPerson(new WomanBuilder());
        System.out.println(manPerson);
    }

}
