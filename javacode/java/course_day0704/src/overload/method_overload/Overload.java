package overload.method_overload;

//方法重载
//在同一个类中,方法名相同(返回值类型要相同),形参列表不同(类型,个数)
public class Overload {


}

class Person {

    String name;
    int age;

    public void say() {

        System.out.println("第一个");
    }

    public void say(int age) {

        System.out.println("第二次" + age);
    }
}