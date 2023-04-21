package solutions.parking_spot.cost_computation;

import solutions.parking_spot.Ticket;

public class CostComputation {
    CostComputationStrategy costComputationStrategy;
    public CostComputation(CostComputationStrategy costComputationStrategy) {
        this.costComputationStrategy = costComputationStrategy;
    }

    public Double getPrice(Ticket ticket) {
        return costComputationStrategy.getPrice(ticket);
    }
}
