package Ch2_Intro;

import java.util.Scanner;

public class Arithmetic {
        public static void main(String[] args) {
            // create a Scanner to obtain input from the command window
            Scanner input = new Scanner(System.in);

            System.out.print("Enter first integer: "); // prompt
            int number1 = input.nextInt(); // read first number from user

            System.out.print("Enter second integer: "); // prompt
            int number2 = input.nextInt(); // read second number from user

            int sum = number1 + number2; // add numbers, then store total in sum
            int product = number1 * number2;
            int difference = number1 - number2;
            int quotient = number1 / number2;

            System.out.printf("Sum is %d%nProduct is %d%nDifference is %d%nQuotient is %d%n"
                    , sum, product, difference, quotient); // display sum
        }
}
