package Ch4_Control.FindLargestNumber_21;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int counter = 0;
        int largestOne = 0;
        int recentNumber;
        Scanner input = new Scanner(System.in);

        while (counter<10) {
            counter++;
            System.out.println("podaj ile rzeczy sprzedł ten ktoś ");
            recentNumber = input.nextInt();
            if(recentNumber>largestOne) {
                largestOne=recentNumber;
            }
        }
        System.out.printf("najlepszy sprzedawca sprzedał %d artykułów", largestOne);
    }
}
