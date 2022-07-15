package com.ydy0427;

import java.util.Scanner;

public class Text4 {
    public static void main(String[] args) {

        //字符串翻转
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        String result="[";
        for(int i=name.length()-1;i>=0;i--){

            if(i!=0) {
                result+=name.charAt(i);
                result+=", ";
            }
            else{

                result+=name.charAt(i);
                result+="]";
            }
        }
        System.out.println(result);
    }
}
