package Ch7_Array.e7_20_TotalSales;

public class TotalSales {
    //static Slip[] table;
    public static void main(String[] args) {
        int size = 21;
        // available slips
        Slip[] table = new Slip[size];
        int h = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                table[h] = new Slip(i,j, i + 100 + j * 10);
                h++;
            }
        }
        for (int i = 0; i < 20; i++) {
            table[i].show();
        }
        // four arrays each one for salespeople,
        // contain total sales of each product
        int[][] sales = new int[4][5];

        for (int i = 0; i < 20; i++) {

               addSales(table[i], sales);
        }
        System.out.printf("%nSalesPeople product total price");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%nid: %7d%8d%12d", i, j, sales[i][j]);
            }
        }
    }

    static void addSales(Slip slip, int[][] table) {
//        int salesPeopleId = slip.getSalesPeopleId();
//        int productId = slip.getProductId();
//        int total = slip.getTotal();
        table[slip.getSalesPeopleId()][slip.getProductId()] += slip.getTotal();

    }
}
