package com.gladkaya.shape.validator;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class DataValidator {
    private final static Logger logger = LogManager.getLogger();
    private final static String REGEXP_NUMBERS = "^(\\d+.0\\s?)+$";

    public static boolean isDataValid(String stringNumbers) {
        logger.log(Level.INFO, "Correct string [" + stringNumbers + "]? " + stringNumbers.matches(REGEXP_NUMBERS));
        return stringNumbers.matches(REGEXP_NUMBERS);
    }

}
