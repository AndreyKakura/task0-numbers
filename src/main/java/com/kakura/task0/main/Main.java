package com.kakura.task0.main;

import com.kakura.task0.customnumber.CustomNumber;
import com.kakura.task0.customreader.CustomReader;
import com.kakura.task0.exception.CalculatorException;
import com.kakura.task0.exception.ParserException;
import com.kakura.task0.exception.ReaderException;
import com.kakura.task0.numbercreator.NumberCreator;
import com.kakura.task0.parser.Parser;
import com.kakura.task0.service.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.List;

public class Main {

    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws CalculatorException, ReaderException, ParserException {

        CustomReader customReader = new CustomReader();
        Parser parser = new Parser();
        NumberCreator numberCreator = new NumberCreator();
        Calculator calculator = new Calculator();

        List<String> stringList;
        try {
            stringList = customReader.readFromFile("src/main/resources/files/numbers.txt");
        } catch (ReaderException e) {
            logger.error(e.getMessage());
            throw e;
        }

        List<Double> doubleList;

        try {
            doubleList = parser.parseStrToDouble(stringList);
        } catch (ParserException e) {
            logger.error(e.getMessage());
            throw e;
        }

        CustomNumber cn1 = numberCreator.createNumber(doubleList.get(0));
        CustomNumber cn2 = numberCreator.createNumber(doubleList.get(1));

        double result1 = calculator.sum(cn1, cn2);
        logger.info("Sum of numbers is " + result1);

        double result2 = calculator.difference(cn1, cn2);
        logger.info("Difference of numbers is " + result2);

        double result3 = calculator.multiplication(cn1, cn2);
        logger.info("Multiplication of numbers is " + result3);

        double result4;
        try {
            result4 = calculator.division(cn1, cn2);
        } catch (CalculatorException e) {
            logger.error(e.getMessage());
            throw e;
        }

        logger.info("Division of numbers is " + result4);

    }
}
