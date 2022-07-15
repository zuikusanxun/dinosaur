package com.ydy0415;

import java.util.Scanner;

public class Text3 {
    //    定义方法实现随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母
    public static void main(String[] args) {

        Scanner scanf=new Scanner(System.in);
        System.out.print("请输入要获取几位的验证码：");
        int n=scanf.nextInt();
        System.out.println(createCode(n));
    }

    //生成随机数
    public static String createCode(int n){

        String code="";
        for (int i = 0; i < n; i++) {

            int number=(int)(Math.random()*(3-1+1)+1);
            switch(number){

                //数字
                case 1:
                    code+=(int)(Math.random()*(9-0+1)+0);
                    break;

                //大写字母
                case 2:
                    char M=(char)(Math.random()*(90-65+1)+65);
                    code+=M;
                    break;

                //小写字母
                case 3:
                    char m=(char)(Math.random()*(122-97+1)+97);
                    code+=m;
                    break;

            }
        }
        return code;
    }
}
