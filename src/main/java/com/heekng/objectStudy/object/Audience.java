package com.heekng.objectStudy.object;

// 관람객
public class Audience {
    // 가방
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
