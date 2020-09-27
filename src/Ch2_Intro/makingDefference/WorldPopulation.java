package Ch2_Intro.makingDefference;

import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) {
        long worldPopulation = 7594000000L;
        float annualGrow = 1.011F;

        Scanner input = new Scanner(System.in);

        System.out.println("Za ile lat chcesz zobaczyć średnia populacje świata?");//???
        int howMany = input.nextInt();

        System.out.printf("średni wynik to: %,.0f", worldPopulation * ( annualGrow * howMany));

    }
}
// WorldPopulation 7 594 000 000 000
// annual world population growth 1.1%