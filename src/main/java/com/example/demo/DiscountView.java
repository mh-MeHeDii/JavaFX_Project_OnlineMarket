package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.IOException;

public class DiscountView extends Application{
    public ChoiceBox myChoiceBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Discount Menu opened");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DiscountView.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setTitle("Discount Menu");
        stage.resizableProperty();
        stage.setScene(scene);
        stage.show();
    }
}
