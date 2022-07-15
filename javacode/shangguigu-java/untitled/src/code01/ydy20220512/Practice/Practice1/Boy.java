package code01.ydy20220512.Practice.Practice1;

public class Boy {

    private String name;
    private int age;

    public Boy(){


    }


    public Boy(int age,String name){

        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl){

        System.out.println("娶~~~"+girl.getName());
    }

    public void shout(){

        if(this.age>=22){

            System.out.println("可以登记!");
        }
        else{

            System.out.println("不行！");
        }
    }
}
