package code01.ydy20220512.Practice.Practice3;

/*
 addCustomer 方法必须依照参数（姓，名）构造一个新的 Customer 对象，然后把它放到 customer 数组中。
   还必须把 numberOfCustomer 属性的值加 1。
 getNumOfCustomers 方法返回 numberofCustomers 属性值。
 getCustomer 方法返回与给出的 index 参数相关的客户。
 */

public class Bank {

    private Customer[] customers;//可以存放多个对象的数组
    private int numberOfCustomer;//记录客户的个数--初始化为0

    public Bank() {

        customers=new Customer[10];
    }

    //添加客户
    public void addCustomer(String firstName, String lastName) {

        Customer customer=new Customer(firstName,lastName);
        customers[numberOfCustomer]=customer;
        numberOfCustomer++;
    }

    //获取用户个数
    public int getnumberOfCustomer() {

        return numberOfCustomer;
    }

    //获取指定位置上的用户
    public Customer getCustomer(int index) {

        if(index>=0 && index < numberOfCustomer){

            return customers[index];
        }
        else{

            return null;
        }
    }

}
