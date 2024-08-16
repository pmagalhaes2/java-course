package exercicios_estrutura_sequencial.ex_02;

import java.util.Locale;
import java.util.Scanner;

// Área círculo
public class Main {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        double area = 3.14159 * Math.pow(radius, 2);

        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
