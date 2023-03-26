package com.github.harryssuperman.javafxtutorial.java2s.com;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class LineExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Drawing Lines");

        Group root = new Group();
        Scene scene = new Scene(root, 300, 150, Color.GRAY);

        Line redLine = new Line(10, 10, 200, 10);
        Line blueLine = new Line(10, 5, 200, 15);

        redLine.setStroke(Color.RED);
        redLine.setStrokeType(StrokeType.CENTERED);
        redLine.setStrokeWidth(10);
        redLine.setStrokeLineCap(StrokeLineCap.ROUND);

        blueLine.setStroke(Color.BLUE);
        blueLine.setStrokeType(StrokeType.CENTERED);
        blueLine.setStrokeWidth(10);
        blueLine.setStrokeLineCap(StrokeLineCap.ROUND);

        blueLine.setStrokeLineJoin(StrokeLineJoin.ROUND);


//        redLine.getStrokeDashArray().addAll(15d, 5d, 15d, 15d, 20d);
//        redLine.setStrokeDashOffset(10);

        root.getChildren().addAll(redLine, blueLine);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
