package code02.ydy20220525.Practice;

public class Kids extends ManKind{

    private int yearsOld;

    public Kids() {
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge(){

        System.out.println("yearsOld"+"="+yearsOld);
    }
}
