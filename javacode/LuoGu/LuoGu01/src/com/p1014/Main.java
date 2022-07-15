package com.p1014;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int n = scanf.nextInt();
        //表示行
        int i = 0;
        //表示共有多少个
        int j = 0;
        //先确定在第几行
        //当j大于或等于n时就可以确定n在第几行
        while (n > j) {

            i++;
            j += i;
        }
        //1.确定在倒数的第几个(画图并找规律)  (j-n+1)
        //2.确定正数第几个，注意行数加一就是这一行分子分母的和
        //3.奇数行与偶数行规律相反
        if (i % 2 == 0) {

            System.out.printf("%d/%d\n", i - j + n, j - n + 1);
            //（i+1）-（j-n+1）=i-j+n
        }
        if (i % 2 != 0) {

            System.out.printf("%d/%d\n", j - n + 1, i - j + n);
        }
    }
}
