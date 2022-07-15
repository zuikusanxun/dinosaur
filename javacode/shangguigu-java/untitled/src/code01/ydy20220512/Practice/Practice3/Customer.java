package code01.ydy20220512.Practice.Practice3;

public class Customer {

    private String firstName;
    private String lastName;
    private Account account;//另一个类作为属性

    public Customer(String firstName,String lastName){

        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
