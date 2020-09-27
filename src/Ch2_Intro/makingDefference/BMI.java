package Ch2_Intro.makingDefference;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj ile warzysz");
        int weight = input.nextInt();
        System.out.println("jaki masz wzrost");
        int height = input.nextInt();

        int bmi = (weight * 10000 / (height * height));
        System.out.printf("BMI = %d/100", bmi);
    }
}
