import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    double a = 10;
    double b = 11.98;

    @Test
    void plusCalc() {
        double expectedResult = a + b;
        double actualResult = Calculator.plusCalc(a, b);
        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    void minusCalc() {
        double expectedResult = a - b;
        double actualResult = Calculator.minusCalc(a, b);
        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @Test
    void divideCalc() {
        double expectedResult = a / b;
        double actualResult = Calculator.divideCalc(a, b);
        double newB = 0;
        double zeroDivisionExpectedResult = 0;
        double zeroDivisionActualResult = Calculator.divideCalc(a, newB);
        assertAll("Division check:",
                () -> assertEquals(expectedResult, actualResult, 0.0001),
                () -> assertEquals(zeroDivisionExpectedResult, zeroDivisionActualResult)
        );

    }

    @Test
    void multiplyCalc() {
        double expectedResult = a * b;
        double actualResult = Calculator.multiplyCalc(a, b);
        assertEquals(expectedResult, actualResult, 0.0001);
    }
}