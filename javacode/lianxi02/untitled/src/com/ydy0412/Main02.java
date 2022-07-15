package com.ydy0412;
import java.util.*;
//乘法表
public class Main02 {
    public static void main(String[] args) {

        int i,j;
        for(i=1;i<=9;i++){

            for(j=1;j<=i;j++){

                System.out.printf("%d*%d=%d\t",j,i,i*j);
            }
            System.out.println();
        }
    }
}
