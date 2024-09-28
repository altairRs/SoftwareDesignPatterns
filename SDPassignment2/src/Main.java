public class Main {
    public static void main(String[] args) {
        Vehicle luxuryCar = new Vehicle.Builder()
                .withEngineType("V8")
                .withTransmission("Automatic")
                .withColor("Black")
                .withSunroof(true)
                .withNumberOfDoors(4)
                .build();

        System.out.println("Luxury Car: ");
        System.out.println("Engine: " + luxuryCar.getEngineType());
        System.out.println("Transmission: " + luxuryCar.getTransmission());
        System.out.println("Color: " + luxuryCar.getColor());
        System.out.println("Sunroof: " + luxuryCar.isHasSunroof());
        System.out.println("Number of Doors: " + luxuryCar.getNumberOfDoors());
        
        Vehicle basicCar = new Vehicle.Builder()
                .withEngineType("Electric")
                .withTransmission("Manual")
                .withColor("White")
                .withNumberOfDoors(2)
                .build();

        System.out.println("\nBasic Car: ");
        System.out.println("Engine: " + basicCar.getEngineType());
        System.out.println("Transmission: " + basicCar.getTransmission());
        System.out.println("Color: " + basicCar.getColor());
        System.out.println("Sunroof: " + basicCar.isHasSunroof());
        System.out.println("Number of Doors: " + basicCar.getNumberOfDoors());
    }
}
