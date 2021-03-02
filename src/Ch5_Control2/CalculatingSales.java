package Ch5_Control2;

import java.util.Scanner;

public class CalculatingSales {
    public static void main(String[] args) {
        int total = 0; // number of sales
        double totalPrice = 0; //
        int produckt1 = 0; //2.98f; // count of A grades
        int produckt2 = 0; //5.50f; // count of B grades
        int produckt3 = 0; //9.98f; // count of C grades
        int produckt4 = 0; //4.49f; // count of D grades
        int produckt5 = 0; //6.87f; // count of F grades

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n",
                "Enter the product number.",
                "Enter quantity sold");

        // loop until user enters the end-of-file indicator
        while (input.hasNext()) {
            int number = input.nextInt(); // read number
            int quntity = input.nextInt();
            float priceOrdered = 0;
            ++total; // add number to total

            // increment appropriate letter-number counter
            switch (number) {
                case 1: // and 100, inclusive
                    ++produckt1;
                    System.out.printf("%nPrice for product $2.98%nQuantity %d%n", quntity);
                    priceOrdered = 2.98f * quntity;
                    System.out.printf("price for all $%.2f%n", priceOrdered);
                    break; // exits switch
                case 2: // number was between 80 and 89
                    ++produckt2;
                    System.out.printf("%nPrice for product $5.50%nQuantity %d%n", quntity);
                    priceOrdered = 5.5f * quntity;
                    System.out.printf("price for all $%.2f%n", priceOrdered);
                    break; // exits switch
                case 3: // number was between 70 and 79
                    ++produckt3;
                    System.out.printf("%nPrice for product $9.98%nQuantity %d%n", quntity);
                    priceOrdered = 9.98f * quntity;
                    System.out.printf("price for all $%.2f%n", priceOrdered);
                    break; // exits switch
                case 4: // number was between 60 and 69
                    ++produckt4;
                    System.out.printf("%nPrice for product $4.49%nQuantity %d%n", quntity);
                    priceOrdered = 4.49f * quntity;
                    System.out.printf("price for all $%.2f%n", priceOrdered);
                    break; // exits switch
                case 5:
                    ++produckt5;
                    System.out.printf("%nPrice for product $6.87%nQuantity %d%n", quntity);
                    priceOrdered = 6.87f * quntity;
                    System.out.printf("price for all $%.2f%n", priceOrdered);
                    break;
                default: // number was less than 60
                    System.out.println("wrong product number");;
                    break; // optional; exits switch anyway
            }
            totalPrice += priceOrdered;
        }

        // display grade report
        System.out.printf("%nSales Report:%n");

        // if user entered at least one grade…
        if (total != 0) {
            // calculate average of all grades entered
            double average = (double) totalPrice / total;

            // output summary of results
            System.out.printf("Total of the %d sales is $%.2f%n",
                    total, totalPrice);
            System.out.printf("Sales average is $%.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of product sales is:",
                    "1: ", produckt1, // display number of A grades
                    "2: ", produckt2, // display number of B grades
                    "3: ", produckt3, // display number of C grades
                    "4: ", produckt4, // display number of D grades
                    "5: ", produckt5); // display number of F grades
        }
        else { // no grades were entered, so output appropriate message
            System.out.println("No grades were entered");
        }
    }
}
