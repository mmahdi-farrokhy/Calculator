package calculator;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorUiController {
    private final CalculatorImplementation calculator = new CalculatorImplementation();
    private static String number1 = "";
    private static String number2 = "";
    private static String result = "";
    private static boolean equal = false;
    private static int pointCounter = 0;
    private static OperationType operation;
    public TextField display = new TextField();
    public Button seven = new Button();
    public Button eight = new Button();
    public Button nine = new Button();
    public Button four = new Button();
    public Button five = new Button();
    public Button six = new Button();
    public Button one = new Button();
    public Button two = new Button();
    public Button three = new Button();
    public Button zero = new Button();
    public Button add = new Button();
    public Button subtract = new Button();
    public Button multiply = new Button();
    public Button divide = new Button();
    public Button equals = new Button();
    public Button point = new Button();

    private void newNumber() {
        if(equal){
            display.clear();
            equal = false;
        }
    }
    public void zeroButtonPressed(){
        newNumber();
        display.setText(display.getText() + zero.getText());
    }
    public void oneButtonPressed(){
        newNumber();
        display.setText(display.getText() + one.getText());
    }
    public void twoButtonPressed(){
        newNumber();
        display.setText(display.getText() + two.getText());
    }
    public void threeButtonPressed(){
        newNumber();
        display.setText(display.getText() + three.getText());
    }
    public void fourButtonPressed(){
        newNumber();
        display.setText(display.getText() + four.getText());
    }
    public void fiveButtonPressed(){
        newNumber();
        display.setText(display.getText() + five.getText());
    }
    public void sixButtonPressed(){
        newNumber();
        display.setText(display.getText() + six.getText());
    }
    public void sevenButtonPressed(){
        newNumber();
        display.setText(display.getText() + seven.getText());
    }
    public void eightButtonPressed(){
        newNumber();
        display.setText(display.getText() + eight.getText());
    }
    public void nineButtonPressed(){
        newNumber();
        display.setText(display.getText() + nine.getText());
    }
    public void clearButtonPressed(){
        display.clear();
    }
    public void pointButtonPressed(){
        newNumber();
        if (pointCounter == 0)
        {
            pointCounter++;
            display.setText(display.getText() + point.getText());
        }
    }
    public void addButtonPressed(){
        operationDetermination(OperationType.ADDITION);
    }
    public void subtractButtonPressed(){
        operationDetermination(OperationType.SUBTRACTION);
    }
    public void multiplyButtonPressed(){
        operationDetermination(OperationType.MULTIPLICATION);
    }
    public void divideButtonPressed(){
        operationDetermination(OperationType.DIVISION);
    }
    private void operationDetermination(OperationType operationType) {
        number1 = display.getText();
        display.clear();
        pointCounter = 0;
        operation = operationType;
    }
    public void equalsButtonPressed(){
        number2 = display.getText();

        if (operation == OperationType.ADDITION)
            result = calculator.add(number1, number2);
        else if (operation == OperationType.SUBTRACTION)
            result = calculator.subtract(number1, number2);
        else if (operation == OperationType.MULTIPLICATION)
            result = calculator.multiply(number1, number2);
        else if (operation == OperationType.DIVISION)
            result = calculator.divide(number1, number2);

        display.setText(result);
        equal = true;
        pointCounter = 0;
        display.clear();
    }
}
