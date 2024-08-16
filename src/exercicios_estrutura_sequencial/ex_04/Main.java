package exercicios_estrutura_sequencial.ex_04;

import java.util.Locale;
import java.util.Scanner;

// Exibe número e salário funcionário
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        int hours_worked = sc.nextInt();
        double hour_value = sc.nextDouble();

        double salary = hours_worked * hour_value;

        System.out.printf("NUMBER = %d\n", id);
        System.out.printf("SALARY = U$ %.2f%n\n", salary);

        sc.close();
    }
}

