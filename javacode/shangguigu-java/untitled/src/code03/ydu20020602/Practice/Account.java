package code03.ydu20020602.Practice;

//写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
//        账号 id，余额 balance，年利率 annualInterestRate；包含的方法：访问器方法（getter 和
//        setter 方法），返回月利率的方法 getMonthlyInterest()，取款方法 withdraw()，存款方法
//        deposit()。
public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {

    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest() {//返回月利率

        return this.annualInterestRate;
    }

    public void withdraw(double amount) {//取款方法

        if (amount > balance) {

            System.out.println("余额不足！");
        } else {

            balance -= amount;
            //System.out.println("余额为：" + balance);
        }
    }

    public void deposit(double amount) {//存款方法

        if (amount > 0) {

            balance += amount;
            //System.out.println("余额为：" + balance);
        } else {

            System.out.println("请输入正确数额");
        }
    }
}
