package Ch6_Method;

import java.util.Scanner;

public class e6_14_Exponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type base and exponent");
        int base = input.nextInt();
        int exponent = input.nextInt();
        System.out.printf("Power of that numbers are: %d", integerPower(base, exponent));;
    }

    static int integerPower(int base, int exponent) {
        int result = 1;
        while(exponent!=0) {
            result *= base;
            exponent--;
        }
        return result;
    }
}
