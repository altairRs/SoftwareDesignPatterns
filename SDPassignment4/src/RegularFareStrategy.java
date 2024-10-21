public class RegularFareStrategy implements FareStrategy {
    public double calculateFare(double distanceKm, double durationMin) {
        return (1.0 * distanceKm) + (0.25 * durationMin);
    }
}
