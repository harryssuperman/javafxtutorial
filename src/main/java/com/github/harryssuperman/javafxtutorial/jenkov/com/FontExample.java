package com.github.harryssuperman.javafxtutorial.jenkov.com;

import javafx.application.Application;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.List;

public class FontExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        List<String> fontFamilies = Font.getFamilies();
        List<String> fontNames = Font.getFontNames();
        Font defaultFont = Font.getDefault();

        System.out.println("Default Font: " + defaultFont);

        for (String fontFamily : fontFamilies) {
            System.out.println(fontFamily);
        }

        for (String fontName :
                fontNames) {
            System.out.println(fontName);
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
