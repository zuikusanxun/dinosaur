package method.ops02;

import java.util.Arrays;

//可变形参
public class Ops {

    public void print(String... name){
        //本质是一个数组
        //name是数组名
        //用于不确定要传入多少个参数

        System.out.println(Arrays.toString(name));
    }
}

class Text{

    public static void main(String[] args) {

        Ops o=new Ops();
        o.print("name01","name02");
    }
}