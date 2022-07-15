package com.ydy0415;

public class Text4 {
    //    把一个数组中的元素复制到另一个新数组中去。
//    分析：
//    需要动态初始化一个数组，长度与原数组一样。
//    遍历原数组的每个元素，依次赋值给新数组。
//    输出两个数组的内容。
    public static void main(String[] args) {

        int[] a=new int[]{1,2,3,4,5};
        int [] b=new int[a.length];
        copy(a,b);
        print(a);
        print(b);
    }

    public static void copy(int[] a,int[] b){

        for (int i = 0; i < a.length; i++) {

            b[i]=a[i];
        }
    }

    public static void print(int[] a){

        System.out.print("[");
        for (int i = 0; i <a.length ; i++) {

            System.out.print(i==a.length-1?a[i]:a[i]+", ");
        }
        System.out.println("]");
    }
}
