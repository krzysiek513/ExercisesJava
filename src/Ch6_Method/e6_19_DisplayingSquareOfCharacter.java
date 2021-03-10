package Ch6_Method;

import java.util.Scanner;

public class e6_19_DisplayingSquareOfCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type size of square");
        int size = input.nextInt();
        System.out.println("Chose a character");
        char fill = input.next().charAt(0);
        squareOfAsterisks(size, fill);

    }
    static void squareOfAsterisks(int size, char character) {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
