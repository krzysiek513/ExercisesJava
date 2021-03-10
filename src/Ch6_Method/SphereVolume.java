package Ch6_Method;

import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        System.out.println("Podaj promień kuli");
        Scanner input = new Scanner(System.in);
        double radious =  input.nextDouble();
        System.out.printf("Objętość kuli wynosi: %.2f", sphereVolume(radious));
    }

    static double sphereVolume(double r){
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        return volume;
    }
}
