package Ch2_Intro;

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: "); // prompt
        int number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        int number2 = input.nextInt(); // read second number from user

        System.out.print("Enter third integer: "); // prompt
        int number3 = input.nextInt(); // read second number from user

        int sum = number1 + number2 + number3; // add numbers, then store total in sum
        int product = number1 * number2 * number3;
        int average = (number1 + number2 + number3) / 3;
        int smallest = 0, larger = 0;

        if(number1<number2){
            if(number1<number3) smallest = number1;
            else smallest = number3;
        } else {
            if(number2<number3) smallest = number2;
            else smallest = number3;
        }

        if(number1>number2){
            if(number1>number3) larger = number1;
            else larger = number3;
        }
        else{
            if(number2>number3) {
                larger = number2;
            }
            else {
                larger = number3;
            }
        }

        System.out.printf("Sum is %d%nProduct is %d%nAverage is %d%nSmallest is %d%nLarger is %d%n"
                , sum, product, average, smallest, larger); // display sum
    }
}
