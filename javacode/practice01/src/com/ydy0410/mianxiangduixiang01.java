package com.ydy0410;

//测试类
public class mianxiangduixiang01 {
    public static void main(String[] args) {

        //创建类的对象==实例化一个类
        Person1 p1 = new Person1();
        //对象.属性
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);
        //对象.方法
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");
        //创建一个类的多个对象,相互的属性互不影响
        Person1 p2 = new Person1();
        System.out.println(p2.name);
        //将p1变量保存的对象地址值赋值给p3，导致p1和p3同时指向堆空间中同一个对象实体
        Person1 p3 = p1;
        System.out.println(p3.name);
    }
}

class Person1 {

    //属性

    String name;
    int age = 1;//年龄
    boolean isMale;//性别
    //方法

    public void eat() {

        System.out.println("人可以吃饭");
    }

    public void sleep() {

        System.out.println("人可以睡觉");
    }

    public void talk(String language) {

        System.out.println("人可以说话,使用的是：" + language);
    }
}

