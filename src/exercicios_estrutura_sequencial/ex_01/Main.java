package exercicios_estrutura_sequencial.ex_01;

import java.util.Scanner;

// Soma números inteiros
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        System.out.printf("SOMA = %d", v1 + v2);

        sc.close();
    }
}
