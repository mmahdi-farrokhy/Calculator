import calculator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorShould {
    Calculator calculator;
    private String number1;
    private String number2;
    private String result;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        number1 = "12.34";
        number2 = "56.78";
        result = "0";
    }

    @Test
    void add_two_double_numbers_correctly() {
        result = calculator.add(number1, number2);
        assertThat(result).isEqualTo("69.12");
    }

    @Test
    void subtract_two_double_numbers_correctly() {
        result = calculator.subtract(number1, number2);
        assertThat(result).isEqualTo("-44.44");
    }

    @Test
    void multiply_two_double_numbers_correctly() {
        result = calculator.multiply(number1, number2);
        assertThat(result).isEqualTo("700.67");
    }

    @Test
    void divide_two_double_numbers_correctly() {
        result = calculator.divide(number1, number2);
        assertThat(result).isEqualTo("0.22");

        result = calculator.divide(number2, number1);
        assertThat(result).isEqualTo("4.60");
    }
}
