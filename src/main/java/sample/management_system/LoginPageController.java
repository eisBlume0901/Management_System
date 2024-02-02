package sample.management_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginPageController {
    @FXML
    private Button loginButton;

    @FXML
    private Button cancelButton;

    @FXML
    protected void login(ActionEvent actionEvent)
    {
        System.out.println("Successfully login");
    }

    @FXML
    protected void cancel(ActionEvent actionEvent)
    {
        System.out.println("Cancel login");
    }
}
