package encapsulation.encapsulationdome;

public class Text {

    public static void main(String[] args) {

        Person p=new Person();

        p.setName("小张猪");
        p.setAge(19);

        System.out.println("性命 " + p.getName()+" 年龄 " + p.getAge());
    }
}
