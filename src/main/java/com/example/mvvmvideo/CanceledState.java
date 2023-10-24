package com.example.mvvmvideo;

public class CanceledState implements OrderState {

    private final String message;

    public CanceledState(String message) {
        this.message = message;
    }

    @Override
    public void next(Order order) {
        // Do nothing, as the order is canceled.
    }

    @Override
    public void cancel(Order order) {
        // Do nothing, as the order is already canceled.
    }

    public String getMessage() {
        return message;
    }
}
