import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTests {
    Calculator sut;

    @BeforeEach
    public void setUp() {
        sut = new Calculator();
    }

    @Test
    public void whenAdd5To10ThenResult15() {
        double expected = 15;
        double result = sut.add.apply(5, 10);
        assertEquals(expected, result);
    }

    @Test
    public void whenSubtractAsString5From15ThenResult10() {
        double expected = 10;
        double result = sut.subtractAsString("15", "5");
        assertEquals(expected, result);
    }

    @Test
    public void whenInputIncorrectValueThenThrowException() {
        Calculator calculator = new Calculator();
        boolean wasException = false;
        try {
            calculator.subtractAsString("kjdfh", "5");
        } catch (Exception e) {
            wasException = true;
        }
        assertTrue(wasException);
    }

    @Test
    public void divisionByZero() {
        Calculator calculator = new Calculator();
        int expected = 1;
        try {
            calculator.divide.apply(5, 0);
        } catch (ArithmeticException e) {
            expected = 0;
        }
    }
}
