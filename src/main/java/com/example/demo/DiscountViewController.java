package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.net.URL;
import java.util.ResourceBundle;

public class DiscountViewController implements Initializable {

    @FXML
    private ChoiceBox<String> myChoiceBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Add options to ChoiceBox
        myChoiceBox.getItems().addAll("5 more on purchase of 20 eggs",
                "250gm extra with 3+ kg of meat", "Extra 50 taka with 500+ vegetables",
                "Get 2 Piece extra items on 10+ plate set");
    }
}
