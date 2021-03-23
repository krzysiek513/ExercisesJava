package Ch7_Array;

import java.security.SecureRandom;

public class e7_17_DiceRolling {

    static final SecureRandom randomNumbers = new SecureRandom();

    public static void main(String[] args) {
        int[] rolls = new int[13];
        for (int tr = 0 ; tr < 36_000_000; tr++) {
            ++rolls[rollDice()];
        }
        for (int i = 2; i < 13; i++) {
            System.out.printf("sum of roll %d fell out %d times%n", i, rolls[i]);
        }
    }

    public static int rollDice() {
        // pick random die values
        int die1 = 1 + randomNumbers.nextInt(6); // first die roll
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll

        int sum = die1 + die2; // sum of die values

        // display results of this roll
        //System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

        return sum;
    }
}
