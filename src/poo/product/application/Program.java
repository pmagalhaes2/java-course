package poo.product.application;

import poo.product.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.printf("Updated data: %s\n", product.toString());

        System.out.print("Enter the number of products to be added in stock: ");
        int addQuantity = sc.nextInt();
        product.addProducts(addQuantity);
        System.out.printf("Updated data: %s\n", product.toString());

        System.out.print("Enter the number of products to be removed in stock: ");
        int removeQuantity = sc.nextInt();
        product.removeProducts(removeQuantity);
        System.out.printf("Updated data: %s\n", product.toString());

        sc.close();
    }
}
