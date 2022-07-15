package code06.ydy20220615.dome01;

//包装类面试题
public class InterviewText {

    public static void main(String[] args) {

        //三目运算符 ：左右类型要统一  自动类型提升
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);//1.0
        Object o2;
        if (true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);//1

        method1();
    }


    public static void method1() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//==对于引用数据类型比较地址---false
        Integer m = 1;
        Integer n = 1;//------>-128---127
        //Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[]，
        //保存了-128~127范围的整数，如果我们使用自动装箱的方式，给Integer赋值在
        //-128~127范围时，可以直接使用数组中的元素，不用再去new了，目的：提高效率
        //超过128之后，等效于创建了一个Integer对象
        System.out.println(m == n);//
        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//
    }

    //println(m)---->若m为char型数组输出数组，，否则输出地址值
}
