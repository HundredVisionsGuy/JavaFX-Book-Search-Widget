package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class PrimaryController {
    @FXML
    private TextField searchField;

    @FXML
    private Label searchResultsLabel;

    @FXML
    private Button submitButton;

    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        Window owner = submitButton.getScene().getWindow();
        if(searchField.getText().isEmpty()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
                    "Please enter a search term (author, title, genre).");
            return;
        }

        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!", 
                "Welcome " + searchField.getText());
    }
}