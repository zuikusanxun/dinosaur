package connector_study.interfacedome;

/*

    接口:interface
    ----比抽象类更抽象的"类"

 */
public class Text {
    public static void main(String[] args) {

        HuaWei p30 = new HuaWei();

        p30.call();
        p30.play();
        p30.mp4();

        System.out.println("---");
        Nokia xiao=new Nokia();

        xiao.call();
        xiao.mp4();
    }
}
