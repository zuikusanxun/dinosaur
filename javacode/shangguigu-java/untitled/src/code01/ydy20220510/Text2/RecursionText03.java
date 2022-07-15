package code01.ydy20220510.Text2;

/*

已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0
的整数，求f(10)的值。
 */
public class RecursionText03 {
    public static void main(String[] args) {


        RecursionText03 text = new RecursionText03();
        System.out.println(text.f(10));
    }

    public int f(int n) {

        if (n == 0) {

            return 1;
        } else if (n == 1) {

            return 4;
        } else {

            return 2*f(n-1)+f(n-2);
        }
    }
}
