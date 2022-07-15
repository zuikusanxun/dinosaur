package com.ydy0427;

public class Text3 {
    public static void main(String[] args) {

        //拼接字符串
        //将int 数组中的元素转换成字符串
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(attToString(arr));
    }

    public static String attToString(int[] arr) {

        if (arr == null) {

            return "";
        }
        if (arr.length == 0) {

            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {

            if (i != arr.length - 1) {
                result += arr[i];
                result += ", ";
            }
            else{

                result += arr[i];
                result += "]";
            }
        }
        return result;
    }
}
