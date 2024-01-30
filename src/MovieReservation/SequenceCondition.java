package MovieReservation;

public class SequenceCondition implements DiscountCondition{
    // 순번 조건
    private int sequence; // 순번

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        //screening의 상영순번과 Screening의 상영 순번이 일치할 경우 할인 가능
        return screening.isSequence(sequence);
    }
}
