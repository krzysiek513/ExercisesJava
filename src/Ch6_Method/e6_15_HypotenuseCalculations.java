package Ch6_Method;

import java.util.Scanner;

public class e6_15_HypotenuseCalculations  {
    public static void main(String[] args) {
        System.out.println("Type side1 and side 2 in right tringle");
        Scanner input = new Scanner(System.in);
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        System.out.printf("Hypotenuse for that tringle = %.2f", hypotenuse(side1, side2));
    }

    static double hypotenuse(double s1, double s2) {
        return Math.sqrt(Math.pow(s1, 2) + Math.pow(s2,2));
    }
}
//    Triangle	Side 1	Side 2
//        1	    3.0 	4.0
//        2 	5.0 	12.0
//        3	    8.0	    15.0