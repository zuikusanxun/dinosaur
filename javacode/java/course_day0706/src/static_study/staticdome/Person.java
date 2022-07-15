package static_study.staticdome;
/*
*
* 关键字:static
*可以修饰:
* 1.代码块-->静态代码块(在类加载时加载)---只加载一次(在程序执行时,一个类只会加载一次)
*
* 2.修饰成员变量和成员方法
*
*
* 使用static修饰的成员不建议使用对象访问----Person(类名).成员
* 所有的对象公用一份变量,因为static是修饰类级别的
*
* 在方法区中的静态域中
*
* 静态方法中不能使用非静态的成员变量(不能使用this关键字)
*
*
* ---------------局部变量是没有默认值
*  --------------成员变量是有默认值的
*
*
*
*
*
* */
public class Person {

    static String name;//静态属性在所有对象中都一样,随着类的加载而加载
    static int age;

    static{

        System.out.println("静态代码块");
    }

    public Person() {

    }

    public static void say(){

        System.out.println("name = "+name+" age = "+age);
    }
}
