package com.ydy0413;

import java.util.*;

public class Main04 {
    //找出数组中的最大值
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int[] a = new int[10];
        //输入数组元素
        for (int i = 0; i < a.length; i++) {

            a[i] = scanf.nextInt();
        }
        System.out.printf("数组中的最大值为：%d", max(a));
    }

    //找出数组中的最大值
    public static int max(int[] a) {

        int max = a[0];
        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {

                max = a[i];
            }
        }
        return max;
    }
}
