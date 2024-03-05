package rdd_moviereservation;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
