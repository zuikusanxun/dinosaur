package com.ydy0409;

import java.util.*;

public class Shuzufanzhuan {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        System.out.print("请输入数组中有多少元素：");
        int n = scanf.nextInt();
        int[] a = new int[n];
        //给数组赋值
        for (int i = 0; i < a.length; i++) {

            a[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
        }
        //显示数组
        for (int i = 0; i < a.length; i++) {

            System.out.printf("%d ", a[i]);
        }
        System.out.println();
        //进行反转
        int m = a.length / 2;
        int t;
        for (int i = 0; i < m; i++) {

            t = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = t;
        }
        //显示数组
        for (int i = 0; i < a.length; i++) {

            System.out.printf("%d ", a[i]);
        }
    }
}
