package solutions.parking_spot;

import solutions.parking_spot.manager.ParkingSpotManager;
import solutions.parking_spot.vehicle.VehicleType;

import java.util.Map;

public class ParkingSpotManagerFactory {
    Map<VehicleType, ParkingSpotManager> parkingSpotManagerMap;
    static public ParkingSpotManagerFactory instance = new ParkingSpotManagerFactory();
    private ParkingSpotManagerFactory() {
    }
    public ParkingSpotManager getParkingSpotManger(VehicleType vehicleType) {
        return switch (vehicleType) {
            case TWO_WHEELER -> parkingSpotManagerMap.getOrDefault(VehicleType.TWO_WHEELER, null);
            case FOUR_WHEELER -> parkingSpotManagerMap.getOrDefault(VehicleType.FOUR_WHEELER, null);
        };
    }

    public void setParkingSpotManagerMap(Map<VehicleType, ParkingSpotManager> parkingSpotManagerMap) {
        this.parkingSpotManagerMap = parkingSpotManagerMap;
    }

    public ParkingSpotManagerFactory getInstance() {
        if(instance == null) return new ParkingSpotManagerFactory();
        return instance;
    }

}
