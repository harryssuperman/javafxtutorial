package com.github.harryssuperman.javafxtutorial.jenkov.com;

import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class WindowModalStage extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX App");

        Stage stage = new Stage();
        stage.initModality(Modality.NONE);

        stage.initOwner(primaryStage);

        primaryStage.show();

        stage.showAndWait();
    }
}
