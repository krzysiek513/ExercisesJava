package Ch5_Control2;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PythagoreanTriples {
    public static void main(String[] args) {
        double c;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Podaj dwa boki Trójkąta, wartości muszą być int");
            int a = input.nextInt();
            int b = input.nextInt();
            c = sqrt(pow(a, 2) + pow(b, 2));
            if (c == (int)c)
            {
                System.out.println(c);
            } else {
                System.out.println("przekątna nie jest wartości int");
            }

        } while (!(c == (int)c));

    }
}
