package Ch5_Control2;

public class CompoundInterest {
    public static void main(String[] args) {
        int principalPennies = 100000; // initial amount before interest
        double rate = 0.05; // interest rate

        // display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        // calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; ++year) {
            // calculate new amount on deposit for specified year
            double amount = principalPennies * Math.pow(1.0 + rate, year);
            System.out.printf("%4d%,15.0f%s%02d%n", year, Math.floor(amount / 100),".", (int)(amount % 100));
        }
    }
}
