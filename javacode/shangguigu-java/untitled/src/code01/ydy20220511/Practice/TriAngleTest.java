package code01.ydy20220511.Practice;

/*
编写两个类，TriAngle和TriAngleTest，其中TriAngle类中声明私有的底
边长base和高height，同时声明公共方法访问私有变量。此外，提供类
必要的构造器。另一个类中使用这些公共方法，计算三角形的面积。
 */
public class TriAngleTest {

    public static void main(String[] args) {

        TriAngle s=new TriAngle(3,4);
        System.out.println("面积为： "+1.0/2*s.getBase()*s.getHeight());

        TriAngle s1=new TriAngle();
        s1.setBase(3);
        s1.setHeight(4);
        System.out.println("面积为："+1.0/2*s1.getBase()*s1.getHeight());
    }
}
