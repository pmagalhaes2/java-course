package exercicios_estrutura_sequencial.ex_05;

import java.util.Locale;
import java.util.Scanner;

// Valor a pagar
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int qtd = sc.nextInt();
        double price = sc.nextDouble();

        int code2 = sc.nextInt();
        int qtd2 = sc.nextInt();
        double price2 = sc.nextDouble();

        double total = qtd * price + qtd2 * price2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}
