package final_study.finaldemo_0706;

import java.util.Arrays;

/*
 *
 * static 与final 关键字组合使用 用来进行对常量的定义
 *
 * 常量只能访问不能修改
 * 常量一般全大写
 *
 *
 * 静态代码块:类加载时JVM回调
 * 构造方法代码块:创建对象时JVM回调
 * 成员代码块:每次创建对象时JVM回调
 * */
public class Text {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p12 = new Person();

        System.out.println(Person.name);
        System.out.println(Arrays.toString(Person.app));

    }
}
