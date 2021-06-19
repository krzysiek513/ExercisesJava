package Ch8_Classes;

public class e8_6_SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000f);
        SavingsAccount saver2 = new SavingsAccount(3000f);

        SavingsAccount.modifyInterestRate(0.04f);
        System.out.printf("saver1: %s, saver2: %s%n", saver1, saver2);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        SavingsAccount.modifyInterestRate(0.05f);
        System.out.printf("saver1: %s, saver2: %s%n", saver1, saver2);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("saver1: %s, saver2: %s%n", saver1, saver2);
    }
}
