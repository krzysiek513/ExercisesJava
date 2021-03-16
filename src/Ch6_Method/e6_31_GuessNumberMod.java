package Ch6_Method;

import java.security.SecureRandom;
import java.util.Scanner;

public class e6_31_GuessNumberMod {
    static Scanner input = new Scanner(System.in);
    static final SecureRandom random = new SecureRandom();
    static int number = 1 + random.nextInt(1000);
    enum Status {CONTINUE, WON}
    static int guess = 0;

    static Status gameStatus;

    public static void main(String[] args) {
        System.out.println("Guess a number between 1 and 1000. ");
        int answer;

        gameStatus = Status.CONTINUE;

        while ( gameStatus == Status.CONTINUE) {
            answer = input.nextInt();
            choice(answer);
        }
    }
    static void choice(int answer) {
        if (number > answer) {
            System.out.println("Too low. Try again.");
            gameStatus = Status.CONTINUE;
            guess++;
        } else if (number < answer ) {
            System.out.println("Too high. Try again.");
            gameStatus = Status.CONTINUE;
            guess++;
        } else {
            System.out.printf("%s%n%s%n%15s%n%15s%n%s%d%s %n", "Congratulations. You guessed the number!", "Wanna play again?",
                    "yes", "no", "You try ", guess, " times");
            String choice = input.next();
            if (choice.equals("yes")) {
                gameStatus = Status.CONTINUE;
                number = 1 + random.nextInt(1000);
                System.out.println("Guess a number between 1 and 1000. ");
            }
            else gameStatus = Status.WON;

        }
    }
}
