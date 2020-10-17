package Ch4_Control;
// Exercise 4.25: Mystery2.java
public class Mystery2_25 {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 10) {
            System.out.println(count % 2 == 1 ? "****" : "++++++++");
            ++count;
        }
    }
}
