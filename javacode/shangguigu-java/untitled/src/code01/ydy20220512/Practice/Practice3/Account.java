package code01.ydy20220512.Practice.Practice3;

public class Account {

    private double balance;//余额

    public Account(double init_balance){

        this.balance=init_balance;
    }

    public double getBalance(){

        return balance;
    }
    //存款
    public void deposit(double amount){

        if(amount>0){

            balance+=amount;
            System.out.println("存款成功 "+amount);
        }
    }

    //取款
    public void  withdraw(double amount){

        if(amount>balance){

            System.out.println("余额不足，无法取款");
            return;
        }
        else{

            balance-=amount;
            System.out.println("取成功 "+amount);

        }
    }
}
