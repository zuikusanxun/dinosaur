package com.ydy0409;

import java.util.Scanner;

public class Qiuzhixing {

    public static void main(String[] args) {

        int[] arr = new int[10];
        //给数组随机赋值
        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);//  [a,b]~~ (int)random()*(b-a+1)+a
        }
        //输出数组元素
        for (int i = 0; i < 10; i++) {

            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        //求数组元素最大值
        int max = arr[0];
        for (int i = 0; i < 10; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }
        }
        System.out.printf("数组元素最大值:%d\n", max);
        //求数组元素最小值
        int min = arr[0];
        for (int i = 0; i < 10; i++) {

            if (arr[i] < min) {

                min = arr[i];
            }
        }
        System.out.printf("数组元素最小值:%d\n", min);
        //求数组元素总和
        int sum = 0;
        for (int i = 0; i < 10; i++) {

            sum += arr[i];
        }
        System.out.printf("数组元素总和:%d\n", sum);
        //求数组元素平均值
        int age;
        age = sum / 10;
        System.out.printf("数组元素平均值：%d\n", age);
    }
}
