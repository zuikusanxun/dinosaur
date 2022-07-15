package com.ydy0406;

import java.util.Scanner;

public class Zhishu01 {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int figure = scanf.nextInt();
        int i, j;
        //遍历2到figure的数
        for (i = 2; i <= figure; i++) {
            //这个数被2--figure-1不能被整除的就是素数
            boolean isFlag = true;
            for (j = 2; j < i; j++) {

                if (i % j == 0) {

                    isFlag=false;
                }
            }
            if(isFlag==true){

                System.out.printf("%d是素数\n",i);
            }
        }
    }
}
