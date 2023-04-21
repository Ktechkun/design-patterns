package solutions.parking_spot.parking_spot.space_finder;

import solutions.parking_spot.parking_spot.ParkingSpot;
import solutions.parking_spot.vehicle.VehicleType;

import java.util.List;
import java.util.stream.Collectors;

public class DefaultParkingSpaceFinder implements ParkingSpaceFinder{

    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpotList) {
        return parkingSpotList.stream().filter(ParkingSpot::getAvailable).findFirst().get();
    }
}
