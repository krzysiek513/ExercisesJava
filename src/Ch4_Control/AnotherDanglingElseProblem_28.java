package Ch4_Control;

import java.util.Scanner;

public class AnotherDanglingElseProblem_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("podaj x i y");
        int x = 5;//input.nextInt();
        int y = 8;//input.nextInt();
        //1
        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
            else
                System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");

        System.out.println("----2------");//2
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
            }
        }
        else {
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }

        System.out.println("-----3-----");//3
        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
            else {
                System.out.println("#####");
                System.out.println("$$$$$");
            }
        System.out.println("&&&&&");


        System.out.println("-----4-----");//4
        //System.out.println("podaj y");
        y = 7;//input.nextInt();
        if (y == 8) {
            if (x == 5)
                System.out.println("@@@@@");
        }
        else
            System.out.println("#####");
        System.out.println("$$$$$");
        System.out.println("&&&&&");

    }
}
