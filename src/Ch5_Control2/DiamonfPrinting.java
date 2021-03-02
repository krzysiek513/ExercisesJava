package Ch5_Control2;

public class DiamonfPrinting {
    public static void main(String[] args) {
        int chars = 0;
        for(int i = 0; i < 9; i++){
            System.out.print(" ");
            System.out.print("*");
            for(int j =0; j < 5; j++){
                if( chars <= j) {
                    System.out.print("  ");
                } else {
                    System.out.print("**");
                }
            }
            if(i < 4) chars++;
            else chars--;
            System.out.print("\n");
        }
    }
}
