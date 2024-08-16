package exercicios_estrutura_condicional.ex_05;

import java.util.Scanner;

// Total a pagar
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int code, qtd;

        System.out.println("Informe o código do produto: ");
        code = sc.nextInt();

        System.out.println("Informe a quantidade: ");
        qtd = sc.nextInt();

        if (code == 1) {
            System.out.printf("Total: R$ %.2f%n", 4.0 * qtd);
        } else if (code == 2) {
            System.out.printf("Total: R$ %.2f%n", 4.50 * qtd);
        } else if (code == 3) {
            System.out.printf("Total: R$ %.2f%n", 5.00 * qtd);
        } else if (code == 4) {
            System.out.printf("Total: R$ %.2f%n", 2.00 * qtd);
        } else if (code == 5) {
            System.out.printf("Total: R$ %.2f%n", 1.50 * qtd);
        }

        sc.close();
    }
}
