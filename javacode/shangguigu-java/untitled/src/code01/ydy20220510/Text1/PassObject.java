package code01.ydy20220510.Text1;

/*

定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义
如下：public void printAreas(Circle c, int time)
在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 */
public class PassObject {

    public void printAreas(Circle c, int time){

        for (int i = 1; i <=time ; i++) {

            c.radius=i;
            System.out.println("半径为："+c.radius+"   面积为："+Math.PI*i*i);

        }
        System.out.println("new radius is  "+ (c.radius+1) );
    }
}
