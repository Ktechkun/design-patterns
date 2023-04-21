package solutions.parking_spot;

import solutions.parking_spot.cost_computation.CostComputation;
import solutions.parking_spot.cost_computation.CostComputationFactory;
import solutions.parking_spot.manager.ParkingSpotManager;
import solutions.parking_spot.parking_spot.ParkingSpot;
import solutions.parking_spot.vehicle.Vehicle;

public class ExitGate {
    private ParkingSpotManagerFactory parkingSpotManagerFactory = ParkingSpotManagerFactory.instance.getInstance();
    private CostComputationFactory costComputationFactory = CostComputationFactory.instance.getInstance();
    private CostComputation costComputation;

    public void getBillPrice(Ticket ticket) {
        costComputation = costComputationFactory.getParkingSpotManger(ticket.getVehicle().getVehicleType());
        Double billAmount = costComputation.getPrice(ticket);
        System.out.println("Need to pay : " + billAmount);

        payBill(ticket);
        removeVehicle(ticket.getParkingSpot());
    }

    public void payBill(Ticket ticket) {
        System.out.println("Thank you for payment!!");
    }

    public void removeVehicle(ParkingSpot parkingSpot) {
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManger(parkingSpot.getVehicle().getVehicleType());
        parkingSpotManager.removeVehicle(parkingSpot);
    }

    public void payAndRemoveVehicle(Ticket ticket) {
        costComputation = costComputationFactory.getParkingSpotManger(ticket.getVehicle().getVehicleType());
        Double billAmount = costComputation.getPrice(ticket);
        Vehicle vehicle = ticket.getVehicle();
        System.out.println(vehicle.getVehicleType() + " " + vehicle.getVehicleNumber() + " : Need to pay : " + billAmount);

        payBill(ticket);
        removeVehicle(ticket.getParkingSpot());
    }
}
