package Ch7_Array;

public class e7_10_SalesCommissions {
    public static void main(String[] args) {
        int[] salesArray = {387, 468, 794, 1000, 483, 578, 485, 791, 576, 787, 2222, 234324};

        e7_10_Sales myGradeBook = new e7_10_Sales(
                "CS101 Introduction to Java Programming", salesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n",
                myGradeBook.getSaleName());
        myGradeBook.processSales();

    }
}
