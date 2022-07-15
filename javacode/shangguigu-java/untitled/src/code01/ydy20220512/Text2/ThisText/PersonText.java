package code01.ydy20220512.Text2.ThisText;
/*

 在Java中，this关键字比较难理解，它的作用和其词义很接近。
 它在方法内部使用，即这个方法所属对象的引用；
 它在构造器内部使用，表示该构造器正在初始化的对象。
 this 可以调用类的属性、方法和构造器
 什么时候使用this关键字呢？
 当在方法内需要用到调用该方法的对象时，就用this。
具体的：我们可以用this来区分属性和局部变量。
比如：this.name = name;
 */

/*
1. 在任意方法或构造器内，
如果使用当前类的成员变量或成
员方法可以在其前面添加this，
增强程序的阅读性。不过，通
常我们都习惯省略this。
2. 当形参与成员变量同名时，
如果在方法内或构造器内需要
使用成员变量，必须添加this来
表明该变量是类的成员变量
3.使用this访问属性和方法时，
如果在本类中未找到，会从父
类中查找
 */
public class PersonText {
    public static void main(String[] args) {

        Person p=new Person();
        p.eat();
    }

}

class Person {

    private String name;
    private int age;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void eat(){

        System.out.println("人吃饭!");
        this.sleep();
    }

    public void sleep(){

        System.out.println("人睡觉!");
    }
}
