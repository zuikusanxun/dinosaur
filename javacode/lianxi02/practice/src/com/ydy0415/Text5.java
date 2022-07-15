package com.ydy0415;

import java.util.Scanner;

public class Text5 {
    //    需求 :
//    在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
//    选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。
    public static void main(String[] args) {

        int[] scores = new int[6];
        scanf(scores);//输入评分
        System.out.println("最总得分为："+score(scores));

    }

    //输入评分
    public static void scanf(int[] a) {

        Scanner scanf = new Scanner(System.in);
        System.out.print("请输入评分：");
        for (int i = 0; i < a.length; i++) {

            a[i] = scanf.nextInt();
        }
    }

    //找到最大值
    public static int max(int[] a) {

        int max = a[1];
        for (int i = 0; i < a.length; i++) {

            if (a[i] > max) {

                max = a[i];
            }
        }
        return max;
    }

    //找到最小值
    public static int min(int[] a) {

        int min = a[1];
        for (int i = 0; i < a.length; i++) {

            if (a[i] < min) {

                min = a[i];
            }
        }
        return min;
    }

    //求最终得分
    public static int score(int[] a){

        int sum=0;
        for (int i = 0; i < a.length; i++) {

            sum+=a[i];
        }
        return (sum-max(a)-min(a))/(a.length-2);
    }
}
