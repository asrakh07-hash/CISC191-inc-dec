package edu.asrasdmesa;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField numberField;

    private int getValue() {
        try {
            return Integer.parseInt(numberField.getText());
        } catch (NumberFormatException e) {
            return 0; // default if user types something invalid
        }
    }

    @FXML
    private void increment() {
        int value = getValue();
        value++;
        numberField.setText(String.valueOf(value));
    }

    @FXML
    private void decrement() {
        int value = getValue();
        value--;
        numberField.setText(String.valueOf(value));
    }
}

