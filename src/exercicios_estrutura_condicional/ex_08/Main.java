package exercicios_estrutura_condicional.ex_08;

import java.util.Locale;
import java.util.Scanner;

// Cálculo imposto renda
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salary, tax;
        salary = sc.nextDouble();

        if (salary <= 2000.00) {
            System.out.println("Isento");
        } else if (salary >= 2000.01 && salary <= 3000.00) {
            tax = (salary - 2000) * 0.08;
            System.out.printf("R$ %.2f%n", tax);
        } else if (salary >= 3000.01 && salary <= 4500.00) {
            tax = 1000 * 0.08 + (salary - 3000) * 0.18;
            System.out.printf("R$ %.2f%n", tax);
        } else if (salary > 4500.00) {
            tax = 1000 * 0.08 + 1500 * 0.18 + (salary - 4500) * 0.28;
            System.out.printf("R$ %.2f%n", tax);
        }
        sc.close();
    }
}
