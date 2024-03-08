package eventcontrol;

import java.time.Duration;
import java.time.LocalDateTime;

public class Event {
    private String subject; // 이벤트 주제
    private LocalDateTime from; // 시작 일시
    private Duration duration; // 소요 시간

    public Event(String subject, LocalDateTime from, Duration duration) {
        this.subject = subject;
        this.from = from;
        this.duration = duration;
    }

    public boolean isSatisfied(RecurringSchedule schedule) {
        if (from.getDayOfWeek() != schedule.getDayOfWeek() ||
            !from.toLocalTime().equals(schedule.getFrom()) ||
            !duration.equals(schedule.getDuration())) {
            reschedule(schedule);
            return false;
        }
        return true;
    }
}