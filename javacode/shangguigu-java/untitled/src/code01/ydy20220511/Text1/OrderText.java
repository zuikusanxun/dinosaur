package code01.ydy20220511.Text1;

public class OrderText {

    public static void main(String[] args) {

        Order order=new Order();
        order.order=1;
        order.orderPublic=2;
//        order.orderPrivate=3;出了Order类private修饰的就不能使用了

        order.method();
        order.methodPublic();
//        order.methodPrivate();出了Order类private修饰的就不能使用了

    }
}
