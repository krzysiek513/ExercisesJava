package Ch2_Intro;
import java.util.Scanner;
public class Checkerboard {
    public static void main(String[] args) {

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 8; j++)
                System.out.print("* ");
            System.out.println();
            for(int j = 0; j < 8; j++)
                System.out.print(" *");
            System.out.println();
        }
        
    }
}
