package com.github.harryssuperman.javafxtutorial;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.skin.DatePickerSkin;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalDate;

public class DatePickerExtendedExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        DatePickerExtended datePickerExtended = new DatePickerExtended(LocalDate.now());
        datePickerExtended.getStylesheets().add("date-picker.css");
        datePickerExtended.applyCss();
        DatePickerSkin datePickerSkin = new DatePickerSkin(datePickerExtended);
        Node popupContent = datePickerSkin.getNode();
        VBox vBox = new VBox(popupContent);
        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
