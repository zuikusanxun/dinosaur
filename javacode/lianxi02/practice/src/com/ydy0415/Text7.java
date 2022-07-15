package com.ydy0415;

import java.util.Scanner;

public class Text7 {
    //双色球6个红球（1-33不能重复）1个篮球（1-16）
    public static void main(String[] args) {

//        for (int i = 0; i < 50; i++) {
//
//
//            //print(luckNumber);
//        }

            int[] luckNumber = createLuckNumber();//中奖号码
            System.out.println("请输入购买的号码：");
            int[] userNumber = userNumbers();//购买号码
            judge(luckNumber, userNumber);//判断中奖情况  if(userNumber==)
    }

    //生成中奖号码
    public static int[] createLuckNumber() {

        //定义一个动态初始化的数组
        int[] numbers = new int[7];
        //输入随机数并判断是否有重复
        for (int i = 0; i < numbers.length - 1; i++) {

            numbers[i] = (int) (Math.random() * (33 - 1 + 1) + 1);
            while (true) {

                if(decide(numbers,i)) {

                    numbers[i] = (int) (Math.random() * (33 - 1 + 1) + 1);
                }
                else{

                    break;
                }
            }
        }
        numbers[numbers.length - 1] = (int) (Math.random() * (16 - 1 + 1) + 1);
        return numbers;
    }

    //用户输入号码
    public static int[] userNumbers() {

        Scanner scanf = new Scanner(System.in);
        int[] users = new int[7];
        for (int i = 0; i < 7; i++) {

            users[i] = scanf.nextInt();
            if (decide(users, i)) {

                System.out.println("用户输入号码不正确！");
                break;
            }
        }
        return users;
    }

    //判断中奖情况
    public static void judge(int[] a, int[] b) {

        int red = 0;
        int blue = 0;
        for (int i = 0; i < a.length - 1; i++) {

            if (b[i] == a[i]) {

                red += 1;
            }
        }
        if (a[a.length - 1] == b[b.length - 1]) {

            blue += 1;
        }
        int sum = red + blue;
        switch (sum) {

            case 0:
                System.out.println("很遗憾您未中奖~");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("恭喜中奖5元！");
                break;
            case 4:
                System.out.println("恭喜中奖10元！");
                break;
            case 5:
                System.out.println("恭喜中奖200元！");
                break;
            case 6:
                if (blue == 0) {

                    System.out.println("恭喜中奖500万元！");
                }
                if (blue == 1) {

                    System.out.println("恭喜中奖3000元！");
                }
                break;
            case 7:
                System.out.println("恭喜中奖1000万元！");
                break;
        }
    }

    //判断是否有重复
    public static boolean decide(int[] num, int i) {

        for (int n = 0; n <= i; n++) {

            for (int j = 0; j < n; j++) {

                if (num[n] == num[j]) {

                    return true;
                }
            }
        }
        return false;
    }


    //打印号码
    public static void print(int[] a) {

        for (int i = 0; i < a.length; i++) {

            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
}
