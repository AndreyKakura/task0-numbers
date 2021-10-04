package com.kakura.task0.parser;

import com.kakura.task0.exception.ParserException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    private Parser parser;
    private static final List<Double> EXPECTED_RESULT = List.of(12.4, 25.5);
    private static final List<String> INPUT = List.of("12.4", "25.5");
    private static final List<String> UNEXPECTED_INPUT = List.of("12.4", "fafasfasf");

    @BeforeEach
    void setUp() {
        parser = new Parser();
    }

    @Test
    void parseStrToDouble() throws Exception {
        List<Double> actualResult = parser.parseStrToDouble(INPUT);
        assertEquals(EXPECTED_RESULT, actualResult);
    }

    @Test
    void parseStrToDoubleWithException() {
        Throwable exception = assertThrows(ParserException.class, () -> parser.parseStrToDouble(UNEXPECTED_INPUT));
        assertEquals("Not enough elements", exception.getMessage());
    }
}