package com.kakura.task0.parser;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    private static final String DOUBLE_REX = "-?\\d+(\\.\\d+)?";

    public List<Double> parseStrToDouble(List<String> stringList) {
        List<Double> doubleList = new ArrayList<>();

        for (String str : stringList) {
            if (isDouble(str)) {
                Double tmp = Double.parseDouble(str);
                doubleList.add(tmp);
            }
        }

        return doubleList;
    }

    private static boolean isDouble(String str) {
        return str.matches(DOUBLE_REX);
    }

}
