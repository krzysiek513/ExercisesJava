package Ch5_Control2;

public class ValuePi {
    public static void main(String[] args) {
        double pi = 4f;
        boolean minus = false;
        int counter = 0;
        for(int i = 3; i < 400002; i += 2){
            if (minus) pi += 4f / i ;
            else pi -= 4f / i;
            minus = !minus;
            counter++;
        }
        System.out.printf("pi = %,6f%n", pi);
        System.out.println(counter);
    }
}
