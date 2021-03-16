package Ch6_Method;

import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

public class e6_28_QualityPoints {
    public static void main(String[] args) {
        System.out.println("Type student's average");
        Scanner input = new Scanner(System.in);
        int average = input.nextInt();
        System.out.printf("Student quality are %d", qualityPoints(average));
    }

    static int qualityPoints(int points) {
        if (points >= 90) {
            return 4;
        } else if (points >= 80) {
            return 3;
        } else if (points >= 70) {
            return 2;
        } else if (points >= 60) {
            return 1;
        } else return 0;
    }
}
