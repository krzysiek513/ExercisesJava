package Ch5_Control2;

public class Product {
    static int number = 0;
    private int productNumber;
    private float price;

    public Product(float price) {
        this.productNumber = ++number;
        this.price = price;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCheap() {
        boolean isCheap;

        if (price < 5) isCheap = true;
        else isCheap = false;

        return isCheap;
    }
}
