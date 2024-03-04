public class Main {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(5); // Create a parking lot with 5 spots

        lot.parkCar("ABC123");
        lot.parkCar("XYZ789");
        lot.parkCar("DEF456");

        lot.printParkingLotStatus();

        lot.removeCar("XYZ789"); // Remove a car

        System.out.println("\nAfter removing a car:");
        lot.printParkingLotStatus();
    }
}
