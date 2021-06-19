package Ch7_Array.e7_19_AirlineReservationsSystem;

public class Plane {
    boolean[] seat = new boolean[10];

    void showSeat() {
        System.out.printf("%nSeats in First class:");
        for (int aClass = 0; aClass < 5; aClass++){
            System.out.printf("%n seat %d is %s", aClass, seat[aClass] ? "reserved" : "free");
        }
        System.out.printf("%nSeats in economy class:");
        for (int bClass = 5; bClass < 10; bClass++){
            System.out.printf("%n seat %d is %s", bClass, seat[bClass] ? "reserved" : "free");
        }
    }

    boolean checkASeat() {
        boolean free = false;
        for (int index = 0; index < 5; index++) {
            if (!seat[index]) {
                System.out.printf("%nSeat nr %d is free", index);
                free = true;
            }
        }
        return free;
    }

    boolean checkBSeat() {
        boolean free = false;
        for (int index = 5; index < 10; index++) {
            if (!seat[index]) {
                System.out.printf("%nSeat nr %d is free", index);
                free = true;
            }
        }
        return free;
    }

    boolean reserveSeat(int assign, boolean firstClass) {
        if (firstClass) {
            if (!seat[assign]) {
                seat[assign] = true;
                System.out.printf("First class, Seat nr %d reserved.", assign);
                return true;
            }
            else {
                System.out.printf("Seat nr %d is already reserved. Chose new one", assign);
                return false;
            }
        } else {
            if (!seat[assign]) {
                seat[assign] = true;
                System.out.printf("Economic class. Seat nr %d reserved.", assign);
                return true;
            }
            else {
                System.out.printf("Seat nr %d is already reserved. Chose new one", assign);
                return false;
            }
        }
    }
}
