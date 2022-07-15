package connector_study.interfacedome;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

public class Phono {

    String name;
    int memorySize;//内存大小

    void call() {

        System.out.println("打电话");
    }
}

/*
 * 定义接口:
 *
 *  1.接口中不能出现成员变量和成员方法
 *  2.接口中只能有   共有(public)常静态常量    和    共有(public)抽象方法
 *  3.修饰符省略默认 是 共有的
 *  4.可以省略  public static final
 *  5.可以省略  abstract
 *
 * */
interface Igame {

    public static final String NAME = "game";

    public abstract void play();

}

interface Imovie {

    public abstract void mp4();

    /*
    *
    * 接口中可以定义普通方法(jdk1.8之后)
    * */

    default void say(){

        System.out.println("接口中定义普通方法需要 重写");
    }
}


/*
 *
 * 接口也可以实现继承
 *
 *
 * */
interface Oops extends Igame {

}

/*
 *
 * java中不支持多继承,但是支持多实现
 * 实现:  implements  关键字
 *
 *
 * */
class HuaWei extends Phono implements Igame, Imovie {


    @Override
    //访问修饰符不能小于父类
    public void play() {

        System.out.println("华为手机可以玩 " + HuaWei.NAME);
    }

    @Override
    public void mp4() {

        System.out.println("看电影");
    }
}

class Nokia extends Phono implements Imovie {


    @Override
    public void mp4() {

        System.out.println("诺基亚可以看电影");
    }
}

class TextUser{

    /*
    *
        一般匿名内部类用于给接口或者抽象类直接创建实例的时候使用;
    *
    * */
    public static void main(String[] args) {

        //其他手机玩游戏
        Igame phono=new Igame(){

            @Override
            public void play() {

                System.out.println("方法内部类----匿名内部类");
            }
        };

        phono.play();
    }
}