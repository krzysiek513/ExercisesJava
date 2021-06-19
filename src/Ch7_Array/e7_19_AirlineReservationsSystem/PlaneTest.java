package Ch7_Array.e7_19_AirlineReservationsSystem;

import java.util.Scanner;

public class PlaneTest {
    public static void main(String[] args) {
        Plane aircraft = new Plane();
        boolean quit = false;
//        aircraft.showSeat();
//        aircraft.checkASeat();
//        aircraft.checkBSeat();
        do {
            System.out.printf("%n Please type 1 for First class.%n Please type 2 for Economy. ");
            Scanner input = new Scanner(System.in);
            String type = input.next();
            if (type.equals("1")) {
                if (aircraft.checkASeat()) {
                    System.out.printf("%n Chose your seat. ");
                    while (!aircraft.reserveSeat(input.nextInt(), true));
                } else {
                    System.out.printf("%nNo First class seats. Do you want seat in Economy? (yes) ");
                    if (input.next().equals("yes")) {
                        if (aircraft.checkBSeat()) {
                            System.out.printf("%n Chose your seat. ");
                            while (!aircraft.reserveSeat(input.nextInt(), false)) ;
                        } else System.out.printf("%n Sorry, no seats. Next flight leaves in 3 hours.");
                    } else System.out.printf("%n Next flight leaves in 3 hours.");
                }
            } else if (type.equals("2")) {
                if (aircraft.checkBSeat()) {
                    System.out.printf("%n Chose your seat. ");
                    while (!aircraft.reserveSeat(input.nextInt(), false)) ;
                }  else {
                    System.out.printf("%nNo Economy seats. Do you want seat in First class? (yes) ");
                    if (input.next().equals("yes")) {
                        if (aircraft.checkASeat()) {
                            System.out.printf("%n Chose your seat. ");
                            while (!aircraft.reserveSeat(input.nextInt(), true)) ;
                        } else System.out.printf("%n Sorry, no seats. Next flight leaves in 3 hours.");
                    } else System.out.printf("%n Next flight leaves in 3 hours.");
                }
            } else System.out.printf("%n wrong answer!");
        } while (!quit);
    }
}
