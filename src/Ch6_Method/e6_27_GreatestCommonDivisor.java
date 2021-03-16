package Ch6_Method;

import java.util.Scanner;

public class e6_27_GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Type two natural numbers");
        Scanner input = new Scanner(System.in);
        int firstNr = input.nextInt();
        int secondNr = input.nextInt();
        System.out.printf("Greatest common divisor are %d", gcd(firstNr, secondNr));
    }

    static int gcd(int a, int b) {
        int mniejsza;
        int wieksza;
        int tmp;
        if (a > b) {
            wieksza = a;
            mniejsza = b;
            while (!(wieksza == mniejsza)) {
                wieksza = wieksza - mniejsza;
                if (mniejsza > wieksza) {
                    tmp = wieksza;
                    wieksza = mniejsza;
                    mniejsza = tmp;
                }
            }
            return wieksza;
        } else {
            wieksza = b;
            mniejsza = a;
            while (!(wieksza == mniejsza)) {
                wieksza = wieksza - mniejsza;
                if (mniejsza > wieksza) {
                    tmp = wieksza;
                    wieksza = mniejsza;
                    mniejsza = tmp;
                }
            }
            return wieksza;
        }
    }
}
