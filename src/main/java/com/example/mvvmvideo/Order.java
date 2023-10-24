package com.example.mvvmvideo;

public class Order {
    private OrderState state;

    public Order() {
        this.state = new PendingState(); // default state
    }

    public void next() {
        state.next(this);
    }

    public void cancel() {
        state.cancel(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public OrderState getState() {
        return state;
    }
}


