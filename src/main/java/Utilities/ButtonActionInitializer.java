package Utilities;

import javafx.scene.control.Button;

import static Utilities.GUIUtils.resetButtonStyle;
import static Utilities.GUIUtils.setButtonStyle;

public class ButtonActionInitializer {
    private ButtonActionInitializer() {
    }

    @FunctionalInterface
    public interface ActionListener {
        void listener();
    }

    public static void setOnActionMethods(Button button, int buttonRadius, ActionListener actionListener) {
        button.setOnMouseEntered(e -> setButtonStyle((Button) e.getSource(), buttonRadius));
        button.setOnMouseExited(e -> resetButtonStyle((Button) e.getSource(), buttonRadius));
        button.setOnAction(e -> actionListener.listener());
    }
}
