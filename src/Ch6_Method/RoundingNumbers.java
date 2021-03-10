package Ch6_Method;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type double:");
        double number = input.nextDouble();
        double y = Math.floor(number + 0.5);
        double z = Math.floor(number * 10 + 0.5) / 10;
        double c = Math.floor(number * 100 + 0.5) / 100;
        System.out.printf("oryginal double %f, converted double %.1f, 10x %.2f, 100x %.3f%n%n",
                number, y, z, c);
        System.out.printf("roundToInteger %d%n", roundToInteger(number));
        System.out.printf("roundToTenths %f%n", roundToTenths(number));
        System.out.printf("roundToHundredths %f%n", roundToHundredths(number));
        System.out.printf("roundToThousandths %f%n", roundToThousandths(number));
    }

    static int roundToInteger(double number) {

        int integer = (int) Math.ceil(number);
        return integer;
    }

    static double roundToTenths(double number) {
        double z = Math.floor(number * 10 + 0.5) / 10;
        return z;

    }

    static double roundToHundredths(double number) {
        double c = Math.floor(number * 100 + 0.5) / 100;
        return c;
    }

    static double roundToThousandths(double number) {
        double c = Math.floor(number * 1000 + 0.5) / 1000;
        return c;
    }
}
