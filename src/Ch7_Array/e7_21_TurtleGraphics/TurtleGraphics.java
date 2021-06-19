package Ch7_Array.e7_21_TurtleGraphics;

import java.util.StringTokenizer;
//todo
public class TurtleGraphics {
    public static void main(String[] args) {
        String[][] floor = new String[20][20];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                floor[i][j] = " ";
            }
        }
        showArray(floor);

        String command = "2 5,12 3 5,12 3 5,12 3 5,12 1 6 9";
        Turtle turtle = new Turtle();

        turtle.start(floor, command);

        showArray(floor);
    }

    static void showArray(String[][] array) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.printf(array[i][j]);
            }
            System.out.printf("%n");
        }
    }
}
