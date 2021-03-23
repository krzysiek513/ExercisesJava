package Ch7_Array;

public class e7_14_VariableLengthArgumentList {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.printf("Values sent to method are %d, %d, %d, %d%n", a, b, c, d);
        System.out.printf("Sum of a and b is %d%n", product(a, b));
        System.out.printf("Sum of a, b and c is %d%n", product(a, b, c));
        System.out.printf("Sum of a, b, c and d is %d%n", product(a, b, c, d));

    }

    static int product (int ... value) {
        int sum = 0;

        for (double number : value) {
            sum += number;
        }

        return sum;
    }
}
