package com.github.harryssuperman.javafxtutorial;

import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class DatePickerExtended extends DatePicker {

    public DatePickerExtended() {
    }

    public DatePickerExtended(LocalDate localDate) {
        super(localDate);
    }
}
