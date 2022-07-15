package code04.Practice;

//编写equalsArea方法测试两个对象的面积是否相等（注意方法的参
//        数类型，利用动态绑定技术），编写displayGeometricObject方法显示对象的面积（注意方法的参
//        数类型，利用动态绑定技术）。
public class GeometricTest {


    public static void main(String[] args) {

        GeometricTest text = new GeometricTest();
        Circle c1 = new Circle(2.3, "white", 1.0);
        text.displayGeometricObject(c1);
        Circle c2 = new Circle(3.3, "white", 1.0);
        text.displayGeometricObject(c2);
        boolean flag = text.equalsArea(c1, c2);
        if (flag) {

            System.out.println("面积相等");
        } else {

            System.out.println("面积不同");
        }

        MyRectangle m1 = new MyRectangle(2.1, 3.4, "red", 2.0);
        text.displayGeometricObject(m1);
    }

    public boolean equalsArea(GeometricObject o1, GeometricObject o2) {

        return o1.findArea() == o2.findArea();
    }

    public void displayGeometricObject(GeometricObject o) {

        System.out.println("面积为：" + o.findArea());
    }


}
