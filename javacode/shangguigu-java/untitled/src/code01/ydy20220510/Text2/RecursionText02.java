package code01.ydy20220510.Text2;

public class RecursionText02 {
    public static void main(String[] args) {

        //例二，计算1-n的阶乘

        //方法一：
        int sum = 1;
        for (int i = 2; i <= 5; i++) {

            sum *= i;
        }
        System.out.println(sum);

        RecursionText02 text=new RecursionText02();
        System.out.println(text.getSum(5));
    }

//    方法二：递归调用
    public int getSum(int n){

        if(n==1){

            return 1;
        }
        else{

            return n*getSum(n-1);
        }
    }
}
