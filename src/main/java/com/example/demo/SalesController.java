package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SalesController {

    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private CheckBox checkBox1;

    @FXML
    private CheckBox checkBox2;

    @FXML
    private CheckBox checkBox3;

    @FXML
    private DatePicker datePicker;

    @FXML
    private ImageView imageView;

    public void initialize() {
        // Initialize choice box options and set a default value
        choiceBox.getItems().addAll("Option 1", "Option 2", "Option 3");
        if (choiceBox.getItems().size() > 0) {
            choiceBox.setValue(choiceBox.getItems().get(0)); // Set first item as default
        }

        // Load image safely
        try {
            Image image = new Image(getClass().getResource("/images/wow.jpg").toExternalForm());
            imageView.setImage(image);
        } catch (NullPointerException e) {
            System.out.println("Image not found: " + e.getMessage());
        }
    }
    public void handleChoiceBoxAction() {
        String selectedOption = choiceBox.getValue();
        System.out.println("Selected option: " + selectedOption);
    }

    public void handleDatePickerAction() {
        System.out.println("Selected date: " + datePicker.getValue());
    }

    public void handleCheckBox1Action() {
        System.out.println("CheckBox 1 selected: " + checkBox1.isSelected());
    }

    public void handleCheckBox2Action() {
        System.out.println("CheckBox 2 selected: " + checkBox2.isSelected());
    }

    public void handleCheckBox3Action() {
        System.out.println("CheckBox 3 selected: " + checkBox3.isSelected());
    }
}

