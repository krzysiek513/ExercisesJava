package Ch7_Array;

import java.util.Arrays;

public class e7_13_Label {
    public static void main(String[] args) {
        int[][] sales = new int[3][5];

        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                sales[row][col] = 0;
            }
        }

        for (int row = 0; row < sales.length; row++) {
            Arrays.fill(sales[row], 0);
        }

        for (int[] sale : sales) {
            Arrays.fill(sale, 0);
        }
    }
}
