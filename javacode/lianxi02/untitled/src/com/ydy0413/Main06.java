package com.ydy0413;

public class Main06 {
    //查询数组中的索引。有就返回下标，没有就返回-1
    public static void main(String[] args) {

        int[] a=new int[]{11,22,33,44,55};
        System.out.println("您查询的数组元素索引为："+find(a, 11));
        if (find(a,0)==-1) {
            System.out.println("无此元素");
        }

    }

    //查询数组中的索引。有就返回下标，没有就返回-1
    public static int find(int[] a,int n){

        for(int i=0;i<a.length;i++){

            if(a[i]==n){

                return i;
            }
        }
        return -1;
    }
}
