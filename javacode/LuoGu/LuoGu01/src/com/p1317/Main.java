package com.p1317;

import java.util.Scanner;
//方法一
/*
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int[] arr = new int[n];
        //输入数据
        for (int i = 0; i < arr.length; i++) {

            arr[i] = s.nextInt();
        }

        //找水池
        int height = 0;
        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i - 1] >= arr[i] && arr[i] < arr[i + 1]) {

                height++;
            }
        }
        System.out.println(height);
    }
}
 */

//方法二：
public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N;
        int ans = 0;
        N = s.nextInt();
        int a[] = new int[N];
        for (int i = 0; i < N; i++) {

            a[i] = s.nextInt();
        }
        for (int i = 1; i < N; i++) {//开始查找

            if (a[i - 1] > a[i]) {//当找到比左边高的开始判断

                while (i < N - 1 && a[i] >= a[i + 1]) {//如果右边还是低的话直接看下一个，直到没有或找到比右边低的

                    i++;
                }
                if (i != N - 1) {

                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
