package Ch4_Control;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class NestedElseProblem_26 {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner input = new Scanner(System.in);
        System.out.println("wprowadz x: ");
        x = input.nextInt();
        System.out.println("wprowadz y: ");
        y = input.nextInt();
        if (x > 5)
            if (y > 5)
                System.out.println("x and y are > 5");
            else
                System.out.println("x is <= 5");
        System.out.println("----lub----");
        System.out.println("wprowadz x: ");
        x = input.nextInt();
        System.out.println("wprowadz y: ");
        y = input.nextInt();
        if (x > 5) {
            if (y > 5)
                System.out.println("x and y are > 5");
        }else
                System.out.println("x is <= 5");


    }
}
