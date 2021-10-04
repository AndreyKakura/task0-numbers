package com.kakura.task0.parser;

import com.kakura.task0.exception.ParserException;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    private static final String DOUBLE_REX = "-?\\d+(\\.\\d+)?";

    public List<Double> parseStrToDouble(List<String> stringList) throws ParserException {
        List<Double> doubleList = new ArrayList<>();

        for (String str : stringList) {
            if (isDouble(str)) {
                Double tmp = Double.parseDouble(str);
                doubleList.add(tmp);
            }
        }

        if (doubleList.size() < 2) {
            throw new ParserException("Not enough elements");
        }

        return doubleList;
    }

    private static boolean isDouble(String str) {
        return str.matches(DOUBLE_REX);
    }

}
