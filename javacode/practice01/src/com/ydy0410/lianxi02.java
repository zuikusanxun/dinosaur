package com.ydy0410;

public class lianxi02 {
    public static void main(String[] args) {

        Person02 p1 = new Person02();
        p1.name = "张三";
        p1.age = 20;
        p1.sex = "男";
        System.out.println(p1.name);
        p1.study();
        p1.showAge();
        System.out.println(p1.name + "的新年龄为" + p1.addAge(2) + "岁");
        System.out.println(p1.age);

        System.out.println();

        Person02 p2=new Person02();
        p2.showAge();
        System.out.println(p2.addAge(2));
    }
}

class Person02 {

    //属性
    String name;
    int age;
    String sex;

    //方法
    public void study() {

        System.out.println("studying");
    }

    public void showAge() {

        System.out.println(age);
    }

    public int addAge(int i) {

        age += i;
        return age;
    }
}