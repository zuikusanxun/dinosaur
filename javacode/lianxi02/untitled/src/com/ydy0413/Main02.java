package com.ydy0413;

import java.util.*;

public class Main02 {
    //用方法需求计算1-n的和
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        System.out.printf("1-%d的和为%d\n", n, sum(n));
    }

    //计算1-n的和
    public static int sum(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum += i;
        }
        return sum;
    }
}
