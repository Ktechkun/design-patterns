package solutions.parking_spot.parking_spot;

import solutions.parking_spot.vehicle.Vehicle;

public class ParkingSpot {
    String Id;
    Double price = 0.0;
    Boolean isAvailable = Boolean.TRUE;
    Vehicle vehicle;

    public ParkingSpot(Double price) {
        this.price = price;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        isAvailable = false;
    }

    public void removeVehicle() {
        vehicle = null;
        isAvailable = true;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
