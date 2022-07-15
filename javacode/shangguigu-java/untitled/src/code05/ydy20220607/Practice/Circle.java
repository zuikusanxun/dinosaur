package code05.ydy20220607.Practice;

public class Circle extends GeometricObject {

    private double radius;


    public Circle() {

        super();
        radius = 1.0;
    }

    public Circle(double radius) {

        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight) {

        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {

        return Math.PI * radius * radius;
    }

    public boolean equals(Object obj) {

        if (this == obj) {

            return true;
        }
        if (obj instanceof Circle) {

            Circle geom = (Circle) obj;
            return this.radius == geom.radius;
        } else {

            return false;
        }
    }

    public String toString() {

        return this.radius + "";
    }
}
