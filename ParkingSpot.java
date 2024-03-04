public class ParkingSpot {
    private boolean isOccupied;
    private String licensePlate; // Assume every car has a unique license plate

    public ParkingSpot() {
        this.isOccupied = false;
        this.licensePlate = null;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void parkCar(String licensePlate) {
        this.isOccupied = true;
        this.licensePlate = licensePlate;
    }

    public void removeCar() {
        this.isOccupied = false;
        this.licensePlate = null;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
