package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HomeController {

    @FXML
    private Hyperlink websiteLink;

    @FXML
    public void initialize() {
        websiteLink.setOnAction(event -> openWebsite("https://www.fakewebsite.com/OnlineSuperMarket"));

    }

    // Opens the given URL in the default browser
    private static void openWebsite(String url) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }
}
