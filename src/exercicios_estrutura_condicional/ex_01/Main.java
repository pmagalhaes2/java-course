package exercicios_estrutura_condicional.ex_01;

import java.util.Scanner;

// Número negativo
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Digite um número inteiro: ");
        number = sc.nextInt();

        if (number < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }
        sc.close();
    }
}
