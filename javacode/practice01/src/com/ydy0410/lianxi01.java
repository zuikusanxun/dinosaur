package com.ydy0410;

public class lianxi01 {
    public static void main(String[] args) {

        Person p1 = new Person();
        System.out.println("张凡~");
        p1.eat("粑粑");
        p1.talk("日本话");
    }
}

class Person {

    String name;

    // 权限修饰符 返回值类型 方法名（形参列表）
    public void eat(String food) {

        System.out.printf("张凡吃%s\n", food);
    }

    public void talk(String language) {

        System.out.printf("张凡说%s语言\n", language);
    }


}
