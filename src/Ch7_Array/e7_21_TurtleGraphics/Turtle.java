package Ch7_Array.e7_21_TurtleGraphics;

import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Turtle {
    boolean draw;
    int direction; //1 - right , 2 - down, 3 - left, 4 - up
    int posX;
    int posY;

    public Turtle() {
        draw = false;
        direction = 1;
        posX = 3;
        posY = 3;
    }

    void start(String[][] array, String command) {
        StringTokenizer st = new StringTokenizer(command);
        while (st.hasMoreElements()) {
            String token = st.nextElement().toString();
            System.out.println("Token = " + token);
            if (token.contains(",")) {
                String[] split = token.split(",");
                move(split[1], array);
            }
            switch (token) {
                case "1":
                    pen(false);
                    break;
                case "2":
                    pen(true);
                    break;
                case "3":
                    turnLeft();
                    break;
                case "4":
                    turnRight();
                    break;
//                case "5":
//                    move(12);
//                    break;
                case "6":
                    display(array);
                    break;
                case "9":
                    System.out.println("It was nice to meet you");
                    break;
                default:
                    System.out.println("error");
            }
        }
        System.out.println("Token count: " + st.countTokens());
    }

    void position(int x, int y){
        posY = y;
        posX = x;
    }

    void move(String steps, String[][] array) {
        int number = parseInt(steps);
        if (draw){
            if (direction == 1) {
                for (int i = 0; i < number; i++) {
                    array[posX][posY++] = "*";
                }
            } else if (direction == 2) {
                array[posX++][posY] = "*";

            } else if (direction == 3) {
                array[posX][posY--] = "*";

            } else if (direction == 4) {
                array[posX--][posY] = "*";

            } else System.out.println("error");
        } else System.out.println("Not this time");
    }

    void turnLeft() {
        if (direction == 1) direction = 4;
        else --direction;
    }

    void turnRight() {
        if (direction == 4) direction = 1;
        else ++direction;
    }

    void display(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf(array[i][j]);
            }
            System.out.printf("%n");
        }
    }
    void pen(boolean write){
        draw = write;
    }
}
