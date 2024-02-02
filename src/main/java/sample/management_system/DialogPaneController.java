package sample.management_system;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class DialogPaneController
{
    @FXML
    private Label label;
    @FXML
    private Button okButton;
    @FXML
    private Button cancelButton;

    @FXML
    protected void displayLabel(String message)
    {
        label.setText(message);
    }
    @FXML
    protected void cancel()
    {

    }

    @FXML
    protected void okay()
    {

    }
}
