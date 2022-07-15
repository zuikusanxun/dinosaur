package java_api_study.class_study;

public class OuterClass {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //内部类
    public class InnerClass {

        void say() {

            System.out.println(OuterClass.this.name);//====等价于name(可以省略)---在内部内中可以访问外部类的私有属性
        }
    }

    //静态内部类
    public static class InnerClass01 {

        public void say() {

            //在内部类中是可以访问外部类中的私有属性的,还可以省略 外部类类名.this
            System.out.println("name=xxx");
        }
    }
}
