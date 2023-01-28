package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class PrimaryController {
    @FXML
    private TextField searchField;

    @FXML
    private Label searchResultsLabel;

    @FXML 
    private Label searchResults; 

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
        String searchText = searchField.getText();
        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "", 
                "You entered: " + searchText);

        // Make the API call
        /* Credits: 
            Simple JSON REST Consumption with GSON API
            https://www.codeproject.com/Tips/1159537/Simple-JSON-REST-Consumption-with-GSON-API
        */
        
        // Test searchText and 
        searchResults.setText(searchText);
        String apiResults = makeAPICall(searchText);


        // Process the results (as an object)
        // Call it SearchResults
        SearchResults results = new SearchResults();

        // Display results

    }
    protected String makeAPICall(String text) {
        String results = "";

        return results;
    }
}