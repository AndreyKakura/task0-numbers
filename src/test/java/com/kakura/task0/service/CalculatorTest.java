package com.kakura.task0.service;

import com.kakura.task0.customnumber.CustomNumber;
import com.kakura.task0.exception.CalculatorException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;
    private static final CustomNumber INPUT_1 = new CustomNumber(6);
    private static final CustomNumber INPUT_2 = new CustomNumber(4);
    private static final double EXPECTED_RESULT_1 = 10;
    private static final double EXPECTED_RESULT_2 = 2;
    private static final double EXPECTED_RESULT_3 = 24;
    private static final double EXPECTED_RESULT_4 = 1.5;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void sum() {

        double actualResult = calculator.sum(INPUT_1, INPUT_2);
        assertEquals(EXPECTED_RESULT_1, actualResult);

    }

    @Test
    void difference() {
        double actualResult = calculator.difference(INPUT_1, INPUT_2);
        assertEquals(EXPECTED_RESULT_2, actualResult);
    }

    @Test
    void multiplication() {
        double actualResult = calculator.multiplication(INPUT_1, INPUT_2);
        assertEquals(EXPECTED_RESULT_3, actualResult);
    }

    @Test
    void division() throws Exception {
        double actualResult = calculator.division(INPUT_1, INPUT_2);
        assertEquals(EXPECTED_RESULT_4, actualResult);
    }

    @Test
    void divisionWithException() {
        Throwable exception = assertThrows(CalculatorException.class, () -> calculator.division(INPUT_1,
                new CustomNumber(0)));
        assertEquals("Division by zero", exception.getMessage());
    }
}