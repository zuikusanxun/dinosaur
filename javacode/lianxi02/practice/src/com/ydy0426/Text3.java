package com.ydy0426;

import java.util.Scanner;

public class Text3 {
    //手机号码屏蔽
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("请您输入手机号码：");
        String tel=sc.next();
        //截取前三位+后四位在拼接
        String tels=tel.substring(0,3);
        tels+="****";
        tels+=tel.substring(7);
        System.out.println(tels);
    }
}
