package com.p5705;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        double m, g, s, b, q;
        double sum = 0;
        m = scanf.nextDouble();
        m=m*10;
        g = (int)m % 10;
        s = (int)m / 10 % 10;
        b = (int)m / 100 % 10;
        q = (int)m / 1000;
        sum = g + s / 10 + b / 100 + q / 1000;
        System.out.printf("%.3f\n", sum);
    }
}
