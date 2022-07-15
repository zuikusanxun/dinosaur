package java_api_study.class_study;


import java.io.OutputStream;

/*
 *
 *  1.普通内部类
 *  2.静态内部类
 *  3.方法内部类(匿名内部类)
 *
 * --------------------------
 *
 *  抽象类创建不了对象抽象类不能实例化的,只能实例化抽象类的子类;
 *
 *  接口不能实例化;
 * */
public class Demo {

    public static void main(String[] args) {
        //创建内部类的对象,我们其实应该先创建外部类的对象
        OuterClass outerClassObj = new OuterClass();
        //创建内部类对象
        OuterClass.InnerClass innerClassObj = outerClassObj.new InnerClass();

//        OuterClass.InnerClass innerClassObj01 = new OuterClass().new InnerClass();---//非静态创建内部类对象

        outerClassObj.setName("admin");
        innerClassObj.say();
    }
}
