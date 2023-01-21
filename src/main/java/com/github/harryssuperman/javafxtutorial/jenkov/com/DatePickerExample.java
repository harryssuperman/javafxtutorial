package com.github.harryssuperman.javafxtutorial.jenkov.com;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DatePickerExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        DatePicker datePicker = new DatePicker();
        datePicker.getSkin().getNode().lookup(".month-year-pane").setVisible(false);
        VBox vBox = new VBox(datePicker);
        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
