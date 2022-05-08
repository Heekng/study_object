package com.heekng.objectStudy.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 매표소
public class TicketOffice {
    // 판매 금액
    private Long amount;
    // 티켓
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}