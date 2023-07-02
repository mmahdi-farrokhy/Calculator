package Utilities;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class GUIUtils {
    private GUIUtils() {
    }

    public static void setButtonStyle(Button button, int radius, Color backgroundColor) {
        String styleCommand = "-fx-border-color: #ffffff; -fx-border-radius: %d; -fx-background-color: #%s; -fx-background-radius: %d;";
        String format = String.format(styleCommand, radius, backgroundColor.toString().replace("0x", "").substring(0, 6), radius);
        button.setStyle(format);
    }

    public static void resetButtonStyle(Button button, int radius, Color backgroundColor) {
        String styleCommand = "-fx-background-radius: %d; -fx-background-color: #%s; ";
        String format = String.format(styleCommand, radius, backgroundColor.toString().replace("0x", "").substring(0, 6));
        button.setStyle(format);
    }
}
