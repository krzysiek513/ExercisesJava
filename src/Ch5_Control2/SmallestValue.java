package Ch5_Control2;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        System.out.println("ile liczb chcesz dodać: ");
        Scanner input = new Scanner(System.in);
        int values = input.nextInt();
        int value[] = new int[values];
        for (int counter = 0; counter < values;counter++) {
            System.out.println("podaj liczbe: ");
            value[counter] = input.nextInt();
        }
        int najmniejsza = value[0];
        for (int counter = 0; counter < values;counter++) {
            if(value[counter]<najmniejsza){
                najmniejsza = value[counter];
            }
        }
        System.out.printf("najmniejsza liczba to %d", najmniejsza);
    }
}
