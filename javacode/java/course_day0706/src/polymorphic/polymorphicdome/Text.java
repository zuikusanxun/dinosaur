package polymorphic.polymorphicdome;

/*
 * 多态:子类的对象赋给父类的引用
 *子类的对象即可以赋值给子类的引用,也可以赋给超(父)类的引用
 * 一般建议赋值给父类的引用
 *
 * 解决代码扩展性
 *
 *
 *
 * */
public class Text {

    public static void main(String[] args) {

        Student stu1 = new Student();
        stu1.name = "小张猪";
        stu1.age = 19;
        stu1.number = "10086";

        Person stu2 = new Student();
        stu2.name = "杨先生";
        stu2.age = 19;
        stu2.number = "10086";

        stu1.say();
        stu2.say();
    }
}
