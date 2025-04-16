package com.tutorialseu.fxmldemo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FormController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField emailField;

    @FXML
    private Button submitButton;

    @FXML
    private Button cancelButton;

    @FXML
    public void initialize() {
        submitButton.setOnAction(event -> handleSubmit());
        cancelButton.setOnAction(event -> handleCancel());
    }

    private void handleSubmit() {
        if (firstNameField.getText().isEmpty() || lastNameField.getText().isEmpty() || emailField.getText().isEmpty()) {
            // COMPLETE THIS: Show an alert if the form is incomplete
        } else {
            // COMPLETE THIS: Show a confirmation dialog
        }
    }

    private void handleCancel() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void showConfirmationDialog() {
        // COMPLETE THIS: Implement the confirmation dialog logic
    }
}