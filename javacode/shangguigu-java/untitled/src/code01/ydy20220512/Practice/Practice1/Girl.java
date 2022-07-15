package code01.ydy20220512.Practice.Practice1;

public class Girl {

    private int age;
    private String name;


    public Girl(){


    }
    public Girl(int age ,String name){

        this.age=age;
        this.name=name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy){

        System.out.println("嫁给"+boy.getName());
        boy.marry(this);//this代表当前对象
    }

    /**
    * @Description: 比较两个对象的大小，返回正数，当前对象大，反之当前对象小
    * @Param: [girl]
    * @return: int
    * @Author: 最酷三旬
    * @Date: 2022/5/12
    */
    public int compare(Girl girl){

        return this.age-girl.age;
    }
}
