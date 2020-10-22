package Ch4_Control;

import java.util.Scanner;

public class PrintingDecimalEquivalentBinaryNumber_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj pięcio cyfrową liczne binarną");
        int binary = input.nextInt();
        int firstDigit = binary / 10000;
        int secundDigit = binary / 1000 % 10;
        int thirdDigit = binary / 100 % 10;
        int fourthDigit = binary / 10 % 10;
        int fifthDigit = binary % 10;
        System.out.printf(" %d %d %d %d %d\n",firstDigit,secundDigit,thirdDigit,fourthDigit,fifthDigit);

        int decimalFromBinary = fifthDigit * 1 + fourthDigit * 2 + thirdDigit * 4
                + secundDigit * 8 + firstDigit * 16;

        System.out.printf("binarna %d to %d\n", binary, decimalFromBinary);
    }
}
