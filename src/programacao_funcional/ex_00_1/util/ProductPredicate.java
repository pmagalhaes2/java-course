package programacao_funcional.ex_00_1.util;

import programacao_funcional.ex_00_1.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100.00;
    }
}
