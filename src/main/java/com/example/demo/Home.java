package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Home extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        // Load the FXML file for Home.fxml
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/demo/Home.fxml"));

        // Set up the scene and load the FXML content
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        stage.setTitle("Online SuperMarket");
        stage.setResizable(false);  // Set resizable to false if needed
        stage.setScene(scene);
        stage.show();
    }
}
