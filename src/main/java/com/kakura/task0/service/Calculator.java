package com.kakura.task0.service;

import com.kakura.task0.customnumber.CustomNumber;
import com.kakura.task0.exception.CalculatorException;
import com.kakura.task0.numbercreator.NumberCreator;

public class Calculator {
    private static final NumberCreator numberCreator = new NumberCreator();

    public double sum(CustomNumber cn1, CustomNumber cn2){
        return cn1.getNumber() + cn2.getNumber();
    }

    public double difference(CustomNumber cn1, CustomNumber cn2) {
        return cn1.getNumber() - cn2.getNumber();
    }

    public double multiplication(CustomNumber cn1, CustomNumber cn2) {
        return cn1.getNumber() * cn2.getNumber();
    }

    public double division(CustomNumber cn1, CustomNumber cn2) throws CalculatorException {

        if(cn2.getNumber() == 0) {
            throw new CalculatorException("Division by zero");
        }

        return cn1.getNumber() / cn2.getNumber();
    }

}
