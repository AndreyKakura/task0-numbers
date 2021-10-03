package com.kakura.task0.main;

import com.kakura.task0.customnumber.CustomNumber;
import com.kakura.task0.customreader.CustomReader;
import com.kakura.task0.exception.ReaderException;
import com.kakura.task0.numbercreator.NumberCreator;
import com.kakura.task0.parser.Parser;
import com.kakura.task0.service.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.List;

public class Main {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        CustomReader customReader = new CustomReader();
        Parser parser = new Parser();
        NumberCreator numberCreator = new NumberCreator();
        Calculator calculator = new Calculator();

        List<String> stringList = null;
        try {
            stringList = customReader.readFromFile("src/main/resources/files/numbers.txt");
        } catch (ReaderException e) {
            logger.error("not enough elements");
        }
        List<Double> doubleList = parser.parseStrToDouble(stringList);

        CustomNumber cn1 = numberCreator.createNumber(doubleList.get(0));
        CustomNumber cn2 = numberCreator.createNumber(doubleList.get(1));

        System.out.println(calculator.sum(cn1, cn2));
        System.out.println(calculator.difference(cn1, cn2));
        System.out.println(calculator.multiplication(cn1, cn2));
        System.out.println(calculator.division(cn1, cn2));

    }
}
