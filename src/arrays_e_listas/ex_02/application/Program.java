package arrays_e_listas.ex_02.application;

import java.util.Locale;
import java.util.Scanner;

// Problema "soma_vetor"
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        System.out.print("VALORES = ");
        for (double number : numbers) {
            System.out.print(number + " ");
        }

        System.out.printf("\nSOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", sum / numbers.length);

        sc.close();
    }
}
