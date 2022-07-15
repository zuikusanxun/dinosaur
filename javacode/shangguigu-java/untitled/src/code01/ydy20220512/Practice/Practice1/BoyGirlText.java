package code01.ydy20220512.Practice.Practice1;

public class BoyGirlText {

    public static void main(String[] args) {

        Boy boy=new Boy(21,"张三");
        boy.shout();
        System.out.println(boy.getName());
        Girl girl=new Girl(18,"李四");
        girl.marry(boy);

        Girl girl1=new Girl(19,"哈哈");

        int compare=girl.compare(girl1);
        if(compare>0){

            System.out.println(girl.getName()+"大");
        }
        else{

            System.out.println(girl1.getName()+"大");
        }
    }
}
