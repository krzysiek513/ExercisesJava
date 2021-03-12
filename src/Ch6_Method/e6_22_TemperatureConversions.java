package Ch6_Method;

import java.util.Scanner;

public class e6_22_TemperatureConversions {
    public static void main(String[] args) {
        System.out.println("Choose what you wanna do, what temperature you have?" +
                "\n celsius or fahrenheit");
        Scanner input = new Scanner(System.in);
        char tempe = input.next().charAt(0);
        System.out.println("type your temperature");
        double temperature = input.nextDouble();
        switch (tempe) {
            case 'c':
                System.out.printf("You type temperature in celsius %.1f but in fahrenheit are %.1f%n", temperature, celsius(temperature));
                break;
            case 'f':
                System.out.printf("You type temperature in fahrenheit %.1f but in celsius are %.1f%n", temperature, fahrenheit(temperature));
                break;
        }
    }
    static double celsius (double fahrenheit) {
        return  5.0 / 9.0 * (fahrenheit - 32);
    }
    static double fahrenheit (double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }

}
