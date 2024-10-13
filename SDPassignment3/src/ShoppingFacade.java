public class ShoppingFacade {
    private ProductCatalog catalog;
    private PaymentProcessor paymentProcessor;
    private InventoryManager inventoryManager;
    private ShippingService shippingService;

    public ShoppingFacade() {
        catalog = new ProductCatalog();
        paymentProcessor = new PaymentProcessor();
        inventoryManager = new InventoryManager();
        shippingService = new ShippingService();
    }

    public void placeOrder(int productId, int quantity, String address) {
        Product product = catalog.searchProduct(productId);
        if (product == null) {
            System.out.println("Sorry, product not found.");
            return;
        }

        System.out.println("You selected: " + product.name + " - $" + product.price + " each");

        if (!inventoryManager.checkStock(productId, quantity)) {
            System.out.println("Order failed due to insufficient stock.");
            return;
        }

        double totalCost = product.price * quantity;
        double shippingCost = shippingService.calculateShipping(address);
        double grandTotal = totalCost + shippingCost;

        System.out.println("Total: $" + totalCost + ", Shipping: $" + shippingCost + ", Grand Total: $" + grandTotal);

        if (!paymentProcessor.processPayment(grandTotal)) {
            System.out.println("Order failed: Payment declined.");
            return;
        }

        inventoryManager.updateStock(productId, quantity);
        shippingService.shipOrder(product.name);

        System.out.println("Order placed successfully!");
    }
}
