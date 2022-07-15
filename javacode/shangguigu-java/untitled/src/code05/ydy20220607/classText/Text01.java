package code05.ydy20220607.classText;

//object类是所有类的根父类
public class Text01 {

    //object的方法，构造器（空参）
    // 对象比较

    //doubel a=10.0;
    //int b=10;
    //a==b   ------>返回true
    /*
    若是引用数据类型
    则比较地址值是否相同
  **************************************************
    public boolean equals(Object obj)

        这里面用的是==
        而 String Data File 包装类比较的是内容
        通常比较内容，需要重写

    public boolean equals(Object obj){

        if(this == obj){

            return true;
        }
        if(obj instanceof Customer){

            Customer cust = (Customer)obj;
            if(this.age==obj.age && this.name.equals(cust.name)){

                return true;
            }
            else{

                return false;
            }
            return false;
        }
    }


    //取得Hash码
    public int hashCode(){


    }

    //对象打印时调用
    public String toString(){

         String Data File 包装类  都重写了toString方法
         返回内容，，其他显示的是地址值
    }
  */


}
