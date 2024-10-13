public class ShippingService {
    public double calculateShipping(String address) {
        System.out.println("Calculating shipping charges to " + address + "...");
        return 50;
    }

    public void shipOrder(String productName) {
        System.out.println("Shipping " + productName + ". Your order is on the way!");
    }
}
