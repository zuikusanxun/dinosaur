package code02.ydy20220525.Done;

public class Person extends Creature{

    String name;
    int age;

    public Person(){

    }

    public Person(String name,int age){

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
