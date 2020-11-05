package Ch5_Control2.CalculatingSales;

public class Product {
    private int productNumber;
    private int quantitySold;
    private double price;

    // constructor
    public Product(int productNr,
                   int quantitySold) {
        this.productNumber = productNr;
        this.quantitySold = quantitySold;
        retailPriceForEachProduct();
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public double getPrice() {
        return price;
    }

    // predicate method returns whether the state has no-fault insurance
    public void retailPriceForEachProduct(){

        // determine whether state has no-fault auto insurance
        // get AutoPolicy object's state abbreviation
        switch (getProductNumber()) {
            case 1 -> price = 4.50;
            case 2 -> price = 4.59;
            case 3 -> price = 9.98;
            case 4 -> price = 4.49;
            case 5 -> price = 6.87;
            default -> price = 0;
        }
    }
}
