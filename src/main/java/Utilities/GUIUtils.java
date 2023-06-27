package Utilities;

import javafx.scene.control.Button;

public class GUIUtils {
    private GUIUtils() {
    }

    public static void setButtonStyle(Button button, int radius) {
        String styleCommand = "-fx-border-color: #e84575; -fx-border-radius: %d; -fx-background-color: #293556; -fx-background-radius: %d; -fx-text-fill : #e84575";
        String format = String.format(styleCommand, radius, radius);
        button.setStyle(format);
    }

    public static void resetButtonStyle(Button button, int radius) {
        String styleCommand = "-fx-background-color: #293556; -fx-background-radius: %d; -fx-text-fill : #e84575";
        String format = String.format(styleCommand, radius, radius);
        button.setStyle(format);
    }
}
