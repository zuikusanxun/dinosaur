package com.ydy0416;

public class Mian02 {
    //认识构造器明白两种构造器的使用
    public static void main(String[] args) {

        stu s = new stu();
        s.name="张三";
        s.num=110;
        System.out.println(s.name+s.num);

        stu s1=new stu("张凡",250);
        System.out.println(s1.name+s1.num);
    }

    public static class stu {

        String name;
        int num;

        public stu() {

            System.out.println("无参数构造器");
        }

        public stu(String n, int m) {

            name = n;
            num = m;
            System.out.println("有参数构造器");
        }
    }
}
