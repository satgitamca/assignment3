
package assinment2.pkg1;

//-Account: Attributes: customer, balance, accNo, interestRate. Methods: deposite(), withdrawl(), getBalance()
class Account
{
String customer;
String balance;
Integer accNo;
float interestRate;

public String deposite()
{
 return "";
}
public String withdrawl()
{
 return "";
}

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getAccNo() {
        return accNo;
    }

    public void setAccNo(Integer accNo) {
        this.accNo = accNo;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
 public String getBalance(Integer acconumber)
 {
    return "";
 }

    public Account(String customer, String balance, Integer accNo, float interestRate) {
        this.customer = customer;
        this.balance = balance;
        this.accNo = accNo;
        this.interestRate = interestRate;
    }

}
class Customer
{
//-Customer: Instance variables: firstName, lastName. 
String firstName;
String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
public class assignment3_1_2 
{
  public static void main(String[] args )
  {
    Account ac=new Account("Satyendra","10000",1001001,9);
    String message=ac.deposite();
    String getbalance=ac.getBalance(ac.getAccNo());
  }
    
    
}
