package Ch6_Method;

import java.security.SecureRandom;
import java.util.Scanner;

public class e6_29_CoinTossing  {
    static final SecureRandom random = new SecureRandom();

    static int tails = 0;
    static int head = 0;

    public static void main(String[] args) {
        int exit = 0;
        Scanner input = new Scanner(System.in);
        while (exit != 1) {
            System.out.printf("%n%s%n%16s%n%16s%n", "What you wanna do?", "Toss coin (2)", "Exit (1)");
            exit = input.nextInt();
            if (exit == 2) flip();
            System.out.printf("heads - %d%ntails - %d%n", head, tails);
        }
    }

    static int flip () {
        int coin = 1 + random.nextInt(2);

        switch (coin) {
            case 1:
                head++;
                System.out.println("You roll head");
                break;
            case 2:
                tails++;
                System.out.println("You roll tails");
                break;
        }

        return coin;
    }
}
