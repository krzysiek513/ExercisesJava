package Ch2_Intro;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: "); // prompt
        int number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        int number2 = input.nextInt(); // read second number from user

        if (number1 == number2) {
            System.out.printf("These numbers are equal%n");
    }


        if (number1 < number2) {
        System.out.printf("%d is larger%n", number2);
    }

        if (number1 > number2) {
        System.out.printf("%d is larger%n", number1);
    }
    }
}
