package com.ydy0410;

/*
1.相同点


2.不同点

    2.1在类中声明的位置不同
        属性：直接定义在类的一对{}内
        局部变量：声明在方法内，方法形参，代码块内，构造器形参，构造器内部的变量
    2.2权限修饰符不同
        属性：可以在声明属性时，指明其权限，使用权限修饰符
        常用权限修饰符：private，public，缺省，protected
        局部变量：不能使用权限修饰符

 */
public class shuxing__jububianliang {
    public static void main(String[] args) {


    }
}
class Usettext{

    String name;
    int age;
    boolean isMale;

    public void talk(String language){  //形参

        System.out.println("使用的语言为："+language);
    }

    public void eat(){

        String food ="饼子";      //在方法内--局部变量
        System.out.println("吃"+food);
    }
}
