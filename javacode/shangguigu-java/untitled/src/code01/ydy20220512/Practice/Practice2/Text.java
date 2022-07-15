//package code.ydy20220512.Practice.Practice2;
//
//import code.ydy20220512.Practice.Practice3.Account;
//import code.ydy20220512.Practice.Practice3.Customer;
//
///*
//（1） 创建一个 Customer ，名字叫 Jane Smith, 他有一个账号为 1000，余额为 2000 元，
//      年利率为 1.23％ 的账户。
//（2） 对 Jane Smith 操作。
//      存入 100 元，再取出 960 元。再取出 2000 元。
//     打印出 Jane Smith 的基本信息
// */
//public class Text {
//
//    public static void main(String[] args) {
//
//        Customer customer = new Customer("Jane", "Smith");
//        Account account = new Account(1000, 2000, 0.0123);
//
//        customer.setAccount(account);
//        customer.getAccount().deposit(100);
//        customer.getAccount().withdraw(960);
//        customer.getAccount().withdraw(2000);
//
//        //输出账户信息
//        /*
//        Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23％, balance is 1140.0
//         */
//        System.out.println("Customer ["+customer.getFirstName()+","+
//                customer.getLastName()+ "] has a account :id is"+
//                customer.getAccount().getId()+","+"annuaInterestRate is " +
//                customer.getAccount().getAnnualInterestRate()*100+"%,"+"balance is "+
//                customer.getAccount().getBalance());
//    }
//}
