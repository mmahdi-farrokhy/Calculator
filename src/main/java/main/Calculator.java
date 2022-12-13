package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Calculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage mainWindow) throws Exception {
        String FXML_FILE = "src/main/java/calculator/CalculatorUI.fxml";
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(FXML_FILE)));
        mainWindow.setTitle("Calculator");
        mainWindow.setScene(new Scene(root, 220, 280));
        mainWindow.setResizable(false);
        mainWindow.show();
    }
}