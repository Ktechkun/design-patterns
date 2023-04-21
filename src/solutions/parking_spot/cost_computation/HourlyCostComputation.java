package solutions.parking_spot.cost_computation;

import solutions.parking_spot.Ticket;

public class HourlyCostComputation implements CostComputationStrategy{
    @Override
    public Double getPrice(Ticket ticket) {
        return (double) ticket.getEntryTime().getSecond();
    }
}
