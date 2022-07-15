package com.ydy0416;

public class Main04_1 {
    //成员变量使用private修饰，只能在本类中访问

    private int age;


    /**
     * 提供配套的getter和setter方法暴露其取值和赋值
     */
    //赋值
    public void setAge(int age) {

        //判断年龄是否正确
        if (age >= 0 && age <= 200) {

            this.age = age;
        }
        else{

            System.out.println("您输入的年龄有问题！");
        }
    }

    //取值
    public int getAge(){

        return age;
    }
}
