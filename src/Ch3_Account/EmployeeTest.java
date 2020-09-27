package Ch3_Account;

import javax.swing.*;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee piotrek1 = new Employee("piotrek", "szef", 3.4);
        Employee karina = new Employee("karina", "podrużniczka", 4363.4);
        Employee pawel1 = new Employee("pawel", "kelner", -3.4);

        System.out.printf("%nnazwa: %12s imie: %12s %12.2fzł", piotrek1.getLastName(), piotrek1.getName(), piotrek1.getSalary());
        System.out.printf("%nnazwa: %12s imie: %12s %12.2fzł", karina.getLastName(), karina.getName(), karina.getSalary());
        System.out.printf("%nnazwa: %12s imie: %12s %12.2fzł", pawel1.getLastName(), pawel1.getName(), pawel1.getSalary());
        System.out.printf("%nśrednie zarobki w firmie wysoszą: %11.2f", karina.getSalary()/3);

        System.out.printf("%nKarina zarobi przez 10 lat %5.2fzł", (karina.getSalary() * 12)*10);

        karina.setSalary(karina.getSalary()*1.1f);
        System.out.printf("%nKarina zarobi przez 10 lat %5.2fzł", (karina.getSalary() * 12)*10);

    }


}
