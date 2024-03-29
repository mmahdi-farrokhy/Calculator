package main;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calculator extends Application {

    public static void main(String... args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("../Calculator.fxml"));
        loader.load();
        primaryStage.setTitle("Travel Agency");
        primaryStage.setScene(new Scene(loader.getRoot()));
        primaryStage.setResizable(false);
        primaryStage.show();
        primaryStage.setOnCloseRequest(e -> closeApplication());
    }

    private void closeApplication() {
        Platform.exit();
        System.exit(0);
    }
}
