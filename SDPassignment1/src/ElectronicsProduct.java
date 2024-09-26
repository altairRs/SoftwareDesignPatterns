public class ElectronicsProduct implements Product {
    private double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.05;  // 5% discount for electronics
    }

    public double getPrice() {
        return price;
    }
}