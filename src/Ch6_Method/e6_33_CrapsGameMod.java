package Ch6_Method;

import java.security.SecureRandom;
import java.util.Scanner;

public class e6_33_CrapsGameMod {
    // create secure random number generator for use in method rollDice
    private static final SecureRandom randomNumbers = new SecureRandom();
    static Scanner input = new Scanner(System.in);

    // enum type with constants that represent the game status
    private enum Status {CONTINUE, WON, LOST};

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    static String play = "yes";

    // plays one game of craps
    public static void main(String[] args) {
        int myPoint = 0; // point if no win or loss on first roll
        Status gameStatus; // can contain CONTINUE, WON or LOST
        int bankBalance = 1000;
        int wager;

        // determine game status and point based on first roll
        while(bankBalance > 0 && play.equals("yes")){
            System.out.println("Set your wager");
            wager = input.nextInt();

            int sumOfDice = rollDice(); // first roll of the dice

            switch (sumOfDice) {
                case SEVEN: // win with 7 on first roll
                case YO_LEVEN: // win with 11 on first roll
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES: // lose with 2 on first roll
                case TREY: // lose with 3 on first roll
                case BOX_CARS: // lose with 12 on first roll
                    gameStatus = Status.LOST;
                    break;
                default: // did not win or lose, so remember point
                    gameStatus = Status.CONTINUE; // game is not over
                    myPoint = sumOfDice; // remember the point
                    System.out.printf("Point is %d%n", myPoint);
                    break;
            }

            // while game is not complete
            while (gameStatus == Status.CONTINUE) { // not WON or LOST
                sumOfDice = rollDice(); // roll dice again

                // determine game status
                if (sumOfDice == myPoint) { // win by making point
                    gameStatus = Status.WON;
                } else {
                    if (sumOfDice == SEVEN) { // lose by rolling 7 before point
                        gameStatus = Status.LOST;
                    }
                }
            }

            // display won or lost message
            if (gameStatus == Status.WON) {
                bankBalance = bankBalance + wager;
                System.out.printf("%s%n%s%d%n%s%n%s%n","Player wins", "bank balance ", bankBalance, "Wanna play again", "yes - no");
                play = input.next();
            } else {
                bankBalance = bankBalance - wager;
                System.out.printf("%s%n%s%d%n%s%n%s%n","Player loses", "bank balance ", bankBalance, "Wanna play again", "yes - no");
                play = input.next();
            }
        }
    }

    // roll dice, calculate sum and display results
    public static int rollDice() {
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll

        int sum = die1 + die2; // sum of die values

        // display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;
    }

    static String chatter() {
        int chat = randomNumbers.nextInt(3);
        switch (chat) {
            case 1 -> {
                return "Oh, you’re going for broke, huh?";
            }
            case 2 -> {
                return "Aw c’mon, take a chance!";
            }
            case 3 -> {
                return "You’re up big. Now’s the time to cash in your chips!";
            }
            default -> {
                return " wtf?!";
            }
        }
    }
}
