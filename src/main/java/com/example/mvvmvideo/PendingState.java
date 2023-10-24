package com.example.mvvmvideo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class PendingState  implements OrderState {

    @Override
    public void next(Order order) {
        order.setState(new ProcessedState());
    }

    @Override
    public void cancel(Order order) {
        order.setState(new CanceledState("Order has been canceled before processing."));
    }
}
