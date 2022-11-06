package com.github.harryssuperman.javafxtutorial.jenkov.com;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MySceneFxApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("My First JavaFX App");
        stage.getIcons().addAll(new Image("logo.png"));

        Label label = new Label("Hello World, JavaFX !");
        Button button = new Button("Exit");
        button.setOnAction(event -> Platform.exit());
        VBox vBox = new VBox(label, button);
        Scene scene = new Scene(vBox, 400, 200);
        stage.setScene(scene);


        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
