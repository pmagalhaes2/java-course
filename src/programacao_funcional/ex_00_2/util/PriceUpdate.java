package programacao_funcional.ex_00_2.util;

import programacao_funcional.ex_00_2.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
