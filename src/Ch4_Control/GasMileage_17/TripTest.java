package Ch4_Control.GasMileage_17;

import java.util.Scanner;

public class TripTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Trasa numer 1\nPodaj przejechane kilometry");
        int mile = input.nextInt();
        System.out.println("Podaj zurzyte paliwo");
        int gallon = input.nextInt();
        Trip trip1 = new Trip(mile,gallon);

        System.out.println("\nTrasa numer 2\nPodaj przejechane kilometry");
        mile = input.nextInt();
        System.out.println("Podaj zurzyte paliwo");
        gallon = input.nextInt();
        Trip trip2 = new Trip(mile,gallon);

        System.out.println("\nTrasa numer 3\nPodaj przejechane kilometry");
        mile = input.nextInt();
        System.out.println("Podaj zurzyte paliwo");
        gallon = input.nextInt();
        Trip trip3 = new Trip(mile,gallon);


        System.out.printf("auto przejezdza na trasie nr 1 %.2f km na litr\n", trip1.getDistance());
        System.out.printf("auto przejezdza na trasie nr 2 %.2f km na litr\n", trip2.getDistance());
        System.out.printf("auto przejezdza na trasie nr 3 %.2f km na litr\n", trip3.getDistance());

        System.out.printf("średnia przejeżdża %.2f km na litr", (trip1.getDistance() + trip2.getDistance() +
                trip3.getDistance()) / 3);
    }

}
