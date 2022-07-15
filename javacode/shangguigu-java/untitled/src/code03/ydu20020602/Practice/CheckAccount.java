package code03.ydu20020602.Practice;

//可透支的账户
public class CheckAccount extends Account {

    private double overdraft;// 代表可透支限额


    public CheckAccount() {


    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {

        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {

        return overdraft;
    }

    public void setOverdraft(double overdraft) {

        this.overdraft = overdraft;
    }

    //    如果（取款金额<账户余额），
//    可直接取款
//    如果（取款金额>账户余额），
//    计算需要透支的额度
//    判断可透支额 overdraft 是否足够支付本次透支需要，如果可以
//    将账户余额修改为 0，冲减可透支金额
//            如果不可以
//    提示用户超过可透支额的限额
    public void withdraw(double amount) {

        if (amount <= getBalance()) {//余额够的情况下

            super.withdraw(amount);
        } else if (overdraft >= amount - getBalance()) {

            //计算需要透支的额度
            overdraft -= (amount - getBalance());
            //System.out.println("可透支金额为：" + overdraft);
            setBalance(0);
        } else {

            System.out.println("用户超过可透支金额");
        }
    }
}
