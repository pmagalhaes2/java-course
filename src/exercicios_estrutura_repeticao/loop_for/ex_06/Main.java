package exercicios_estrutura_repeticao.loop_for.ex_06;

import java.util.Scanner;

// Divisores
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
