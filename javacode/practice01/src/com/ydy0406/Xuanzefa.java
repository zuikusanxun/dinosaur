package com.ydy0406;
import java.util.*;
import java.math.*;

public class Xuanzefa {

    public static void main(String[] args) {

        Scanner scanf=new Scanner(System.in);
        int i,j,t,k;
        int n;
        n=scanf.nextInt();
        int[] a=new int[100];
        //输入元素
        for(i=0;i<n;i++){

            a[i]=scanf.nextInt();
        }
        //进行排序
        for(i=0;i<n;i++){

            k=i;
            for(j=i+1;j<n;j++){

                if(a[k]<a[j]){

                    k=j;
                }
            }
            t=a[k];
            a[k]=a[i];
            a[i]=t;
        }
        //输出数组
        for(i=0;i<n;i++){

            System.out.printf("%d ",a[i]);
        }
    }
}
