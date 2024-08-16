package exercicios_estrutura_repeticao.loop_for.ex_01;

import java.util.Scanner;

// Impressão números pares
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 0; i <= x; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
