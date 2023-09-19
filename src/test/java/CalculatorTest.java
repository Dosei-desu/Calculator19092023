import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    double a = 10;
    double b = 11.98;

    @org.junit.jupiter.api.Test
    void plusCalc() {
        double expectedResult = a + b;
        double actualResult = Calculator.plusCalc(a, b);
        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @org.junit.jupiter.api.Test
    void minusCalc() {
        double expectedResult = a - b;
        double actualResult = Calculator.minusCalc(a, b);
        assertEquals(expectedResult, actualResult, 0.0001);
    }

    @org.junit.jupiter.api.Test
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

    @org.junit.jupiter.api.Test
    void multiplyCalc() {
        double expectedResult = a * b;
        double actualResult = Calculator.multiplyCalc(a, b);
        assertEquals(expectedResult, actualResult, 0.0001);
    }
}