package Ch7_Array;

import java.util.Arrays;
import java.util.Scanner;

public class e7_12_DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int index = 0;
        int location;
        int[] table = new int[5];
        displayArray(table, "Initial arrray");

        while (index < 5){
            number = 0;
            while (number < 10 || number > 100) {
                System.out.printf("%ntype number from 10 to 100 inclusive%n");
                number = input.nextInt();
            }
            location = Arrays.binarySearch(table, number);
            if (location >= 0) {
                System.out.printf("Found on %d location", location);
            } else {
                    table[index] = number;
                    System.out.printf("%n number %d added to array", number);
                    index++;
            }

        }
        displayArray(table, "array after added five different numbers");


    }

    static void displayArray(int[] array, String descrotion) {
        System.out.printf("%n%s: ", descrotion);
        for (int value : array) {
            System.out.printf("%d ", value);
        }
    }
}
