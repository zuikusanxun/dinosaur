package type;


/*
*   小-->大: 自动类型转换
    小--->大: 强制类型转换
    类型转换时一定要注意对象本身的类型;
*
*
* */
public class Text {

    /*
     * 子类的对象可以赋值给父类的对象
     *
     *
     *
     * */

    public static void main(String[] args) {

        Person p = new Person();
        Student s = new Student();

        p = s;//子类的对象可以赋值给父类的对象
        s = (Student) p;//父类强转为子类对象

    }
}
