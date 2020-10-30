package Ch5_Control2;

public class OddIntegers {
    public static void main(String[] args) {
        int counter = 0;
        while(counter < 16) {
            counter++;
            if(counter % 2 == 1) {
                System.out.println(counter);
            }
        }
    }
}
