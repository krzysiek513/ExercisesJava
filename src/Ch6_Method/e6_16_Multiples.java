package Ch6_Method;

import java.util.Scanner;

public class e6_16_Multiples {
    public static void main(String[] args) {
        System.out.println("podaj dwie wartości");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.printf(" %b ", isMultiple(a, b));
    }

    static boolean isMultiple(int first, int second) {
        return first % second == 0;
    }
}
