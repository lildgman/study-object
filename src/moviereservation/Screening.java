package moviereservation;

import java.time.LocalDateTime;

public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreend;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreend) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreend = whenScreend;
    }

    public Reservation reserve(Customer customer, int audienceCount) {
        // 영화 예매 기능
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);


    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public LocalDateTime getWhenScreend() { // 상영 시작 시간 반환
        return whenScreend;
    }

    public boolean isSequence(int sequence) { // 순번 일치 여부
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }
}
