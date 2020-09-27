package Ch3_Account;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice nazwa = new Invoice("Zamowienie numer jeden",
                "jakis opid?", 5, 45673.241);

        Invoice nazwa2 = new Invoice("Zamowienie numer dwa",
                "jakis drugi opid?", 55, 4561);

        System.out.printf("ilość zamówień: %d%n",nazwa.quantity);
        System.out.printf("ilość zamówień: %.2f%n",nazwa.getInvoiceAmount());
        System.out.printf("ilość zamówień: %d%n",nazwa2.quantity);
        System.out.printf("ilość zamówień: %.2f%n",nazwa2.getInvoiceAmount());
        System.out.printf("ilość zamówień: %d%n",nazwa2.quantity);
        System.out.printf("ilość zamówień: %d%n",nazwa.quantity);
    }
}
