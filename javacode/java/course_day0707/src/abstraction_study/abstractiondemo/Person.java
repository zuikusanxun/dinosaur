package abstraction_study.abstractiondemo;

public class Person {

}

abstract class Student {

    String name;

    abstract void say();

    public void say01() {

        System.out.println("name is " + name);
    }
}


class Teather extends Student {

    @Override
    void say(){

        System.out.println("继承抽象类必须要重写抽象方法");
    }
}