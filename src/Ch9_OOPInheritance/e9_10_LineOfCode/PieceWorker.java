package Ch9_OOPInheritance.e9_10_LineOfCode;

public class PieceWorker extends Employee{

    private Double pieceSales;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate
    ,Double pieceSales) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.pieceSales = pieceSales;
    }

    public Double getPieceSales() {
        return pieceSales;
    }

    public void setPieceSales(Double pieceSales) {
        this.pieceSales = pieceSales;
    }

    public String toString() {
        return String.format("%s %s%n%s: %.2f", "Employee",
                super.toString(), "piece salary", getPieceSales());
    }
}
