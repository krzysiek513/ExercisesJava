package Ch2_Intro;
import java.util.Scanner;
public class Diameter_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj promień koła: ");
        int radius = input.nextInt();

        System.out.printf("Diameter = %d%nCircuference = %f%nArea = %f%n",
                2 * radius, 2 * Math.PI * radius, Math.PI * (radius * radius));
    }
}