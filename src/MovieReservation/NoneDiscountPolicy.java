package MovieReservation;

public class NoneDiscountPolicy extends DiscountPolicy{

    public NoneDiscountPolicy(DiscountCondition conditions) {
        super(conditions);
    }

    @Override
    public Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
