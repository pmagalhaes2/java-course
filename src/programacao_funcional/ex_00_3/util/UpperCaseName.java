package programacao_funcional.ex_00_3.util;

import programacao_funcional.ex_00_3.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
