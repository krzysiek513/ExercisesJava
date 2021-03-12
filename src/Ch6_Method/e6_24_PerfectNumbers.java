package Ch6_Method;

public class e6_24_PerfectNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 10_000; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPerfect(int perfectNumber) {
        int sum = 0;
        for (int i = 1; i < perfectNumber; i++) {
            if (perfectNumber % i == 0)
                sum += i;
        }
        return sum == perfectNumber;
    }
}
