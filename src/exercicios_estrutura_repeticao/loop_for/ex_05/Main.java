package exercicios_estrutura_repeticao.loop_for.ex_05;

import java.util.Locale;
import java.util.Scanner;

// Fatorial
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fat = 1;

        for (int i = (n - 1); i > 0; i--) {
            fat += fat * i;
        }

        System.out.println(fat);

        sc.close();
    }
}

