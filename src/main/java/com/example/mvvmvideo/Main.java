package com.example.mvvmvideo;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {

        Order order = new Order();
        OrderViewModel viewModel = new OrderViewModel(order);
        OrderView view = new OrderView(viewModel);

        primaryStage.setScene(view.getScene());
        primaryStage.setWidth(700);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
