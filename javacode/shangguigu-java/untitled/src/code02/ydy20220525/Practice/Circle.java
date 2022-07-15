package code02.ydy20220525.Practice;

public class Circle {

    private double radius;

    public Circle() {

        this.radius=1.0;
    }

    public double getRadius(){

        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){

        return Math.PI*radius*radius;
    }
}
