package arrays_e_listas.ex_00_1.application;

import arrays_e_listas.ex_00_1.entities.Product;

import java.util.Locale;
import java.util.Scanner;

// Problema "media_preco"
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];
        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            sum += price;
        }

        double average = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", average);

        sc.close();
    }
}
