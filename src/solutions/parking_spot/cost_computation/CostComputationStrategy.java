package solutions.parking_spot.cost_computation;

import solutions.parking_spot.Ticket;

public interface CostComputationStrategy {
    default Double getPrice(Ticket ticket) {
        return ticket.getParkingSpot().getPrice();
    }
}
