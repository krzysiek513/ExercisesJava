package Ch6_Method;

import java.util.Scanner;

public class e6_17_EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check if the number is even");
        String game = "yes";
        while (game.equals("yes")) {
            System.out.println("Type number");
            int in = input.nextInt();
            System.out.printf("%b%n", isEven(in));
            System.out.println("Do you want check more? (yes)");
            game = input.next();
            System.out.println();
        }

    }

    static boolean isEven(int integer) {
        return integer % 2 ==0;
    }
}
