package com.ydy0410;

public class lianxi03 {

    public static void main(String[] args) {

        method00 m1=new method00();
        m1.method01();
        System.out.println("1结束");
        System.out.println(m1.method02());
        System.out.println("2结束");
        System.out.println(m1.method03(10, 8));
        System.out.println("3结束");
    }
}
class method00{

    public void method01() {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 8; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public int method02() {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 8; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        return 10 * 8;
    }

    public int method03(int m, int n) {

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}
