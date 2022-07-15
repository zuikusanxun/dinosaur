package code02.ydy20220525.Practice;

public class KidsTest {

    public static void main(String[] args) {

        ManKind m=new ManKind();

        m.setSex(1);
        m.setSalary(1);
        m.manOrWoman();
        m.employeed();

        Kids k=new Kids();
        k.setSex(1);
        k.manOrWoman();
    }
}
