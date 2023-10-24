package com.example.mvvmvideo.basicCode;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainBasic extends Application {
    //region
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
        Scene scene = new Scene(layout, 300, 200);

        primaryStage.setTitle("Online Order System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateStatusLabel() {
        statusLabel.setText("Order Status: " + order.getStatus());
    }
    //endregion
}
