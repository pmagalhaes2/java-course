package programacao_funcional.ex_01.application;

import programacao_funcional.ex_01.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> productList = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                productList.add(new Product(name, price));
                line = br.readLine();
            }

            double average =
                    productList.stream().map(Product::getPrice).reduce(0.0, Double::sum) / productList.size();

            System.out.println("Avarage price: " + String.format("%.2f", average));

            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> names =
                    productList.stream().filter(product -> product.getPrice() < average).map(Product::getName)
                            .sorted(comparator.reversed())
                            .toList();

            for (String name : names) {
                System.out.println(name);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
