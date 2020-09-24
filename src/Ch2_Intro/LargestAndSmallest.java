package Ch2_Intro;
import java.util.Scanner;
public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: "); // prompt
        int number1 = input.nextInt(); // read first number from user

        System.out.print("Enter second integer: "); // prompt
        int number2 = input.nextInt(); // read second number from user

        System.out.print("Enter third integer: "); // prompt
        int number3 = input.nextInt(); // read second number from user

        System.out.print("Enter fourth integer: "); // prompt
        int number4 = input.nextInt(); // read second number from user

        System.out.print("Enter fifth integer: "); // prompt
        int number5 = input.nextInt(); // read second number from user
        int larger;
        if(number1>number2){
            if(number1>number3){
                if(number1>number4){
                    if(number1>number5) larger=number1;
                    else larger=number5;
                } else {
                    if(number4>number5) larger=number4;
                    else larger=number5;
                }
            } else {
                if(number3>number4){
                    if(number3>number5) larger=number3;
                    else larger=number5;
                } else {
                    if(number4>number5) larger=number4;
                    else larger=number5;
                }
            }
        }else{
            if(number2>number3){
                if(number2>number4){
                    if(number2>number5) larger=number2;
                    else larger=number5;
                } else {
                    if(number4>number5) larger=number4;
                    else larger=number5;
                }
            } else {
                if(number3>number4){
                    if(number3>number5) larger=number3;
                    else larger=number5;
                } else {
                    if(number4>number5) larger=number4;
                    else larger=number5;
                }
            }
        }

        //// smallest number
        int smallest;
        if(number1<number2){
            if(number1<number3){
                if(number1<number4){
                    if(number1<number5) smallest=number1;
                    else smallest=number5;
                } else {
                    if(number4<number5) smallest=number4;
                    else smallest=number5;
                }
            } else {
                if(number3<number4){
                    if(number3<number5) smallest=number3;
                    else smallest=number5;
                } else {
                    if(number4<number5) smallest=number4;
                    else smallest=number5;
                }
            }
        }else{
            if(number2<number3){
                if(number2<number4){
                    if(number2<number5) smallest=number2;
                    else smallest=number5;
                } else {
                    if(number4<number5) smallest=number4;
                    else smallest=number5;
                }
            } else {
                if(number3<number4){
                    if(number3<number5) smallest=number3;
                    else smallest=number5;
                } else {
                    if(number4<number5) smallest=number4;
                    else smallest=number5;
                }
            }
        }
        System.out.printf("najmniejsza liczba to %d%nNajwieksza to %d%n", smallest, larger);
    }
}
