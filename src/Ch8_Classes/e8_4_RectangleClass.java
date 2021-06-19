package Ch8_Classes;

public class e8_4_RectangleClass {
    public static void main(String[] args) {
        Rectangle firstRec = new Rectangle();
        System.out.println(firstRec);
        firstRec.setLenght(2f);

        System.out.println(firstRec);
        firstRec.setWidth(2f);

        System.out.println(firstRec);

        try {
            firstRec.setWidth(22f);
        }
        catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        try {
            firstRec.setLenght(22f);
        }
        catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        System.out.printf("area is = %.2f perimeter = %.2f", firstRec.area(), firstRec.perimeter());
    }
}
