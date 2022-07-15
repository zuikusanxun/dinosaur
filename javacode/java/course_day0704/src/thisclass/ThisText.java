package thisclass;

//面试
//造成栈溢出的可能:方法调用层次太深(递归)
//解决栈溢出:控制好递归的退出条件


//this关键字表示调用当前方法的对象
public class ThisText {

    public static void main(String[] args) {

        Person p = new Person("小张猪", 19);
        p.print("name", 18);
    }
}

class Person {

    String name;
    int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void print(String name, int age) {

        System.out.println("name is " + this.name + " age is " + this.age);
    }
}