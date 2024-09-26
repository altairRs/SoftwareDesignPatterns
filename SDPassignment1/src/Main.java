public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();

        Product food = new FoodProduct(100);
        Product electronics = new ElectronicsProduct(200);
        Product clothing = new ClothingProduct(150);

        System.out.println("Food Product Discount: " + discountCalculator.calculateDiscount(food));
        System.out.println("Electronics Product Discount: " + discountCalculator.calculateDiscount(electronics));
        System.out.println("Clothing Product Discount: " + discountCalculator.calculateDiscount(clothing));
    }
}
