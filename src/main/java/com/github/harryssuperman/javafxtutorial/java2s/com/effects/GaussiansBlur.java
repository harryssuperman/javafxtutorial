package com.github.harryssuperman.javafxtutorial.java2s.com.effects;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GaussiansBlur extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250, Color.WHITE);

        Group g = new Group();

        Text t = new Text();
        t.setX(10.0);
        t.setY(40.0);
        t.setCache(true);
        t.setText("Blurry Text");
        t.setFill(Color.web("0x3b596d"));
        t.setFont(Font.font(null, FontWeight.BOLD, 50));

        t.setEffect(new GaussianBlur());

        g.getChildren().add(t);

        root.getChildren().add(g);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
