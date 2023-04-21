package solutions.parking_spot;

import solutions.parking_spot.manager.ParkingSpotManager;
import solutions.parking_spot.manager.TwoWheelerParkingSpotManager;
import solutions.parking_spot.parking_spot.FourWheelerParkingSpot;
import solutions.parking_spot.parking_spot.ParkingSpot;
import solutions.parking_spot.parking_spot.TwoWheelerParkingSpot;
import solutions.parking_spot.vehicle.FourWheeler;
import solutions.parking_spot.vehicle.Vehicle;
import solutions.parking_spot.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class ParkingLot {
    private EntranceGate entranceGate;
    private ExitGate exitGate;

    public ParkingLot() {
        entranceGate = new EntranceGate();
        exitGate = new ExitGate();
    }
    public void go() {
        List<Vehicle> cars = new ArrayList<>();
        for (int i =0; i < 10 ; i++) {
            cars.add(new FourWheeler("10"+i));
        }
        List<Ticket> ticketList = cars.stream().map((car) -> entranceGate.generateTicket(car)).toList();
        ticketList.forEach((ticket -> exitGate.payAndRemoveVehicle(ticket)));

    }

    public void setUpParkingLot() {
        List<ParkingSpot> twoWheelerParkingSpots = new ArrayList<>();
        for (int i =0; i < 400 ; i++)
            twoWheelerParkingSpots.add(new TwoWheelerParkingSpot());
        List<ParkingSpot> fourWheelerParkingSpots = new ArrayList<>();
        for (int i =0; i < 200 ; i++)
            fourWheelerParkingSpots.add(new FourWheelerParkingSpot());
        Map<VehicleType, ParkingSpotManager> parkingSpotManagerMap = new HashMap<>();
        parkingSpotManagerMap.put(VehicleType.TWO_WHEELER,new TwoWheelerParkingSpotManager(twoWheelerParkingSpots));
        parkingSpotManagerMap.put(VehicleType.FOUR_WHEELER,new TwoWheelerParkingSpotManager(fourWheelerParkingSpots));
        ParkingSpotManagerFactory.instance.setParkingSpotManagerMap(parkingSpotManagerMap);
    }
}
