package com.heekng.objectStudy.object1;

// 관람객의 소지품을 보관할 가방
public class Bag {
    // 현금
    private Long amount;
    // 초대장
    private Invitation invitation;
    // 티켓
    private Ticket ticket;

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    // 현금만 보관하는 경우
    public Bag(Long amount) {
        this(null, amount);
    }

    // 현금과 초대장을 보관하는 경우
    public Bag(Invitation invitation, Long amount) {
        this.amount = amount;
        this.invitation = invitation;
    }

    private boolean hasInvitation() {
        return invitation == null;
    }

    public boolean hasTicket() {
        return ticket == null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }
}
