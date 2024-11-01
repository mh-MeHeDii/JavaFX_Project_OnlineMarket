package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;

public class CartView {

    @FXML
    private Text itemsText;

    @FXML
    private Button paymentButton;

    @FXML
    private Button addressButton;

    @FXML
    private CheckBox homeDeliveryCheckBox;

    @FXML
    private CheckBox pickUpCheckBox;

    @FXML
    public void initialize() {
        itemsText.setText("Items you have picked");
    }

    @FXML
    private void handlePaymentAction() {
        System.out.println("Payment button clicked.");
    }

    @FXML
    private void handleAddressAction() {
        System.out.println("Address button clicked.");
    }

    @FXML
    private void handleHomeDeliverySelection() {
        if (homeDeliveryCheckBox.isSelected()) {
            System.out.println("Home Delivery selected.");
            pickUpCheckBox.setSelected(false);
        }
    }

    @FXML
    private void handlePickUpSelection() {
        if (pickUpCheckBox.isSelected()) {
            System.out.println("PickUp selected.");
            homeDeliveryCheckBox.setSelected(false);
        }
    }
}
