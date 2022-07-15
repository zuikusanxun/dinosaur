package code05.ydy20220607.dome;

//x instanceof A：检验x是否为类A的对象，返回值为boolean型。
//    要求x所属的类与类A必须是子类和父类的关系，否则编译错误。
//    如果x属于类A的子类B，x instanceof A值也为true。
public class instanceofText {

    //多态性子类无法调用自己特有的方法
    //内存中实际加载了，但无法调用
    //Person p=new Man();
    //调用子类特有的属性和方法
    //向下转型(父->子）强制类型转换----多态
    //Man p1=(Man)p;
    //在向下转型时，先用instanceof判断是否为对象
    //若a instanceof A 返回true a instanceof B 返回true  则
    //B为A的父类
    //int...arr与int[]等价  ----也可以算做方法重写
    //int[]优先

}
