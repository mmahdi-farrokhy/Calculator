package controller;

import calculator.CalculatorImplementation;
import calculator.OperationType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

import static Utilities.ButtonActionInitializer.setOnActionMethods;

public class CalculatorController implements Initializable {
    @FXML
    private Button addBtn;

    @FXML
    private Button clearBtn;

    @FXML
    private TextField displayField;

    @FXML
    private Button divideBtn;

    @FXML
    private Button eightBtn;

    @FXML
    private Button equalsBtn;

    @FXML
    private Button fiveBtn;

    @FXML
    private Button fourBtn;

    @FXML
    private Button multiplyBtn;

    @FXML
    private Button nineBtn;

    @FXML
    private Button oneBtn;

    @FXML
    private Button pointBtn;

    @FXML
    private Button sevenBtn;

    @FXML
    private Button sixBtn;

    @FXML
    private Button subtractBtn;

    @FXML
    private Button threeBtn;

    @FXML
    private Button twoBtn;

    @FXML
    private Button zeroBtn;

    private final CalculatorImplementation calculator = new CalculatorImplementation();
    private static String number1 = "";
    private static String number2 = "";
    private static String result = "";
    private static boolean equal = false;
    private static boolean pointIsAllowed = true;
    private static OperationType operation;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Color numberColor = Color.valueOf("#6bc6a5");
        Color operatorColor = Color.valueOf("#f9d162");
        Color clearColor = Color.valueOf("#ef3a4f");

        setOnActionMethods(zeroBtn, 10, numberColor, () -> numberButtonPushed(zeroBtn));
        setOnActionMethods(oneBtn, 10, numberColor, () -> numberButtonPushed(oneBtn));
        setOnActionMethods(twoBtn, 10, numberColor, () -> numberButtonPushed(twoBtn));
        setOnActionMethods(threeBtn, 10, numberColor, () -> numberButtonPushed(threeBtn));
        setOnActionMethods(fourBtn, 10, numberColor, () -> numberButtonPushed(fourBtn));
        setOnActionMethods(fiveBtn, 10, numberColor, () -> numberButtonPushed(fiveBtn));
        setOnActionMethods(sixBtn, 10, numberColor, () -> numberButtonPushed(sixBtn));
        setOnActionMethods(sevenBtn, 10, numberColor, () -> numberButtonPushed(sevenBtn));
        setOnActionMethods(eightBtn, 10, numberColor, () -> numberButtonPushed(eightBtn));
        setOnActionMethods(nineBtn, 10, numberColor, () -> numberButtonPushed(nineBtn));
        setOnActionMethods(clearBtn, 10, clearColor, this::clearDisplayField);
        setOnActionMethods(pointBtn, 10, operatorColor, this::applyFloatingPoint);
        setOnActionMethods(addBtn, 10, operatorColor, this::applyAddition);
        setOnActionMethods(subtractBtn, 10, operatorColor, this::applySubtraction);
        setOnActionMethods(multiplyBtn, 10, operatorColor, this::applyMultiplication);
        setOnActionMethods(divideBtn, 10, operatorColor, this::applyDivision);
        setOnActionMethods(equalsBtn, 10, operatorColor, this::applyEquality);
    }

    public void numberButtonPushed(Button numberButton) {
        newNumber();
        displayField.setText(displayField.getText() + numberButton.getText());
    }

    private void newNumber() {
        if (equal) {
            displayField.clear();
            equal = false;
        }
    }

    public void clearDisplayField() {
        displayField.clear();
    }

    public void applyFloatingPoint() {
        newNumber();
        if (pointIsAllowed) {
            pointIsAllowed = false;
            displayField.setText(displayField.getText() + pointBtn.getText());
        }
    }

    public void applyAddition() {
        operationDetermination(OperationType.ADDITION);
    }

    public void applySubtraction() {
        operationDetermination(OperationType.SUBTRACTION);
    }

    public void applyMultiplication() {
        operationDetermination(OperationType.MULTIPLICATION);
    }

    public void applyDivision() {
        operationDetermination(OperationType.DIVISION);
    }

    private void operationDetermination(OperationType operationType) {
        number1 = displayField.getText();
        displayField.clear();
        pointIsAllowed = true;
        operation = operationType;
    }

    public void applyEquality() {
        number2 = displayField.getText();

        switch (operation) {
            case ADDITION -> result = calculator.add(number1, number2);
            case SUBTRACTION -> result = calculator.subtract(number1, number2);
            case MULTIPLICATION -> result = calculator.multiply(number1, number2);
            case DIVISION -> result = calculator.divide(number1, number2);
        }

        displayField.setText(result);
        equal = true;
        pointIsAllowed = true;
    }
}
