package Ch6_Method;

public class e6_26_ReversingDigits {
    public static void main(String[] args) {
        System.out.println(reversing(32456));
        System.out.println(reverse(43256));
    }

    static int reversing(int number) {
        String strNumber = String.valueOf(number);
        String reverseNumber = "";
        for (int i = 0; i < strNumber.length(); i++)
            reverseNumber += strNumber.charAt(strNumber.length() - i - 1);
        return Integer.parseInt(reverseNumber);
    }

    static int reverse(int n){

        int rev = 0; // reversed number
        int rem;   // remainder

        while(n>0){

            rem = n%10;
            rev = (rev*10) + rem;
            n = n/10;
        }

        return rev;
    }
}
