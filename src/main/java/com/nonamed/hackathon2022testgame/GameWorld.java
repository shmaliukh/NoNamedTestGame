package com.nonamed.hackathon2022testgame;

import com.nonamed.hackathon2022testgame.game_objects.micro.HeroPerson;
import com.nonamed.hackathon2022testgame.utils.MyLogUtil;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import lombok.Getter;

import java.io.IOException;

@Getter
public final class GameWorld {

    private final FXMLLoader FXML_LOADER = new FXMLLoader(App.class.getResource("mainScreen.fxml"));
    private Pane gamePane;
    public Scene gameScene;

    public GameWorld() {
        GameWorldHandler.HERO = new HeroPerson("Hero name", 100, 100);
        initScene();
    }

    private void initScene() {
        try {
            gamePane = FXML_LOADER.load();
        } catch (IOException ioe) {
            MyLogUtil.logErr(this, ioe);
        }
        gameScene = new Scene(gamePane);
    }

    public void registerObject(int id, ImageView imageView){
        gamePane.getChildren().add(id, imageView);
    }

    public void registerObject(int id, Group imageView){
        gamePane.getChildren().add(imageView);
    }

    public void registerObject(Group imageView) {
        gamePane.getChildren().add(imageView);
    }
}
