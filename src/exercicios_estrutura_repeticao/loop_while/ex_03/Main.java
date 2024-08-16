package exercicios_estrutura_repeticao.loop_while.ex_03;

import java.util.Scanner;

// Posto de combustível
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcohol = 0, gasoline = 0, diesel = 0;

        int option = sc.nextInt();

        while (option != 4) {
            if (option == 1) {
                alcohol += 1;
            } else if (option == 2) {
                gasoline += 1;
            } else if (option == 3) {
                diesel += 1;
            }
            option = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcohol);
        System.out.printf("Gasolina: %d\n", gasoline);
        System.out.printf("Diesel: %d\n", diesel);
    }
}
