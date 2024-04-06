package sample.management_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DialogPaneApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(DialogPaneApplication.class.getResource("dialog-pane-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//        String cssFileName = "login-view-style.css";
//        scene.getStylesheets().add(getClass().getResource(cssFileName).toExternalForm());
        primaryStage.setTitle("Login Page");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
