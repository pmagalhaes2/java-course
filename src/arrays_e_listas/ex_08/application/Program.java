package arrays_e_listas.ex_08.application;

import java.util.Locale;
import java.util.Scanner;

// Problema "media_pares"
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int evensQuantity = 0;
        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                evensQuantity++;
                sum += vect[i];
            }
        }

        if (evensQuantity == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES = %.1f%n", sum / evensQuantity);
        }
        sc.close();
    }
}
