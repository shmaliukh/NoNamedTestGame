package com.nonamed.hackathon2022testgame;

import com.nonamed.hackathon2022testgame.sercives.SaveReadService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;

import java.net.URL;
import java.util.ResourceBundle;

public class PauseMenuController implements Initializable {

    @FXML
    protected void onContinueButtonClick() {
        Scene continueGameScene = new GameWorldHandler().getGameWorld().getGameScene();
        App.stage.setScene(continueGameScene);
    }

    @FXML
    protected void onMainMenuButtonClick() {
        Scene mainMenuScene = new MainMenu().mainMenuScene;
        App.stage.setScene(mainMenuScene);
    }

    @FXML
    protected void onRetryButtonClick() {
        Scene gameScene = SaveReadService.read().getGameWorld().gameScene;
        App.stage.setScene(gameScene);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
