package final_study.finaldemo_0706;

public class Person {

    static final String name="admin";
    static final String[] app=new String[3];

    //普通代码块
    {

        String name;
        System.out.println("成员代码块");
    }

    //静态代码块
    static{

        System.out.println("类执行时执行");
    }

    public Person(){

        System.out.println("创建对象时执行");
    }
}
