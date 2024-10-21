import java.time.LocalTime;

public class RideContext {
    private FareStrategy fareStrategy;

    public RideContext(FareStrategy strategy) {
        this.fareStrategy = strategy;
    }

    public void setFareStrategy(FareStrategy strategy) {
        this.fareStrategy = strategy;
    }

    public double calculateFare(double distanceKm, double durationMin) {
        if (distanceKm < 0 || durationMin < 0) {
            System.out.println("Invalid input: Distance and duration must be non-negative.");
            return 0;
        }
        double fare = fareStrategy.calculateFare(distanceKm, durationMin);
        return Math.max(fare, 10.0);
    }

    public void selectStrategyBasedOnTime(LocalTime time) {
        if (time.isAfter(LocalTime.of(7, 0)) && time.isBefore(LocalTime.of(10, 0)) ||
                time.isAfter(LocalTime.of(17, 0)) && time.isBefore(LocalTime.of(20, 0))) {
            setFareStrategy(new SurgeFareStrategy());
        } else {
            setFareStrategy(new RegularFareStrategy());
        }
    }
}
