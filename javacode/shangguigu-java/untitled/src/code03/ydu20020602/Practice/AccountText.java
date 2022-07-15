package code03.ydu20020602.Practice;

public class AccountText {

    public static void main(String[] args) {

        Account acc = new Account(1122, 20000, 0.045);
        System.out.println("id为：" + acc.getId());
        System.out.println("余额为：" + acc.getBalance());
        System.out.println("月利率为：" + (acc.getAnnualInterestRate()) * 100 + "%");

        CheckAccount check = new CheckAccount(1122, 20000, 0.045, 5000);

        check.withdraw(5000);
        System.out.println("余额为：" + check.getBalance());
        System.out.println("可透支金额为：" + check.getOverdraft());

        check.withdraw(5000);
        System.out.println("余额为：" + check.getBalance());
        System.out.println("可透支金额为：" + check.getOverdraft());

        check.withdraw(5000);
        System.out.println("余额为：" + check.getBalance());
        System.out.println("可透支金额为：" + check.getOverdraft());

        check.withdraw(5000);
        System.out.println("余额为：" + check.getBalance());
        System.out.println("可透支金额为：" + check.getOverdraft());

        check.withdraw(5000);
        System.out.println("余额为：" + check.getBalance());
        System.out.println("可透支金额为：" + check.getOverdraft());

    }
}
