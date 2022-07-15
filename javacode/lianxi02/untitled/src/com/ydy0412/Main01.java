package com.ydy0412;
import java.util.*;
//求1-100的和

public class Main01 {
    public static void main(String[] args) {

        int i=1;
        int sum=0;
        while(i<=100){

            sum+=i;
            i++;
        }
        System.out.printf("%d",sum);
    }

}
