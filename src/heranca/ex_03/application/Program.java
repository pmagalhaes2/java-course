package heranca.ex_03.application;

import heranca.ex_03.entities.Company;
import heranca.ex_03.entities.Individual;
import heranca.ex_03.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Tax payer #%d data:\n", i + 1);
            System.out.print("Individual or company (i/c)? ");
            sc.nextLine();
            char opt = sc.nextLine().charAt(0);
            System.out.println(opt);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            if (opt == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                taxPayers.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        Double totalTax = 0.0;
        for (TaxPayer t : taxPayers) {
            System.out.printf("%s: $ %.2f\n", t.getName(), t.tax());
            totalTax += t.tax();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", totalTax);

        sc.close();
    }
}
