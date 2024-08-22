package heranca.ex_01.application;

import heranca.ex_01.entities.ImportedProduct;
import heranca.ex_01.entities.Product;
import heranca.ex_01.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        List<Product> products = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            System.out.print("Common, used or imported (c/u/i)? ");
            sc.nextLine();
            char opt = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (opt == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            } else if (opt == 'u') {
                System.out.print("Manufacture date: ");
                sc.nextLine();
                Date manufactureDate = sdf.parse(sc.nextLine());
                products.add(new UsedProduct(name, price, manufactureDate));
            } else {
                products.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product p : products) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
