package ticketoffice;

public class TicketSeller { // 판매원, 초대장을 티켓으로 교환 or 티켓 판매 역할
    private TicketOffice ticketOffice;

//    public TicketSeller(TicketOffice ticketOffice) {
//        this.ticketOffice = ticketOffice;
//    }
    // ticketOffice의 가시성이 private
    // 접근 가능한 public 메서드가 없으므로 외부에서 ticketOffice에 직접 접근 불가

    public void sellTo(Audience audience) {
        ticketOffice.sellTicketTo(audience);
    } // TicketSeller가 Audience 인터페이스에만 의존
    // TicketSeller가 buy메서드 호출
    
    // TicketOffice를 사용하는 모든 부분을 TicketSeller 내부로 옮김
}
