package Ch6_Method;

import java.util.Scanner;

public class e6_17_EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check the number is even");
        System.out.println("Type number");
        int in = input.nextInt();
        System.out.printf("%b%n", isEven(in));

    }

    static boolean isEven(int integer) {
        return integer % 2 ==0;
    }
}
