public class Main {
    public static void main(String[] args) {
        ShoppingFacade facade = new ShoppingFacade();

        System.out.println("\n--- Test Case 1: Successful Order ---");
        facade.placeOrder(1, 2, "Mangilik");

        System.out.println("\n--- Test Case 2: Insufficient Stock ---");
        facade.placeOrder(1, 10, "Kabanbay");

        System.out.println("\n--- Test Case 3: Invalid Product ID ---");
        facade.placeOrder(99, 1, "Sarayshyq");
    }
}