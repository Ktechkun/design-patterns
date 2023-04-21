package solutions.parking_spot;

import solutions.parking_spot.manager.ParkingSpotManager;
import solutions.parking_spot.parking_spot.ParkingSpot;
import solutions.parking_spot.vehicle.Vehicle;
import solutions.parking_spot.vehicle.VehicleType;

public class EntranceGate {
    ParkingSpotManager parkingSpotManager;
    ParkingSpotManagerFactory parkingSpotManagerFactory = ParkingSpotManagerFactory.instance.getInstance();
    public Ticket generateTicket(Vehicle vehicle) {
        parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManger(vehicle.getVehicleType());
        ParkingSpot parkingSpot = parkingSpotManager.parkVehicle(vehicle);
        return new Ticket(vehicle, parkingSpot);
    }

}
