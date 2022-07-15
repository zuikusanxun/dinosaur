package com.ydy0413;

public class Main01 {
    //目标：学习方法的定义，调用，执行
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int sum =add(a,b);
        System.out.printf("%d\n", sum);
    }

    public static int add(int a, int b) {

        int c = a + b;
        return c;
    }
}
