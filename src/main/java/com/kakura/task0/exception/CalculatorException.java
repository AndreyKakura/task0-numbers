package com.kakura.task0.exception;

import com.kakura.task0.service.Calculator;

public class CalculatorException extends Exception {

    public CalculatorException() {}

    public CalculatorException(String message) {
        super(message);
    }

    public CalculatorException(Exception e) {
        super(e);
    }

    public CalculatorException(String message, Exception e) {
        super(message, e);
    }
}
