package com.example.mvvmvideo;

public class ShippedState implements OrderState {

    @Override
    public void next(Order order) {
        // Do nothing, as the order is already shipped.
    }

    @Override
    public void cancel(Order order) {
        order.setState(new CanceledState("Order has been canceled after shipping. Return process initiated."));
    }
}
