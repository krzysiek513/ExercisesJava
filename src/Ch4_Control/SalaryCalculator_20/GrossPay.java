package Ch4_Control.SalaryCalculator_20;

import java.util.Scanner;

public class GrossPay {
    public static void main(String[] args) {
        int employees = 0;
        Scanner input = new Scanner(System.in);
        while( employees < 3 ) {
            employees++;
            System.out.println("ile przepracował pracownik ");
            int hour = input.nextInt();
            System.out.println("ile ma za godzine");
            float cashPerHour = input.nextFloat();
            System.out.printf("temu pracownikowi należy się %.2fzł\n",salary(hour, cashPerHour));
        }
    }
    public static float salary(int hour, float cashPerHour) {
        if (hour > 40 ) {
            return (float) ((hour - 40) * (cashPerHour * 1.5) + 40 * cashPerHour);
        } else {
            return hour * cashPerHour;
        }
    }
}
