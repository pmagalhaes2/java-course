package arrays_e_listas.ex_01.application;

import java.util.Locale;
import java.util.Scanner;

// Problema "negativos"
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        if(n > 10) return;

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }

        sc.close();
    }
}
