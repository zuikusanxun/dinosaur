package com.ydy0415;

public class Main01 {
    public static void main(String[] args) {

        //识别方法重载的形式，并理解其调用流程，知道方法重载的好处
        fire();
        fire("张凡");
        fire("张凡",521);
    }

    public static void fire(){

        //System.out.println("攻击张凡！");
        fire("张凡");
    }

    public static void fire(String location){

        //System.out.println("攻击"+location+"!");
        fire(location,521);
    }

    public static void fire(String location,int nums){

        System.out.println("攻击"+location+nums+"次!");
    }
}
