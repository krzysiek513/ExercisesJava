package Ch6_Method;

import java.util.Scanner;

public class e6_23_FindMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type three double numbers");
        double fi = input.nextDouble();
        double se = input.nextDouble();
        double th = input.nextDouble();
        System.out.printf("Minimal number of these are %.2f", minimum3(fi, se ,th));

    }

    static double minimum3(double first, double second, double third) {
        double minimum = Math.min(first, second);
        minimum = Math.min(minimum, third);
        return minimum;
    }
}
