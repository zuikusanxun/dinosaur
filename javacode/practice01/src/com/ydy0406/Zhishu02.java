package com.ydy0406;

import java.util.Scanner;

public class Zhishu02 {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int figure = scanf.nextInt();
        int i, j;
        //遍历2到figure的数
        for (i = 2; i <= figure; i++) {

            for (j = 2; j < i; j++) {

                if (i % j == 0){

                    break;
                }
            }
            if(j==i){

                System.out.printf("%d是素数\n",i);
            }

        }
    }
}
