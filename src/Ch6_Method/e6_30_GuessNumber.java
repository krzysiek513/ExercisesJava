package Ch6_Method;

import java.security.SecureRandom;
import java.util.EnumMap;
import java.util.Scanner;

public class e6_30_GuessNumber {
    static Scanner input = new Scanner(System.in);
    static final SecureRandom random = new SecureRandom();

    enum Status {CONTINUE, WON}

    public static void main(String[] args) {
        int number = 1 + random.nextInt(1000);
        System.out.println("Guess a number between 1 and 1000. ");
        int answer;

        Status gameStatus = Status.CONTINUE;

        while ( gameStatus == Status.CONTINUE) {
            answer = input.nextInt();
            if (number > answer) {
                System.out.println("Too low. Try again.");
                gameStatus = Status.CONTINUE;
            } else if (number < answer ) {
                System.out.println("Too high. Try again.");
                gameStatus = Status.CONTINUE;
            } else {
                System.out.printf("%s%n%s%n%15s%n%15s%n", "Congratulations. You guessed the number!", "Wanna play again?",
                        "yes", "no");
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
}
