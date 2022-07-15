package code02.ydy20220525.Practice;

public class CylinderTest {

    public static void main(String[] args) {

        Cylinder c=new Cylinder();
        c.setLength(3.4);
        c.setRadius(2.1);

//        double volume = c.findVolume();
//        System.out.println("体积为"+volume);

        double area = c.findArea();
        System.out.println("表面积为"+area);

    }
}
