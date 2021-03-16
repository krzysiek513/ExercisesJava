package Ch6_Method;

public class e6_34_TableBinaryOctalHexadecimal {
    public static void main(String[] args) {
        for (int i = 1; i <= 256; i++){
            System.out.printf("%d - %d - 0%d - 0x%d%n", i, binary(i), octal(i), hexadecimal(i));
        }

    }

    static long binary (int number) {
        return Long.parseLong((Integer.toBinaryString(number)));
    }

    static long octal (int number) {
        return Long.parseLong((Integer.toOctalString(number)));
    }

    static long hexadecimal (int number) {
        return Long.parseLong((Integer.toHexString(number)));
    }
}
