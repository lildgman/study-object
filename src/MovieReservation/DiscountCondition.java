package MovieReservation;

public interface DiscountCondition {
    // 할인이 가능할 경우 true, 불가능하면 false
    boolean isSatisfiedBy(Screening screening);
}
