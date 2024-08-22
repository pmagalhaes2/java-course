package heranca.ex_00_1.application;

import heranca.ex_00_1.entities.Employee;
import heranca.ex_00_1.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d data:\n", i + 1);
            System.out.print("Outsourced (y/n)? ");
            sc.nextLine();
            char opt = sc.nextLine().charAt(0);

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (opt == 'n' || opt == 'N') {
                employees.add(new Employee(name, hours, valuePerHour));
            } else {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
        }

        System.out.println("PAYMENTS:");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }

        sc.close();
    }

}
