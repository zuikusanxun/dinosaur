package com.ydy0415;

import java.util.concurrent.ForkJoinPool;

public class Text2 {
    //    101-200之间的数据可以采用循环依次拿到; 每拿到一个数，判断该数是否是素数。
//    判断规则是：从2开始遍历到该数的一半的数据，看是否有数据可以整除它，有则不是素数，没有则是素数。
    public static void main(String[] args) {

        //遍历101-200
        for (int i = 101; i <= 200; i++) {

            if (decide(i)) {

                System.out.printf("%d为素数\n", i);
            }
        }
        decide1();
    }

    //判断是否为素数1
    public static boolean decide(int number) {

        boolean flag = true;         //信号位
        for (int i = 2; i < Math.sqrt(number); i++) {

            if (number % i == 0) {

                flag = false;
                return flag;
            }
        }
        return flag;
    }

    public static void decide1(){

        //101-200
        int i,j;
        for (i =101;i<=200;i++){

            //遍历查找素数
            for (j =2;j<Math.sqrt(i);j++){

                if(i%j==0){

                    break;
                }
            }
            if(Math.sqrt(i)<=j){

                System.out.println(i+"是素数！");
            }
        }
    }
}
