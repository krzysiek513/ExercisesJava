package Ch7_Array;

public class e7_9_Consider {
    public static void main(String[] args) {
        int[][] c = {{1, 1, 1}, {2, 2, 2}};

        for(int i = 0; i < c.length; i++) {
            System.out.println(c[i][0]);
            System.out.println(c[i][1]);
            System.out.println(c[i][2]);
        }
        for (int j = 0; j < 3; j++) {
            System.out.println(c[0][j]);
        }
        c[0][1] = 0;
        for ( int i = 0; i < c.length; i++) {
            for ( int j = 0; j < 3; j++) {
                c[i][j] = 0;
            }
        }
    }
}
