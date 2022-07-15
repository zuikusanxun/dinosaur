package com.ydy0413;

import java.util.*;

public class Main03 {
    //判断整数是奇数还是偶数
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        cheak(n);
    }

    //判断整数是奇数还是偶数
    public static void cheak(int n) {

        if (n % 2 == 0) {

            System.out.printf("%d是偶数\n",n);
        } else {

            System.out.printf("%d是奇数\n",n);
        }
    }
}
