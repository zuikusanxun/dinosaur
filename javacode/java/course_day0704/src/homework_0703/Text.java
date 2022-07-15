package homework_0703;

public class Text {

    public static void main(String[] args) {

        Elephant elephant = new Elephant(10, 10, 10);
        Refrigerator refrigerator = new Refrigerator(20, 20, 20);

        refrigerator.put_in(elephant);
    }
}
