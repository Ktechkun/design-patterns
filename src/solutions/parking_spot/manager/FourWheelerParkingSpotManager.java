package solutions.parking_spot.manager;

import solutions.parking_spot.parking_spot.ParkingSpot;
import solutions.parking_spot.parking_spot.space_finder.DefaultParkingSpaceFinder;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{

    FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList) {
        super(parkingSpotList, new DefaultParkingSpaceFinder());
    }
}
