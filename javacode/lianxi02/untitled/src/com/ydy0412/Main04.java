package com.ydy0412;
import java.util.*;
//判断是否为闰年02
public class Main04 {

    public static void main(String[] args) {

        Scanner scanf=new Scanner(System.in);
        System.out.println("请输入要判断是否为闰年的年份：");
        int year=scanf.nextInt();
        boolean leap;
        if(year%4!=0){

            leap=false;
        }
        else if(year%100!=0){

            leap=true;
        }
        else if(year%400!=0){

            leap=false;
        }
        else{

            leap=true;
        }
        if(leap==true){

            System.out.printf("%d是闰年！\n",year);
        }
        else{

            System.out.printf("%d不是闰年！\n",year);
        }
    }
}
