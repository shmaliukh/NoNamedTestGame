module com.nonamed.hackathon2022testgame {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires org.slf4j;
    requires java.logging;


    opens com.nonamed.hackathon2022testgame to javafx.fxml;
    exports com.nonamed.hackathon2022testgame;

    exports com.nonamed.hackathon2022testgame.game_objects;
    opens com.nonamed.hackathon2022testgame.game_objects to javafx.fxml;
    exports com.nonamed.hackathon2022testgame.game_objects.micro;
    opens com.nonamed.hackathon2022testgame.game_objects.micro to javafx.fxml;
    exports com.nonamed.hackathon2022testgame.sercives;
    opens com.nonamed.hackathon2022testgame.sercives to javafx.fxml;
    exports com.nonamed.hackathon2022testgame.utils;
    opens com.nonamed.hackathon2022testgame.utils to javafx.fxml;


}