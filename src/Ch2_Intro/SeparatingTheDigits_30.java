package Ch2_Intro;
import java.util.Scanner;
public class SeparatingTheDigits_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź pięcio cyfrową liczbe:");
        int number = input.nextInt();
        int first, secund, third, fourth, fifth;
        first = number / 10000;
        secund = number / 1000 % 10;
        third = number / 100 % 10;
        fourth = number / 10 % 10;
        fifth = number % 10;
        System.out.printf("%d   %d   %d   %d   %d", first, secund, third, fourth, fifth);
    }
}
