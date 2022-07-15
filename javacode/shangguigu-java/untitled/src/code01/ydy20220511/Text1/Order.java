package code01.ydy20220511.Text1;

public class Order {

    private int orderPrivate;
    int order;
    public int orderPublic;

    private void methodPrivate(){

        orderPrivate=1;
        order=2;
        orderPublic=3;
    }

    void method(){


        orderPrivate=11;
        order=22;
        orderPublic=33;
    }

    public void methodPublic(){

        orderPrivate=111;
        order=222;
        orderPublic=333;
    }
}
