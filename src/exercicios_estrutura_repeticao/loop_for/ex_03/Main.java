package exercicios_estrutura_repeticao.loop_for.ex_03;

import java.util.Locale;
import java.util.Scanner;

// Cálculo média ponderada
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();

            double media = (x * 2 + y * 3 + z * 5) / 10;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}

