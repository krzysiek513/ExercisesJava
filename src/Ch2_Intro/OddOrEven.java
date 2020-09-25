package Ch2_Intro;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number % 2 == 0) System.out.println(number + " jest parzyste");
        else System.out.printf("%d jest nieparzyste", number);
    }

}
