package com.ydy0427;

import java.util.Scanner;

public class Text2 {

    public static void main(String[] args) {
        //统计一个字符串中大写小写字母以及数字的个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String code = sc.next();
        int dletter=0,xletter=0,number=0;
        for (int i = 0; i < code.length(); i++) {

            char c = code.charAt(i);
            if (c >= '0' && c <= '9') {

                number++;
            }
            else if(c>='a'&&c<='z'){

                xletter++;
            }
            else if(c>='A'&c<='Z'){

                dletter++;
            }
        }
        System.out.println("大写字母有："+dletter+"小写字母有："+xletter+"数字有："+number);
    }
}
