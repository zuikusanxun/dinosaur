package code05.ydy20220607.Practice;

public class CircleText {

    public static void main(String[] args) {

        Circle c1 = new Circle(2.0);
        Circle c2 = new Circle(3.0,"black",6.6);


        System.out.println("颜色是否相同"+c1.color.equals(c2.color));
        System.out.println("半径是否相同"+c1.equals(c2));
        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }
}
