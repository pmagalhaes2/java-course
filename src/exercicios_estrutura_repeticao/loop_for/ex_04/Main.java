package exercicios_estrutura_repeticao.loop_for.ex_04;

import java.util.Locale;
import java.util.Scanner;

// Cálcul divisão
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int den = sc.nextInt();

            if (den == 0) {
                System.out.println("divisao impossivel");
            } else {
                double result = (double) num / den;
                System.out.printf("%.1f%n", result);
            }

        }
        sc.close();
    }
}

