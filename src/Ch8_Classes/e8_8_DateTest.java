package Ch8_Classes;

public class e8_8_DateTest {
    public static void main(String[] args) {
        Date birth = new Date(6, 1, 1988);
        int count = 0;
        System.out.println(birth);
        while (count < 1000) {
            birth.nextDay();
            if (count % 10 == 0)
                System.out.println(birth);
            count++;
        }
        System.out.println(birth);
    }
}
