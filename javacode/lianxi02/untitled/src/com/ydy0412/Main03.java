package com.ydy0412;

import java.util.*;

//判断是否为闰年01
public class Main03 {

    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        boolean flag=true;
        while (flag) {

            System.out.printf("请输入要判断是否为闰年的年份：");
            int year = scanf.nextInt();
            if(year==0){

                flag=false;
            }
            if ((year % 4 == 0 && year % 100 == 0) || (year % 400 == 0)) {

                System.out.printf("%d为闰年\n", year);
            } else {

                System.out.printf("%d不是闰年\n", year);
            }
        }
    }
}
