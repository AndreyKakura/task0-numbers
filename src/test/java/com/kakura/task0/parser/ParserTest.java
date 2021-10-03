package com.kakura.task0.parser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    private Parser parser;
    private static final List<Double> EXPECTED_RESULT = List.of(12.4, 25.5);
    private static final List<String> INPUT = List.of("12.4", "25.5");

    @BeforeEach
    void setUp() {
        parser = new Parser();
    }

    @Test
    void parseStrToDouble() {
        List<Double> actualResult = parser.parseStrToDouble(INPUT);
        assertEquals(EXPECTED_RESULT, actualResult);
    }
}