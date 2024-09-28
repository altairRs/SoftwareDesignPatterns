public class Vehicle {
    private final String engineType;
    private final String transmission;
    private final String color;
    private final boolean hasSunroof;
    private final int numberOfDoors;

    private Vehicle(Builder builder) {
        this.engineType = builder.engineType;
        this.transmission = builder.transmission;
        this.color = builder.color;
        this.hasSunroof = builder.hasSunroof;
        this.numberOfDoors = builder.numberOfDoors;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public static class Builder {
        private String engineType;
        private String transmission;
        private String color;
        private boolean hasSunroof;
        private int numberOfDoors;

        public Builder withEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder withTransmission(String transmission) {
            this.transmission = transmission;
            return this;
        }

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        public Builder withSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Builder withNumberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}
