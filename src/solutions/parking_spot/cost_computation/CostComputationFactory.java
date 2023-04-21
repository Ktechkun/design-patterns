package solutions.parking_spot.cost_computation;

import solutions.parking_spot.vehicle.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class CostComputationFactory {
    Map<VehicleType, CostComputation> costComputationMap = new HashMap<>();
    static public CostComputationFactory instance = new CostComputationFactory();
    private CostComputationFactory() {}
    public CostComputation getParkingSpotManger(VehicleType vehicleType) {
        return switch (vehicleType) {
            case TWO_WHEELER -> costComputationMap.getOrDefault(VehicleType.TWO_WHEELER, new TwoWheelerCostComputation());
            case FOUR_WHEELER -> costComputationMap.getOrDefault(VehicleType.FOUR_WHEELER, new FourWheelerCostComputation());
        };
    }

    public void setParkingSpotManagerMap(Map<VehicleType, CostComputation> costComputationMap) {
        this.costComputationMap = costComputationMap;
    }

    public CostComputationFactory getInstance() {
        if(instance == null) return new CostComputationFactory();
        return instance;
    }
}
