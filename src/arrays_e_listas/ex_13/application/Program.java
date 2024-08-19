package arrays_e_listas.ex_13.application;

import arrays_e_listas.ex_13.entities.Employee;

import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("Employee #%d\n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            employees[i] = new Employee(id, name, salary);
        }

        System.out.print("Enter the employee id thar will have salary increase: ");
        int id = sc.nextInt();
        System.out.print("Enter the percentage: ");
        double percentage = sc.nextDouble();

        Optional<Employee> optionalEmployee = Arrays.stream(employees)
                .filter(employee -> employee.getId() == id)
                .findFirst();

        if (optionalEmployee.isPresent()) {
            Employee foundedEmployee = optionalEmployee.get();
            foundedEmployee.increase(percentage);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }

        System.out.println("List of employees:");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }

        sc.close();

    }
}
