package MovieReservation;

import java.time.LocalDateTime;

public class Screening { // 상영 클래스
    private Movie movie; // 상영할 영화
    private int sequence; // 순번
    private LocalDateTime whenScreened; // 상영시간

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public LocalDateTime getStartTime() { // 상영 시작 시간
        return whenScreened;
    }

    public boolean isSequence(int sequence) { // 순번 일치 여부 검사
        return this.sequence == sequence;
    }

    public Money getMovieFee() { // 기본 요금 반환
        return movie.getFee();
    }

    public Reservation reverse(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    public Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
