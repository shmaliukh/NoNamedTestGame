package com.nonamed.hackathon2022testgame;

import com.nonamed.hackathon2022testgame.utils.MyLogUtil;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.io.IOException;

public final class WinMenu {

    private final FXMLLoader FXML_LOADER = new FXMLLoader(App.class.getResource("winMenu.fxml"));
    private Pane pane;
    public Scene winMenuScene;

    public WinMenu() {
        initScene();
    }

    private void initScene() {
        try {
            pane = FXML_LOADER.load();
        } catch (IOException ioe) {
            MyLogUtil.logErr(this, ioe);
        }
        winMenuScene = new Scene(pane);
    }

}
