package Ch7_Array.e7_20_TotalSales;

public class Slip {
    int salesPeopleId;
    int productId;
    int total;

    public Slip() {
    }

    public Slip(int salesPeopleId, int productId, int total) {
        this.salesPeopleId = salesPeopleId;
        this.productId = productId;
        this.total = total;
    }

    public int getSalesPeopleId() {
        return salesPeopleId;
    }

    public int getProductId() {
        return productId;
    }

    public int getTotal() {
        return total;
    }

    void show() {
        System.out.printf("%nsalesPeopleId: %d, productId: %d, total: %d", salesPeopleId, productId, total);
    }
}
