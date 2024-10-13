import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    private Map<Integer, Product> products;

    public ProductCatalog() {
        products = new HashMap<>();
        products.put(1, new Product("Laptop", 1500, 5));
        products.put(2, new Product("Smartphone", 800, 10));
        products.put(3, new Product("Headphones", 150, 20));
    }

    public Product searchProduct(int productId) {
        return products.get(productId);
    }
}

class Product {
    String name;
    double price;
    int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
