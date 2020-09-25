package Ch2_Intro;
import java.util.Scanner;
public class Multiples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbe");
        int number1 = input.nextInt();
        System.out.println("podaj druga liczbe");
        int number2 = input.nextInt();
        if(number1 % number2 == 0){
            System.out.printf("Liczba jest wielokrotnością");
        } else System.out.println("Liczba nie jest wielokrotnością");
    }
}
