import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        RideContext ride = new RideContext(new RegularFareStrategy());

        System.out.println("\n--- Test Case 1: Regular Fare ---");
        double fare1 = ride.calculateFare(10, 15);
        System.out.println("Fare: $" + fare1);

        System.out.println("\n--- Test Case 2: Discount Fare ---");
        ride.setFareStrategy(new DiscountFareStrategy());
        double fare2 = ride.calculateFare(3, 5);
        System.out.println("Fare: $" + fare2);

        System.out.println("\n--- Test Case 3: Premium Fare ---");
        ride.setFareStrategy(new PremiumFareStrategy());
        double fare3 = ride.calculateFare(12, 20);
        System.out.println("Fare: $" + fare3);

        System.out.println("\n--- Test Case 4: Surge Fare During Peak Hours ---");
        ride.selectStrategyBasedOnTime(LocalTime.of(8, 30));
        double fare4 = ride.calculateFare(5, 10);
        System.out.println("Fare: $" + fare4);

        System.out.println("\n--- Test Case 5: Invalid Input (Negative Distance) ---");
        double fare5 = ride.calculateFare(-5, 10);
        System.out.println("Fare: $" + fare5);
    }
}
