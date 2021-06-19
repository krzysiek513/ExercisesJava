package Ch8_Classes;
//todo, can be better
public class SavingsAccount {
    private static float annualInterestRate;
    private float savingsBalance;

    public SavingsAccount(float savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    @Override
    public String toString() {
        return String.format("SavingsAccount: %.2f", savingsBalance);
    }

    public float calculateMonthlyInterest() {
        float monthly = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthly;
        return monthly;
    }

    static void modifyInterestRate(float newRate) {
        annualInterestRate = newRate;
    }

}
