package Ch3_Account.MakingDifference;

import java.util.Scanner;

public class HeartRates {
    Scanner input = new Scanner(System.in);
    String name;
    String lastName;
    int day;
    int month;
    int year;

    //BMI
    int bmi( ) { //= (weight * 10000 / (height * height));
        System.out.println("Podaj swoj wzrost");
        int height = input.nextInt();
        System.out.println("Podaj swoją wagę");
        int weight = input.nextInt();
        return (weight * 10000 / (height * height));
    }
    // calculates and return person age in years
    int ageInYears() {
        return 2020 - year; //?
    }
    // personal's maximum heart rate
    int heartRate() {
        return 220 - ageInYears(); //?
    }
    // personal's target rate
    double targetRate() {
        return heartRate() * 0.70; //?
    }

    public HeartRates(String name, String lastName, int day, int month, int year) {
        this.name = name;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
