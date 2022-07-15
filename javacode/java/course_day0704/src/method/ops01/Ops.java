package method.ops01;

//方法的创建
class Person {

    String firstName = "name";
    String lastName = "user";

    public String say(String firstName, String lastName) {

        String name = firstName + lastName;
        return name;
    }
}

public class Ops {

    public static void main(String[] args) {

        Person p = new Person();
        p.firstName = "name";
        p.lastName = "user";

        System.out.println(p.say(p.firstName, p.lastName));
    }
}
