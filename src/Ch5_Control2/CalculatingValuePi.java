package Ch5_Control2;

public class CalculatingValuePi {
    public static void main(String[] args) {
        double pi = 0;
        double divider = 3;
        boolean sign = false;
        for (int i = 0; i < 200000; i++) {
            if(i == 0) {
                pi = 4;
            }
            if(sign) {
                pi += 4 / divider;
            } else {
                pi -= 4 / divider;
            }
            divider+=2;
            sign = !sign;
        }
        System.out.println(pi);
    }
}