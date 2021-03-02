package Ch5_Control2;

import java.util.Scanner;

public class DiamonfPrintingMod {
    public static void main(String[] args) {
        int chars = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wysokość diamentu: (liczby nieparzyste 1-19)");
        int size = input.nextInt();
        for(int i = 0; i <= size; i++){
            System.out.print(" ");
            System.out.print("*");
            for(int j =0; j <= size/2; j++){
                if( chars <= j) {
                    System.out.print("  ");
                } else {
                    System.out.print("**");
                }
            }
            if(i < size/2) chars++;
            else chars--;
            System.out.print("\n");
        }
    }
}
