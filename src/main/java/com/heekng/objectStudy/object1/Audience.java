package com.heekng.objectStudy.object1;

// 관람객
public class Audience {
    // 가방
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
