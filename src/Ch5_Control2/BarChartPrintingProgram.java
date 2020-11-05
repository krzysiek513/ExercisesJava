package Ch5_Control2;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj 5 liczb od 1 do 30");
        int amount = 5;
        int[] values = new int[amount];
        int count = 0;
        while(count < amount){
            System.out.printf("%d z nich to: ", 1 + count);
//            try {
            values[count] = input.nextInt();
//            }
//            catch (InputMismatchException e) {
//                System.out.printf("miały być liczby... %s", e);
//                continue;
//            }
            if (values[count] > 0 & values[count] < 31){
                count++;
                System.out.println();
            } else {
                System.out.println("złe liczby");
            }
        }
        for ( count = 0; count < amount; count++){
            for( int nestedC = 0; nestedC < values[count]; nestedC++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
