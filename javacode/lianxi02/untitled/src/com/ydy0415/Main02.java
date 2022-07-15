package com.ydy0415;

public class Main02 {
    //使用return；结束方法
    public static void main(String[] args) {

        int a=10;
        int b=0;
        add(a,b);
    }

    public static void add(int a,int b){

        if(b==0){

            System.out.println("被除数不能为0！");
            return;//立即跳出当前方法的执行
        }
        else{

            int c=a/b;
            System.out.println("结果是："+c);
        }
    }
}
