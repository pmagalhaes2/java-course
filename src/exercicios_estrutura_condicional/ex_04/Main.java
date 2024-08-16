package exercicios_estrutura_condicional.ex_04;

import java.util.Scanner;

// Duração jogo
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start, end, duration;

        start = sc.nextInt();
        end = sc.nextInt();

        if (start > end) {
            duration = (24 - start) + end;
        } else if (start == end) {
            duration = 24;
        } else {
            duration = end - start;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duration);

        sc.close();
    }
}
