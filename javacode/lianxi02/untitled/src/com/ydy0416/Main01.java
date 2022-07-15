package com.ydy0416;

public class Main01 {
    //面向对象
    public static void main(String[] args) {

        Car c = new Car();
        c.name = "奔驰";
        c.price = 100;
        System.out.println(c.name);
        System.out.println(c.price);
        c.start();
        c.run();

        System.out.println("---------------------");
        Car c2 = new Car();
        c2.name="劳斯莱斯";
        System.out.println(c2.name);

        System.out.println("---------------------");

        Student s1=new Student();
        s1.name="张三";
        System.out.println(s1.name);
        s1.run();
    }
}
