package com.ydy0409;

import java.util.*;
import java.math.*;

public class lianxi01 {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);

        //输入有几位同学
        System.out.printf("请输入有多少位同学：");
        int n = scanf.nextInt();
        int[] score = new int[n];
        //输入n位同学成绩
        System.out.printf("输入%d位同学成绩:",n);
        for (int i = 0; i < score.length; i++) {

            score[i] = scanf.nextInt();
        }
        //找出最高分
        int max = score[0];
        for (int i = 1; i < score.length; i++) {

            if (score[i] > max) {

                max = score[i];
            }
        }
        //输出最大值
        System.out.printf("最大值为：%d\n", max);
        //输出结果
        char level;
        for (int i = 0; i < score.length; i++) {

            if (max - score[i] <= 10) {

                level = 'A';
            } else if (max - score[i] <= 20) {

                level = 'B';
            } else if (max - score[i] <= 30) {

                level = 'C';
            } else {

                level = 'D';
            }
            System.out.printf("student %d score is %d grade is %c\n",i+1,score[i],level);
        }
    }
}
