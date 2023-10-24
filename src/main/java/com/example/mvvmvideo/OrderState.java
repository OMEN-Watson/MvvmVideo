package com.example.mvvmvideo;

public interface OrderState {
    void next(Order order);
    void cancel(Order order);
}
