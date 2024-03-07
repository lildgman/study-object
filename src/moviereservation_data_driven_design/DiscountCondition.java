package moviereservation_data_driven_design;


public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);

}
