package exercicios_estrutura_condicional.ex_02;

import java.util.Scanner;

// Par ou ímpar
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Digite um número inteiro: ");
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        sc.close();
    }
}
