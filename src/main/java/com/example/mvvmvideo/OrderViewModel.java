package com.example.mvvmvideo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class OrderViewModel {
    private Order order;
    private StringProperty orderStatusProperty = new SimpleStringProperty();

    public OrderViewModel(Order order) {
        this.order = order;
        updateStatus();
    }

    public StringProperty orderStatusProperty() {
        return orderStatusProperty;
    }

    public void processOrder() {
        order.next();
        updateStatus();
    }

    public void cancelOrder() {
        order.cancel();
        updateStatus();
    }

    private void updateStatus() {
        if (order.getState() instanceof CanceledState) {
            orderStatusProperty.set(((CanceledState) order.getState()).getMessage());
        } else {
            orderStatusProperty.set(order.getState().getClass().getSimpleName());
        }
    }
}
