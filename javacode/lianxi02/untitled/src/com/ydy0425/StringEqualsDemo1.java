package com.ydy0425;

import java.util.Scanner;

public class StringEqualsDemo1 {

    public static void main(String[] args) {

        //正确登录名
        String okname = "itheima";
        String okpassword = "123456";
        //输入
        System.out.println("请输入账号");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();
        //判断输入是否正确
        if (name == okname && password == okpassword) {   //双等是判断地址是否相同

            System.out.println("登录成功！");
        } else {

            System.out.println("账号或密码错误！请重新输入！");
        }
        if (okname.equals(name) && okpassword.equals(password)) {   //双等是判断地址是否相同

            System.out.println("登录成功！");
        } else {

            System.out.println("账号或密码错误！请重新输入！");
        }

        //忽略大小写的API一般用于验证码
        String sysCode="123ABC";
        String Code="123abc";
        if(sysCode.equalsIgnoreCase(Code)){

            System.out.println("输入正确！");
        }
        else{

            System.out.println("输入错误！");
        }
    }
}
