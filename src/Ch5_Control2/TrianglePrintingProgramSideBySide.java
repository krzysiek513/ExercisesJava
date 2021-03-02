package Ch5_Control2;

public class TrianglePrintingProgramSideBySide {
    public static void main(String[] args) {
        int a;
        for(int i = 0; i < 10; i++)  {
                for(a = 0; a < 40; a++) {
                    if (i >= a % 10) System.out.print("*");
                    else System.out.print(" ");
                }
            System.out.println();
        }
    }
}
