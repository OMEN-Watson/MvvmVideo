package com.example.mvvmvideo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.example.mvvmvideo.basicCode.OrderBasic;

public class Main extends Application {
//    //region mvvm
//    @Override
//    public void start(Stage primaryStage) {
//
//        Order order = new Order();
//        OrderViewModel viewModel = new OrderViewModel(order);
//        OrderView view = new OrderView(viewModel);
//
//        primaryStage.setScene(view.getScene());
//        primaryStage.setWidth(700);
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
////endregion
    //region basic
    private OrderBasic order = new OrderBasic();
    private Label statusLabel = new Label();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        updateStatusLabel();

        Button processButton = new Button("Process Order");
        processButton.setOnAction(e -> {
            order.processOrder();
            updateStatusLabel();
        });

        Button shipButton = new Button("Ship Order");
        shipButton.setOnAction(e -> {
            order.shipOrder();
            updateStatusLabel();
        });

        Button cancelButton = new Button("Cancel Order");
        cancelButton.setOnAction(e -> {
            order.cancelOrder();
            updateStatusLabel();
        });

        VBox layout = new VBox(10, statusLabel, processButton, shipButton, cancelButton);
        Scene scene = new Scene(layout, 600, 200);

        primaryStage.setTitle("Online Order System_Basic");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateStatusLabel() {
        statusLabel.setText("Order Status: " + order.getStatus());
    }
    //endregion
}
