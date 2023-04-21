package solutions.parking_spot.parking_spot.space_finder;

import solutions.parking_spot.parking_spot.ParkingSpot;
import solutions.parking_spot.vehicle.VehicleType;

import java.util.List;

public interface ParkingSpaceFinder {
     ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList);
}
