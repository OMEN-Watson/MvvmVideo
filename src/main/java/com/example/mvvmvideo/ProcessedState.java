package com.example.mvvmvideo;

public class ProcessedState implements OrderState {

    @Override
    public void next(Order order) {
        order.setState(new ShippedState());
    }

    @Override
    public void cancel(Order order) {

        order.setState(new CanceledState("Order has been canceled after processing but before shipping."));
    }
}
