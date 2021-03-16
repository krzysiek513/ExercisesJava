package Ch6_Method;

import java.util.Scanner;

public class e6_32_DistanceBetweenPoints {
    public static void main(String[] args) {
        System.out.println("type x1 nad y1");
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        System.out.println("type x2 nad y2");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        System.out.printf("Distance between that two points are %.2f", distance (x1, y1, x2, y2));
    }

    static double distance (int x1, int y1, int x2, int y2) {
        if (x1 > x2) {
            if (y1 > y2){
                return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            } else if (y1 < y2) {
                return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y2 - y1, 2));
            } else return x1 - x2;
        } else if (x1 < x2) {
            if (y1 > y2){
                return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y1 - y2, 2));
            } else if (y1 < y2) {
                return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            } else return x2 - x1;
        } else {
            if (y1 > y2) return y1 - y2;
            else if (y1 < y2) return y2 - y1;
            else return 0;
        }

    }
}
