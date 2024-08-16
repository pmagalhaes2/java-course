package exercicios_estrutura_repeticao.loop_while.ex_01;

import java.util.Scanner;

// Verificação senha
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int password = sc.nextInt();

        while (password != 2002) {
            System.out.println("Senha Invalida");
            password = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
