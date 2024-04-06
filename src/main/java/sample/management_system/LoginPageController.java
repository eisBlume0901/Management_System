package sample.management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;


import java.io.IOException;
import java.sql.*;

public class LoginPageController {
    @FXML
    private Button loginButton;

    @FXML
    private Button cancelButton;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField passwordTextField;
    private Alert alert;

    @FXML
    protected void login(ActionEvent actionEvent) throws IOException {

        String email = emailTextField.getText();
        String password = passwordTextField.getText();

        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection dbconnection = databaseConnection.getConnection("sample_ms");

        String sql = "SELECT * FROM accounts WHERE email = ? AND password = ?";
        try {
            PreparedStatement preparedStatement = dbconnection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) { // Check if a result is returned
                if (resultSet.getString("role").equalsIgnoreCase("ADMIN")) {
                    System.out.println("Admin login");

                } else if (resultSet.getString("role").equalsIgnoreCase("USER")) {
                    System.out.println("User login");
                } else {
                    System.out.println("Invalid login");
                }
            } else {
                System.out.println("Invalid login");
            }
        } catch (Exception e) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error");
            alert.setContentText("Error: " + e.getMessage());
            alert.showAndWait();
        }
    }

    @FXML
    protected void cancel(ActionEvent actionEvent)
    {
        System.out.println("Cancel login");
    }
}
