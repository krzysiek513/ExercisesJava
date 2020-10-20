package Ch4_Control;

import java.util.Scanner;

public class AnotherDanglingElseProblem_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj x i y");
        int x, y;
        x = input.nextInt();
        y = input.nextInt();
        if (x < 10){
            if (y > 10){
                System.out.println("*****");}
            else
                System.out.println("#####");}
        System.out.println("$$$$$");

        if (x < 10) {
            if (y > 10) {
                System.out.println("*****");
            }
            else {
                System.out.println("#####");
            }
        }
        System.out.println("$$$$$");
        if (x < 10) {
            if (y > 10) {
                System.out.println("*****");
            }
            System.out.println("#####");
        }
        else {
            System.out.println("$$$$$");
        }

    }
}
