package com.github.harryssuperman.javafxtutorial.jenkov.com;

import javafx.application.Application;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontSmoothingType;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {

        Text text = new Text("This is a longer JavaFX text.");

        text.setFont(Font.font("Arial", FontWeight.BOLD, 36));
        text.setFill(Color.YELLOW);
        text.setStroke(Color.GREEN);
        text.setTextOrigin(VPos.BASELINE);
        text.setFontSmoothingType(FontSmoothingType.LCD);

        Scene scene = new Scene(new VBox(text), 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
