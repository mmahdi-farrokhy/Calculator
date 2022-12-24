package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Calculator extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage mainWindow) throws Exception {
        String FXML_FILE = "src/main/java/calculator/CalculatorUI.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(FXML_FILE));
        fxmlLoader.setRoot(new BorderPane());
        Parent root = fxmlLoader.load();
        mainWindow.setTitle("Calculator");
        mainWindow.setScene(new Scene(root, 220, 280));
        mainWindow.setResizable(false);
        mainWindow.show();
    }
}