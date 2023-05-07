import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    public void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    public void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }

    @Test
    @DisplayName("Divide two numbers")
    public void divide() {
        assertAll(() -> assertEquals(1, Calculator.divide(2, 2)),
                () -> assertEquals(-1, Calculator.divide(2, -2)),
                () -> assertEquals(1, Calculator.divide(-2, -2)));
    }

    @Test
    @DisplayName("Subtract two numbers")
    public void subtract() {
        assertAll(() -> assertEquals(1, Calculator.subtract(3, 2)),
                () -> assertEquals(4, Calculator.subtract(2, -2)),
                () -> assertEquals(-4, Calculator.subtract(-2, 2)));
    }

}