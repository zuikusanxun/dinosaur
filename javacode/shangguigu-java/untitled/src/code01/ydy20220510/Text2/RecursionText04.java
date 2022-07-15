package code01.ydy20220510.Text2;

/*

输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
1 1 2 3 5 8 13 21 34 55
规律：一个数等于前两个数之和
要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
 */
public class RecursionText04 {
    public static void main(String[] args) {

        RecursionText04 text = new RecursionText04();
        for (int i = 1; i <10 ; i++) {

            System.out.print(text.F(i)+" ");
        }
    }

    public int F(int n) {

        if (n == 1) {

            return 1;
        } else if (n == 2) {

            return 1;
        } else {

            return F(n - 1) + F(n - 2);
        }
    }
}
