package ticketoffice;

public class Bag {
    private Long amount; // 현금, 이벤트 미당첨자는 돈을 내고 봐야함
    private Invitation invitation; // 초대장
    private Ticket ticket; // 티켓

    public Bag(long amount) { // 초대장 없이 현금만 보유(미당첨자)
        this(amount, null);
    }

    public Bag(Long amount, Invitation invitation) { // 초대장과 현금 보유(당첨자)
        this.amount = amount;
        this.invitation = invitation;
    }

    public boolean hasInvitaion() { // 초대장 보유 여부
        return invitation != null;
    }   

    public boolean hasTicket() { // 티켓 보유 여부
        return ticket != null;
    }

    public void setTicket(Ticket ticket) { // 초대장을 티켓으로 교환
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) { // 현금 감소
        this.amount -= amount;
    }

    public void plusAmount(Long amount) { // 현금 증가
        this.amount += amount;
    }
    // 이벤트 당첨된 관람객 가방에는 현금과 초대장이 들어있음
    // 이벤트 미당첨자에게는 초대장이 없을 것이다.
}
