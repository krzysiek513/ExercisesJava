package Ch6_Method;

import java.util.Scanner;

public class e6_18_DisplayingSquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type size of square");
        int size = input.nextInt();
        squareOfAsterisks(size);

    }
    static void squareOfAsterisks(int size) {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
