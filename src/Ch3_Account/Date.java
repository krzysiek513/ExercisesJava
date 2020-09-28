package Ch3_Account;

public class Date {
    int year;
    int month;
    int day;

    public Date(int year, int month, int day) {
        if (year > 1900 & month > 0 & month < 13 & day > 0 & day < 32) {
            this.year = year;
            this.month = month;
            this.day = day;
            System.out.println("utworzono date");
        } else {
            System.out.println("błąd w tworzeniu daty");
        }
    }

    public void displayDate(){
        System.out.printf("%d-%d-%d", day, month, year);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
