package com.ydy0409;

import java.util.*;

public class Shuzuhebing {

    public static void main(String[] args) {

        int[] arr1, arr2;
        arr1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        //显示arr1元素
        for (int i = 0; i < arr1.length; i++) {

            System.out.printf("%d ", arr1[i]);
        }
        System.out.println();
        arr2 = arr1;    //实际只有一个数组，new一个数组堆空间中只有一个数组，只是将地址值给了arr2
        //都指向堆空间中的一个实体数组
        //相当于创建快捷方式
        //将偶数索引改为相应的值
        for (int i = 0; i < arr2.length; i++) {

            if (i % 2 == 0) {

                arr2[i] = i;
            }
        }
        for (int i = 0; i < arr1.length; i++) {

            System.out.printf("%d ", arr1[i]);
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {

            System.out.printf("%d ", arr2[i]);
        }
    }
}
