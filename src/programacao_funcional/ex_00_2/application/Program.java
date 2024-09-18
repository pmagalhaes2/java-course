package programacao_funcional.ex_00_2.application;

import programacao_funcional.ex_00_2.entities.Product;
import programacao_funcional.ex_00_2.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // usando interface
        // list.forEach(new PriceUpdate());

        // usando método estático
        // list.forEach(Product::staticPriceUpdate);

        // usando método não estático
        // list.forEach(Product::nonStaticPriceUpdate);

        // usando lambda declarada
        // Consumer<Product> cons = p -> {
        //    p.setPrice(p.getPrice() * 1.1);};
        // list.forEach(cons);

        // usando lambda inline
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
        list.forEach(System.out::println);
    }
}
