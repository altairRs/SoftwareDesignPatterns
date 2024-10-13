public class InventoryManager {
    private ProductCatalog productCatalog;

    public InventoryManager() {
        productCatalog = new ProductCatalog();
    }

    public boolean checkStock(int productId, int quantity) {
        Product product = productCatalog.searchProduct(productId);
        if (product != null && product.stock >= quantity) {
            return true;
        }
        System.out.println("Insufficient stock for " + productId + ".");
        return false;
    }

    public void updateStock(int productId, int quantity) {
        Product product = productCatalog.searchProduct(productId);
        if (product != null) {
            product.stock -= quantity;
        }
    }
}
