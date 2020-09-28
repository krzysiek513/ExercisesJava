package Ch3_Account.MakingDifference;

import Ch3_Account.Date;

import java.time.Year;

public class HeartRates {
    String name;
    String lastName;
    int day;
    int month;
    int year;

    // calculates and return person age in years

    int ageInYears() {
        return year; //?
    }
    // personal's maximum heart rate
    int heartDate() {
        return 220 - ageInYears(); //?
    }
    // personal's target rate
    double targetRate() {
        return heartDate() * 0.70; //?
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
