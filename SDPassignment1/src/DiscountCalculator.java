public class DiscountCalculator {
    public double calculateDiscount(Product product) {
        return product.getDiscount();  // Polymorphic call to get discount
    }
}
