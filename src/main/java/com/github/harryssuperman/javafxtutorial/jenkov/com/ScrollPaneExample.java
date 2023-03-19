package com.github.harryssuperman.javafxtutorial.jenkov.com;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ScrollPaneExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(new ImageView(String.valueOf(getClass().getClassLoader().getResource("images/arcoiris.png"))));
        scrollPane.setPrefSize(250, 250);
        scrollPane.setPannable(true);
//        scrollPane.setFitToHeight(true);

        Scene scene = new Scene(scrollPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ScrollPane Example");
        primaryStage.show();
    }
}
