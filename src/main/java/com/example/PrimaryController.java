package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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
        
        // Display the search text
        searchResults.setText(searchText);

        // Make API Call
        String apiResults = makeAPICall(searchText);
        searchResults.setText(apiResults);


        // Process the results (as an object)
        // Call it SearchResults
        SearchResults results = new SearchResults();

        // Display results

    }
    protected String makeAPICall(String text) {
        String results = "";
        String host = "http://gutendex.com/";
        String endpoint = "books";
        String query = "?" + text;

        String url = host + endpoint + query;
        try {
            results = fetchContent(url);
        }
        catch (IOException ex) {
            results = "Oops! There was a problem\n";
            results += ex.toString();
        }

        return results;
    }
    private static String fetchContent(String uri) throws IOException {
        final int OK = 200;
        URL url = new URL(uri);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        int responseCode = connection.getResponseCode();
        if (responseCode == OK) {
            BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
            );
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return response.toString();
        }
        return null;
    }
}