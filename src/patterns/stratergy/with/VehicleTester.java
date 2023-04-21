package patterns.stratergy.with;

import patterns.stratergy.with.classes.*;
import patterns.stratergy.with.stratergies.BumpyDrive;
import patterns.stratergy.with.stratergies.NormalDrive;
import patterns.stratergy.with.stratergies.SpeedyDrive;

import java.util.ArrayList;
import java.util.List;

public class VehicleTester {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new SportsVehicle(new SpeedyDrive()));
        vehicleList.add(new GoodsVehicle(new NormalDrive()));
        vehicleList.add(new PassengerVehicle(new NormalDrive()));
        vehicleList.add(new OffRoadVehicle(new BumpyDrive()));

        vehicleList.forEach(Vehicle::simulateDrive);
    }
}
