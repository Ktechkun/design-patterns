package solutions.parking_spot.cost_computation;

public class FourWheelerCostComputation extends CostComputation {
    public FourWheelerCostComputation() {
        super(new HourlyCostComputation());
    }
}
