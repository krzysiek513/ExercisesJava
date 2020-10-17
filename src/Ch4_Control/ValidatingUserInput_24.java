package Ch4_Control;

import java.util.Scanner;

public class ValidatingUserInput_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        boolean validate = true;
        while (validate) {
            count++;
            System.out.println("wprowadz jakąś cyfre, 1 lub 2 by skończyć");
            int result = input.nextInt();
            if(result == 1 || result == 2) {
                validate = false;
            }
        }
        System.out.printf("ilość prób %d\n", count);
        if(count==1) {
            System.out.println("brawo trafiłeś za pierwszym razem");
        }
    }
}
