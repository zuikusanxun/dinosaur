package code01.ydy20220511.Practice;

/*


1. 在前面定义的Person类中添加构造器，利用构造器设置所有人的age属
性初始值都为18。 2. 修改上题中类和构造器，增加name属性,使得每次创建Person对象的同
时初始化对象的age属性值和name属性值。
 */
public class Person {

    private int age;//年龄
    private String name;//姓名


    public Person() {

        age = 18;
        name = "张三";
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        if (age >= 0 && age <= 130) {
            this.age = age;
        } else {

            System.out.println("请重新输入正确年龄！");
            return;
        }
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}