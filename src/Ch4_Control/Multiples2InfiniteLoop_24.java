package Ch4_Control;

public class Multiples2InfiniteLoop_24 {
    public static void main(String[] args) {
        int multipla = 1;
        while (true) {
            int two = multipla * 2;
            multipla += 2222;
            System.out.println(two);
        }
    }
}
