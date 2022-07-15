package code01.ydy20220511.Practice;

/*

创建程序,在其中定义两个类：Person和PersonTest类。定义如下：
用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。 在 PersonTest 类 中实例化 Person 类的对象 b ， 调 用 setAge() 和
getAge()方法，体会Java的封装性。
 */
public class PersonTest {

    public static void main(String[] args) {

        Person b = new Person();
//        b.setAge(20);
        System.out.println("年龄为： " + (b.getAge()));
        System.out.println("姓名： " + (b.getName()));
    }

}
