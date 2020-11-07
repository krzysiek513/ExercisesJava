package Ch5_Control2;

public class AssumeThat {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 3;
        int m = 2;

        System.out.print(i == 1);
        System.out.println(" i równe jeden");

        System.out.print(j == 3);
        System.out.println(" j nie równe 3");

        System.out.print((i >= 1) && (j < 4)); //true&&true
        System.out.print(false && false);
        System.out.print(false && true);
        System.out.print(true && false);
        System.out.println(" && bramka logiczna (and)");

        System.out.print((m <= 99) & (k < m));
        System.out.print(false & false);
        System.out.print(false & true);
        System.out.print(true & true);
        System.out.println(" & bramka logiczna(and)");

        System.out.print((j >= i) || (k == m));
        System.out.print(false || false);
        System.out.print(false || true);
        System.out.print(true || true);
        System.out.println(" || bramka (or)");

        System.out.print((k + m < j) | (3 - j >= k));
        System.out.print(true | false);
        System.out.print(false | true);
        System.out.print(true | true);
        System.out.println(" | bramka (or)");
        System.out.print(!(k > m));
        System.out.println(" zaprzeczenie");
    }
}
