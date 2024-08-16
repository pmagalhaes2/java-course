package exercicios_estrutura_repeticao.loop_for.ex_02;

import java.util.Scanner;

// Quantidade números dentro do intervalo [10, 20]
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int in = 0, out = 0;

        System.out.println("Informe a quantidade: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Informe um número: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }

        }

        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}
