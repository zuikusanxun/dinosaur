package com.ydy0413;

import javax.swing.*;

public class Main05 {
    //打印数组内容
    public static void main(String[] args) {

        int[] a = new int[]{11, 22, 33, 44, 55};
        Print1(a);
        Print2(a);
    }

    //打印数组内容01
    public static void Print1(int[] a) {

        System.out.print("[");
        if(a!=null&&a.length>0){

            for (int i = 0; i < a.length; i++) {

                if (i != a.length - 1) {

                    System.out.print(a[i] + ",");
                } else {

                    System.out.print(a[i]);
                }
            }
        }
        System.out.println("]");
    }

    //打印数组内容02
    public static void Print2(int[] a) {

        System.out.print("[");
        if(a!=null&&a.length>0){

            for (int i = 0; i < a.length; i++) {

                System.out.print(i == a.length - 1 ? a[i] : a[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
