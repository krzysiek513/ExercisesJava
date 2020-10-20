package Ch4_Control;

import java.util.Scanner;

public class SquareOfAsterisks_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj rozmiar kwadratu (od 1 do 20)");
        int size = input.nextInt();
        int tmp2 = size;
        while (size>0){
            size--;
            int tmp = tmp2;
            while (tmp>0) {
                tmp--;
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
