package Ch2_Intro;
import java.util.Scanner;
public class ZeroValues_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negative = 0, positive = 0, zero = 0;
        System.out.print("Enter first integer: "); // prompt
        int number1 = input.nextInt(); // read first number from user
        if(number1 > 0) positive++; else if(number1 < 0) negative++; else zero++;

        System.out.print("Enter second integer: "); // prompt
        int number2 = input.nextInt(); // read second number from user
        if(number2 > 0) positive++; else if(number2 < 0) negative++; else zero++;

        System.out.print("Enter third integer: "); // prompt
        int number3 = input.nextInt(); // read second number from user
        if(number3 > 0) positive++; else if(number3 < 0) negative++; else zero++;

        System.out.print("Enter fourth integer: "); // prompt
        int number4 = input.nextInt(); // read second number from user
        if(number4 > 0) positive++; else if(number4 < 0) negative++; else zero++;

        System.out.print("Enter fifth integer: "); // prompt
        int number5 = input.nextInt(); // read second number from user
        if(number5 > 0) positive++; else if(number5 < 0) negative++; else zero++;

        System.out.printf("Ujemnych: %d%nDodatnich: %d%nZerowych: %d%n", negative, positive, zero);
    }
}
