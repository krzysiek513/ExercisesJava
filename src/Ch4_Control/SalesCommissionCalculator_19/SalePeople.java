package Ch4_Control.SalesCommissionCalculator_19;

public class SalePeople {
    int basicSalary = 200;
    float plusSalary = 0.09f;
    float itemValue;
    float salary;
    String name;

    public SalePeople(String name) {
        this.name = name;
    }

    public void setItemValue(float itemValue) {
        this.itemValue = itemValue;
        salary = itemValue * plusSalary + basicSalary;
    }

    @Override
    public String toString() {
        return  name + " earn " + salary;
    }
}
