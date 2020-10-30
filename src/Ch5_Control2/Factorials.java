package Ch5_Control2;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        System.out.println("silnie z ilu chcesz policzyc? ");
        Scanner input = new Scanner(System.in);
        int factorialFrom = input.nextInt();
        long factorial = 1;
        for (int counter = 1; counter <= factorialFrom; counter++){
            factorial= factorial * counter;
        }
        System.out.printf("silnie z %d to %d ", factorialFrom, factorial);
    }
}
