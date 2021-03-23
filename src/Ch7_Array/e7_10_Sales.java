package Ch7_Array;

import java.io.FileReader;

public class e7_10_Sales {
    private String saleName; // name of course this GradeBook represents
    private int[] sales; // array of student grades

    // constructor
    public e7_10_Sales(String saleName, int[] sales) {
        this.saleName = saleName;
        this.sales = sales;
    }

    public String getSaleName() { return saleName;}

    // perform various operations on the data
    public void processSales() {
        // output grades array
        outputSales();

        // call method getAverage to calculate the average grade
        System.out.printf("%nAverage sale is %.2f%n", getAverage());

        // call methods getMinimum and getMaximum
        System.out.printf("Lowest is %d%nHighest is %d%n%n",
                getMinimum(), getMaximum());

        // call outputBarChart to print grade distribution chart
        outputBarChart();
    }

    // find minimum grade
    public int getMinimum() {
        int lowSale = sales[0]; // assume grades[0] is smallest

        // loop through grades array
        for (int sale : sales) {
            // if grade lower than lowGrade, assign it to lowGrade
            if (sale < lowSale) {
                lowSale = sale; // new lowest grade
            }
        }

        return lowSale;
    }

    // find maximum grade
    public int getMaximum() {
        int highSale = sales[0]; // assume grades[0] is largest

        // loop through grades array
        for (int sale : sales) {
            // if grade greater than highGrade, assign it to highGrade
            if (sale > highSale) {
                highSale = sale; // new highest grade
            }
        }

        return highSale;
    }

    // determine average grade for test
    public double getAverage() {
        int total = 0;

        // sum grades for one student
        for (int sale : sales) {
            total += sale;
        }

        // return average of grades
        return (double) total / sales.length;
    }

    // output bar chart displaying grade distribution
    public void outputBarChart() {
        System.out.println("Sales distribution:");

        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];

        // for each grade, increment the appropriate frequency
        for (int sale : sales) {
            if(sale < 1000) {
                ++frequency[sale / 100];
            } else {
                ++frequency[10];
            }
        }

        // for each grade frequency, print bar in chart
        for (int count = 0; count < frequency.length; count++) {
            // output bar label ("00-09: ", …, "90-99: ", "100: ")
            if (count == 10) {
                System.out.printf("%5d+:  ", 1000);
            }
            else {
                System.out.printf("%02d-%02d: ", count * 100, count * 100 + 999);
            }

            // print bar of asterisks
            for (int stars = 0; stars < frequency[count]; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // output the contents of the grades array
    public void outputSales() {
        System.out.printf("The sales are:%n%n");

        // output each student's grade
        for (int salespeople  = 0; salespeople  < sales.length; salespeople ++) {
            System.out.printf("Salespeople %2d: %3d%n",
                    salespeople  + 1, sales[salespeople]    );
        }
    }
}
