package com.ydy0410;

import java.util.*;

public class jisuanyuanmianji {
    public static void main(String[] args) {

        Scanner scanf = new Scanner(System.in);
        System.out.print("请输入要计算面积圆的半径:");
        Circle c1 = new Circle();
        c1.r=scanf.nextDouble();
        double area = c1.findArea();
        System.out.println(area);
    }
}

//圆
class Circle {

    //属性
    double r;

    //方法
    public double findArea() {

        return Math.PI * r * r;
    }
}
