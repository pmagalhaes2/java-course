package programacao_funcional.ex_02.application;

import programacao_funcional.ex_02.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.next();

        System.out.print("Enter salary: ");
        Double salary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> employeeList = new ArrayList<>();
            String line = br.readLine();


            while (line != null) {
                String[] fields = line.split(",");
                employeeList.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            List<String> emails =
                    employeeList.stream().filter(employee -> employee.getSalary() > salary).map(Employee::getEmail)
                            .sorted().toList();

            double sumSalariesStartsM =
                    employeeList.stream().filter(employee -> employee.getName().charAt(0) == 'M')
                            .map(Employee::getSalary).reduce(0.0,
                                    Double::sum);

            System.out.printf("Email of people whose salary is more than %.2f:\n", salary);
            for (String email : emails) {
                System.out.println(email);
            }

            System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", sumSalariesStartsM);


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        // ordem alfabefica email funcionarios com salario > valor digitado
        // soma salarios funcionarios que iniciam com letra m
    }
}
