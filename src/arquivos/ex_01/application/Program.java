package arquivos.ex_01.application;


import arquivos.ex_01.application.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter file path: ");
        String srcPath = sc.nextLine();

        File srcFile = new File(srcPath);
        String srcFolder = srcFile.getParent();

        boolean success = new File(srcFolder + "\\out").mkdir();

        String targetFile = srcFolder + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(srcPath))) {
            String itemCsv = br.readLine();
            while (itemCsv != null) {
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                products.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
                for (Product product : products) {
                    bw.write(product.getName() + ',' + String.format("%.2f", product.total()));
                    bw.newLine();
                }

                System.out.println(targetFile + " CREATED");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        sc.close();
    }
}
