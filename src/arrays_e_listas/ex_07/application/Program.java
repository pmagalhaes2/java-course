package arrays_e_listas.ex_07.application;

import java.util.Locale;
import java.util.Scanner;

// Problema "abaixo_da_media"
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0.0;

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        double average = sum / vect.length;

        System.out.println("MEDIA DO VETOR = " + average);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (int i = 0; i < n; i++) {
            if (vect[i] < average) {
                System.out.printf("%.1f\n", vect[i]);
            }
        }

        sc.close();
    }
}
