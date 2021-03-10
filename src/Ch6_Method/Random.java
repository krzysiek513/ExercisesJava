package Ch6_Method;

import java.security.SecureRandom;

public class Random {
    public static void main(String[] args) {
        SecureRandom randow = new SecureRandom();
        int a = 1 + randow.nextInt(2);//        1 ≤ n ≤ 2
        int b = 1 + randow.nextInt(100);//        1 ≤ n ≤ 100
        int c = randow.nextInt(10);//        0 ≤ n ≤ 9
        int d = 1000 + randow.nextInt(113);//        1000 ≤ n ≤ 1112.
        int e = -1 + randow.nextInt(3);//–1 ≤ n ≤ 1.
        int f = -3 + randow.nextInt(15);//–3 ≤ n ≤ 11
        System.out.printf(" %d, %d, %d, %d, %d, %d%n%nPart 2%n", a, b, c, d, e, f);

        int g = 2 + 2 * randow.nextInt(5);//        2, 4, 6, 8, 10.
        System.out.printf(" %d ",g);
        int j = 3 + 2 * randow.nextInt(5);//        3, 5, 7, 9, 11.
        System.out.printf(" %d ",j);
        int h = 6 + 4 * randow.nextInt(5);//        6, 10, 14, 18, 22.
        System.out.printf(" %d ",h);

    }
}
