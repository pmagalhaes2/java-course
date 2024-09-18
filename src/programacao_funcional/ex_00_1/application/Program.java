package programacao_funcional.ex_00_1.application;

import programacao_funcional.ex_00_1.entities.Product;
import programacao_funcional.ex_00_1.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // removendo usando lambda inline
        // list.removeIf(product -> product.getPrice() >= 100.00);

        // removendo usando predicate classe externa
        // list.removeIf(new ProductPredicate());

        // removendo usando método estático
        // list.removeIf(Product::staticProductsPredicate);

        // removendo usando método não estático
        // list.removeIf(Product::nonStaticProductsPredicate);

        // removendo usando predicate
        Predicate<Product> pred = product -> product.getPrice() >= 100.00;
        list.removeIf(pred);

        for (Product p : list) {
            System.out.println(p.toString());
        }
    }
}
