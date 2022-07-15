package com.ydy0416;

public class Car {

    //成员变量（属性）
    String name;
    double price;

    //成员方法（行为）
    //启动
    public void start(){

        System.out.println(name+"启动了！");
    }

    //跑
    public void run(){

        System.out.println("价格是："+price+name+"跑的很快！");
    }
}
