package com.ydy0416.demo;

public class Text {

    public static void main(String[] args) {
        //1.设计电影类
        //2.创建3个电影对象
        //将三个对象放在数组中
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("《长津湖》", 9.7, "吴京");//将地址存入
        movies[1] = new Movie("《我和我的父辈》", 9.6, "吴京");
        movies[2] = new Movie("《扑水少年》", 9.5, "王川");

        //4.遍历输出
        for (int i = 0; i < movies.length; i++) {

            Movie m = movies[i];
            System.out.println(m.getName());
            System.out.println(m.getScore());
            System.out.println(m.getActor());
            System.out.println("============");
        }
    }
}
