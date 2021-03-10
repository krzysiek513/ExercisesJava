package Ch6_Method;

import java.util.Scanner;

public class e6_20_CircleArea {
    public static void main(String[] args) {
        System.out.println("Type the circles radius");
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        System.out.printf("cercle area are %.2f", circleArea(radius));
    }
    static double circleArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
