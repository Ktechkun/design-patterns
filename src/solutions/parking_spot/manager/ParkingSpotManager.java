package solutions.parking_spot.manager;

import solutions.parking_spot.parking_spot.ParkingSpot;
import solutions.parking_spot.parking_spot.space_finder.DefaultParkingSpaceFinder;
import solutions.parking_spot.parking_spot.space_finder.ParkingSpaceFinder;
import solutions.parking_spot.vehicle.Vehicle;

import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;
    ParkingSpaceFinder parkingSpaceFinder;

    ParkingSpotManager(List<ParkingSpot> parkingSpotList, DefaultParkingSpaceFinder parkingSpaceFinder) {
        this.parkingSpotList = parkingSpotList;
        this.parkingSpaceFinder = parkingSpaceFinder;
    }
    public void addParkingSpaces(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList.addAll(parkingSpotList);
    }
    public ParkingSpot findParkingSpot() {
        return parkingSpaceFinder.findParkingSpot(parkingSpotList);
    }

    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot parkingSpot = findParkingSpot();
        parkingSpot.parkVehicle(vehicle);
        parkingSpotList.remove(parkingSpot);
        return parkingSpot;
    }

    public void removeVehicle(ParkingSpot parkingSpot) {
        parkingSpot.removeVehicle();
        parkingSpotList.add(parkingSpot);
    }

}
