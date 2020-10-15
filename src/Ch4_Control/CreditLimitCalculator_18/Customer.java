package Ch4_Control.CreditLimitCalculator_18;

public class Customer {
    int accountNumber;
    int monthlyBalance;
    int itemCharged;
    int creditApplied;
    int allowCredit;

    public Customer(int accountNumber, int monthlyBalance, int itemCharged, int creditApplied, int allowCredit) {
        this.accountNumber = accountNumber;
        this.monthlyBalance = monthlyBalance;
        this.itemCharged = itemCharged;
        this.creditApplied = creditApplied;
        this.allowCredit = allowCredit;
    }

    public int newBalance() {
        int newBal = monthlyBalance + creditApplied - itemCharged;
        if(newBal>=0) {
            System.out.printf("nowy limit %d", newBal);
            return  newBal;
        } else {
            System.out.printf("przekroczono limit o %d, odmowa zakupu\n", -newBal);
            return monthlyBalance;
        }

    }
}
