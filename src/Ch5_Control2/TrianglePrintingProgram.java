package Ch5_Control2;

public class TrianglePrintingProgram {
    public static void main(String[] args) {
        System.out.println(" (a) ");
        int a = 0;
        for(int i=1;i<=10;i++) {
            for(int n=1;n<=a;n++) {
                System.out.print("*");
            }
            a++;
            System.out.println();
        }
        for(int i=1;i<=10;i++) {
            for(int j=1;j<=a;j++) {
                System.out.print("*");
            }
            a--;
            System.out.println();
        }
        for(int i=1;i<=10;i++) {
            for(int j=1;j<=a;j++) {
                System.out.print("*");
            }
            a++;
            System.out.println();
        }
        for(int i=1;i<=10;i++) {
            for(int j=1;j<=a;j++) {
                System.out.print("*");
            }
            a--;
            System.out.println();
        }
    }
}
