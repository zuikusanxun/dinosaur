package code05.ydy20220607.classText;

import code02.ydy20220525.Done.Creature;

import java.util.Objects;

public class Person extends Creature {

    String name;
    int age;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    public Person(){

    }

    public Person(String name, int age){

        this.name=name;
        this.age=age;
    }

    public void eat(){

        System.out.println("吃");
    }

    public void sleep(){

        System.out.println("睡觉");
    }
}
