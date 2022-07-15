package com.ydy0410;

public class fangfa {
    public static void main(String[] args) {


    }
}

class Customer {

    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void sleep(int hour) {

        System.out.println("休息了" + hour);
    }

    public String getName() {

        return name;
    }

    public String getNation(String nation) {

        String info = "我的国籍是" + nation;
        return info;
    }
}
