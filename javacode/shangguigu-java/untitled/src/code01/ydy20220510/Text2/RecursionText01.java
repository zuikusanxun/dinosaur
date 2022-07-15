package code01.ydy20220510.Text2;

/*

递归方法的使用：
递归方法：一个方法体内调用它自身。
方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执
行无须循环控制。
递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死
循环。
 */
public class RecursionText01 {

    public static void main(String[] args) {

        //例1，计算1-n的和
//        方式一：
        int sum = 0;
        for (int i = 1; i <= 100; i++) {

            sum += i;
        }
        System.out.println(sum);

        RecursionText01 text=new RecursionText01();
        System.out.println(text.getSum(100));
    }

    //方式二：
    //递归调用：计算1-n的和
    public int getSum(int n) {

        if (n == 1) {

            return 1;
        } else {

            return n+getSum(n-1);
        }
    }
}
