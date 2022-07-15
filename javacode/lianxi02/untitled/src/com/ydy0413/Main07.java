package com.ydy0413;

public class Main07 {
    //判断数组是否相同
    public static void main(String[] args) {

        int[] a = new int[]{11, 22, 33, 44, 55};
        int[] b = new int[]{11, 22, 33, 44, 55};
        int[] c = new int[]{1, 2, 3, 4, 5};
        if (decide1(a, b)) {

            System.out.println("相等");
        } else {

            System.out.println("不相等");
        }
        if (decide1(a, b)) {

            System.out.println("相等");
        } else {

            System.out.println("不相等");
        }
    }

    //判断数组是否相同1
    public static boolean decide1(int[] a, int[] b) {

        boolean flag = true;
        if (a.length != b.length) {

            flag = false;
        } else {

            for (int i = 0; i < a.length; i++) {

                if (a[i] == b[i]) {

                    flag = true;
                } else {

                    flag = false;
                }
            }
        }
        return flag;
    }

    //判断数组是否相同2
    public static boolean decide2(int[] a, int[] b) {

        if (a.length == b.length) {

            for (int i = 0; i < a.length; i++) {

                if (a[i] != b[i]) {

                    return false;
                }
            }
            return true;
        } else {

            return false;
        }
    }
}
