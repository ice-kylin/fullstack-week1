package online.icekylin.exer2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class MainController {
    @FXML
    private Label infoLabel;

    @FXML
    private TextField nameField;

    @FXML
    private Button submitButton;

    @FXML
    private void initialize() {
        submitButton.setDisable(true);
    }

    @FXML
    private void cancelButtonClicked() {
        System.exit(0);
    }

    @FXML
    private void submitButtonClicked() {
        String info = nameField.getText().trim() + " entered the name!";

        System.out.println(info);
        infoLabel.setText(info);
    }

    @FXML
    private void nameFieldKeyReleased() {
        boolean isEmpty = nameField.getText().trim().isEmpty();

        infoLabel.setText("Please enter your name to win a prize:");

        if (isEmpty && !submitButton.isDisable()) {
            submitButton.setDisable(true);
        } else if (!isEmpty && submitButton.isDisable()) {
            submitButton.setDisable(false);
        }
    }
}
