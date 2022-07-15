package com.ydy0406;
import java.util.*;

public class Maopaofa {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        int i,j,t;
        int n;
        n=scanf.nextInt();
        int[] a=new int[10];
        //输入元素
        for(i=0;i<n;i++){

            a[i]=scanf.nextInt();
        }
        //进行排序
        for(i=0;i<n-1;i++){

            for(j=0;j<n-i-1;j++){

                if(a[i]>a[j]){

                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        //输出数组
        for(i=0;i<n;i++){

            System.out.printf("%d ",a[i]);
        }
    }
}
