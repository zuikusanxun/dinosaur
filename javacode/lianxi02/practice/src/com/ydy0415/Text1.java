package com.ydy0415;

import java.util.Scanner;

public class Text1 {
    //    需求:
//    机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
//    按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
//    分析：
//    定义一个方法可以进行键盘录入机票原价、月份和机舱类型。
//    使用if判断月份是是旺季还是淡季，使用switch分支判断是头等舱还是经济舱。
//    选择对应的折扣进行计算并返回计算的结果。
    public static void main(String[] args) {

//        键盘录入机票原价、月份和机舱类型
        Scanner sc = new Scanner(System.in);

        System.out.print("请您输入机票原价：");
        double money = sc.nextDouble();

        System.out.println();

        System.out.print("请您输入月份（1-12）：");
        int month = sc.nextInt();

        System.out.println();

        System.out.print("请您输入舱位类型：");
        String type = sc.next();

        System.out.println();

        System.out.println("优惠后的价格是" + calc(money, month, type));
    }


    //接收方法信息，统计优惠后价格并返回
    public static double calc(double money, int month, String type) {

        if (month >= 5 && month <= 10) {

            //旺季
            switch (type) {

                case "头等舱":
                    money *= 0.9;//month=month*0.9;
                    break;
                case "经济舱":
                    money *= 0.85;
                    break;
                default:
                    System.out.println("您输入的舱位类型有问题！");
                    money = -1;
            }
        } else if (month == 11 || month == 12 || month >= 1 && month <= 4) {

            //淡季
            switch (type) {

                case "头等舱":
                    money *= 0.7;
                    break;
                case "经济舱":
                    money *= 0.65;
                    break;
                default:
                    System.out.println("您输入的舱位类型有问题！");
                    money = -1;
            }
        } else {

            System.out.println("您输入的价格有问题！");
            money = -1;//表示当前价格无法计算
        }
        return money;//最终价格
    }
}
