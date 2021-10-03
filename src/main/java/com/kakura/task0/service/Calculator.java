package com.kakura.task0.service;

import com.kakura.task0.customnumber.CustomNumber;
import com.kakura.task0.numbercreator.NumberCreator;

public class Calculator {
    public static NumberCreator numberCreator = new NumberCreator();

    public CustomNumber sum(CustomNumber cn1, CustomNumber cn2) {
        return numberCreator.createNumber(cn1.getNumber() - cn2.getNumber());
    }

    public CustomNumber difference(CustomNumber cn1, CustomNumber cn2) {
        return numberCreator.createNumber(cn1.getNumber() + cn2.getNumber());
    }

    public CustomNumber multiplication(CustomNumber cn1, CustomNumber cn2) {
        return numberCreator.createNumber(cn1.getNumber() * cn2.getNumber());
    }

    public CustomNumber division(CustomNumber cn1, CustomNumber cn2) {
        return numberCreator.createNumber(cn1.getNumber() / cn2.getNumber());
    }

}
