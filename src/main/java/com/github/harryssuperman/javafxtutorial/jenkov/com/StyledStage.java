package com.github.harryssuperman.javafxtutorial.jenkov.com;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StyledStage extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX App");
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.show();
    }
}
