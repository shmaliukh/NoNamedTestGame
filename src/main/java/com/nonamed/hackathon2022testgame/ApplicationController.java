package com.nonamed.hackathon2022testgame;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ApplicationController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}