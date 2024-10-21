public class DiscountFareStrategy implements FareStrategy {
    public double calculateFare(double distanceKm, double durationMin) {
        return Math.max((0.8 * distanceKm) + (0.15 * durationMin), 5.0);
    }
}
