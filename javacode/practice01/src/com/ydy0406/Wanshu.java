package com.ydy0406;

public class Wanshu {

    public static void main(String[] args) {

        int n = 1000;
        for (int i = 1; i <= n; i++) {

            int t = 0;
            for (int j = 1; j <= i/2; j++) {

                if (i % j == 0) {

                    t += j;
                }
            }
            if (t == i) {

                System.out.printf("%d是完数\n", i);
            }
        }
    }
}
