package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.net.URL;
import java.util.ResourceBundle;

public class CategoriesController implements Initializable {

    @FXML
    private ChoiceBox<String> myChoiceBox;

    // MenuItem variables for category actions
    @FXML
    private MenuItem category1;
    @FXML
    private MenuItem category2;
    @FXML
    private MenuItem category3;
    @FXML
    private MenuItem preferences;
    @FXML
    private MenuItem about;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize ChoiceBox with options
        myChoiceBox.getItems().addAll("Fruits", "Vegetables", "Meats", "Fishes",
                "Baby Foods", "Diet Items", "Vitamins", "Others");

        // Set up event handlers for the menu items
        category1.setOnAction(event -> showCategoryAlert("Category 1"));
        category2.setOnAction(event -> showCategoryAlert("Category 2"));
        category3.setOnAction(event -> showCategoryAlert("Category 3"));
        preferences.setOnAction(event -> showCategoryAlert("Preferences"));
        about.setOnAction(event -> showCategoryAlert("About"));
    }

    // Helper method to show alerts for selected menu items
    private void showCategoryAlert(String category) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Category Selected");
        alert.setHeaderText(null);
        alert.setContentText("You selected: " + category);
        alert.showAndWait();
    }
}

