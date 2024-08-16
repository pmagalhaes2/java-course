package arrays_e_listas.ex_05.application;

import java.util.Locale;
import java.util.Scanner;

// Problema "maior_posicao"
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
        }

        double max = numbers[0];
        int position = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                position = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", max);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", position);

        sc.close();
    }
}
