package Ch9_OOPInheritance.e9_3_UsingCompositiom;

// Fig. 9.11: BasePlusCommissionEmployee.java
// BasePlusCommissionEmployee class inherits from CommissionEmployee
// and accesses the superclass’s private data via inherited
// public methods.
public class BasePlus {
    private double baseSalary; // base salary per week
    private CommissionEmployee commissionEmployee;

    // six-argument constructor
    public BasePlus(String firstName, String lastName,
                    String socialSecurityNumber, double grossSales,
                    double commissionRate, double baseSalary) {
        commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber,
                grossSales, commissionRate);

        // if baseSalary is invalid throw exception
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    // set base salary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    // return base salary
    public double getBaseSalary() {return baseSalary;}

    public double earnings() {return getBaseSalary() + commissionEmployee.earnings();}

    // return String representation of BasePlusCommissionEmployee
    @Override
    public String toString() {
        return String.format("%s %s%n%s: %.2f", "base-salaried",
                commissionEmployee.toString(), "base salary", getBaseSalary());
    }

    public String getFirstName() {
        return commissionEmployee.getFirstName();
    }

    public String getLastName(){
        return commissionEmployee.getLastName();
    }

    public String getSocialSecurityNumber() {
        return commissionEmployee.getSocialSecurityNumber();
    }

    public double getGrossSales() {
        return commissionEmployee.getGrossSales();
    }

    public double getCommissionRate() {
        return commissionEmployee.getCommissionRate();
    }
}
