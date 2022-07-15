package final_study.finaldemo_0707;

public final class Person01 {

    final String name = "小张猪";


    public final void say() {

        System.out.println("被final修饰的方法不能被重写!");
    }

}


/*

被final修饰的类无法继承

class Student extends Person01{


}
*/
