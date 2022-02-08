package online.icekylin.pizza;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.util.Arrays;

public class PizzaController {
    private final String[] toppings = new String[]{
            "Pepperoni",
            "Chicken Breast Strips",
            "Sweetcorn",
            "Ham",
            "Mushrooms",
            "Onions",
            "Pineapple",
            "Smoked Bacon Rashers",
            "Green and Red Peppers"
    };

    @FXML
    private Button submitButton;

    @FXML
    private ChoiceBox<String> toppingChoiceBox;

    @FXML
    private TextField nameField;

    @FXML
    private void initialize() {
        toppingChoiceBox.getItems().addAll(Arrays.asList(toppings));
    }

    @FXML
    private void submitButtonClicked() {
    }
}
