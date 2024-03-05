package rdd_moviereservation;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountCondition {
    private DiscountConditionType type; // 할인 조건의 종류
    private int sequence; // 순번 조건을 위한 순번
    private DayOfWeek dayOfWeek; // 기간 조건을 위한 요일
    private LocalTime startTime; // 시작 시간
    private LocalTime endTime; // 종료 시간
    public boolean isSatisfiedBy(Screening screening) {
        if (type == DiscountConditionType.PERIOD) {
            return isSatisfiedByPeriod(screening);
        }
        return isSatisfiedBySequence(screening);
    }

    private boolean isSatisfiedByPeriod(Screening screening) {
        return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
                startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
                endTime.isAfter(screening.getWhenScreened().toLocalTime()) >= 0;
    }
    private boolean isSatisfiedBySequence(Screening screening) {
        return sequence == screening.getSequence();
    }


}
