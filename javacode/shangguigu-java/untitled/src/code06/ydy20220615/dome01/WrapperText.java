package code06.ydy20220615.dome01;

//包装类
public class WrapperText {

    public static void main(String[] args) {

        text1();

    }

    public static void text1() {

        int num1 = 10;

        //基本数据类型-->包装类
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());

        Boolean b1 = new Boolean("true213");//忽略true大小写都为true
        System.out.println(b1.toString());

        Order o = new Order();
        System.out.println(o.b);
        System.out.println(o.bb);

        //包装类-->基本数据类型   eg.27行  .xxxValue
        Integer m = new Integer(10);
        int m_value = m.intValue();
        System.out.println(m_value);


        //自动装箱  基本数据类型-->包装类
        int num2 = 10;
        Integer in2 = num2;


        //自动拆箱  包装类-->基本数据类型
        int num3 = in2;


        //基本数据类型,包装类-->String类型

        //方法一
        int num4 = 10;
        String str1 = num4 + "";

        //方法二----使用String.valueOf()方法
        int num5=10;
        String str2=String.valueOf(num5);

        Integer in3=new Integer(10);
        String str3=String.valueOf(in3);


        //String类型-->基本数据类型,包装类  调用包装类的方法：.parseXxx(String s)

        String str4="123";
        int num6=Integer.parseInt(str4);
        System.out.println(num6);

    }

    static class Order {

        boolean b;
        Boolean bb;
    }
}


