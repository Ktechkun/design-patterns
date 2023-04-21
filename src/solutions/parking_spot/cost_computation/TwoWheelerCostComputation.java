package solutions.parking_spot.cost_computation;

public class TwoWheelerCostComputation extends CostComputation{
    public TwoWheelerCostComputation() {
        super(new DailyCostComputation());
    }
}
