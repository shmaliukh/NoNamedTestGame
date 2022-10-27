package com.nonamed.hackathon2022testgame;

import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class App extends Application {

    public static boolean isAbleToUseEscButton = false;

    public static Stage stage; // window

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        stage.setTitle("Hackathon test game (noNamed)");

        stage.setScene(new MainMenu().mainMenuScene);

        stage.setMinWidth(1200);
        stage.setMinHeight(720);

        stage.addEventFilter(KeyEvent.KEY_PRESSED, (keyEvent -> {
            if (keyEvent.getCode() == KeyCode.ESCAPE && isAbleToUseEscButton) {
                stage.setScene(new PauseMenu().loseMenuScene);
            }
        }));


        stage.show();
    }
}