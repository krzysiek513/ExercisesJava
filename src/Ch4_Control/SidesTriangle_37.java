package Ch4_Control;

import java.util.Scanner;

public class SidesTriangle_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj trzy boki trujkąta prostego");
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
        System.out.printf("najwiekszy %d mniejszy %d mniejszy %d\n", larger, smalest, small);
        if(larger*larger == (smalest*smalest) + (small*small))
            System.out.println("jest prostokatny");
        else
            System.out.println("nie jest");
    }
}
