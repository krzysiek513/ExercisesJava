package Ch5_Control2.CalculatingSales;

public class ProductTest {
    public static void main(String[] args) {
        Product first =
                new Product(1, 22);
        Product second =
                new Product(2, 33);
        Product third =
                new Product(3, 11);
        Product fourth =
                new Product(4, 34);
        Product fifth =
                new Product(5, 26);

        displayTheTotalRetailValue(first);
        displayTheTotalRetailValue(second);
        displayTheTotalRetailValue(third);
        displayTheTotalRetailValue(fourth);
        displayTheTotalRetailValue(fifth);
    }

    public static void displayTheTotalRetailValue(Product someThing) {
        System.out.println("Faktura:");
        for (int i = 0; i < someThing.getQuantitySold(); i++) {
            System.out.printf(
                    "numer produktu to: %d; sprzedany jako: %d za: %.2f$%n",
                    someThing.getProductNumber(), i + 1, someThing.getPrice() );
        }
        System.out.printf("Cena całkowita to: %.2f$%n%n", someThing.getPrice()*someThing.getQuantitySold());
    }
}
