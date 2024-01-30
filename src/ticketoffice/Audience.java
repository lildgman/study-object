package ticketoffice;

public class Audience { // 관람객
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
    
    // 변경 후 Audience는 자신 가방에 초대장이 있는지 스스로 확인
    // 3자가 자신 가방을 보는것을 허용하지 않음, Audience가 Bag을 직접 처리
    
    // Bag을 사용하는 모든 부분을 Audience 내부로 옮김
}
