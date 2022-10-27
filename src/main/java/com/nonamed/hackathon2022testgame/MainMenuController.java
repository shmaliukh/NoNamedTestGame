package com.nonamed.hackathon2022testgame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable {

    @FXML
    protected void onNewGameButtonClick(){
        Scene gameScene = new GameWorldHandler().getGameWorld().getGameScene();
        App.stage.setScene(gameScene);
    }

    @FXML
    protected void onSettingsButtonClick(){
        App.stage.setScene(new SettingsMenu().settingsMenuScene);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
