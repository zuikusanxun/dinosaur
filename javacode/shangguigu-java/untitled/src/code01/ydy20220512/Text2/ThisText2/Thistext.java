package code01.ydy20220512.Text2.ThisText2;

//使用this调用构造器
/*
     可以在类的构造器中使用"this(形参列表)"的方式，调用本类中重载的其
他的构造器！
 明确：构造器中不能通过"this(形参列表)"的方式调用自身构造器
 如果一个类中声明了n个构造器，则最多有 n - 1个构造器中使用了
"this(形参列表)"
 "this(形参列表)"必须声明在类的构造器的首行！
 在类的一个构造器中，最多只能声明一个"this(形参列表)"
 */
public class Thistext {
    public static void main(String[] args) {

        Person1 p=new Person1(18,"张凡 ");
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }


}
class Person1{

    private int age;
    private String name;


    public Person1(){

        String info="所需代码~~~";
        System.out.println(info);
    }

    public Person1(int age){

        this();//调用构造器
        this.age=age;
    }

    public Person1(String name){

        this();
        this.name=name;
    }

    public Person1(int age,String name){

        this(age);
        this.name=name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){

        System.out.println("人吃饭!");
        this.sleep();
    }

    public void sleep(){

        System.out.println("人睡觉!");
    }
}
