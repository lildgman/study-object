package ticketoffice;

public class TicketSeller { // 판매원, 초대장을 티켓으로 교환 or 티켓 판매 역할
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
