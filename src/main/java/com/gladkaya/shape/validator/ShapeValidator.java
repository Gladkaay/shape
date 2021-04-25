package com.gladkaya.shape.validator;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ShapeValidator {
    private final static Logger logger = LogManager.getLogger();
    private final static String REGEXP_TRIANGLE = "^(\\d.0+\\s\\d.0+\\s0.0)";

    public static boolean isTriangle(String stringTriangle) {
        logger.log(Level.INFO, "Is triangle [" + stringTriangle + "]? " + !stringTriangle.matches(REGEXP_TRIANGLE));
        return !stringTriangle.matches(REGEXP_TRIANGLE);
    }
}
