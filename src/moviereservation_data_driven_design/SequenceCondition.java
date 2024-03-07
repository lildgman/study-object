package moviereservation_data_driven_design;

public class SequenceCondition implements DiscountCondition{
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
