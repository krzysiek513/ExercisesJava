package Ch4_Control;

public class CheckerboardPatternAsterisks_33 {
    public static void main(String[] args) {
        boolean choice = true;
        int firstWhile = 0;
        int secundWhile = 0;
        while (firstWhile < 8) {
            firstWhile++;
            while (secundWhile < 8) {
                secundWhile++;
                if (!choice)
                    System.out.print(" *");
                else
                    System.out.print("* ");
            }
            secundWhile = 0;
            choice=!choice;
            System.out.println();
        }
    }
}
