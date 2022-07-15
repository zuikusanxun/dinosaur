package com.ydy0409;

import java.util.*;
import java.math.*;

public class Yanghuisanjiao {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        int[][] a = new int[10][];

        for (int i = 0; i < a.length; i++) {

            a[i] = new int[i + 1];
            //给首末元素赋值
            a[i][0] = 1;
            a[i][i] = 1;
            //给中间元素赋值
            if (i >= 2) {
                for (int j = 1; j < a[i].length-1; j++) {

                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
            }
        }
        //输出杨辉三角
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
