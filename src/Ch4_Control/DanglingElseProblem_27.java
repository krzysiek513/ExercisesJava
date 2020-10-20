package Ch4_Control;

import java.util.Scanner;

public class DanglingElseProblem_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj x i y: ");
        int x;
        int y;
        x = input.nextInt();
        y = input.nextInt();
        if (x > 5){
            if (y > 5){
                System.out.println("x and y are > 5"); }}
            else {
                System.out.println("x is <= 5");}

    }
}
