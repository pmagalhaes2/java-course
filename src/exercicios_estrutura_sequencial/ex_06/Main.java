package exercicios_estrutura_sequencial.ex_06;

import java.util.Locale;
import java.util.Scanner;

// Cálculo de área
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f%n", (a * c) / 2);
        System.out.printf("CIRCULO: %.3f%n", 3.14159 * Math.pow(c, 2));
        System.out.printf("TRAPEZIO: %.3f%n", (a + b) * c / 2);
        System.out.printf("QUADRADO: %.3f%n", Math.pow(b, 2));
        System.out.printf("RETANGULO: %.3f%n", a * b);

        sc.close();
    }
}
