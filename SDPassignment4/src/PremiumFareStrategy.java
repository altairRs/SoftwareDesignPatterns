public class PremiumFareStrategy implements FareStrategy {
    public double calculateFare(double distanceKm, double durationMin) {
        return (2.0 * distanceKm) + (0.50 * durationMin) + 5.0;
    }
}
