package Ch6_Method;

import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe godzin");
        int hoors = input.nextInt();
        System.out.printf("Twoja opłata wynosi $%.2f", calculateCharges(hoors));
    }

    static float calculateCharges(int hours) {
        float price;
        if(hours<=3)
            price =2f;
        else if( hours <= 19)
            price = (float) hours * 0.5f + 0.5f;
        else price = 10f;

        return price;
    }
}
