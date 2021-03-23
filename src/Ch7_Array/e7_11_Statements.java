package Ch7_Array;

public class e7_11_Statements {
    public static void main(String[] args) {
        int[] counts = new int[10];
        int[] bonus = {1, 1, 1,1, 1, 1,1, 1, 1,1, 1, 1,1, 1, 1};
        int[] bestScores = { 2, 5, 7, 34, 65, 3, 54, 3, 23, 8};
        best(bestScores,5);
    }

    static void best(int[] tab, int howMany) {
        int[] best = new int[howMany];
        for (int nr : tab) {
            if ( nr > best[0]) {
                best[4] = best[3];
                best[3] = best[2];
                best[2] = best[1];
                best[1] = best[0];
                best[0] = nr;
            }
            else if ( nr > best[1]) {
                best[4] = best[3];
                best[3] = best[2];
                best[2] = best[1];
                best[1] = nr;
            }
            else if ( nr > best[2]) {
                best[4] = best[3];
                best[3] = best[2];
                best[2] = nr;
            }
            else if ( nr > best[3]) {
                best[4] = best[3];
                best[3] = nr;
            }
            else if ( nr > best[4]) best[4] = nr;
        }
        for (int onr : best) {
            System.out.println(onr);
        }
    }

}
