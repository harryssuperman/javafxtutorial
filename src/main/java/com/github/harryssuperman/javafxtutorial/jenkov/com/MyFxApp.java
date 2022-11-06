package com.github.harryssuperman.javafxtutorial.jenkov.com;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MyFxApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX App");
        primaryStage.getIcons().addAll(new Image("logo.png"));


        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
