package com.ydy0410;

public class lianxi04__duixiangshuzu {

    public static void main(String[] args) {

        //对象类数组
        student[] stus = new student[20];
        student stu = new student();
        //给数组元素赋值
        stu.fuzhi(stus);

        stu.info1(stus);
        //打印出不同年级的学生信息
        System.out.println("完成打印出三年级的学生信息");

        stu.shouStus(stus,3);
        System.out.println("完成打印出三年级的学生信息");

        //使用冒泡排序将学生按成绩排名
        stu.sort(stus);
        //遍历
        stu.info1(stus);
        System.out.println("完成使用冒泡排序将学生按成绩排名");
    }
}

class student {


    int number;       //学号
    int state;        //年级
    int score;        //成绩

    //给数组元素赋值

    /**
    * @Description: 
    * @Param: [stus]
    * @return: void
    * @Author: 最酷三旬
    * @Date: 2022/4/10
    */
    public void fuzhi(student[] stus) {

        for (int i = 0; i < stus.length; i++) {

            //给数组元素赋值
            stus[i] = new student();
            //给元素的属性赋值
            //给student对象属性赋值
            stus[i].number = (i + 1);
            //年级~【1-6】
            stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            //成绩【0-100】---[a,b]----(b-a+1    +a)
            stus[i].score = (int) (Math.random() * (100 - 0 + 1) + 0);

        }
    }

    //显示学生信息的方法

    /**
    * @Description: 
    * @Param: [stus]
    * @return: void
    * @Author: 最酷三旬
    * @Date: 2022/4/10
    */
    public void info1(student[] stus) {

        //遍历学生数组
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i].number + " " + stus[i].state + " " + stus[i].score);
        }
    }

    public String info2() {

        return number + " " + state + " " + score;
    }

    //打印出不同年级的学生信息

    /**
    * @Description: 
    * @Param: [stus, state]
    * @return: void
    * @Author: 最酷三旬
    * @Date: 2022/4/10
    */
    public void shouStus(student[] stus,int state) {
        for (int i = 0; i < stus.length; i++) {

            if (stus[i].state == 3) {

                System.out.println(stus[i].info2());
            }
        }
    }

    //使用冒泡排序将学生按成绩排名

    /**
    * @Description: 
    * @Param: [stus]
    * @return: void
    * @Author: 最酷三旬
    * @Date: 2022/4/10
    */
    public void sort(student[] stus) {

        for (int i = 0; i < stus.length - 1; i++) {

            for (int j = 0; j < stus.length - i - 1; j++) {

                if (stus[j].score > stus[j + 1].score) {

                    student t = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = t;
                }
            }
        }
    }
}
