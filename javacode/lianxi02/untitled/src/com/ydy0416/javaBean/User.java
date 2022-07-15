package com.ydy0416.javaBean;

public class User {

    //1.成员变量使用private私有
    private String name;
    private double height;
    private double salary;


    //无参构造器

    public User() {
    }

    //有参构造器
    public User(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }

    /**
     * 必须为成员变量提供成套的setter和getter方法
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
