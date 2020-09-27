package Ch3_Account;

public class Employee {
    String name;
    String lastName;
    double salary;

    public Employee(String name, String lastName, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        if(salary < 0.0){
            System.out.println("za mala kase - " + name + " " + lastName);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        if(salary<0.0) {return 123.123; }
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
