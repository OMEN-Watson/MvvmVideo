package com.example.mvvmvideo;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class OrderView {
    private Scene scene;
    private OrderViewModel viewModel;

    public OrderView(OrderViewModel viewModel) {
        this.viewModel = viewModel;

        Label statusLabel = new Label();
        statusLabel.textProperty().bind(viewModel.orderStatusProperty());

        Button processButton = new Button("Process Order");
        processButton.setOnAction(e -> viewModel.processOrder());

        Button cancelButton = new Button("Cancel Order");
        cancelButton.setOnAction(e -> viewModel.cancelOrder());

        VBox layout = new VBox(10, statusLabel, processButton, cancelButton);
        scene = new Scene(layout, 300, 200);
    }

    public Scene getScene() {
        return scene;
    }
}
