package arrays_e_listas.ex_04.application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

// Problema "numeros_pares"
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            int number = sc.nextInt();

            if (number % 2 == 0) evenNumbers.add(number);
        }

        System.out.println();
        System.out.println("NUMEROS PARES:");
        for (int evenNumber : evenNumbers) {
            System.out.printf("%d ", evenNumber);
        }

        System.out.println();
        System.out.printf("QUANTIDADE DE PARES = %d\n", evenNumbers.size());

        sc.close();
    }
}
