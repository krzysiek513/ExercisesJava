package Ch6_Method;

public class e6_25_PrimeNumbers {
    private static int prime;

    public static void main(String[] args) {
        for ( int i = 0; i < 10_000; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
            if (i % 200 == 0)
                System.out.println();
        }
    }

    static boolean isPrime(int prime) {
//        if ((!(prime % 2 == 0) && !(prime % 3 == 0) && !(prime % 5 == 0) && !(prime % 7 == 0))
//                || prime == 1 | prime == 2 || prime == 3 || prime == 7) return true;
//        else return false;

        return prime == 1 || prime == 2 || prime == 3 || prime == 7 ||
                (!(prime % 2 == 0) && !(prime % 3 == 0) && !(prime % 5 == 0) && !(prime % 7 == 0));
    }
}
