package com.ydy0416;

public class Main03 {

    //this关键字的使用
    public static void main(String[] args) {

        decide d=new decide();
//        System.out.println(d);
        d.decide1();
        decide d1=new decide(3,4);
        System.out.println(d1.a +" "+ d1.b);
        d1.add(5,6);
    }

    public static class decide{

        int a;
        int b;
        public decide(){

            System.out.println("构造器中this关键字"+this);
        }

        public decide(int a,int b){

            this.a=a;
            this.b=b;
        }

        public void decide1(){

            System.out.println("方法中this关键字"+this);
        }

        public void add(int a,int b){

            this.a=a+this.a;
            this.b=b+this.b;
            System.out.println(this.a+" "+this.b);
        }
    }
}
