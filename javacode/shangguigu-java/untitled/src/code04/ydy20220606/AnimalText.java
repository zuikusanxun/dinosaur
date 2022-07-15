package code04.ydy20220606;

//多态类的应用
public class AnimalText {

    public static void main(String[] args) {


        AnimalText text = new AnimalText();
        text.func(new Cat());

    }


    public void func(Animal animal) {

        animal.eat();
        animal.shout();
    }

}

