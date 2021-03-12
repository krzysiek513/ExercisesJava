package Ch6_Method;

import java.util.Scanner;

public class e6_21_SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type two integets for 1 to 99999");
        int number = input.nextInt();
        int number2 = input.nextInt();
        System.out.printf("Integer prat from divide: %d / %d = %d%n", number, number2, integerPart(number, number2));
        System.out.printf("Remainder from divide: %7d / %d = %d%n", number, number2, remainder(number, number2));
        System.out.printf("Separate digits from %d are: %s", number, displayDigits(number));
    }

    static int integerPart(int a, int b) {
        return a / b;
    }

    static int remainder(int a, int b) {
        return a % b;
    }

    static String displayDigits(int x) {
        int first = 0;
        int secund = 0;
        int third = 0;
        int fourth = 0;
        int fifth = 0;
        if (x >= 10000 & x < 99999){
            first = x / 10000;
            secund = x / 1000 % 10;
            third = x / 100 % 10;
            fourth = x / 10 % 10;
            fifth = x % 10;
            return String.format("%5d   %d   %d   %d   %d", first, secund, third, fourth, fifth);
        } else if ( x <= 9999 & x > 1000) {
            first = x / 1000;
            secund = x / 100 % 10;
            third = x / 10 % 10;
            fourth = x % 10;
            return String.format("%5d   %d   %d   %d", first, secund, third, fourth);
        } else if ( x <= 999 & x > 100) {
            first = x / 100;
            secund = x / 10 % 10;
            third = x % 10;
            return String.format("%5d   %d   %d", first, secund, third);
        } else if ( x <= 99 & x > 10) {
            first = x / 10;
            secund = x % 10;
            return String.format("%5d   %d", first, secund);
        } else {
            return String.format("%5d", x);
        }
    }
}
