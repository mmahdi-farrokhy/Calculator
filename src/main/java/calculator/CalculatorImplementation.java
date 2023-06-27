package calculator;

import Utilities.Converter;

import java.util.function.BinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.ToDoubleFunction;

public class CalculatorImplementation {
    private double number1;
    private double number2;
    private final ToDoubleFunction<String> toDouble = Converter::toDouble;
    private final DoubleFunction<String> toString = Converter::toString;
    private void initNumbers(String num1, String num2){
        try {
            number1 = toDouble.applyAsDouble(num1);
            number2 = toDouble.applyAsDouble(num2);
        } catch (NumberFormatException nfe){
            throw new NumberFormatException();
        }
    }
    public String add(String num1, String num2) {
        initNumbers(num1, num2);
        BinaryOperator<Double> sum = Operations::sum;
        return toString.apply(sum.apply(number1, number2));
    }
    public String subtract(String num1, String num2) {
        initNumbers(num1, num2);
        BinaryOperator<Double> sub = Operations::subtract;
        return toString.apply(sub.apply(number1, number2));
    }
    public String multiply(String num1, String num2) {
        initNumbers(num1, num2);
        BinaryOperator<Double> mul = Operations::multiply;
        return toString.apply(mul.apply(number1, number2));
    }
    public String divide(String num1, String num2) {
        initNumbers(num1, num2);
        BinaryOperator<Double> div = Operations::divide;
        return toString.apply(div.apply(number1, number2));
    }
}
