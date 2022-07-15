package com.ydy0426;

import java.util.Scanner;

public class Text1 {
    //生成随机数
    public static void main(String[] args) {

        //定义可能出现的字符信息
        String datas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        //循环n次每次生成一个随机索引
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入几位数的验证码：");
        int n = sc.nextInt();//输入几位验证码
        String code = "";
        for (int i = 0; i < n; i++) {

            int index = (int) (Math.random() * (datas.length() - 0 + 1) + 0);//随机生成的索引
            char c = datas.charAt(index);
            code += c;
        }
        System.out.println(code);
    }
}
