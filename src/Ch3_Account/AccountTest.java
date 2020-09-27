package Ch3_Account;
// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account karina = new Account("Karina Szkopińska", 50.00);
        Account piotrek = new Account("Pioter Szkopiński", -7.53);


        // display initial balance of each object
        System.out.printf("%s balance: $%.2f%n",
                piotrek.getName(), piotrek.getStatus());
        System.out.printf("%s balance: $%.2f%n%n",
                karina.getName(), karina.getStatus());
/*
        int Withdrawal(account1.name ){

        }*/
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for piotrek: "); // prompt
        double depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to piotrek balance%n%n",
                depositAmount);
        piotrek.deposit(depositAmount); // add to account1’s balance

        // display balances
        System.out.printf("%s balance: $%.2f%n",
                piotrek.getName(), piotrek.getStatus());
        System.out.printf("%s balance: $%.2f%n%n",
                karina.getName(), karina.getStatus());

        System.out.print("Enter deposit amount for karina: "); // prompt
        depositAmount = input.nextDouble(); // obtain user input
        System.out.printf("%nadding %.2f to karina balance%n%n",
                depositAmount);
        karina.deposit(depositAmount); // add to account2 balance

        // display balances
        System.out.printf("%s balance: $%.2f%n",
                piotrek.getName(), piotrek.getStatus());
        System.out.printf("%s balance: $%.2f%n%n",
                karina.getName(), karina.getStatus());
    }
}
