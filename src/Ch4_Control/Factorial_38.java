package Ch4_Control;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Factorial_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("jaką silnie chcesz policzyć");
        int factorialFrom = input.nextInt();
        System.out.printf("zad 1: silnia z %d to %d\n", factorialFrom, factorial(factorialFrom));

        ///////2

        System.out.println("jakie e chcesz policzyć");
        int e = input.nextInt();
        System.out.printf("zad 2: e z %d to %d\n", e, e(e));

        /////// 3

        System.out.println("jakie x chcesz policzyć");
        int x = input.nextInt();
        System.out.printf("zad 3: x dla %d to %d\n", x, x(x));

    }

    public static int x(int from) {
       int x = 0;
       int tmp = from;
        while(from>0){
            if(from!=1){
                x =+ (1 / factorial(from));
            } else {
                x =+ 1 * ( power(tmp, from) / factorial(from));
            }
            from--;
        }
        return x;
    }

    public static int power(int from, int to) {
        int pow = from;
        while(to>1) {
            pow *= from;
            to--;
        }
        return pow;
    }

    public static int e(int from) {
        int e = 0;
        while(from>0){
            if(from!=1){
                e =+ (1 / factorial(from));
            } else {
                e =+ 1 + (1 / factorial(from));
            }
            from--;
        }
        return e;
    }

    public static int factorial(int from) {

        int factorial = 0;
        if(from > 0) {
            while (from > 0) {
                if (factorial != 0) {
                    factorial = factorial * from;
                } else {
                    factorial = from;
                }
                from--;
            }
        } else  {
            return 1;
        }
        return factorial;
    }

}
