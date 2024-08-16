package exercicios_estrutura_repeticao.loop_do_while.ex_00;

import java.util.Locale;
import java.util.Scanner;

// Cálculo temperatura
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        char choice;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = celsius * 9.0 / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahtenheit: %.1f%n", fahrenheit);
            System.out.print("Deseja repetir (s/n)? ");
            choice = sc.next().charAt(0);
        } while (choice != 'n');
    }
}
