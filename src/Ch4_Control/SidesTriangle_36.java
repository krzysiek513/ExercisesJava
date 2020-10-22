package Ch4_Control;

import java.util.Scanner;

public class SidesTriangle_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int larger, small, smalest;
        if(a>c){
            if(a>b) {
                larger = a;
                smalest = b;
                small = c;
            }
            else {
                larger = b;
                smalest = a;
                small = b;
            }

        }
        else{
            if(c>b) {
                larger = c;
                smalest = a;
                small = b;
            }
            else {
                larger = b;
                smalest = a;
                small = c;
            }
        }
        System.out.printf("najwiekszy%d mniejszy %d mniejszy %d\n", larger, smalest, small);
        if(larger<(smalest+small))
            System.out.println("będzie triangle");
        else
            System.out.println("nic z tego");
    }
}
