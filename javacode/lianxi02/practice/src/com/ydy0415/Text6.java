package com.ydy0415;
import java.util.Scanner;
public class Text6 {
//    某系统的数字密码，比如1983，采用加密方式进行传输，规则如下：先得到每位数，然后每位数都加上5
//    再对10求余，最后将所有数字反转，得到一串新数。

    public static void main(String[] args) {

        int[] num=new int[4];
        Scanner scanf=new Scanner(System.in);
        //输入数字
        for (int i = 0; i < num.length; i++) {

            num[i]=scanf.nextInt();
        }
        //进行加密
        for (int i = 0; i <num.length ; i++) {

            num[i]=(num[i]+5)%10;
        }
        //进行反转
        for (int i = 0; i < num.length/2 ;i++) {

            int t=num[i];
            num[i]=num[num.length-i-1];
            num[num.length-i-1]=t;
        }
        //输出结果
        for (int i = 0; i < num.length; i++) {

            System.out.printf("%d ",num[i]);
        }
    }
}
