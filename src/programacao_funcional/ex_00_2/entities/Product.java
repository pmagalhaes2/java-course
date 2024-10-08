package programacao_funcional.ex_00_2.entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static void staticPriceUpdate(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    public void nonStaticPriceUpdate() {
        price = price * 1.1;
    }

    @Override
    public String toString() {
        return "Produto: " + getName() + " - " + "Preço: R$ " + String.format("%.2f", getPrice());
    }
}
