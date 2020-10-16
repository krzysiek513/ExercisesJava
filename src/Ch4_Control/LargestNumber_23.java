package Ch4_Control;

import java.util.Scanner;

public class LargestNumber_23 {
    public static void main(String[] args) {
        int counter = 0;
        int largestOne = 0;
        int largestTwo = 0;
        int recentNumber = 0;
        Scanner input = new Scanner(System.in);

        while (counter<10) {
            counter++;
            System.out.println("podaj ile rzeczy sprzedł ten ktoś ");
            recentNumber = input.nextInt();
            if(recentNumber>largestOne) {
                largestTwo = largestOne;
                largestOne = recentNumber;
            }
        }
        System.out.printf("najlepszy sprzedawca sprzedał %d artykułów a za nim %d"
                , largestOne, largestTwo);
    }
}
