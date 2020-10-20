package Ch4_Control;

import java.util.Scanner;

public class Palindromes_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char guard = 'd';
        while ( guard != 'n'){
            System.out.println("podaj pięcio cyfrową cyfre ");
            int number = input.nextInt();
            if(number>9999&number<100000) {
                guard = 'n';
                int firstDigit = number / 10000;
                int secundDigit = number / 1000 % 10;
                int thirdDigit = number / 100 % 10;
                int fourthDigit = number / 10 % 10;
                int fifthDigit = number % 10;
                if (fifthDigit == fifthDigit) {
                    if (secundDigit == fourthDigit) {
                        System.out.println("jest to palindrom");
                    }
                }
            } else {
                    System.out.printf("źle!!! wpiszesz ją dobrze? (tak lub nie)");
                    String decision = input.next();
                    if(decision.equals("nie")){
                        guard = 'n';
                    }
            }
        }

    }
}
