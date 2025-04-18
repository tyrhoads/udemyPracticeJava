package com.tutorialseu.fxmldemo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Optional;

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
            showAlert("Form incomplete" , "Please fill it out");
        } else {
            showConfirmationDialog();
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
        Alert contfirmationDialog = new Alert(AlertType.CONFIRMATION);
        contfirmationDialog.setTitle("Confirmed");
        contfirmationDialog.setHeaderText("Please Confirm");
        contfirmationDialog.setContentText("First Name: " + firstNameField.getText() + "\n"
                + "Last Name: " + lastNameField.getText() + "\n"
                + "Email: " + emailField.getText());

        ButtonType okButton = new ButtonType("OK");
        ButtonType cancelButton = new ButtonType("Cancel");

        contfirmationDialog.getButtonTypes().setAll(okButton, cancelButton);

        Optional<ButtonType> result = contfirmationDialog.showAndWait();
        if (result.isPresent() && result.get() == okButton) {
            handleCancel(); // Close the program

        }
}
}