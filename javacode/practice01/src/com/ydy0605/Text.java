package com.ydy0605;

import java.util.Scanner;

//前缀和
public class Text {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum[] = Cursum(arr);
        for (int i = 0; i < sum.length; i++) {

            System.out.print(sum[i] + " ");
        }

        //找到L~R之间的和
        int l, r;
        Scanner s = new Scanner(System.in);
        l = s.nextInt();
        r = s.nextInt();
        if (l == 1) {

            System.out.println(sum[r - 1]);
        } else {

            System.out.println(sum[r - 1] - sum[l - 1]);
        }
    }

    public static int[] Cursum(int[] arr) {

        int sum[] = new int[arr.length];
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {

            ans += arr[i];
            sum[i] = ans;
        }
        return sum;
    }
}



