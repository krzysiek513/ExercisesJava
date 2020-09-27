package Ch2_Intro.makingDefference;

import javax.swing.*;
import java.util.Scanner;

public class CarPooling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj ile kilometrów przejeżdzasz dzisnnie "); // prompt
        int km = input.nextInt(); // read first number from user
        System.out.print("Podaj koszt paliwa "); // prompt
        float fuelCost = input.nextFloat(); // read second number from user
        System.out.print("Podaj zyrzycie paliwa "); // prompt
        float fuel = input.nextFloat(); // read second number from user
        System.out.print("Dzienna cana parkingu "); // prompt
        int parkingCost = input.nextInt(); // read second number from user
        System.out.print("Dodatkowe dzienne opłaty "); // prompt
        int ex = input.nextInt(); // read second number from user

        float dailyCost = ((km * (fuel/100)) * fuelCost) + parkingCost + ex;

        System.out.printf("Twój dzinny koszt utrzymania auto to %,.2f", dailyCost);

    }
}


//        Total miles driven per day.
//        Cost per gallon of gasoline.
//        Average miles per gallon.
//        Parking fees per day.
//        Tolls per day.