package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloController {

    @FXML
    private Button homeButton;
    @FXML
    private Button cartButton;
    @FXML
    private Button categoriesButton;
    @FXML
    private Button discountButton;
    @FXML
    private Button salesButton;
    @FXML
    private Button helpButton;

    // Function to open a new window
    private void openWindow(String fxmlFile, String title) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(fxmlLoader.load()));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onHomeButtonClick() {
        openWindow("Home.fxml", "Home");
        System.out.println("You are on Home Menu");
    }

    @FXML
    private void onCartButtonClick() {
        openWindow("CartView.fxml", "Cart");
        System.out.println("You are on Cart Menu");
    }

    @FXML
    private void onCategoriesButtonClick() {
        openWindow("Categories.fxml", "Categories");
        System.out.println("You are on Categories Menu");
    }

    @FXML
    private void onDiscountButtonClick() {
        openWindow("DiscountView.fxml", "Discount");
        System.out.println("You are on Discount Menu");
    }

    @FXML
    private void onSalesButtonClick() {
        openWindow("Sales.fxml", "Sales");
        System.out.println("You are on Sales Menu");
    }

    @FXML
    private void onHelpButtonClick() {
        openWindow("HelpView.fxml", "Help");
        System.out.println("You are on Help Menu");
    }
}
