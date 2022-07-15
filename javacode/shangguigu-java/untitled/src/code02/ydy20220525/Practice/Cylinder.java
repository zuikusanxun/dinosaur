package code02.ydy20220525.Practice;

public class Cylinder extends Circle{

    private double length;

    public Cylinder(){

        this.length=1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

//    public double findVolume(){
//
//        return findArea()*length;
//    }

    public double findArea(){

        return Math.PI*getRadius()*getRadius()*2+2*Math.PI*getRadius()*getLength();
    }
}
