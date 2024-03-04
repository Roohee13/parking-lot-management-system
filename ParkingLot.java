public class ParkingLot {
    private ParkingSpot[] spots;

    public ParkingLot(int size) {
        spots = new ParkingSpot[size];
        for (int i = 0; i < size; i++) {
            spots[i] = new ParkingSpot();
        }
    }

    public boolean parkCar(String licensePlate) {
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied()) {
                spot.parkCar(licensePlate);
                return true; // Car parked successfully
            }
        }
        System.out.println("Parking lot is full.");
        return false; // Parking lot is full
    }

    public boolean removeCar(String licensePlate) {
        for (ParkingSpot spot : spots) {
            if (spot.isOccupied() && spot.getLicensePlate().equals(licensePlate)) {
                spot.removeCar();
                return true; // Car removed successfully
            }
        }
        System.out.println("Car not found.");
        return false; // Car with given license plate not found
    }

    public void printParkingLotStatus() {
        System.out.println("Parking Lot Status:");
        for (int i = 0; i < spots.length; i++) {
            if (spots[i].isOccupied()) {
                System.out.println("Spot " + (i + 1) + ": Occupied by " + spots[i].getLicensePlate());
            } else {
                System.out.println("Spot " + (i + 1) + ": Empty");
            }
        }
    }
}
