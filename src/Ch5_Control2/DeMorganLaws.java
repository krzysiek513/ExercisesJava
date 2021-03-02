package Ch5_Control2;

public class DeMorganLaws {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int g = 5;
        int x = 6;
        int y = 4;
        int i = 3;
        int j = 7;

        if (!(x < 5) && !(y >= 7)) System.out.print("a");
        else System.out.print("A");
        System.out.print(" - morgan ");
        if (!((x < 5) || (y >= 7))) System.out.println("a");
        else System.out.println("A");

        if (!(a == b) || !(g != 5)) System.out.print("b");
        else System.out.print("B");
        System.out.print(" - morgan ");
        if (!((a == b) && (g != 5))) System.out.println("b");
        else System.out.println("B");

        if (!((x <= 8) && (y > 4))) System.out.print("c");
        else System.out.print("C");
        System.out.print(" - morgan ");
        if (!(x <= 8) || !(y > 4)) System.out.println("c");
        else System.out.println("C");

        if (!((i > 4) || (j <= 6))) System.out.print("d");
        else System.out.print("D");
        System.out.print(" - morgan ");
        if (!(i > 4) && !(j <= 6) ) System.out.println("d");
        else System.out.println("D");
    }
}
