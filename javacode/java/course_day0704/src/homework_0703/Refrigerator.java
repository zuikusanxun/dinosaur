package homework_0703;

public class Refrigerator {

    int length;//长
    int height;//宽
    int wide;//高

    public Refrigerator(int length, int height, int wide) {

        this.length = length;
        this.height = height;
        this.wide = wide;
    }

    public void put_in(Elephant elephant) {

        int elephantVolume = elephant.height * elephant.length * elephant.weight;
        int refrigeratorVolume = this.height * this.length * this.wide;

        if (elephantVolume > refrigeratorVolume) {

            System.out.println("装入失败!");
        } else {

            System.out.println("装入成功!");
        }
    }
}
