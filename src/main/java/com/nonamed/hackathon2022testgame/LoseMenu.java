package com.nonamed.hackathon2022testgame;

import com.nonamed.hackathon2022testgame.utils.MyLogUtil;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.io.IOException;

public final class LoseMenu {

    private final FXMLLoader FXML_LOADER = new FXMLLoader(App.class.getResource("loseMenu.fxml"));
    private Pane pane;
    public Scene loseMenuScene;

    public LoseMenu() {
        initScene();
    }

    private void initScene() {
        try {
            pane = FXML_LOADER.load();
        } catch (IOException ioe) {
            MyLogUtil.logErr(this, ioe);
        }
        loseMenuScene = new Scene(pane);
    }

}
