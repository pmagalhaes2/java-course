package exercicios_estrutura_sequencial.ex_03;

import java.util.Scanner;

// Diferença produto
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int difference = (a * b - c * d);

        System.out.printf("DIFERENCA = %d", difference);

        sc.close();
    }
}
