package Ch3_Account;
// Fig. 3.8: Account.java
// Account class with a double instance variable balance and a constructor
// and deposit method that perform validation.

public class Account { // private/public class Order {
    private String name; // instance variable
    private double status; //
    // private boolean done; // instance variable

    // method that deposits (adds) only a valid amount to the balance
    public void Withdrawal (double WithdrawalAmount) {
        if (status > 0.0) { // if the depositAmount is valid
            status = status - WithdrawalAmount; // add it to the balance
            System.out.println("kasa zabrana!!!!");
        }}

    // Account constructor that receives two parameters
    public Account(String name, double balance) {
        this.name = name; // assign name to instance variable name

        // validate that the balance is greater than 0.0; if it's not,
        // instance variable balance keeps i
        // ts default initial value of 0.0
        if (balance > 0.0) { // if the balance is valid
            this.status = balance; // assign it to instance variable balance
        }
    }

    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { // if the depositAmount is valid
            status = status + depositAmount; // add it to the balance
        }
        if (depositAmount<0)
        {
            System.out.println("Błąd!!!");
        }
    }


    // method returns the account balance
    public double getStatus() {
        return status;
    }

    // method that sets the name
    public void setName(String name) {
        this.name = name;
    }

    // method that returns the name
    public String getName() {
        return name;
    }
}
