package com.ydy0426;

import java.util.Scanner;

public class Text2 {
    //模拟用户登录功能
    public static void main(String[] args) {

        //定义正确用户名与密码
        String okName="abcde";
        String okPassword="123456";
        Scanner sc=new Scanner(System.in);
        //定义一个循环，循环三次，让用户登录
        for (int i = 1; i <= 3; i++) {

            System.out.print("请输入用户名：");
            String loginName=sc.next();
            System.out.print("请输入密码：");
            String password=sc.next();

            //判断登录是否成功
            if(okName.equals(loginName)){

                if(okPassword.equals(password)){

                    System.out.println("登录成功！");
                    break;
                }
                else{

                    System.out.println("您输入密码不正确！您还剩余"+(3-i)+"次机会");
                }
            }
            else{

                System.out.println("您输入用户名不正确！您还剩余"+(3-i)+"次机会");
            }
        }
    }
}
