package com.github.harryssuperman.javafxtutorial.jenkov.com;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SetCursorScene extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX App");
        VBox vBox = new VBox();
        Scene scene = new Scene(vBox);
        scene.setCursor(Cursor.HAND);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
