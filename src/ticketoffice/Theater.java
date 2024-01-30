package ticketoffice;

public class Theater { // 극장

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
//        if (audience.getBag().hasInvitaion()) { // 관객에게 초대장이 있는지 확인
//            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//            audience.getBag().setTicket(ticket); // 있다면 티켓을 관객 가방에 넣어줌
//        } else { // 관객에게 초대장이 없다면
//            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//            audience.getBag().minusAmount(ticket.getFee()); //고객 가방에서 티켓 금액만큼 차감 후
//            ticketSeller.getTicketOffice().plusAmount(ticket.getFee()); // 극장 매표소에 금액 증가시킴
//            audience.getBag().setTicket(ticket); // 고객에게 티켓 넣어줌
//        }
        // 이 코드의 문제점
    /* 관람객과 판매원이 소극장의 통제를 받고있다.
       소극장이 관람객의 가방을 마음대로 보고 돈을 가져가는 상황

       판매원 입장에서 소극장이 매표소에 보관중인 티켓과 현금에 마음대로 접근가능

        이 코드를 이해하기 위해서는 세부적인 내용을 한꺼번에 기억하고 있어야 한다.
        enter 메서드를 보면,
        Theater의 enter메서드를 이해하기 위해서는 Audience가 Bag을 가지고 있고,
        Bag 안에는 현금과 티켓이 들어 있으며 TicketSeller가 TicketOffice에서 티켓을 판매하고
        TicketOffice안에 돈과 티켓이 보관돼 있다는 사실을 동시에 기억하고 있어야 한다.

        하나의 클래스나 메서드에서 너무 많은 세부사항을 다루고 있어 코드를 작성하는 사람과 보는 사람으로 하여금
        큰 부담을 준다.

        제일 큰 문제점
        Audience와 TicketSeller를 변경할 경우 Theater도 함께 변경해야한다.
        변경에 취약하다!!

        이 코드는 관객이 현금, 초대장을 보관하기 위한 가방을 항상 들고다닌다는 가정을 하고있음
        또한 판매원이 매표소에서만 티켓을 판매한다고 가정하고 있음

        가정이 바뀌게 되면 많은 곳을 변경해야함

        이것은 객체 사이 의존성과 관련된 문제다
        애플리케이션 기능을 구현하는데 필요한 최소한의 의존성만 유지하고 불필요한 의존성을 제거해야 함

        의존성이 과한 경우를 결합도가 높다고 한다.
        객체들이 합리적인 수준으로 의존할 경우: 결합도가 낮다고 한다.
        객체 사이 결합도를 낮춰 변경이 용이한 설계를 만들어야 함

        Audience와 TicketSeller가 직접 Bag과 TicketOffice를 처리하는 자율적 존재가 되도록 설계를 변경하자!
     */
        ticketSeller.sellTo(audience);
        // Theater는 오직 TicketOffice 인터페이스에만 의존
        // 객체를 인터페이스와 구현으로 나누고 인터페이스만 공개하는 것은
        // 결합도를 낮추고 변경하기 쉬운 코드로 작성하기 위한 설계 원칙
    }

}
