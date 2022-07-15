package code05.ydy20220607.classText;

public class Student1 extends Person {

//    String name;
//    int age;
    String major;

    public Student1(){


    }

    public Student1(String name, int age, String major){

        this.name=name;
        this.age=age;
        this.major=major;
    }

//    public void eat(){
//
//        System.out.println("吃");
//    }
//
//    public void sleep(){
//
//        System.out.println("睡觉");
//    }

    public void study(){

        System.out.println("学习");
    }
}
