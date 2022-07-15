package polymorphic.polymorphicdome;

public class Student extends Person {


    @Override
    public void say() {

        super.say();
        System.out.println("my sutNumber is " + super.number);
    }
}
