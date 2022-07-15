package com.ydy0409;

import java.util.*;

public class Erfenchazhao {

    public static void main(String[] args) {

        //二分查找必须要求数组有序
        Scanner scanf = new Scanner(System.in);
        System.out.print("请输入数组中有多少元素：");
        int n = scanf.nextInt();
        int[] a = new int[n];
        //给数组输入数据
        for (int i = 0; i < a.length; i++) {

            a[i] = scanf.nextInt();
        }
        //显示数组
        for (int i = 0; i < a.length; i++) {

            System.out.printf("%d ", a[i]);
        }
        System.out.println();
        //进行排序
        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - i - 1; j++) {

                if (a[j] > a[j + 1]) {

                    int t = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = t;
                }
            }
        }
        //显示数组
        for (int i = 0; i < a.length; i++) {

            System.out.printf("%d ", a[i]);
        }
        System.out.println();
        //进行二分查找
        boolean isFlag = true;
        System.out.print("请输入要查找的元素");
        int key = scanf.nextInt();
        int left, right, mid;
        left = 0;
        right = a.length - 1;
        while (left <= right) {

            mid = (left + right) / 2;
            if (key == a[mid]) {

                System.out.printf("找到了是第%d个\n", mid);
                isFlag = false;
                break;
            } else if (key > a[mid]) {

                left = mid + 1;
            } else {

                right = mid - 1;
            }
        }
        if (isFlag) {

            System.out.printf("未找到相应的元素！\n");
        }
    }
}
