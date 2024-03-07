package moviereservation_data_driven_design;

public class PeriodCondition implements DiscountCondition {
    public boolean isSatisfiedBy(Screening screening) {
        return false;
    }
}
