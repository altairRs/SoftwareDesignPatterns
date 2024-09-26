public class FoodProduct implements Product {
    private double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.1;  // 10% discount for food products
    }

    public double getPrice() {
        return price;
    }
}