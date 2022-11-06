package com.github.harryssuperman.javafxtutorial.jenkov.com;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FullScreenModeStage extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX App");
        Button button = new Button("Full Screen");
        button.setOnAction((event) -> primaryStage.setFullScreen(true));
        VBox vbox = new VBox();
        vbox.getChildren().addAll(button);
        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }
}
