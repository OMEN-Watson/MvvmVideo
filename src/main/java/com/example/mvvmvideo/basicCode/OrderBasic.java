package com.example.mvvmvideo.basicCode;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.example.mvvmvideo.Order;
import com.example.mvvmvideo.OrderState;
import com.example.mvvmvideo.PendingState;

public class OrderBasic {
    private String status;

    public OrderBasic() {
        this.status = "Pending";
    }

    public String getStatus() {
        return status;
    }

    public void processOrder() {
        if (status.equals("Pending")) {
            status = "Processed";
        }
    }

    public void shipOrder() {
        if (status.equals("Processed")) {
            status = "Shipped";
        }
    }

    public void cancelOrder() {
        if (!status.equals("Shipped")) {
            status = "Canceled";
        } else {
            status = "Canceled - Initiate Return";
        }
    }
}









